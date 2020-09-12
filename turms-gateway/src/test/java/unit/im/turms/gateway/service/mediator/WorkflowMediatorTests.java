/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package unit.im.turms.gateway.service.mediator;

import im.turms.common.constant.DeviceType;
import im.turms.common.constant.statuscode.TurmsStatusCode;
import im.turms.common.model.dto.notification.TurmsNotification;
import im.turms.gateway.manager.UserSessionsManager;
import im.turms.gateway.plugin.manager.TurmsPluginManager;
import im.turms.gateway.pojo.bo.session.UserSession;
import im.turms.gateway.service.impl.*;
import im.turms.gateway.service.mediator.WorkflowMediator;
import im.turms.server.common.cluster.node.Node;
import im.turms.server.common.dto.ServiceRequest;
import im.turms.server.common.property.TurmsProperties;
import im.turms.server.common.property.env.gateway.GatewayProperties;
import im.turms.server.common.property.env.gateway.SessionProperties;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.socket.CloseStatus;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * @author James Chen
 */
class WorkflowMediatorTests {

    private final Long userId = 1L;
    private final DeviceType deviceType = DeviceType.ANDROID;

    @Test
    void constructor_shouldSucceed() {
        WorkflowMediator mediator = new WorkflowMediator(null, null, null, null, null, null, null);

        assertNotNull(mediator);
    }

    // Login

    @Test
    void processLoginRequest_shouldReturnForbiddenDeviceType_ifIsForbiddenDeviceType() {
        WorkflowMediator mediator = newWorkflowMediator(true, true, true, true);
        Mono<TurmsStatusCode> result = mediator.processLoginRequest(userId, null, deviceType, null, null, null, null);

        StepVerifier.create(result)
                .expectNext(TurmsStatusCode.FORBIDDEN_DEVICE_TYPE)
                .verifyComplete();
    }

    @Test
    void processLoginRequest_shouldReturnUnauthorized_ifIsUnauthorized() {
        WorkflowMediator mediator = newWorkflowMediator(true, true, false, false);
        Mono<TurmsStatusCode> result = mediator.processLoginRequest(userId, null, deviceType, null, null, null, null);

        StepVerifier.create(result)
                .expectNext(TurmsStatusCode.UNAUTHORIZED)
                .verifyComplete();
    }

    @Test
    void processLoginRequest_shouldReturnNotActive_ifUserIsNotActive() {
        WorkflowMediator mediator = newWorkflowMediator(true, false, false, false);
        Mono<TurmsStatusCode> result = mediator.processLoginRequest(userId, null, deviceType, null, null, null, null);

        StepVerifier.create(result)
                .expectNext(TurmsStatusCode.NOT_ACTIVE)
                .verifyComplete();
    }

    @Test
    void processLoginRequest_shouldReturnNotActive_ifUserIsActiveAndAuthenticated() {
        WorkflowMediator mediator = newWorkflowMediator(true, true, true, false);
        Mono<TurmsStatusCode> result = mediator.processLoginRequest(userId, null, deviceType, null, null, null, null);

        StepVerifier.create(result)
                .expectNext(TurmsStatusCode.OK)
                .verifyComplete();
    }

    @Test
    void rejectLoginRequest_shouldSucceed() {
        WorkflowMediator mediator = newWorkflowMediator();
        Mono<Boolean> result = mediator.rejectLoginRequest(TurmsStatusCode.SERVER_INTERNAL_ERROR, null, null, null);

        StepVerifier.create(result)
                .expectNext(true)
                .verifyComplete();
    }

    @Test
    void setLocalUserDeviceOffline_shouldSucceed() {
        WorkflowMediator mediator = newWorkflowMediator();
        Mono<Boolean> result = mediator.setLocalUserDeviceOffline(userId, deviceType, CloseStatus.NORMAL);

        StepVerifier.create(result)
                .expectNext(true)
                .verifyComplete();
    }

    @Test
    void onSessionEstablished_shouldSendSessionNotification_ifIsNotifyClientsOfSessionInfoAfterConnected() {
        WorkflowMediator mediator = newWorkflowMediator();
        UserSessionsManager manager = mock(UserSessionsManager.class);
        when(manager.pushSessionNotification(any()))
                .thenReturn(true);
        mediator.onSessionEstablished(manager, deviceType);

        verify(manager, times(1))
                .pushSessionNotification(deviceType);
    }

    @Test
    void processServiceRequest_shouldSucceed() {
        WorkflowMediator mediator = newWorkflowMediator();
        ServiceRequest request = mock(ServiceRequest.class);
        Mono<TurmsNotification> result = mediator.processServiceRequest(request);

        StepVerifier.create(result)
                .verifyComplete();
    }

    @Test
    void processHeartbeatRequest_shouldSucceed() {
        WorkflowMediator mediator = newWorkflowMediator();
        Mono<Boolean> result = mediator.processHeartbeatRequest(userId, deviceType);

        StepVerifier.create(result)
                .expectNext(true)
                .verifyComplete();
    }

    @Test
    void triggerGoOnlinePlugins_shouldSucceed() {
        WorkflowMediator mediator = newWorkflowMediator();
        UserSessionsManager manager = mock(UserSessionsManager.class);
        UserSession session = mock(UserSession.class);
        Mono<Void> result = mediator.triggerGoOnlinePlugins(manager, session);

        StepVerifier.create(result)
                .verifyComplete();
    }

    private WorkflowMediator newWorkflowMediator() {
        return newWorkflowMediator(true, true, true, false);
    }

    private WorkflowMediator newWorkflowMediator(
            boolean enableAuthentication,
            boolean isActiveAndNotDeleted,
            boolean isAuthenticated,
            boolean isForbiddenDeviceType) {
        Node node = mock(Node.class);
        TurmsProperties properties = new TurmsProperties();
        GatewayProperties gateway = new GatewayProperties();
        SessionProperties session = new SessionProperties();
        session.setNotifyClientsOfSessionInfoAfterConnected(true);
        session.setEnableAuthentication(enableAuthentication);
        gateway.setSession(session);
        properties.setGateway(gateway);
        when(node.getSharedProperties())
                .thenReturn(properties);

        TurmsPluginManager pluginManager = mock(TurmsPluginManager.class);
        when(pluginManager.isEnabled()).thenReturn(true);
        when(pluginManager.getUserAuthenticatorList()).thenReturn(Collections.emptyList());
        when(pluginManager.getUserOnlineStatusChangeHandlerList()).thenReturn(Collections.emptyList());

        UserService userService = mock(UserService.class);
        when(userService.isActiveAndNotDeleted(any())).thenReturn(Mono.just(isActiveAndNotDeleted));
        when(userService.authenticate(any(), any())).thenReturn(Mono.just(isAuthenticated));

        ReasonCacheService reasonCacheService = mock(ReasonCacheService.class);
        when(reasonCacheService.shouldCacheLoginFailureReason(any(), any(), any()))
                .thenReturn(true);
        when(reasonCacheService.cacheLoginFailureReason(any(), any(), any(), any()))
                .thenReturn(Mono.just(true));

        SessionService sessionService = mock(SessionService.class);
        when(sessionService.tryRegisterOnlineUser(any(), any(), any(), any(), any(), any()))
                .thenReturn(Mono.just(TurmsStatusCode.OK));
        when(sessionService.setLocalSessionOfflineByUserIdAndDeviceType(any(), any(), any()))
                .thenReturn(Mono.just(true));
        when(sessionService.updateHeartbeatTimestamp(any(), any(DeviceType.class)))
                .thenReturn(Mono.just(true));

        UserSimultaneousLoginService userSimultaneousLoginService = mock(UserSimultaneousLoginService.class);
        when(userSimultaneousLoginService.isForbiddenDeviceType(any()))
                .thenReturn(isForbiddenDeviceType);

        InboundRequestService inboundRequestService = mock(InboundRequestService.class);
        when(inboundRequestService.processServiceRequest(any()))
                .thenReturn(Mono.empty());
        return new WorkflowMediator(node, pluginManager, userService, reasonCacheService, sessionService, userSimultaneousLoginService, inboundRequestService);
    }

}