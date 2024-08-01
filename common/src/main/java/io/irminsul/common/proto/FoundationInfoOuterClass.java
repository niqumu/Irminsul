// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: FoundationInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class FoundationInfoOuterClass {
  private FoundationInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      FoundationInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FoundationInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FoundationInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.FoundationStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    int getStatusValue();
    /**
     * <code>.FoundationStatus status = 1;</code>
     * @return The status.
     */
    FoundationStatusOuterClass.FoundationStatus getStatus();

    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @return A list containing the uidList.
     */
    java.util.List<Integer> getUidListList();
    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @return The count of uidList.
     */
    int getUidListCount();
    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    int getUidList(int index);

    /**
     * <code>uint32 current_building_id = 3;</code>
     * @return The currentBuildingId.
     */
    int getCurrentBuildingId();

    /**
     * <code>uint32 locked_by_uid = 4;</code>
     * @return The lockedByUid.
     */
    int getLockedByUid();
  }
  /**
   * <pre>
   * Obf: HJBPIEDJHAP
   * </pre>
   *
   * Protobuf type {@code FoundationInfo}
   */
  public static final class FoundationInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:FoundationInfo)
      FoundationInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        FoundationInfo.class.getName());
    }
    // Use FoundationInfo.newBuilder() to construct.
    private FoundationInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private FoundationInfo() {
      status_ = 0;
      uidList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return FoundationInfoOuterClass.internal_static_FoundationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              FoundationInfo.class, Builder.class);
    }

    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_ = 0;
    /**
     * <code>.FoundationStatus status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @Override public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.FoundationStatus status = 1;</code>
     * @return The status.
     */
    @Override public FoundationStatusOuterClass.FoundationStatus getStatus() {
      FoundationStatusOuterClass.FoundationStatus result = FoundationStatusOuterClass.FoundationStatus.forNumber(status_);
      return result == null ? FoundationStatusOuterClass.FoundationStatus.UNRECOGNIZED : result;
    }

    public static final int UID_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList uidList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @return A list containing the uidList.
     */
    @Override
    public java.util.List<Integer>
        getUidListList() {
      return uidList_;
    }
    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @return The count of uidList.
     */
    public int getUidListCount() {
      return uidList_.size();
    }
    /**
     * <code>repeated uint32 uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    public int getUidList(int index) {
      return uidList_.getInt(index);
    }
    private int uidListMemoizedSerializedSize = -1;

    public static final int CURRENT_BUILDING_ID_FIELD_NUMBER = 3;
    private int currentBuildingId_ = 0;
    /**
     * <code>uint32 current_building_id = 3;</code>
     * @return The currentBuildingId.
     */
    @Override
    public int getCurrentBuildingId() {
      return currentBuildingId_;
    }

    public static final int LOCKED_BY_UID_FIELD_NUMBER = 4;
    private int lockedByUid_ = 0;
    /**
     * <code>uint32 locked_by_uid = 4;</code>
     * @return The lockedByUid.
     */
    @Override
    public int getLockedByUid() {
      return lockedByUid_;
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
      if (status_ != FoundationStatusOuterClass.FoundationStatus.FOUNDATION_STATUS_NONE.getNumber()) {
        output.writeEnum(1, status_);
      }
      if (getUidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(uidListMemoizedSerializedSize);
      }
      for (int i = 0; i < uidList_.size(); i++) {
        output.writeUInt32NoTag(uidList_.getInt(i));
      }
      if (currentBuildingId_ != 0) {
        output.writeUInt32(3, currentBuildingId_);
      }
      if (lockedByUid_ != 0) {
        output.writeUInt32(4, lockedByUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (status_ != FoundationStatusOuterClass.FoundationStatus.FOUNDATION_STATUS_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, status_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < uidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(uidList_.getInt(i));
        }
        size += dataSize;
        if (!getUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        uidListMemoizedSerializedSize = dataSize;
      }
      if (currentBuildingId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, currentBuildingId_);
      }
      if (lockedByUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, lockedByUid_);
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
      if (!(obj instanceof FoundationInfo)) {
        return super.equals(obj);
      }
      FoundationInfo other = (FoundationInfo) obj;

      if (status_ != other.status_) return false;
      if (!getUidListList()
          .equals(other.getUidListList())) return false;
      if (getCurrentBuildingId()
          != other.getCurrentBuildingId()) return false;
      if (getLockedByUid()
          != other.getLockedByUid()) return false;
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
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + status_;
      if (getUidListCount() > 0) {
        hash = (37 * hash) + UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUidListList().hashCode();
      }
      hash = (37 * hash) + CURRENT_BUILDING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentBuildingId();
      hash = (37 * hash) + LOCKED_BY_UID_FIELD_NUMBER;
      hash = (53 * hash) + getLockedByUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static FoundationInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FoundationInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FoundationInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FoundationInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FoundationInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static FoundationInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static FoundationInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static FoundationInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static FoundationInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static FoundationInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static FoundationInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static FoundationInfo parseFrom(
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
    public static Builder newBuilder(FoundationInfo prototype) {
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
     * Obf: HJBPIEDJHAP
     * </pre>
     *
     * Protobuf type {@code FoundationInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FoundationInfo)
        FoundationInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return FoundationInfoOuterClass.internal_static_FoundationInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                FoundationInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.FoundationInfoOuterClass.FoundationInfo.newBuilder()
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
        status_ = 0;
        uidList_ = emptyIntList();
        currentBuildingId_ = 0;
        lockedByUid_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return FoundationInfoOuterClass.internal_static_FoundationInfo_descriptor;
      }

      @Override
      public FoundationInfo getDefaultInstanceForType() {
        return FoundationInfo.getDefaultInstance();
      }

      @Override
      public FoundationInfo build() {
        FoundationInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public FoundationInfo buildPartial() {
        FoundationInfo result = new FoundationInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(FoundationInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.status_ = status_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          uidList_.makeImmutable();
          result.uidList_ = uidList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.currentBuildingId_ = currentBuildingId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.lockedByUid_ = lockedByUid_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof FoundationInfo) {
          return mergeFrom((FoundationInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(FoundationInfo other) {
        if (other == FoundationInfo.getDefaultInstance()) return this;
        if (other.status_ != 0) {
          setStatusValue(other.getStatusValue());
        }
        if (!other.uidList_.isEmpty()) {
          if (uidList_.isEmpty()) {
            uidList_ = other.uidList_;
            uidList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureUidListIsMutable();
            uidList_.addAll(other.uidList_);
          }
          onChanged();
        }
        if (other.getCurrentBuildingId() != 0) {
          setCurrentBuildingId(other.getCurrentBuildingId());
        }
        if (other.getLockedByUid() != 0) {
          setLockedByUid(other.getLockedByUid());
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
              case 8: {
                status_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                int v = input.readUInt32();
                ensureUidListIsMutable();
                uidList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  uidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 24: {
                currentBuildingId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                lockedByUid_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

      private int status_ = 0;
      /**
       * <code>.FoundationStatus status = 1;</code>
       * @return The enum numeric value on the wire for status.
       */
      @Override public int getStatusValue() {
        return status_;
      }
      /**
       * <code>.FoundationStatus status = 1;</code>
       * @param value The enum numeric value on the wire for status to set.
       * @return This builder for chaining.
       */
      public Builder setStatusValue(int value) {
        status_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.FoundationStatus status = 1;</code>
       * @return The status.
       */
      @Override
      public FoundationStatusOuterClass.FoundationStatus getStatus() {
        FoundationStatusOuterClass.FoundationStatus result = FoundationStatusOuterClass.FoundationStatus.forNumber(status_);
        return result == null ? FoundationStatusOuterClass.FoundationStatus.UNRECOGNIZED : result;
      }
      /**
       * <code>.FoundationStatus status = 1;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(FoundationStatusOuterClass.FoundationStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FoundationStatus status = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList uidList_ = emptyIntList();
      private void ensureUidListIsMutable() {
        if (!uidList_.isModifiable()) {
          uidList_ = makeMutableCopy(uidList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @return A list containing the uidList.
       */
      public java.util.List<Integer>
          getUidListList() {
        uidList_.makeImmutable();
        return uidList_;
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @return The count of uidList.
       */
      public int getUidListCount() {
        return uidList_.size();
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @param index The index of the element to return.
       * @return The uidList at the given index.
       */
      public int getUidList(int index) {
        return uidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The uidList to set.
       * @return This builder for chaining.
       */
      public Builder setUidList(
          int index, int value) {

        ensureUidListIsMutable();
        uidList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @param value The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addUidList(int value) {

        ensureUidListIsMutable();
        uidList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @param values The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUidList(
          Iterable<? extends Integer> values) {
        ensureUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, uidList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUidList() {
        uidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int currentBuildingId_ ;
      /**
       * <code>uint32 current_building_id = 3;</code>
       * @return The currentBuildingId.
       */
      @Override
      public int getCurrentBuildingId() {
        return currentBuildingId_;
      }
      /**
       * <code>uint32 current_building_id = 3;</code>
       * @param value The currentBuildingId to set.
       * @return This builder for chaining.
       */
      public Builder setCurrentBuildingId(int value) {

        currentBuildingId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 current_building_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrentBuildingId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        currentBuildingId_ = 0;
        onChanged();
        return this;
      }

      private int lockedByUid_ ;
      /**
       * <code>uint32 locked_by_uid = 4;</code>
       * @return The lockedByUid.
       */
      @Override
      public int getLockedByUid() {
        return lockedByUid_;
      }
      /**
       * <code>uint32 locked_by_uid = 4;</code>
       * @param value The lockedByUid to set.
       * @return This builder for chaining.
       */
      public Builder setLockedByUid(int value) {

        lockedByUid_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 locked_by_uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLockedByUid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lockedByUid_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:FoundationInfo)
    }

    // @@protoc_insertion_point(class_scope:FoundationInfo)
    private static final FoundationInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FoundationInfo();
    }

    public static FoundationInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FoundationInfo>
        PARSER = new com.google.protobuf.AbstractParser<FoundationInfo>() {
      @Override
      public FoundationInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FoundationInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<FoundationInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public FoundationInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FoundationInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_FoundationInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024FoundationInfo.proto\032\026FoundationStatus" +
      ".proto\"y\n\016FoundationInfo\022!\n\006status\030\001 \001(\016" +
      "2\021.FoundationStatus\022\020\n\010uid_list\030\002 \003(\r\022\033\n" +
      "\023current_building_id\030\003 \001(\r\022\025\n\rlocked_by_" +
      "uid\030\004 \001(\rB\032\n\030io.irminsul.common.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          FoundationStatusOuterClass.getDescriptor(),
        });
    internal_static_FoundationInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FoundationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_FoundationInfo_descriptor,
        new String[] { "Status", "UidList", "CurrentBuildingId", "LockedByUid", });
    descriptor.resolveAllFeaturesImmutable();
    FoundationStatusOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
