// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: DeshretObeliskGadgetInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class DeshretObeliskGadgetInfoOuterClass {
  private DeshretObeliskGadgetInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      DeshretObeliskGadgetInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeshretObeliskGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DeshretObeliskGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @return A list containing the argumentList.
     */
    java.util.List<Integer> getArgumentListList();
    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @return The count of argumentList.
     */
    int getArgumentListCount();
    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @param index The index of the element to return.
     * @return The argumentList at the given index.
     */
    int getArgumentList(int index);
  }
  /**
   * <pre>
   * Obf: HBNLGHJLHNL
   * </pre>
   *
   * Protobuf type {@code DeshretObeliskGadgetInfo}
   */
  public static final class DeshretObeliskGadgetInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DeshretObeliskGadgetInfo)
      DeshretObeliskGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        DeshretObeliskGadgetInfo.class.getName());
    }
    // Use DeshretObeliskGadgetInfo.newBuilder() to construct.
    private DeshretObeliskGadgetInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private DeshretObeliskGadgetInfo() {
      argumentList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeshretObeliskGadgetInfoOuterClass.internal_static_DeshretObeliskGadgetInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeshretObeliskGadgetInfoOuterClass.internal_static_DeshretObeliskGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DeshretObeliskGadgetInfo.class, Builder.class);
    }

    public static final int ARGUMENT_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList argumentList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @return A list containing the argumentList.
     */
    @Override
    public java.util.List<Integer>
        getArgumentListList() {
      return argumentList_;
    }
    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @return The count of argumentList.
     */
    public int getArgumentListCount() {
      return argumentList_.size();
    }
    /**
     * <code>repeated uint32 argument_list = 1;</code>
     * @param index The index of the element to return.
     * @return The argumentList at the given index.
     */
    public int getArgumentList(int index) {
      return argumentList_.getInt(index);
    }
    private int argumentListMemoizedSerializedSize = -1;

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
      if (getArgumentListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(argumentListMemoizedSerializedSize);
      }
      for (int i = 0; i < argumentList_.size(); i++) {
        output.writeUInt32NoTag(argumentList_.getInt(i));
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
        for (int i = 0; i < argumentList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(argumentList_.getInt(i));
        }
        size += dataSize;
        if (!getArgumentListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        argumentListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof DeshretObeliskGadgetInfo)) {
        return super.equals(obj);
      }
      DeshretObeliskGadgetInfo other = (DeshretObeliskGadgetInfo) obj;

      if (!getArgumentListList()
          .equals(other.getArgumentListList())) return false;
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
      if (getArgumentListCount() > 0) {
        hash = (37 * hash) + ARGUMENT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getArgumentListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static DeshretObeliskGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeshretObeliskGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static DeshretObeliskGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static DeshretObeliskGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static DeshretObeliskGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static DeshretObeliskGadgetInfo parseFrom(
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
    public static Builder newBuilder(DeshretObeliskGadgetInfo prototype) {
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
     * Obf: HBNLGHJLHNL
     * </pre>
     *
     * Protobuf type {@code DeshretObeliskGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DeshretObeliskGadgetInfo)
        DeshretObeliskGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return DeshretObeliskGadgetInfoOuterClass.internal_static_DeshretObeliskGadgetInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return DeshretObeliskGadgetInfoOuterClass.internal_static_DeshretObeliskGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                DeshretObeliskGadgetInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.DeshretObeliskGadgetInfoOuterClass.DeshretObeliskGadgetInfo.newBuilder()
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
        argumentList_ = emptyIntList();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return DeshretObeliskGadgetInfoOuterClass.internal_static_DeshretObeliskGadgetInfo_descriptor;
      }

      @Override
      public DeshretObeliskGadgetInfo getDefaultInstanceForType() {
        return DeshretObeliskGadgetInfo.getDefaultInstance();
      }

      @Override
      public DeshretObeliskGadgetInfo build() {
        DeshretObeliskGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public DeshretObeliskGadgetInfo buildPartial() {
        DeshretObeliskGadgetInfo result = new DeshretObeliskGadgetInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(DeshretObeliskGadgetInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          argumentList_.makeImmutable();
          result.argumentList_ = argumentList_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof DeshretObeliskGadgetInfo) {
          return mergeFrom((DeshretObeliskGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(DeshretObeliskGadgetInfo other) {
        if (other == DeshretObeliskGadgetInfo.getDefaultInstance()) return this;
        if (!other.argumentList_.isEmpty()) {
          if (argumentList_.isEmpty()) {
            argumentList_ = other.argumentList_;
            argumentList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureArgumentListIsMutable();
            argumentList_.addAll(other.argumentList_);
          }
          onChanged();
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
                ensureArgumentListIsMutable();
                argumentList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureArgumentListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  argumentList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
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

      private com.google.protobuf.Internal.IntList argumentList_ = emptyIntList();
      private void ensureArgumentListIsMutable() {
        if (!argumentList_.isModifiable()) {
          argumentList_ = makeMutableCopy(argumentList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @return A list containing the argumentList.
       */
      public java.util.List<Integer>
          getArgumentListList() {
        argumentList_.makeImmutable();
        return argumentList_;
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @return The count of argumentList.
       */
      public int getArgumentListCount() {
        return argumentList_.size();
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @param index The index of the element to return.
       * @return The argumentList at the given index.
       */
      public int getArgumentList(int index) {
        return argumentList_.getInt(index);
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The argumentList to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentList(
          int index, int value) {

        ensureArgumentListIsMutable();
        argumentList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @param value The argumentList to add.
       * @return This builder for chaining.
       */
      public Builder addArgumentList(int value) {

        ensureArgumentListIsMutable();
        argumentList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @param values The argumentList to add.
       * @return This builder for chaining.
       */
      public Builder addAllArgumentList(
          Iterable<? extends Integer> values) {
        ensureArgumentListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, argumentList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 argument_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgumentList() {
        argumentList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DeshretObeliskGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:DeshretObeliskGadgetInfo)
    private static final DeshretObeliskGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DeshretObeliskGadgetInfo();
    }

    public static DeshretObeliskGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeshretObeliskGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<DeshretObeliskGadgetInfo>() {
      @Override
      public DeshretObeliskGadgetInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<DeshretObeliskGadgetInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<DeshretObeliskGadgetInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public DeshretObeliskGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeshretObeliskGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DeshretObeliskGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\036DeshretObeliskGadgetInfo.proto\"1\n\030Desh" +
      "retObeliskGadgetInfo\022\025\n\rargument_list\030\001 " +
      "\003(\rB\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DeshretObeliskGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DeshretObeliskGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DeshretObeliskGadgetInfo_descriptor,
        new String[] { "ArgumentList", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
