// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: SetUpAvatarTeamReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class SetUpAvatarTeamReqOuterClass {
  private SetUpAvatarTeamReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SetUpAvatarTeamReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetUpAvatarTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetUpAvatarTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    java.util.List<Long> getAvatarTeamGuidListList();
    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @return The count of avatarTeamGuidList.
     */
    int getAvatarTeamGuidListCount();
    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    long getAvatarTeamGuidList(int index);

    /**
     * <code>uint64 cur_avatar_guid = 13;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();

    /**
     * <code>uint32 team_id = 3;</code>
     * @return The teamId.
     */
    int getTeamId();
  }
  /**
   * <pre>
   * CmdId: 5889
   * Obf: ADMCJJMPKGL
   * </pre>
   *
   * Protobuf type {@code SetUpAvatarTeamReq}
   */
  public static final class SetUpAvatarTeamReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SetUpAvatarTeamReq)
      SetUpAvatarTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        SetUpAvatarTeamReq.class.getName());
    }
    // Use SetUpAvatarTeamReq.newBuilder() to construct.
    private SetUpAvatarTeamReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SetUpAvatarTeamReq() {
      avatarTeamGuidList_ = emptyLongList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SetUpAvatarTeamReq.class, Builder.class);
    }

    public static final int AVATAR_TEAM_GUID_LIST_FIELD_NUMBER = 12;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList avatarTeamGuidList_ =
        emptyLongList();
    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @return A list containing the avatarTeamGuidList.
     */
    @Override
    public java.util.List<Long>
        getAvatarTeamGuidListList() {
      return avatarTeamGuidList_;
    }
    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @return The count of avatarTeamGuidList.
     */
    public int getAvatarTeamGuidListCount() {
      return avatarTeamGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatar_team_guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The avatarTeamGuidList at the given index.
     */
    public long getAvatarTeamGuidList(int index) {
      return avatarTeamGuidList_.getLong(index);
    }
    private int avatarTeamGuidListMemoizedSerializedSize = -1;

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 13;
    private long curAvatarGuid_ = 0L;
    /**
     * <code>uint64 cur_avatar_guid = 13;</code>
     * @return The curAvatarGuid.
     */
    @Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
    }

    public static final int TEAM_ID_FIELD_NUMBER = 3;
    private int teamId_ = 0;
    /**
     * <code>uint32 team_id = 3;</code>
     * @return The teamId.
     */
    @Override
    public int getTeamId() {
      return teamId_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (teamId_ != 0) {
        output.writeUInt32(3, teamId_);
      }
      if (getAvatarTeamGuidListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(avatarTeamGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarTeamGuidList_.getLong(i));
      }
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(13, curAvatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (teamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, teamId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < avatarTeamGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarTeamGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarTeamGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarTeamGuidListMemoizedSerializedSize = dataSize;
      }
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, curAvatarGuid_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SetUpAvatarTeamReq)) {
        return super.equals(obj);
      }
      SetUpAvatarTeamReq other = (SetUpAvatarTeamReq) obj;

      if (!getAvatarTeamGuidListList()
          .equals(other.getAvatarTeamGuidListList())) return false;
      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
      if (getTeamId()
          != other.getTeamId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getAvatarTeamGuidListCount() > 0) {
        hash = (37 * hash) + AVATAR_TEAM_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarTeamGuidListList().hashCode();
      }
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      hash = (37 * hash) + TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTeamId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SetUpAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetUpAvatarTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetUpAvatarTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetUpAvatarTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetUpAvatarTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SetUpAvatarTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SetUpAvatarTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SetUpAvatarTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SetUpAvatarTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SetUpAvatarTeamReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 5889
     * Obf: ADMCJJMPKGL
     * </pre>
     *
     * Protobuf type {@code SetUpAvatarTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetUpAvatarTeamReq)
        SetUpAvatarTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SetUpAvatarTeamReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.SetUpAvatarTeamReqOuterClass.SetUpAvatarTeamReq.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        avatarTeamGuidList_ = emptyLongList();
        curAvatarGuid_ = 0L;
        teamId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SetUpAvatarTeamReqOuterClass.internal_static_SetUpAvatarTeamReq_descriptor;
      }

      @Override
      public SetUpAvatarTeamReq getDefaultInstanceForType() {
        return SetUpAvatarTeamReq.getDefaultInstance();
      }

      @Override
      public SetUpAvatarTeamReq build() {
        SetUpAvatarTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SetUpAvatarTeamReq buildPartial() {
        SetUpAvatarTeamReq result = new SetUpAvatarTeamReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SetUpAvatarTeamReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          avatarTeamGuidList_.makeImmutable();
          result.avatarTeamGuidList_ = avatarTeamGuidList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.curAvatarGuid_ = curAvatarGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.teamId_ = teamId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SetUpAvatarTeamReq) {
          return mergeFrom((SetUpAvatarTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SetUpAvatarTeamReq other) {
        if (other == SetUpAvatarTeamReq.getDefaultInstance()) return this;
        if (!other.avatarTeamGuidList_.isEmpty()) {
          if (avatarTeamGuidList_.isEmpty()) {
            avatarTeamGuidList_ = other.avatarTeamGuidList_;
            avatarTeamGuidList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureAvatarTeamGuidListIsMutable();
            avatarTeamGuidList_.addAll(other.avatarTeamGuidList_);
          }
          onChanged();
        }
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
        }
        if (other.getTeamId() != 0) {
          setTeamId(other.getTeamId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 24: {
                teamId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 96: {
                long v = input.readUInt64();
                ensureAvatarTeamGuidListIsMutable();
                avatarTeamGuidList_.addLong(v);
                break;
              } // case 96
              case 98: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarTeamGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarTeamGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 98
              case 104: {
                curAvatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList avatarTeamGuidList_ = emptyLongList();
      private void ensureAvatarTeamGuidListIsMutable() {
        if (!avatarTeamGuidList_.isModifiable()) {
          avatarTeamGuidList_ = makeMutableCopy(avatarTeamGuidList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @return A list containing the avatarTeamGuidList.
       */
      public java.util.List<Long>
          getAvatarTeamGuidListList() {
        avatarTeamGuidList_.makeImmutable();
        return avatarTeamGuidList_;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @return The count of avatarTeamGuidList.
       */
      public int getAvatarTeamGuidListCount() {
        return avatarTeamGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @param index The index of the element to return.
       * @return The avatarTeamGuidList at the given index.
       */
      public long getAvatarTeamGuidList(int index) {
        return avatarTeamGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The avatarTeamGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarTeamGuidList(
          int index, long value) {

        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.setLong(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @param value The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarTeamGuidList(long value) {

        ensureAvatarTeamGuidListIsMutable();
        avatarTeamGuidList_.addLong(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @param values The avatarTeamGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarTeamGuidList(
          Iterable<? extends Long> values) {
        ensureAvatarTeamGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarTeamGuidList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_team_guid_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarTeamGuidList() {
        avatarTeamGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avatar_guid = 13;</code>
       * @return The curAvatarGuid.
       */
      @Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 13;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {

        curAvatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_avatar_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        curAvatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int teamId_ ;
      /**
       * <code>uint32 team_id = 3;</code>
       * @return The teamId.
       */
      @Override
      public int getTeamId() {
        return teamId_;
      }
      /**
       * <code>uint32 team_id = 3;</code>
       * @param value The teamId to set.
       * @return This builder for chaining.
       */
      public Builder setTeamId(int value) {

        teamId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 team_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        teamId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SetUpAvatarTeamReq)
    }

    // @@protoc_insertion_point(class_scope:SetUpAvatarTeamReq)
    private static final SetUpAvatarTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SetUpAvatarTeamReq();
    }

    public static SetUpAvatarTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetUpAvatarTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<SetUpAvatarTeamReq>() {
      @Override
      public SetUpAvatarTeamReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SetUpAvatarTeamReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SetUpAvatarTeamReq> getParserForType() {
      return PARSER;
    }

    @Override
    public SetUpAvatarTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetUpAvatarTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SetUpAvatarTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030SetUpAvatarTeamReq.proto\"]\n\022SetUpAvata" +
      "rTeamReq\022\035\n\025avatar_team_guid_list\030\014 \003(\004\022" +
      "\027\n\017cur_avatar_guid\030\r \001(\004\022\017\n\007team_id\030\003 \001(" +
      "\rB\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetUpAvatarTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetUpAvatarTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SetUpAvatarTeamReq_descriptor,
        new String[] { "AvatarTeamGuidList", "CurAvatarGuid", "TeamId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
