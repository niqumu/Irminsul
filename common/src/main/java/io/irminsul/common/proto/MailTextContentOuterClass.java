// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: MailTextContent.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class MailTextContentOuterClass {
  private MailTextContentOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      MailTextContentOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MailTextContentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MailTextContent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    String getTitle();
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    String getContent();
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>string sender = 3;</code>
     * @return The sender.
     */
    String getSender();
    /**
     * <code>string sender = 3;</code>
     * @return The bytes for sender.
     */
    com.google.protobuf.ByteString
        getSenderBytes();
  }
  /**
   * <pre>
   * Obf: GONDLGCFODB
   * </pre>
   *
   * Protobuf type {@code MailTextContent}
   */
  public static final class MailTextContent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MailTextContent)
      MailTextContentOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        MailTextContent.class.getName());
    }
    // Use MailTextContent.newBuilder() to construct.
    private MailTextContent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private MailTextContent() {
      title_ = "";
      content_ = "";
      sender_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MailTextContentOuterClass.internal_static_MailTextContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MailTextContent.class, Builder.class);
    }

    public static final int TITLE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object title_ = "";
    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    @Override
    public String getTitle() {
      Object ref = title_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        title_ = s;
        return s;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    @Override
    public com.google.protobuf.ByteString
        getTitleBytes() {
      Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object content_ = "";
    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    @Override
    public String getContent() {
      Object ref = content_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    @Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDER_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile Object sender_ = "";
    /**
     * <code>string sender = 3;</code>
     * @return The sender.
     */
    @Override
    public String getSender() {
      Object ref = sender_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      }
    }
    /**
     * <code>string sender = 3;</code>
     * @return The bytes for sender.
     */
    @Override
    public com.google.protobuf.ByteString
        getSenderBytes() {
      Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, title_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, content_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sender_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, sender_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, title_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, content_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(sender_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, sender_);
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
      if (!(obj instanceof MailTextContent)) {
        return super.equals(obj);
      }
      MailTextContent other = (MailTextContent) obj;

      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (!getSender()
          .equals(other.getSender())) return false;
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
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MailTextContent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailTextContent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailTextContent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailTextContent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailTextContent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MailTextContent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MailTextContent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MailTextContent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static MailTextContent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static MailTextContent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MailTextContent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MailTextContent parseFrom(
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
    public static Builder newBuilder(MailTextContent prototype) {
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
     * Obf: GONDLGCFODB
     * </pre>
     *
     * Protobuf type {@code MailTextContent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MailTextContent)
        MailTextContentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MailTextContentOuterClass.internal_static_MailTextContent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MailTextContent.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.MailTextContentOuterClass.MailTextContent.newBuilder()
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
        title_ = "";
        content_ = "";
        sender_ = "";
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MailTextContentOuterClass.internal_static_MailTextContent_descriptor;
      }

      @Override
      public MailTextContent getDefaultInstanceForType() {
        return MailTextContent.getDefaultInstance();
      }

      @Override
      public MailTextContent build() {
        MailTextContent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public MailTextContent buildPartial() {
        MailTextContent result = new MailTextContent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(MailTextContent result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.title_ = title_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.content_ = content_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sender_ = sender_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MailTextContent) {
          return mergeFrom((MailTextContent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MailTextContent other) {
        if (other == MailTextContent.getDefaultInstance()) return this;
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getSender().isEmpty()) {
          sender_ = other.sender_;
          bitField0_ |= 0x00000004;
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
              case 10: {
                title_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                sender_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private Object title_ = "";
      /**
       * <code>string title = 1;</code>
       * @return The title.
       */
      public String getTitle() {
        Object ref = title_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          title_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string title = 1;</code>
       * @return The bytes for title.
       */
      public com.google.protobuf.ByteString
          getTitleBytes() {
        Object ref = title_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          title_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string title = 1;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        title_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        title_ = getDefaultInstance().getTitle();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string title = 1;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        title_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object content_ = "";
      /**
       * <code>string content = 2;</code>
       * @return The content.
       */
      public String getContent() {
        Object ref = content_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        content_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        content_ = getDefaultInstance().getContent();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        content_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private Object sender_ = "";
      /**
       * <code>string sender = 3;</code>
       * @return The sender.
       */
      public String getSender() {
        Object ref = sender_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          sender_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string sender = 3;</code>
       * @return The bytes for sender.
       */
      public com.google.protobuf.ByteString
          getSenderBytes() {
        Object ref = sender_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          sender_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string sender = 3;</code>
       * @param value The sender to set.
       * @return This builder for chaining.
       */
      public Builder setSender(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        sender_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSender() {
        sender_ = getDefaultInstance().getSender();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string sender = 3;</code>
       * @param value The bytes for sender to set.
       * @return This builder for chaining.
       */
      public Builder setSenderBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        sender_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MailTextContent)
    }

    // @@protoc_insertion_point(class_scope:MailTextContent)
    private static final MailTextContent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MailTextContent();
    }

    public static MailTextContent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MailTextContent>
        PARSER = new com.google.protobuf.AbstractParser<MailTextContent>() {
      @Override
      public MailTextContent parsePartialFrom(
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

    public static com.google.protobuf.Parser<MailTextContent> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MailTextContent> getParserForType() {
      return PARSER;
    }

    @Override
    public MailTextContent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailTextContent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MailTextContent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025MailTextContent.proto\"A\n\017MailTextConte" +
      "nt\022\r\n\005title\030\001 \001(\t\022\017\n\007content\030\002 \001(\t\022\016\n\006se" +
      "nder\030\003 \001(\tB\032\n\030io.irminsul.common.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MailTextContent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MailTextContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MailTextContent_descriptor,
        new String[] { "Title", "Content", "Sender", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
