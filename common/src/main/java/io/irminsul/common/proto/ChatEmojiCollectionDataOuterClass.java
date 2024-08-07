// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ChatEmojiCollectionData.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ChatEmojiCollectionDataOuterClass {
  private ChatEmojiCollectionDataOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ChatEmojiCollectionDataOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChatEmojiCollectionDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChatEmojiCollectionData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @return A list containing the emojiIdList.
     */
    java.util.List<Integer> getEmojiIdListList();
    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @return The count of emojiIdList.
     */
    int getEmojiIdListCount();
    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The emojiIdList at the given index.
     */
    int getEmojiIdList(int index);
  }
  /**
   * <pre>
   * Obf: GFDAHNLKKNG
   * </pre>
   *
   * Protobuf type {@code ChatEmojiCollectionData}
   */
  public static final class ChatEmojiCollectionData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ChatEmojiCollectionData)
      ChatEmojiCollectionDataOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        ChatEmojiCollectionData.class.getName());
    }
    // Use ChatEmojiCollectionData.newBuilder() to construct.
    private ChatEmojiCollectionData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ChatEmojiCollectionData() {
      emojiIdList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChatEmojiCollectionDataOuterClass.internal_static_ChatEmojiCollectionData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChatEmojiCollectionDataOuterClass.internal_static_ChatEmojiCollectionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChatEmojiCollectionData.class, Builder.class);
    }

    public static final int EMOJI_ID_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList emojiIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @return A list containing the emojiIdList.
     */
    @Override
    public java.util.List<Integer>
        getEmojiIdListList() {
      return emojiIdList_;
    }
    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @return The count of emojiIdList.
     */
    public int getEmojiIdListCount() {
      return emojiIdList_.size();
    }
    /**
     * <code>repeated uint32 emoji_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The emojiIdList at the given index.
     */
    public int getEmojiIdList(int index) {
      return emojiIdList_.getInt(index);
    }
    private int emojiIdListMemoizedSerializedSize = -1;

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
      if (getEmojiIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(emojiIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < emojiIdList_.size(); i++) {
        output.writeUInt32NoTag(emojiIdList_.getInt(i));
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
        for (int i = 0; i < emojiIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(emojiIdList_.getInt(i));
        }
        size += dataSize;
        if (!getEmojiIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        emojiIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof ChatEmojiCollectionData)) {
        return super.equals(obj);
      }
      ChatEmojiCollectionData other = (ChatEmojiCollectionData) obj;

      if (!getEmojiIdListList()
          .equals(other.getEmojiIdListList())) return false;
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
      if (getEmojiIdListCount() > 0) {
        hash = (37 * hash) + EMOJI_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEmojiIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ChatEmojiCollectionData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChatEmojiCollectionData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChatEmojiCollectionData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChatEmojiCollectionData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChatEmojiCollectionData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ChatEmojiCollectionData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ChatEmojiCollectionData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ChatEmojiCollectionData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ChatEmojiCollectionData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ChatEmojiCollectionData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ChatEmojiCollectionData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ChatEmojiCollectionData parseFrom(
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
    public static Builder newBuilder(ChatEmojiCollectionData prototype) {
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
     * Obf: GFDAHNLKKNG
     * </pre>
     *
     * Protobuf type {@code ChatEmojiCollectionData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChatEmojiCollectionData)
        ChatEmojiCollectionDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ChatEmojiCollectionDataOuterClass.internal_static_ChatEmojiCollectionData_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ChatEmojiCollectionDataOuterClass.internal_static_ChatEmojiCollectionData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ChatEmojiCollectionData.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ChatEmojiCollectionDataOuterClass.ChatEmojiCollectionData.newBuilder()
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
        emojiIdList_ = emptyIntList();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ChatEmojiCollectionDataOuterClass.internal_static_ChatEmojiCollectionData_descriptor;
      }

      @Override
      public ChatEmojiCollectionData getDefaultInstanceForType() {
        return ChatEmojiCollectionData.getDefaultInstance();
      }

      @Override
      public ChatEmojiCollectionData build() {
        ChatEmojiCollectionData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ChatEmojiCollectionData buildPartial() {
        ChatEmojiCollectionData result = new ChatEmojiCollectionData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ChatEmojiCollectionData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          emojiIdList_.makeImmutable();
          result.emojiIdList_ = emojiIdList_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ChatEmojiCollectionData) {
          return mergeFrom((ChatEmojiCollectionData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ChatEmojiCollectionData other) {
        if (other == ChatEmojiCollectionData.getDefaultInstance()) return this;
        if (!other.emojiIdList_.isEmpty()) {
          if (emojiIdList_.isEmpty()) {
            emojiIdList_ = other.emojiIdList_;
            emojiIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureEmojiIdListIsMutable();
            emojiIdList_.addAll(other.emojiIdList_);
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
                ensureEmojiIdListIsMutable();
                emojiIdList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureEmojiIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  emojiIdList_.addInt(input.readUInt32());
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

      private com.google.protobuf.Internal.IntList emojiIdList_ = emptyIntList();
      private void ensureEmojiIdListIsMutable() {
        if (!emojiIdList_.isModifiable()) {
          emojiIdList_ = makeMutableCopy(emojiIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @return A list containing the emojiIdList.
       */
      public java.util.List<Integer>
          getEmojiIdListList() {
        emojiIdList_.makeImmutable();
        return emojiIdList_;
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @return The count of emojiIdList.
       */
      public int getEmojiIdListCount() {
        return emojiIdList_.size();
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The emojiIdList at the given index.
       */
      public int getEmojiIdList(int index) {
        return emojiIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The emojiIdList to set.
       * @return This builder for chaining.
       */
      public Builder setEmojiIdList(
          int index, int value) {

        ensureEmojiIdListIsMutable();
        emojiIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @param value The emojiIdList to add.
       * @return This builder for chaining.
       */
      public Builder addEmojiIdList(int value) {

        ensureEmojiIdListIsMutable();
        emojiIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @param values The emojiIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEmojiIdList(
          Iterable<? extends Integer> values) {
        ensureEmojiIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, emojiIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 emoji_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEmojiIdList() {
        emojiIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ChatEmojiCollectionData)
    }

    // @@protoc_insertion_point(class_scope:ChatEmojiCollectionData)
    private static final ChatEmojiCollectionData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChatEmojiCollectionData();
    }

    public static ChatEmojiCollectionData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChatEmojiCollectionData>
        PARSER = new com.google.protobuf.AbstractParser<ChatEmojiCollectionData>() {
      @Override
      public ChatEmojiCollectionData parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChatEmojiCollectionData> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ChatEmojiCollectionData> getParserForType() {
      return PARSER;
    }

    @Override
    public ChatEmojiCollectionData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatEmojiCollectionData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ChatEmojiCollectionData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035ChatEmojiCollectionData.proto\"0\n\027ChatE" +
      "mojiCollectionData\022\025\n\remoji_id_list\030\001 \003(" +
      "\rB\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChatEmojiCollectionData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatEmojiCollectionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ChatEmojiCollectionData_descriptor,
        new String[] { "EmojiIdList", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
