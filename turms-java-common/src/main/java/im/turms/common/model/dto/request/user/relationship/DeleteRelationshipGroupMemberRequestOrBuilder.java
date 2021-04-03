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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/delete_relationship_group_member_request.proto

package im.turms.common.model.dto.request.user.relationship;

public interface DeleteRelationshipGroupMemberRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:im.turms.proto.DeleteRelationshipGroupMemberRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 user_id = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int32 group_index = 2;</code>
   * @return The groupIndex.
   */
  int getGroupIndex();

  /**
   * <code>int32 target_group_index = 3;</code>
   * @return Whether the targetGroupIndex field is set.
   */
  boolean hasTargetGroupIndex();
  /**
   * <code>int32 target_group_index = 3;</code>
   * @return The targetGroupIndex.
   */
  int getTargetGroupIndex();
}
