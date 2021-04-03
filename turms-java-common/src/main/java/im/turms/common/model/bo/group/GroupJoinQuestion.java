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
// source: model/group/group_join_question.proto

package im.turms.common.model.bo.group;

/**
 * Protobuf type {@code im.turms.proto.GroupJoinQuestion}
 */
public final class GroupJoinQuestion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.GroupJoinQuestion)
    GroupJoinQuestionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroupJoinQuestion.newBuilder() to construct.
  private GroupJoinQuestion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroupJoinQuestion() {
    question_ = "";
    answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroupJoinQuestion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GroupJoinQuestion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            id_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            groupId_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            question_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000008) != 0)) {
              answers_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000008;
            }
            answers_.add(s);
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            score_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) != 0)) {
        answers_ = answers_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.common.model.bo.group.GroupJoinQuestionOuterClass.internal_static_im_turms_proto_GroupJoinQuestion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.common.model.bo.group.GroupJoinQuestionOuterClass.internal_static_im_turms_proto_GroupJoinQuestion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.common.model.bo.group.GroupJoinQuestion.class, im.turms.common.model.bo.group.GroupJoinQuestion.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int GROUP_ID_FIELD_NUMBER = 2;
  private long groupId_;
  /**
   * <code>int64 group_id = 2;</code>
   * @return Whether the groupId field is set.
   */
  @java.lang.Override
  public boolean hasGroupId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>int64 group_id = 2;</code>
   * @return The groupId.
   */
  @java.lang.Override
  public long getGroupId() {
    return groupId_;
  }

  public static final int QUESTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object question_;
  /**
   * <code>string question = 3;</code>
   * @return Whether the question field is set.
   */
  @java.lang.Override
  public boolean hasQuestion() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>string question = 3;</code>
   * @return The question.
   */
  @java.lang.Override
  public java.lang.String getQuestion() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      question_ = s;
      return s;
    }
  }
  /**
   * <code>string question = 3;</code>
   * @return The bytes for question.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuestionBytes() {
    java.lang.Object ref = question_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      question_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANSWERS_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList answers_;
  /**
   * <code>repeated string answers = 4;</code>
   * @return A list containing the answers.
   */
  public com.google.protobuf.ProtocolStringList
      getAnswersList() {
    return answers_;
  }
  /**
   * <code>repeated string answers = 4;</code>
   * @return The count of answers.
   */
  public int getAnswersCount() {
    return answers_.size();
  }
  /**
   * <code>repeated string answers = 4;</code>
   * @param index The index of the element to return.
   * @return The answers at the given index.
   */
  public java.lang.String getAnswers(int index) {
    return answers_.get(index);
  }
  /**
   * <code>repeated string answers = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the answers at the given index.
   */
  public com.google.protobuf.ByteString
      getAnswersBytes(int index) {
    return answers_.getByteString(index);
  }

  public static final int SCORE_FIELD_NUMBER = 5;
  private int score_;
  /**
   * <code>int32 score = 5;</code>
   * @return Whether the score field is set.
   */
  @java.lang.Override
  public boolean hasScore() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>int32 score = 5;</code>
   * @return The score.
   */
  @java.lang.Override
  public int getScore() {
    return score_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, groupId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, question_);
    }
    for (int i = 0; i < answers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, answers_.getRaw(i));
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(5, score_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, groupId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, question_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < answers_.size(); i++) {
        dataSize += computeStringSizeNoTag(answers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnswersList().size();
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, score_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.common.model.bo.group.GroupJoinQuestion)) {
      return super.equals(obj);
    }
    im.turms.common.model.bo.group.GroupJoinQuestion other = (im.turms.common.model.bo.group.GroupJoinQuestion) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (getId()
          != other.getId()) return false;
    }
    if (hasGroupId() != other.hasGroupId()) return false;
    if (hasGroupId()) {
      if (getGroupId()
          != other.getGroupId()) return false;
    }
    if (hasQuestion() != other.hasQuestion()) return false;
    if (hasQuestion()) {
      if (!getQuestion()
          .equals(other.getQuestion())) return false;
    }
    if (!getAnswersList()
        .equals(other.getAnswersList())) return false;
    if (hasScore() != other.hasScore()) return false;
    if (hasScore()) {
      if (getScore()
          != other.getScore()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
    }
    if (hasGroupId()) {
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGroupId());
    }
    if (hasQuestion()) {
      hash = (37 * hash) + QUESTION_FIELD_NUMBER;
      hash = (53 * hash) + getQuestion().hashCode();
    }
    if (getAnswersCount() > 0) {
      hash = (37 * hash) + ANSWERS_FIELD_NUMBER;
      hash = (53 * hash) + getAnswersList().hashCode();
    }
    if (hasScore()) {
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.common.model.bo.group.GroupJoinQuestion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.common.model.bo.group.GroupJoinQuestion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.GroupJoinQuestion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.GroupJoinQuestion)
      im.turms.common.model.bo.group.GroupJoinQuestionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.common.model.bo.group.GroupJoinQuestionOuterClass.internal_static_im_turms_proto_GroupJoinQuestion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.common.model.bo.group.GroupJoinQuestionOuterClass.internal_static_im_turms_proto_GroupJoinQuestion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.common.model.bo.group.GroupJoinQuestion.class, im.turms.common.model.bo.group.GroupJoinQuestion.Builder.class);
    }

    // Construct using im.turms.common.model.bo.group.GroupJoinQuestion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      groupId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      question_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      score_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.common.model.bo.group.GroupJoinQuestionOuterClass.internal_static_im_turms_proto_GroupJoinQuestion_descriptor;
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinQuestion getDefaultInstanceForType() {
      return im.turms.common.model.bo.group.GroupJoinQuestion.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinQuestion build() {
      im.turms.common.model.bo.group.GroupJoinQuestion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.common.model.bo.group.GroupJoinQuestion buildPartial() {
      im.turms.common.model.bo.group.GroupJoinQuestion result = new im.turms.common.model.bo.group.GroupJoinQuestion(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.groupId_ = groupId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.question_ = question_;
      if (((bitField0_ & 0x00000008) != 0)) {
        answers_ = answers_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.answers_ = answers_;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.score_ = score_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.common.model.bo.group.GroupJoinQuestion) {
        return mergeFrom((im.turms.common.model.bo.group.GroupJoinQuestion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.common.model.bo.group.GroupJoinQuestion other) {
      if (other == im.turms.common.model.bo.group.GroupJoinQuestion.getDefaultInstance()) return this;
      if (other.hasId()) {
        setId(other.getId());
      }
      if (other.hasGroupId()) {
        setGroupId(other.getGroupId());
      }
      if (other.hasQuestion()) {
        bitField0_ |= 0x00000004;
        question_ = other.question_;
        onChanged();
      }
      if (!other.answers_.isEmpty()) {
        if (answers_.isEmpty()) {
          answers_ = other.answers_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureAnswersIsMutable();
          answers_.addAll(other.answers_);
        }
        onChanged();
      }
      if (other.hasScore()) {
        setScore(other.getScore());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.common.model.bo.group.GroupJoinQuestion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.common.model.bo.group.GroupJoinQuestion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      bitField0_ |= 0x00000001;
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
      onChanged();
      return this;
    }

    private long groupId_ ;
    /**
     * <code>int64 group_id = 2;</code>
     * @return Whether the groupId field is set.
     */
    @java.lang.Override
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>int64 group_id = 2;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public long getGroupId() {
      return groupId_;
    }
    /**
     * <code>int64 group_id = 2;</code>
     * @param value The groupId to set.
     * @return This builder for chaining.
     */
    public Builder setGroupId(long value) {
      bitField0_ |= 0x00000002;
      groupId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 group_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGroupId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      groupId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object question_ = "";
    /**
     * <code>string question = 3;</code>
     * @return Whether the question field is set.
     */
    public boolean hasQuestion() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>string question = 3;</code>
     * @return The question.
     */
    public java.lang.String getQuestion() {
      java.lang.Object ref = question_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        question_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string question = 3;</code>
     * @return The bytes for question.
     */
    public com.google.protobuf.ByteString
        getQuestionBytes() {
      java.lang.Object ref = question_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        question_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string question = 3;</code>
     * @param value The question to set.
     * @return This builder for chaining.
     */
    public Builder setQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      question_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string question = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuestion() {
      bitField0_ = (bitField0_ & ~0x00000004);
      question_ = getDefaultInstance().getQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>string question = 3;</code>
     * @param value The bytes for question to set.
     * @return This builder for chaining.
     */
    public Builder setQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      question_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAnswersIsMutable() {
      if (!((bitField0_ & 0x00000008) != 0)) {
        answers_ = new com.google.protobuf.LazyStringArrayList(answers_);
        bitField0_ |= 0x00000008;
       }
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @return A list containing the answers.
     */
    public com.google.protobuf.ProtocolStringList
        getAnswersList() {
      return answers_.getUnmodifiableView();
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @return The count of answers.
     */
    public int getAnswersCount() {
      return answers_.size();
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param index The index of the element to return.
     * @return The answers at the given index.
     */
    public java.lang.String getAnswers(int index) {
      return answers_.get(index);
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the answers at the given index.
     */
    public com.google.protobuf.ByteString
        getAnswersBytes(int index) {
      return answers_.getByteString(index);
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param index The index to set the value at.
     * @param value The answers to set.
     * @return This builder for chaining.
     */
    public Builder setAnswers(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param value The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswers(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param values The answers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnswers(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnswersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, answers_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswers() {
      answers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string answers = 4;</code>
     * @param value The bytes of the answers to add.
     * @return This builder for chaining.
     */
    public Builder addAnswersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAnswersIsMutable();
      answers_.add(value);
      onChanged();
      return this;
    }

    private int score_ ;
    /**
     * <code>int32 score = 5;</code>
     * @return Whether the score field is set.
     */
    @java.lang.Override
    public boolean hasScore() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>int32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }
    /**
     * <code>int32 score = 5;</code>
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(int value) {
      bitField0_ |= 0x00000010;
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 score = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000010);
      score_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.GroupJoinQuestion)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.GroupJoinQuestion)
  private static final im.turms.common.model.bo.group.GroupJoinQuestion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.common.model.bo.group.GroupJoinQuestion();
  }

  public static im.turms.common.model.bo.group.GroupJoinQuestion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroupJoinQuestion>
      PARSER = new com.google.protobuf.AbstractParser<GroupJoinQuestion>() {
    @java.lang.Override
    public GroupJoinQuestion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GroupJoinQuestion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GroupJoinQuestion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroupJoinQuestion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.common.model.bo.group.GroupJoinQuestion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

