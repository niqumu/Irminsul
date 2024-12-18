// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: MailChangeNotify.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class MailChangeNotifyOuterClass {
  private MailChangeNotifyOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      MailChangeNotifyOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MailChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MailChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return A list containing the delMailIdList.
     */
    java.util.List<Integer> getDelMailIdListList();
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return The count of delMailIdList.
     */
    int getDelMailIdListCount();
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The delMailIdList at the given index.
     */
    int getDelMailIdList(int index);

    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    java.util.List<MailDataOuterClass.MailData>
        getMailListList();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    MailDataOuterClass.MailData getMailList(int index);
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    int getMailListCount();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    java.util.List<? extends MailDataOuterClass.MailDataOrBuilder>
        getMailListOrBuilderList();
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 7569
   * Obf: COPGIOFFCBJ
   * </pre>
   *
   * Protobuf type {@code MailChangeNotify}
   */
  public static final class MailChangeNotify extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MailChangeNotify)
      MailChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        MailChangeNotify.class.getName());
    }
    // Use MailChangeNotify.newBuilder() to construct.
    private MailChangeNotify(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private MailChangeNotify() {
      delMailIdList_ = emptyIntList();
      mailList_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MailChangeNotify.class, Builder.class);
    }

    public static final int DEL_MAIL_ID_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList delMailIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return A list containing the delMailIdList.
     */
    @Override
    public java.util.List<Integer>
        getDelMailIdListList() {
      return delMailIdList_;
    }
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @return The count of delMailIdList.
     */
    public int getDelMailIdListCount() {
      return delMailIdList_.size();
    }
    /**
     * <code>repeated uint32 del_mail_id_list = 11;</code>
     * @param index The index of the element to return.
     * @return The delMailIdList at the given index.
     */
    public int getDelMailIdList(int index) {
      return delMailIdList_.getInt(index);
    }
    private int delMailIdListMemoizedSerializedSize = -1;

    public static final int MAIL_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<MailDataOuterClass.MailData> mailList_;
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @Override
    public java.util.List<MailDataOuterClass.MailData> getMailListList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @Override
    public java.util.List<? extends MailDataOuterClass.MailDataOrBuilder>
        getMailListOrBuilderList() {
      return mailList_;
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @Override
    public int getMailListCount() {
      return mailList_.size();
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @Override
    public MailDataOuterClass.MailData getMailList(int index) {
      return mailList_.get(index);
    }
    /**
     * <code>repeated .MailData mail_list = 3;</code>
     */
    @Override
    public MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
        int index) {
      return mailList_.get(index);
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
      for (int i = 0; i < mailList_.size(); i++) {
        output.writeMessage(3, mailList_.get(i));
      }
      if (getDelMailIdListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(delMailIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < delMailIdList_.size(); i++) {
        output.writeUInt32NoTag(delMailIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < mailList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, mailList_.get(i));
      }
      {
        int dataSize = 0;
        for (int i = 0; i < delMailIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(delMailIdList_.getInt(i));
        }
        size += dataSize;
        if (!getDelMailIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        delMailIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof MailChangeNotify)) {
        return super.equals(obj);
      }
      MailChangeNotify other = (MailChangeNotify) obj;

      if (!getDelMailIdListList()
          .equals(other.getDelMailIdListList())) return false;
      if (!getMailListList()
          .equals(other.getMailListList())) return false;
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
      if (getDelMailIdListCount() > 0) {
        hash = (37 * hash) + DEL_MAIL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDelMailIdListList().hashCode();
      }
      if (getMailListCount() > 0) {
        hash = (37 * hash) + MAIL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMailListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MailChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MailChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static MailChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static MailChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MailChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MailChangeNotify parseFrom(
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
    public static Builder newBuilder(MailChangeNotify prototype) {
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
     * CmdId: 7569
     * Obf: COPGIOFFCBJ
     * </pre>
     *
     * Protobuf type {@code MailChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MailChangeNotify)
        MailChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MailChangeNotify.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.MailChangeNotifyOuterClass.MailChangeNotify.newBuilder()
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
        delMailIdList_ = emptyIntList();
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
        } else {
          mailList_ = null;
          mailListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MailChangeNotifyOuterClass.internal_static_MailChangeNotify_descriptor;
      }

      @Override
      public MailChangeNotify getDefaultInstanceForType() {
        return MailChangeNotify.getDefaultInstance();
      }

      @Override
      public MailChangeNotify build() {
        MailChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public MailChangeNotify buildPartial() {
        MailChangeNotify result = new MailChangeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(MailChangeNotify result) {
        if (mailListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            mailList_ = java.util.Collections.unmodifiableList(mailList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.mailList_ = mailList_;
        } else {
          result.mailList_ = mailListBuilder_.build();
        }
      }

      private void buildPartial0(MailChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          delMailIdList_.makeImmutable();
          result.delMailIdList_ = delMailIdList_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MailChangeNotify) {
          return mergeFrom((MailChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MailChangeNotify other) {
        if (other == MailChangeNotify.getDefaultInstance()) return this;
        if (!other.delMailIdList_.isEmpty()) {
          if (delMailIdList_.isEmpty()) {
            delMailIdList_ = other.delMailIdList_;
            delMailIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureDelMailIdListIsMutable();
            delMailIdList_.addAll(other.delMailIdList_);
          }
          onChanged();
        }
        if (mailListBuilder_ == null) {
          if (!other.mailList_.isEmpty()) {
            if (mailList_.isEmpty()) {
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureMailListIsMutable();
              mailList_.addAll(other.mailList_);
            }
            onChanged();
          }
        } else {
          if (!other.mailList_.isEmpty()) {
            if (mailListBuilder_.isEmpty()) {
              mailListBuilder_.dispose();
              mailListBuilder_ = null;
              mailList_ = other.mailList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              mailListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMailListFieldBuilder() : null;
            } else {
              mailListBuilder_.addAllMessages(other.mailList_);
            }
          }
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
              case 26: {
                MailDataOuterClass.MailData m =
                    input.readMessage(
                        MailDataOuterClass.MailData.parser(),
                        extensionRegistry);
                if (mailListBuilder_ == null) {
                  ensureMailListIsMutable();
                  mailList_.add(m);
                } else {
                  mailListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 88: {
                int v = input.readUInt32();
                ensureDelMailIdListIsMutable();
                delMailIdList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureDelMailIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  delMailIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private com.google.protobuf.Internal.IntList delMailIdList_ = emptyIntList();
      private void ensureDelMailIdListIsMutable() {
        if (!delMailIdList_.isModifiable()) {
          delMailIdList_ = makeMutableCopy(delMailIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return A list containing the delMailIdList.
       */
      public java.util.List<Integer>
          getDelMailIdListList() {
        delMailIdList_.makeImmutable();
        return delMailIdList_;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return The count of delMailIdList.
       */
      public int getDelMailIdListCount() {
        return delMailIdList_.size();
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param index The index of the element to return.
       * @return The delMailIdList at the given index.
       */
      public int getDelMailIdList(int index) {
        return delMailIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The delMailIdList to set.
       * @return This builder for chaining.
       */
      public Builder setDelMailIdList(
          int index, int value) {

        ensureDelMailIdListIsMutable();
        delMailIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param value The delMailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addDelMailIdList(int value) {

        ensureDelMailIdListIsMutable();
        delMailIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @param values The delMailIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDelMailIdList(
          Iterable<? extends Integer> values) {
        ensureDelMailIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, delMailIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 del_mail_id_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDelMailIdList() {
        delMailIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private java.util.List<MailDataOuterClass.MailData> mailList_ =
        java.util.Collections.emptyList();
      private void ensureMailListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          mailList_ = new java.util.ArrayList<MailDataOuterClass.MailData>(mailList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder> mailListBuilder_;

      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<MailDataOuterClass.MailData> getMailListList() {
        if (mailListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mailList_);
        } else {
          return mailListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public int getMailListCount() {
        if (mailListBuilder_ == null) {
          return mailList_.size();
        } else {
          return mailListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public MailDataOuterClass.MailData getMailList(int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);
        } else {
          return mailListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder setMailList(
          int index, MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.set(index, value);
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder setMailList(
          int index, MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.set(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          int index, MailDataOuterClass.MailData value) {
        if (mailListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMailListIsMutable();
          mailList_.add(index, value);
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addMailList(
          int index, MailDataOuterClass.MailData.Builder builderForValue) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.add(index, builderForValue.build());
          onChanged();
        } else {
          mailListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder addAllMailList(
          Iterable<? extends MailDataOuterClass.MailData> values) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mailList_);
          onChanged();
        } else {
          mailListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder clearMailList() {
        if (mailListBuilder_ == null) {
          mailList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          mailListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public Builder removeMailList(int index) {
        if (mailListBuilder_ == null) {
          ensureMailListIsMutable();
          mailList_.remove(index);
          onChanged();
        } else {
          mailListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public MailDataOuterClass.MailData.Builder getMailListBuilder(
          int index) {
        return getMailListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public MailDataOuterClass.MailDataOrBuilder getMailListOrBuilder(
          int index) {
        if (mailListBuilder_ == null) {
          return mailList_.get(index);  } else {
          return mailListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<? extends MailDataOuterClass.MailDataOrBuilder>
           getMailListOrBuilderList() {
        if (mailListBuilder_ != null) {
          return mailListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mailList_);
        }
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public MailDataOuterClass.MailData.Builder addMailListBuilder() {
        return getMailListFieldBuilder().addBuilder(
            MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public MailDataOuterClass.MailData.Builder addMailListBuilder(
          int index) {
        return getMailListFieldBuilder().addBuilder(
            index, MailDataOuterClass.MailData.getDefaultInstance());
      }
      /**
       * <code>repeated .MailData mail_list = 3;</code>
       */
      public java.util.List<MailDataOuterClass.MailData.Builder>
           getMailListBuilderList() {
        return getMailListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder>
          getMailListFieldBuilder() {
        if (mailListBuilder_ == null) {
          mailListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              MailDataOuterClass.MailData, MailDataOuterClass.MailData.Builder, MailDataOuterClass.MailDataOrBuilder>(
                  mailList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          mailList_ = null;
        }
        return mailListBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:MailChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:MailChangeNotify)
    private static final MailChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MailChangeNotify();
    }

    public static MailChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MailChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<MailChangeNotify>() {
      @Override
      public MailChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MailChangeNotify> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MailChangeNotify> getParserForType() {
      return PARSER;
    }

    @Override
    public MailChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MailChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026MailChangeNotify.proto\032\016MailData.proto" +
      "\"J\n\020MailChangeNotify\022\030\n\020del_mail_id_list" +
      "\030\013 \003(\r\022\034\n\tmail_list\030\003 \003(\0132\t.MailDataB\032\n\030" +
      "io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MailDataOuterClass.getDescriptor(),
        });
    internal_static_MailChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MailChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MailChangeNotify_descriptor,
        new String[] { "DelMailIdList", "MailList", });
    descriptor.resolveAllFeaturesImmutable();
    MailDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
