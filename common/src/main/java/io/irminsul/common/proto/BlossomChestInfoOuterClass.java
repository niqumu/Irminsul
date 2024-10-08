// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: BlossomChestInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class BlossomChestInfoOuterClass {
  private BlossomChestInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      BlossomChestInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlossomChestInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlossomChestInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    int getResin();

    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @return A list containing the qualifyUidList.
     */
    java.util.List<Integer> getQualifyUidListList();
    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @return The count of qualifyUidList.
     */
    int getQualifyUidListCount();
    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    int getQualifyUidList(int index);

    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @return A list containing the remainUidList.
     */
    java.util.List<Integer> getRemainUidListList();
    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @return The count of remainUidList.
     */
    int getRemainUidListCount();
    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    int getRemainUidList(int index);

    /**
     * <code>uint32 dead_time = 4;</code>
     * @return The deadTime.
     */
    int getDeadTime();

    /**
     * <code>uint32 blossom_refresh_type = 5;</code>
     * @return The blossomRefreshType.
     */
    int getBlossomRefreshType();

    /**
     * <code>uint32 refresh_id = 6;</code>
     * @return The refreshId.
     */
    int getRefreshId();
  }
  /**
   * <pre>
   * Obf: OGDABNFHACL
   * </pre>
   *
   * Protobuf type {@code BlossomChestInfo}
   */
  public static final class BlossomChestInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlossomChestInfo)
      BlossomChestInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        BlossomChestInfo.class.getName());
    }
    // Use BlossomChestInfo.newBuilder() to construct.
    private BlossomChestInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private BlossomChestInfo() {
      qualifyUidList_ = emptyIntList();
      remainUidList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BlossomChestInfo.class, Builder.class);
    }

    public static final int RESIN_FIELD_NUMBER = 1;
    private int resin_ = 0;
    /**
     * <code>uint32 resin = 1;</code>
     * @return The resin.
     */
    @Override
    public int getResin() {
      return resin_;
    }

    public static final int QUALIFY_UID_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList qualifyUidList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @return A list containing the qualifyUidList.
     */
    @Override
    public java.util.List<Integer>
        getQualifyUidListList() {
      return qualifyUidList_;
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @return The count of qualifyUidList.
     */
    public int getQualifyUidListCount() {
      return qualifyUidList_.size();
    }
    /**
     * <code>repeated uint32 qualify_uid_list = 2;</code>
     * @param index The index of the element to return.
     * @return The qualifyUidList at the given index.
     */
    public int getQualifyUidList(int index) {
      return qualifyUidList_.getInt(index);
    }
    private int qualifyUidListMemoizedSerializedSize = -1;

    public static final int REMAIN_UID_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList remainUidList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @return A list containing the remainUidList.
     */
    @Override
    public java.util.List<Integer>
        getRemainUidListList() {
      return remainUidList_;
    }
    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @return The count of remainUidList.
     */
    public int getRemainUidListCount() {
      return remainUidList_.size();
    }
    /**
     * <code>repeated uint32 remain_uid_list = 3;</code>
     * @param index The index of the element to return.
     * @return The remainUidList at the given index.
     */
    public int getRemainUidList(int index) {
      return remainUidList_.getInt(index);
    }
    private int remainUidListMemoizedSerializedSize = -1;

    public static final int DEAD_TIME_FIELD_NUMBER = 4;
    private int deadTime_ = 0;
    /**
     * <code>uint32 dead_time = 4;</code>
     * @return The deadTime.
     */
    @Override
    public int getDeadTime() {
      return deadTime_;
    }

    public static final int BLOSSOM_REFRESH_TYPE_FIELD_NUMBER = 5;
    private int blossomRefreshType_ = 0;
    /**
     * <code>uint32 blossom_refresh_type = 5;</code>
     * @return The blossomRefreshType.
     */
    @Override
    public int getBlossomRefreshType() {
      return blossomRefreshType_;
    }

    public static final int REFRESH_ID_FIELD_NUMBER = 6;
    private int refreshId_ = 0;
    /**
     * <code>uint32 refresh_id = 6;</code>
     * @return The refreshId.
     */
    @Override
    public int getRefreshId() {
      return refreshId_;
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
      if (resin_ != 0) {
        output.writeUInt32(1, resin_);
      }
      if (getQualifyUidListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(qualifyUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < qualifyUidList_.size(); i++) {
        output.writeUInt32NoTag(qualifyUidList_.getInt(i));
      }
      if (getRemainUidListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(remainUidListMemoizedSerializedSize);
      }
      for (int i = 0; i < remainUidList_.size(); i++) {
        output.writeUInt32NoTag(remainUidList_.getInt(i));
      }
      if (deadTime_ != 0) {
        output.writeUInt32(4, deadTime_);
      }
      if (blossomRefreshType_ != 0) {
        output.writeUInt32(5, blossomRefreshType_);
      }
      if (refreshId_ != 0) {
        output.writeUInt32(6, refreshId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, resin_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < qualifyUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(qualifyUidList_.getInt(i));
        }
        size += dataSize;
        if (!getQualifyUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        qualifyUidListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < remainUidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(remainUidList_.getInt(i));
        }
        size += dataSize;
        if (!getRemainUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        remainUidListMemoizedSerializedSize = dataSize;
      }
      if (deadTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, deadTime_);
      }
      if (blossomRefreshType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, blossomRefreshType_);
      }
      if (refreshId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, refreshId_);
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
      if (!(obj instanceof BlossomChestInfo)) {
        return super.equals(obj);
      }
      BlossomChestInfo other = (BlossomChestInfo) obj;

      if (getResin()
          != other.getResin()) return false;
      if (!getQualifyUidListList()
          .equals(other.getQualifyUidListList())) return false;
      if (!getRemainUidListList()
          .equals(other.getRemainUidListList())) return false;
      if (getDeadTime()
          != other.getDeadTime()) return false;
      if (getBlossomRefreshType()
          != other.getBlossomRefreshType()) return false;
      if (getRefreshId()
          != other.getRefreshId()) return false;
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
      hash = (37 * hash) + RESIN_FIELD_NUMBER;
      hash = (53 * hash) + getResin();
      if (getQualifyUidListCount() > 0) {
        hash = (37 * hash) + QUALIFY_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQualifyUidListList().hashCode();
      }
      if (getRemainUidListCount() > 0) {
        hash = (37 * hash) + REMAIN_UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRemainUidListList().hashCode();
      }
      hash = (37 * hash) + DEAD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getDeadTime();
      hash = (37 * hash) + BLOSSOM_REFRESH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getBlossomRefreshType();
      hash = (37 * hash) + REFRESH_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRefreshId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BlossomChestInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BlossomChestInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BlossomChestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BlossomChestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BlossomChestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BlossomChestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BlossomChestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BlossomChestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static BlossomChestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static BlossomChestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BlossomChestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BlossomChestInfo parseFrom(
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
    public static Builder newBuilder(BlossomChestInfo prototype) {
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
     * Obf: OGDABNFHACL
     * </pre>
     *
     * Protobuf type {@code BlossomChestInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlossomChestInfo)
        BlossomChestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BlossomChestInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.BlossomChestInfoOuterClass.BlossomChestInfo.newBuilder()
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
        resin_ = 0;
        qualifyUidList_ = emptyIntList();
        remainUidList_ = emptyIntList();
        deadTime_ = 0;
        blossomRefreshType_ = 0;
        refreshId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BlossomChestInfoOuterClass.internal_static_BlossomChestInfo_descriptor;
      }

      @Override
      public BlossomChestInfo getDefaultInstanceForType() {
        return BlossomChestInfo.getDefaultInstance();
      }

      @Override
      public BlossomChestInfo build() {
        BlossomChestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public BlossomChestInfo buildPartial() {
        BlossomChestInfo result = new BlossomChestInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(BlossomChestInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.resin_ = resin_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          qualifyUidList_.makeImmutable();
          result.qualifyUidList_ = qualifyUidList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          remainUidList_.makeImmutable();
          result.remainUidList_ = remainUidList_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.deadTime_ = deadTime_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.blossomRefreshType_ = blossomRefreshType_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.refreshId_ = refreshId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BlossomChestInfo) {
          return mergeFrom((BlossomChestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BlossomChestInfo other) {
        if (other == BlossomChestInfo.getDefaultInstance()) return this;
        if (other.getResin() != 0) {
          setResin(other.getResin());
        }
        if (!other.qualifyUidList_.isEmpty()) {
          if (qualifyUidList_.isEmpty()) {
            qualifyUidList_ = other.qualifyUidList_;
            qualifyUidList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureQualifyUidListIsMutable();
            qualifyUidList_.addAll(other.qualifyUidList_);
          }
          onChanged();
        }
        if (!other.remainUidList_.isEmpty()) {
          if (remainUidList_.isEmpty()) {
            remainUidList_ = other.remainUidList_;
            remainUidList_.makeImmutable();
            bitField0_ |= 0x00000004;
          } else {
            ensureRemainUidListIsMutable();
            remainUidList_.addAll(other.remainUidList_);
          }
          onChanged();
        }
        if (other.getDeadTime() != 0) {
          setDeadTime(other.getDeadTime());
        }
        if (other.getBlossomRefreshType() != 0) {
          setBlossomRefreshType(other.getBlossomRefreshType());
        }
        if (other.getRefreshId() != 0) {
          setRefreshId(other.getRefreshId());
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
                resin_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                int v = input.readUInt32();
                ensureQualifyUidListIsMutable();
                qualifyUidList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureQualifyUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  qualifyUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 24: {
                int v = input.readUInt32();
                ensureRemainUidListIsMutable();
                remainUidList_.addInt(v);
                break;
              } // case 24
              case 26: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureRemainUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  remainUidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 26
              case 32: {
                deadTime_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                blossomRefreshType_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                refreshId_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
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

      private int resin_ ;
      /**
       * <code>uint32 resin = 1;</code>
       * @return The resin.
       */
      @Override
      public int getResin() {
        return resin_;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @param value The resin to set.
       * @return This builder for chaining.
       */
      public Builder setResin(int value) {

        resin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 resin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearResin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        resin_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList qualifyUidList_ = emptyIntList();
      private void ensureQualifyUidListIsMutable() {
        if (!qualifyUidList_.isModifiable()) {
          qualifyUidList_ = makeMutableCopy(qualifyUidList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @return A list containing the qualifyUidList.
       */
      public java.util.List<Integer>
          getQualifyUidListList() {
        qualifyUidList_.makeImmutable();
        return qualifyUidList_;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @return The count of qualifyUidList.
       */
      public int getQualifyUidListCount() {
        return qualifyUidList_.size();
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @param index The index of the element to return.
       * @return The qualifyUidList at the given index.
       */
      public int getQualifyUidList(int index) {
        return qualifyUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The qualifyUidList to set.
       * @return This builder for chaining.
       */
      public Builder setQualifyUidList(
          int index, int value) {

        ensureQualifyUidListIsMutable();
        qualifyUidList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @param value The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addQualifyUidList(int value) {

        ensureQualifyUidListIsMutable();
        qualifyUidList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @param values The qualifyUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllQualifyUidList(
          Iterable<? extends Integer> values) {
        ensureQualifyUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, qualifyUidList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 qualify_uid_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQualifyUidList() {
        qualifyUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList remainUidList_ = emptyIntList();
      private void ensureRemainUidListIsMutable() {
        if (!remainUidList_.isModifiable()) {
          remainUidList_ = makeMutableCopy(remainUidList_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @return A list containing the remainUidList.
       */
      public java.util.List<Integer>
          getRemainUidListList() {
        remainUidList_.makeImmutable();
        return remainUidList_;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @return The count of remainUidList.
       */
      public int getRemainUidListCount() {
        return remainUidList_.size();
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @param index The index of the element to return.
       * @return The remainUidList at the given index.
       */
      public int getRemainUidList(int index) {
        return remainUidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The remainUidList to set.
       * @return This builder for chaining.
       */
      public Builder setRemainUidList(
          int index, int value) {

        ensureRemainUidListIsMutable();
        remainUidList_.setInt(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @param value The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addRemainUidList(int value) {

        ensureRemainUidListIsMutable();
        remainUidList_.addInt(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @param values The remainUidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRemainUidList(
          Iterable<? extends Integer> values) {
        ensureRemainUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, remainUidList_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 remain_uid_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainUidList() {
        remainUidList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private int deadTime_ ;
      /**
       * <code>uint32 dead_time = 4;</code>
       * @return The deadTime.
       */
      @Override
      public int getDeadTime() {
        return deadTime_;
      }
      /**
       * <code>uint32 dead_time = 4;</code>
       * @param value The deadTime to set.
       * @return This builder for chaining.
       */
      public Builder setDeadTime(int value) {

        deadTime_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dead_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeadTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        deadTime_ = 0;
        onChanged();
        return this;
      }

      private int blossomRefreshType_ ;
      /**
       * <code>uint32 blossom_refresh_type = 5;</code>
       * @return The blossomRefreshType.
       */
      @Override
      public int getBlossomRefreshType() {
        return blossomRefreshType_;
      }
      /**
       * <code>uint32 blossom_refresh_type = 5;</code>
       * @param value The blossomRefreshType to set.
       * @return This builder for chaining.
       */
      public Builder setBlossomRefreshType(int value) {

        blossomRefreshType_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 blossom_refresh_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlossomRefreshType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        blossomRefreshType_ = 0;
        onChanged();
        return this;
      }

      private int refreshId_ ;
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @return The refreshId.
       */
      @Override
      public int getRefreshId() {
        return refreshId_;
      }
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @param value The refreshId to set.
       * @return This builder for chaining.
       */
      public Builder setRefreshId(int value) {

        refreshId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 refresh_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRefreshId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        refreshId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BlossomChestInfo)
    }

    // @@protoc_insertion_point(class_scope:BlossomChestInfo)
    private static final BlossomChestInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BlossomChestInfo();
    }

    public static BlossomChestInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlossomChestInfo>
        PARSER = new com.google.protobuf.AbstractParser<BlossomChestInfo>() {
      @Override
      public BlossomChestInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlossomChestInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<BlossomChestInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public BlossomChestInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlossomChestInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlossomChestInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026BlossomChestInfo.proto\"\231\001\n\020BlossomChes" +
      "tInfo\022\r\n\005resin\030\001 \001(\r\022\030\n\020qualify_uid_list" +
      "\030\002 \003(\r\022\027\n\017remain_uid_list\030\003 \003(\r\022\021\n\tdead_" +
      "time\030\004 \001(\r\022\034\n\024blossom_refresh_type\030\005 \001(\r" +
      "\022\022\n\nrefresh_id\030\006 \001(\rB\032\n\030io.irminsul.comm" +
      "on.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlossomChestInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlossomChestInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlossomChestInfo_descriptor,
        new String[] { "Resin", "QualifyUidList", "RemainUidList", "DeadTime", "BlossomRefreshType", "RefreshId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
