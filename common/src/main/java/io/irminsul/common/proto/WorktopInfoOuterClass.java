// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: WorktopInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class WorktopInfoOuterClass {
  private WorktopInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      WorktopInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorktopInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorktopInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @return A list containing the optionList.
     */
    java.util.List<Integer> getOptionListList();
    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @return The count of optionList.
     */
    int getOptionListCount();
    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @param index The index of the element to return.
     * @return The optionList at the given index.
     */
    int getOptionList(int index);

    /**
     * <code>bool is_guest_can_operate = 2;</code>
     * @return The isGuestCanOperate.
     */
    boolean getIsGuestCanOperate();
  }
  /**
   * <pre>
   * Obf: FHDMCJINDAH
   * </pre>
   *
   * Protobuf type {@code WorktopInfo}
   */
  public static final class WorktopInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:WorktopInfo)
      WorktopInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        WorktopInfo.class.getName());
    }
    // Use WorktopInfo.newBuilder() to construct.
    private WorktopInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private WorktopInfo() {
      optionList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WorktopInfoOuterClass.internal_static_WorktopInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              WorktopInfo.class, Builder.class);
    }

    public static final int OPTION_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList optionList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @return A list containing the optionList.
     */
    @Override
    public java.util.List<Integer>
        getOptionListList() {
      return optionList_;
    }
    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @return The count of optionList.
     */
    public int getOptionListCount() {
      return optionList_.size();
    }
    /**
     * <code>repeated uint32 option_list = 1;</code>
     * @param index The index of the element to return.
     * @return The optionList at the given index.
     */
    public int getOptionList(int index) {
      return optionList_.getInt(index);
    }
    private int optionListMemoizedSerializedSize = -1;

    public static final int IS_GUEST_CAN_OPERATE_FIELD_NUMBER = 2;
    private boolean isGuestCanOperate_ = false;
    /**
     * <code>bool is_guest_can_operate = 2;</code>
     * @return The isGuestCanOperate.
     */
    @Override
    public boolean getIsGuestCanOperate() {
      return isGuestCanOperate_;
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
      if (getOptionListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(optionListMemoizedSerializedSize);
      }
      for (int i = 0; i < optionList_.size(); i++) {
        output.writeUInt32NoTag(optionList_.getInt(i));
      }
      if (isGuestCanOperate_ != false) {
        output.writeBool(2, isGuestCanOperate_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < optionList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(optionList_.getInt(i));
        }
        size += dataSize;
        if (!getOptionListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        optionListMemoizedSerializedSize = dataSize;
      }
      if (isGuestCanOperate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isGuestCanOperate_);
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
      if (!(obj instanceof WorktopInfo)) {
        return super.equals(obj);
      }
      WorktopInfo other = (WorktopInfo) obj;

      if (!getOptionListList()
          .equals(other.getOptionListList())) return false;
      if (getIsGuestCanOperate()
          != other.getIsGuestCanOperate()) return false;
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
      if (getOptionListCount() > 0) {
        hash = (37 * hash) + OPTION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOptionListList().hashCode();
      }
      hash = (37 * hash) + IS_GUEST_CAN_OPERATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsGuestCanOperate());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static WorktopInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorktopInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorktopInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorktopInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorktopInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static WorktopInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static WorktopInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static WorktopInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static WorktopInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static WorktopInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static WorktopInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static WorktopInfo parseFrom(
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
    public static Builder newBuilder(WorktopInfo prototype) {
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
     * Obf: FHDMCJINDAH
     * </pre>
     *
     * Protobuf type {@code WorktopInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorktopInfo)
        WorktopInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WorktopInfoOuterClass.internal_static_WorktopInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                WorktopInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.WorktopInfoOuterClass.WorktopInfo.newBuilder()
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
        optionList_ = emptyIntList();
        isGuestCanOperate_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WorktopInfoOuterClass.internal_static_WorktopInfo_descriptor;
      }

      @Override
      public WorktopInfo getDefaultInstanceForType() {
        return WorktopInfo.getDefaultInstance();
      }

      @Override
      public WorktopInfo build() {
        WorktopInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public WorktopInfo buildPartial() {
        WorktopInfo result = new WorktopInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(WorktopInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          optionList_.makeImmutable();
          result.optionList_ = optionList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isGuestCanOperate_ = isGuestCanOperate_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof WorktopInfo) {
          return mergeFrom((WorktopInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(WorktopInfo other) {
        if (other == WorktopInfo.getDefaultInstance()) return this;
        if (!other.optionList_.isEmpty()) {
          if (optionList_.isEmpty()) {
            optionList_ = other.optionList_;
            optionList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureOptionListIsMutable();
            optionList_.addAll(other.optionList_);
          }
          onChanged();
        }
        if (other.getIsGuestCanOperate() != false) {
          setIsGuestCanOperate(other.getIsGuestCanOperate());
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
                int v = input.readUInt32();
                ensureOptionListIsMutable();
                optionList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureOptionListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  optionList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 16: {
                isGuestCanOperate_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private com.google.protobuf.Internal.IntList optionList_ = emptyIntList();
      private void ensureOptionListIsMutable() {
        if (!optionList_.isModifiable()) {
          optionList_ = makeMutableCopy(optionList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @return A list containing the optionList.
       */
      public java.util.List<Integer>
          getOptionListList() {
        optionList_.makeImmutable();
        return optionList_;
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @return The count of optionList.
       */
      public int getOptionListCount() {
        return optionList_.size();
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @param index The index of the element to return.
       * @return The optionList at the given index.
       */
      public int getOptionList(int index) {
        return optionList_.getInt(index);
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The optionList to set.
       * @return This builder for chaining.
       */
      public Builder setOptionList(
          int index, int value) {

        ensureOptionListIsMutable();
        optionList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @param value The optionList to add.
       * @return This builder for chaining.
       */
      public Builder addOptionList(int value) {

        ensureOptionListIsMutable();
        optionList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @param values The optionList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOptionList(
          Iterable<? extends Integer> values) {
        ensureOptionListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, optionList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 option_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionList() {
        optionList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isGuestCanOperate_ ;
      /**
       * <code>bool is_guest_can_operate = 2;</code>
       * @return The isGuestCanOperate.
       */
      @Override
      public boolean getIsGuestCanOperate() {
        return isGuestCanOperate_;
      }
      /**
       * <code>bool is_guest_can_operate = 2;</code>
       * @param value The isGuestCanOperate to set.
       * @return This builder for chaining.
       */
      public Builder setIsGuestCanOperate(boolean value) {

        isGuestCanOperate_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_guest_can_operate = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsGuestCanOperate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isGuestCanOperate_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:WorktopInfo)
    }

    // @@protoc_insertion_point(class_scope:WorktopInfo)
    private static final WorktopInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new WorktopInfo();
    }

    public static WorktopInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorktopInfo>
        PARSER = new com.google.protobuf.AbstractParser<WorktopInfo>() {
      @Override
      public WorktopInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorktopInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<WorktopInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public WorktopInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorktopInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_WorktopInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021WorktopInfo.proto\"@\n\013WorktopInfo\022\023\n\013op" +
      "tion_list\030\001 \003(\r\022\034\n\024is_guest_can_operate\030" +
      "\002 \001(\010B\032\n\030io.irminsul.common.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WorktopInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorktopInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_WorktopInfo_descriptor,
        new String[] { "OptionList", "IsGuestCanOperate", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}