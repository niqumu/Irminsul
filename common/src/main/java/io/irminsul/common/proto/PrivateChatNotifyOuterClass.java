// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: PrivateChatNotify.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class PrivateChatNotifyOuterClass {
  private PrivateChatNotifyOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PrivateChatNotifyOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PrivateChatNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PrivateChatNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ChatInfo chat_info = 5;</code>
     * @return Whether the chatInfo field is set.
     */
    boolean hasChatInfo();
    /**
     * <code>.ChatInfo chat_info = 5;</code>
     * @return The chatInfo.
     */
    ChatInfoOuterClass.ChatInfo getChatInfo();
    /**
     * <code>.ChatInfo chat_info = 5;</code>
     */
    ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 29471
   * Obf: ANNGLMINMGK
   * </pre>
   *
   * Protobuf type {@code PrivateChatNotify}
   */
  public static final class PrivateChatNotify extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PrivateChatNotify)
      PrivateChatNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        PrivateChatNotify.class.getName());
    }
    // Use PrivateChatNotify.newBuilder() to construct.
    private PrivateChatNotify(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private PrivateChatNotify() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PrivateChatNotifyOuterClass.internal_static_PrivateChatNotify_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PrivateChatNotifyOuterClass.internal_static_PrivateChatNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PrivateChatNotify.class, Builder.class);
    }

    private int bitField0_;
    public static final int CHAT_INFO_FIELD_NUMBER = 5;
    private ChatInfoOuterClass.ChatInfo chatInfo_;
    /**
     * <code>.ChatInfo chat_info = 5;</code>
     * @return Whether the chatInfo field is set.
     */
    @Override
    public boolean hasChatInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.ChatInfo chat_info = 5;</code>
     * @return The chatInfo.
     */
    @Override
    public ChatInfoOuterClass.ChatInfo getChatInfo() {
      return chatInfo_ == null ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
    }
    /**
     * <code>.ChatInfo chat_info = 5;</code>
     */
    @Override
    public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
      return chatInfo_ == null ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
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
        output.writeMessage(5, getChatInfo());
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
          .computeMessageSize(5, getChatInfo());
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
      if (!(obj instanceof PrivateChatNotify)) {
        return super.equals(obj);
      }
      PrivateChatNotify other = (PrivateChatNotify) obj;

      if (hasChatInfo() != other.hasChatInfo()) return false;
      if (hasChatInfo()) {
        if (!getChatInfo()
            .equals(other.getChatInfo())) return false;
      }
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
      if (hasChatInfo()) {
        hash = (37 * hash) + CHAT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getChatInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PrivateChatNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PrivateChatNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PrivateChatNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PrivateChatNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PrivateChatNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PrivateChatNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PrivateChatNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PrivateChatNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PrivateChatNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static PrivateChatNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PrivateChatNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PrivateChatNotify parseFrom(
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
    public static Builder newBuilder(PrivateChatNotify prototype) {
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
     * CmdId: 29471
     * Obf: ANNGLMINMGK
     * </pre>
     *
     * Protobuf type {@code PrivateChatNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PrivateChatNotify)
        PrivateChatNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PrivateChatNotifyOuterClass.internal_static_PrivateChatNotify_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PrivateChatNotifyOuterClass.internal_static_PrivateChatNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PrivateChatNotify.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.PrivateChatNotifyOuterClass.PrivateChatNotify.newBuilder()
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
          getChatInfoFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        chatInfo_ = null;
        if (chatInfoBuilder_ != null) {
          chatInfoBuilder_.dispose();
          chatInfoBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PrivateChatNotifyOuterClass.internal_static_PrivateChatNotify_descriptor;
      }

      @Override
      public PrivateChatNotify getDefaultInstanceForType() {
        return PrivateChatNotify.getDefaultInstance();
      }

      @Override
      public PrivateChatNotify build() {
        PrivateChatNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public PrivateChatNotify buildPartial() {
        PrivateChatNotify result = new PrivateChatNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(PrivateChatNotify result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.chatInfo_ = chatInfoBuilder_ == null
              ? chatInfo_
              : chatInfoBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PrivateChatNotify) {
          return mergeFrom((PrivateChatNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PrivateChatNotify other) {
        if (other == PrivateChatNotify.getDefaultInstance()) return this;
        if (other.hasChatInfo()) {
          mergeChatInfo(other.getChatInfo());
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
              case 42: {
                input.readMessage(
                    getChatInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 42
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

      private ChatInfoOuterClass.ChatInfo chatInfo_;
      private com.google.protobuf.SingleFieldBuilder<
          ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder> chatInfoBuilder_;
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       * @return Whether the chatInfo field is set.
       */
      public boolean hasChatInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       * @return The chatInfo.
       */
      public ChatInfoOuterClass.ChatInfo getChatInfo() {
        if (chatInfoBuilder_ == null) {
          return chatInfo_ == null ? ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        } else {
          return chatInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public Builder setChatInfo(ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          chatInfo_ = value;
        } else {
          chatInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public Builder setChatInfo(
          ChatInfoOuterClass.ChatInfo.Builder builderForValue) {
        if (chatInfoBuilder_ == null) {
          chatInfo_ = builderForValue.build();
        } else {
          chatInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public Builder mergeChatInfo(ChatInfoOuterClass.ChatInfo value) {
        if (chatInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            chatInfo_ != null &&
            chatInfo_ != ChatInfoOuterClass.ChatInfo.getDefaultInstance()) {
            getChatInfoBuilder().mergeFrom(value);
          } else {
            chatInfo_ = value;
          }
        } else {
          chatInfoBuilder_.mergeFrom(value);
        }
        if (chatInfo_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public Builder clearChatInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        chatInfo_ = null;
        if (chatInfoBuilder_ != null) {
          chatInfoBuilder_.dispose();
          chatInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public ChatInfoOuterClass.ChatInfo.Builder getChatInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getChatInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      public ChatInfoOuterClass.ChatInfoOrBuilder getChatInfoOrBuilder() {
        if (chatInfoBuilder_ != null) {
          return chatInfoBuilder_.getMessageOrBuilder();
        } else {
          return chatInfo_ == null ?
              ChatInfoOuterClass.ChatInfo.getDefaultInstance() : chatInfo_;
        }
      }
      /**
       * <code>.ChatInfo chat_info = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder>
          getChatInfoFieldBuilder() {
        if (chatInfoBuilder_ == null) {
          chatInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              ChatInfoOuterClass.ChatInfo, ChatInfoOuterClass.ChatInfo.Builder, ChatInfoOuterClass.ChatInfoOrBuilder>(
                  getChatInfo(),
                  getParentForChildren(),
                  isClean());
          chatInfo_ = null;
        }
        return chatInfoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:PrivateChatNotify)
    }

    // @@protoc_insertion_point(class_scope:PrivateChatNotify)
    private static final PrivateChatNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PrivateChatNotify();
    }

    public static PrivateChatNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PrivateChatNotify>
        PARSER = new com.google.protobuf.AbstractParser<PrivateChatNotify>() {
      @Override
      public PrivateChatNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PrivateChatNotify> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<PrivateChatNotify> getParserForType() {
      return PARSER;
    }

    @Override
    public PrivateChatNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PrivateChatNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PrivateChatNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027PrivateChatNotify.proto\032\016ChatInfo.prot" +
      "o\"1\n\021PrivateChatNotify\022\034\n\tchat_info\030\005 \001(" +
      "\0132\t.ChatInfoB\032\n\030io.irminsul.common.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ChatInfoOuterClass.getDescriptor(),
        });
    internal_static_PrivateChatNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PrivateChatNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PrivateChatNotify_descriptor,
        new String[] { "ChatInfo", });
    descriptor.resolveAllFeaturesImmutable();
    ChatInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}