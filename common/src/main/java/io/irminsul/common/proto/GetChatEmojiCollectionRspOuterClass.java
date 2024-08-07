// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: GetChatEmojiCollectionRsp.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class GetChatEmojiCollectionRspOuterClass {
  private GetChatEmojiCollectionRspOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      GetChatEmojiCollectionRspOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetChatEmojiCollectionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetChatEmojiCollectionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     * @return Whether the chatEmojiCollectionData field is set.
     */
    boolean hasChatEmojiCollectionData();
    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     * @return The chatEmojiCollectionData.
     */
    ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData();
    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     */
    ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 21858
   * Obf: NOLCBIPMJDJ
   * </pre>
   *
   * Protobuf type {@code GetChatEmojiCollectionRsp}
   */
  public static final class GetChatEmojiCollectionRsp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetChatEmojiCollectionRsp)
      GetChatEmojiCollectionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        GetChatEmojiCollectionRsp.class.getName());
    }
    // Use GetChatEmojiCollectionRsp.newBuilder() to construct.
    private GetChatEmojiCollectionRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private GetChatEmojiCollectionRsp() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetChatEmojiCollectionRsp.class, Builder.class);
    }

    private int bitField0_;
    public static final int CHAT_EMOJI_COLLECTION_DATA_FIELD_NUMBER = 1;
    private ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     * @return Whether the chatEmojiCollectionData field is set.
     */
    @Override
    public boolean hasChatEmojiCollectionData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     * @return The chatEmojiCollectionData.
     */
    @Override
    public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
      return chatEmojiCollectionData_ == null ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
    }
    /**
     * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
     */
    @Override
    public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
      return chatEmojiCollectionData_ == null ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @Override
    public int getRetcode() {
      return retcode_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getChatEmojiCollectionData());
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getChatEmojiCollectionData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof GetChatEmojiCollectionRsp)) {
        return super.equals(obj);
      }
      GetChatEmojiCollectionRsp other = (GetChatEmojiCollectionRsp) obj;

      if (hasChatEmojiCollectionData() != other.hasChatEmojiCollectionData()) return false;
      if (hasChatEmojiCollectionData()) {
        if (!getChatEmojiCollectionData()
            .equals(other.getChatEmojiCollectionData())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (hasChatEmojiCollectionData()) {
        hash = (37 * hash) + CHAT_EMOJI_COLLECTION_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getChatEmojiCollectionData().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GetChatEmojiCollectionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetChatEmojiCollectionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetChatEmojiCollectionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static GetChatEmojiCollectionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static GetChatEmojiCollectionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static GetChatEmojiCollectionRsp parseFrom(
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
    public static Builder newBuilder(GetChatEmojiCollectionRsp prototype) {
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
     * CmdId: 21858
     * Obf: NOLCBIPMJDJ
     * </pre>
     *
     * Protobuf type {@code GetChatEmojiCollectionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetChatEmojiCollectionRsp)
        GetChatEmojiCollectionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GetChatEmojiCollectionRsp.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.GetChatEmojiCollectionRspOuterClass.GetChatEmojiCollectionRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
          getChatEmojiCollectionDataFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        chatEmojiCollectionData_ = null;
        if (chatEmojiCollectionDataBuilder_ != null) {
          chatEmojiCollectionDataBuilder_.dispose();
          chatEmojiCollectionDataBuilder_ = null;
        }
        retcode_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetChatEmojiCollectionRspOuterClass.internal_static_GetChatEmojiCollectionRsp_descriptor;
      }

      @Override
      public GetChatEmojiCollectionRsp getDefaultInstanceForType() {
        return GetChatEmojiCollectionRsp.getDefaultInstance();
      }

      @Override
      public GetChatEmojiCollectionRsp build() {
        GetChatEmojiCollectionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public GetChatEmojiCollectionRsp buildPartial() {
        GetChatEmojiCollectionRsp result = new GetChatEmojiCollectionRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(GetChatEmojiCollectionRsp result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.chatEmojiCollectionData_ = chatEmojiCollectionDataBuilder_ == null
              ? chatEmojiCollectionData_
              : chatEmojiCollectionDataBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetChatEmojiCollectionRsp) {
          return mergeFrom((GetChatEmojiCollectionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GetChatEmojiCollectionRsp other) {
        if (other == GetChatEmojiCollectionRsp.getDefaultInstance()) return this;
        if (other.hasChatEmojiCollectionData()) {
          mergeChatEmojiCollectionData(other.getChatEmojiCollectionData());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 10: {
                input.readMessage(
                    getChatEmojiCollectionDataFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData chatEmojiCollectionData_;
      private com.google.protobuf.SingleFieldBuilder<
          ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder> chatEmojiCollectionDataBuilder_;
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       * @return Whether the chatEmojiCollectionData field is set.
       */
      public boolean hasChatEmojiCollectionData() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       * @return The chatEmojiCollectionData.
       */
      public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData getChatEmojiCollectionData() {
        if (chatEmojiCollectionDataBuilder_ == null) {
          return chatEmojiCollectionData_ == null ? ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
        } else {
          return chatEmojiCollectionDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public Builder setChatEmojiCollectionData(ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatEmojiCollectionData_ = value;
        } else {
          chatEmojiCollectionDataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public Builder setChatEmojiCollectionData(
          ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder builderForValue) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          chatEmojiCollectionData_ = builderForValue.build();
        } else {
          chatEmojiCollectionDataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public Builder mergeChatEmojiCollectionData(ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData value) {
        if (chatEmojiCollectionDataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            chatEmojiCollectionData_ != null &&
            chatEmojiCollectionData_ != ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance()) {
            getChatEmojiCollectionDataBuilder().mergeFrom(value);
          } else {
            chatEmojiCollectionData_ = value;
          }
        } else {
          chatEmojiCollectionDataBuilder_.mergeFrom(value);
        }
        if (chatEmojiCollectionData_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public Builder clearChatEmojiCollectionData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chatEmojiCollectionData_ = null;
        if (chatEmojiCollectionDataBuilder_ != null) {
          chatEmojiCollectionDataBuilder_.dispose();
          chatEmojiCollectionDataBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder getChatEmojiCollectionDataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChatEmojiCollectionDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      public ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder getChatEmojiCollectionDataOrBuilder() {
        if (chatEmojiCollectionDataBuilder_ != null) {
          return chatEmojiCollectionDataBuilder_.getMessageOrBuilder();
        } else {
          return chatEmojiCollectionData_ == null ?
              ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.getDefaultInstance() : chatEmojiCollectionData_;
        }
      }
      /**
       * <code>.ChatEmojiCollectionData chat_emoji_collection_data = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder>
          getChatEmojiCollectionDataFieldBuilder() {
        if (chatEmojiCollectionDataBuilder_ == null) {
          chatEmojiCollectionDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.Builder, ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionDataOrBuilder>(
                  getChatEmojiCollectionData(),
                  getParentForChildren(),
                  isClean());
          chatEmojiCollectionData_ = null;
        }
        return chatEmojiCollectionDataBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GetChatEmojiCollectionRsp)
    }

    // @@protoc_insertion_point(class_scope:GetChatEmojiCollectionRsp)
    private static final GetChatEmojiCollectionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GetChatEmojiCollectionRsp();
    }

    public static GetChatEmojiCollectionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetChatEmojiCollectionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetChatEmojiCollectionRsp>() {
      @Override
      public GetChatEmojiCollectionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetChatEmojiCollectionRsp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<GetChatEmojiCollectionRsp> getParserForType() {
      return PARSER;
    }

    @Override
    public GetChatEmojiCollectionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetChatEmojiCollectionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\037GetChatEmojiCollectionRsp.proto\032\035ChatE" +
      "mojiCollectionData.proto\"j\n\031GetChatEmoji" +
      "CollectionRsp\022<\n\032chat_emoji_collection_d" +
      "ata\030\001 \001(\0132\030.ChatEmojiCollectionData\022\017\n\007r" +
      "etcode\030\016 \001(\005B\032\n\030io.irminsul.common.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ChatEmojiCollectionDataOuterClass.getDescriptor(),
        });
    internal_static_GetChatEmojiCollectionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetChatEmojiCollectionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetChatEmojiCollectionRsp_descriptor,
        new String[] { "ChatEmojiCollectionData", "Retcode", });
    descriptor.resolveAllFeaturesImmutable();
    ChatEmojiCollectionDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
