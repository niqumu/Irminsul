// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: AvatarSkillInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class AvatarSkillInfoOuterClass {
  private AvatarSkillInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AvatarSkillInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 pass_cd_time = 1;</code>
     * @return The passCdTime.
     */
    int getPassCdTime();

    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return A list containing the fullCdTimeList.
     */
    java.util.List<Integer> getFullCdTimeListList();
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return The count of fullCdTimeList.
     */
    int getFullCdTimeListCount();
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fullCdTimeList at the given index.
     */
    int getFullCdTimeList(int index);

    /**
     * <code>uint32 max_charge_count = 3;</code>
     * @return The maxChargeCount.
     */
    int getMaxChargeCount();
  }
  /**
   * <pre>
   * Obf: FKBNODHMBMG
   * </pre>
   *
   * Protobuf type {@code AvatarSkillInfo}
   */
  public static final class AvatarSkillInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AvatarSkillInfo)
      AvatarSkillInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        AvatarSkillInfo.class.getName());
    }
    // Use AvatarSkillInfo.newBuilder() to construct.
    private AvatarSkillInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillInfo() {
      fullCdTimeList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AvatarSkillInfo.class, Builder.class);
    }

    public static final int PASS_CD_TIME_FIELD_NUMBER = 1;
    private int passCdTime_ = 0;
    /**
     * <code>uint32 pass_cd_time = 1;</code>
     * @return The passCdTime.
     */
    @Override
    public int getPassCdTime() {
      return passCdTime_;
    }

    public static final int FULL_CD_TIME_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList fullCdTimeList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return A list containing the fullCdTimeList.
     */
    @Override
    public java.util.List<Integer>
        getFullCdTimeListList() {
      return fullCdTimeList_;
    }
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @return The count of fullCdTimeList.
     */
    public int getFullCdTimeListCount() {
      return fullCdTimeList_.size();
    }
    /**
     * <code>repeated uint32 full_cd_time_list = 2;</code>
     * @param index The index of the element to return.
     * @return The fullCdTimeList at the given index.
     */
    public int getFullCdTimeList(int index) {
      return fullCdTimeList_.getInt(index);
    }
    private int fullCdTimeListMemoizedSerializedSize = -1;

    public static final int MAX_CHARGE_COUNT_FIELD_NUMBER = 3;
    private int maxChargeCount_ = 0;
    /**
     * <code>uint32 max_charge_count = 3;</code>
     * @return The maxChargeCount.
     */
    @Override
    public int getMaxChargeCount() {
      return maxChargeCount_;
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
      if (passCdTime_ != 0) {
        output.writeUInt32(1, passCdTime_);
      }
      if (getFullCdTimeListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(fullCdTimeListMemoizedSerializedSize);
      }
      for (int i = 0; i < fullCdTimeList_.size(); i++) {
        output.writeUInt32NoTag(fullCdTimeList_.getInt(i));
      }
      if (maxChargeCount_ != 0) {
        output.writeUInt32(3, maxChargeCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (passCdTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, passCdTime_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fullCdTimeList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fullCdTimeList_.getInt(i));
        }
        size += dataSize;
        if (!getFullCdTimeListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fullCdTimeListMemoizedSerializedSize = dataSize;
      }
      if (maxChargeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxChargeCount_);
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
      if (!(obj instanceof AvatarSkillInfo)) {
        return super.equals(obj);
      }
      AvatarSkillInfo other = (AvatarSkillInfo) obj;

      if (getPassCdTime()
          != other.getPassCdTime()) return false;
      if (!getFullCdTimeListList()
          .equals(other.getFullCdTimeListList())) return false;
      if (getMaxChargeCount()
          != other.getMaxChargeCount()) return false;
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
      hash = (37 * hash) + PASS_CD_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPassCdTime();
      if (getFullCdTimeListCount() > 0) {
        hash = (37 * hash) + FULL_CD_TIME_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFullCdTimeListList().hashCode();
      }
      hash = (37 * hash) + MAX_CHARGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxChargeCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AvatarSkillInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarSkillInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarSkillInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarSkillInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarSkillInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AvatarSkillInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AvatarSkillInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AvatarSkillInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AvatarSkillInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static AvatarSkillInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AvatarSkillInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AvatarSkillInfo parseFrom(
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
    public static Builder newBuilder(AvatarSkillInfo prototype) {
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
     * Obf: FKBNODHMBMG
     * </pre>
     *
     * Protobuf type {@code AvatarSkillInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillInfo)
        AvatarSkillInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AvatarSkillInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.AvatarSkillInfoOuterClass.AvatarSkillInfo.newBuilder()
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
        passCdTime_ = 0;
        fullCdTimeList_ = emptyIntList();
        maxChargeCount_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AvatarSkillInfoOuterClass.internal_static_AvatarSkillInfo_descriptor;
      }

      @Override
      public AvatarSkillInfo getDefaultInstanceForType() {
        return AvatarSkillInfo.getDefaultInstance();
      }

      @Override
      public AvatarSkillInfo build() {
        AvatarSkillInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public AvatarSkillInfo buildPartial() {
        AvatarSkillInfo result = new AvatarSkillInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(AvatarSkillInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.passCdTime_ = passCdTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          fullCdTimeList_.makeImmutable();
          result.fullCdTimeList_ = fullCdTimeList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.maxChargeCount_ = maxChargeCount_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AvatarSkillInfo) {
          return mergeFrom((AvatarSkillInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AvatarSkillInfo other) {
        if (other == AvatarSkillInfo.getDefaultInstance()) return this;
        if (other.getPassCdTime() != 0) {
          setPassCdTime(other.getPassCdTime());
        }
        if (!other.fullCdTimeList_.isEmpty()) {
          if (fullCdTimeList_.isEmpty()) {
            fullCdTimeList_ = other.fullCdTimeList_;
            fullCdTimeList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureFullCdTimeListIsMutable();
            fullCdTimeList_.addAll(other.fullCdTimeList_);
          }
          onChanged();
        }
        if (other.getMaxChargeCount() != 0) {
          setMaxChargeCount(other.getMaxChargeCount());
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
                passCdTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                int v = input.readUInt32();
                ensureFullCdTimeListIsMutable();
                fullCdTimeList_.addInt(v);
                break;
              } // case 16
              case 18: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFullCdTimeListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fullCdTimeList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 18
              case 24: {
                maxChargeCount_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private int passCdTime_ ;
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @return The passCdTime.
       */
      @Override
      public int getPassCdTime() {
        return passCdTime_;
      }
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @param value The passCdTime to set.
       * @return This builder for chaining.
       */
      public Builder setPassCdTime(int value) {

        passCdTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pass_cd_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPassCdTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        passCdTime_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fullCdTimeList_ = emptyIntList();
      private void ensureFullCdTimeListIsMutable() {
        if (!fullCdTimeList_.isModifiable()) {
          fullCdTimeList_ = makeMutableCopy(fullCdTimeList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return A list containing the fullCdTimeList.
       */
      public java.util.List<Integer>
          getFullCdTimeListList() {
        fullCdTimeList_.makeImmutable();
        return fullCdTimeList_;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return The count of fullCdTimeList.
       */
      public int getFullCdTimeListCount() {
        return fullCdTimeList_.size();
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param index The index of the element to return.
       * @return The fullCdTimeList at the given index.
       */
      public int getFullCdTimeList(int index) {
        return fullCdTimeList_.getInt(index);
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param index The index to set the value at.
       * @param value The fullCdTimeList to set.
       * @return This builder for chaining.
       */
      public Builder setFullCdTimeList(
          int index, int value) {

        ensureFullCdTimeListIsMutable();
        fullCdTimeList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param value The fullCdTimeList to add.
       * @return This builder for chaining.
       */
      public Builder addFullCdTimeList(int value) {

        ensureFullCdTimeListIsMutable();
        fullCdTimeList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @param values The fullCdTimeList to add.
       * @return This builder for chaining.
       */
      public Builder addAllFullCdTimeList(
          Iterable<? extends Integer> values) {
        ensureFullCdTimeListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fullCdTimeList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 full_cd_time_list = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFullCdTimeList() {
        fullCdTimeList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int maxChargeCount_ ;
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @return The maxChargeCount.
       */
      @Override
      public int getMaxChargeCount() {
        return maxChargeCount_;
      }
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @param value The maxChargeCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxChargeCount(int value) {

        maxChargeCount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_charge_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxChargeCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxChargeCount_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AvatarSkillInfo)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillInfo)
    private static final AvatarSkillInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AvatarSkillInfo();
    }

    public static AvatarSkillInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillInfo>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillInfo>() {
      @Override
      public AvatarSkillInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarSkillInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AvatarSkillInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public AvatarSkillInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AvatarSkillInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025AvatarSkillInfo.proto\"\\\n\017AvatarSkillIn" +
      "fo\022\024\n\014pass_cd_time\030\001 \001(\r\022\031\n\021full_cd_time" +
      "_list\030\002 \003(\r\022\030\n\020max_charge_count\030\003 \001(\rB\032\n" +
      "\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AvatarSkillInfo_descriptor,
        new String[] { "PassCdTime", "FullCdTimeList", "MaxChargeCount", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
