package io.irminsul.common.proto;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionSimpleInfo.proto

// Protobuf Java Version: 3.25.4
public final class RegionSimpleInfoOuterClass {
  private RegionSimpleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionSimpleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionSimpleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    String getName();
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    String getTitle();
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    com.google.protobuf.ByteString
        getTitleBytes();

    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    String getType();
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>string dispatch_url = 4;</code>
     * @return The dispatchUrl.
     */
    String getDispatchUrl();
    /**
     * <code>string dispatch_url = 4;</code>
     * @return The bytes for dispatchUrl.
     */
    com.google.protobuf.ByteString
        getDispatchUrlBytes();
  }
  /**
   * Protobuf type {@code RegionSimpleInfo}
   */
  public static final class RegionSimpleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionSimpleInfo)
      RegionSimpleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionSimpleInfo.newBuilder() to construct.
    private RegionSimpleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionSimpleInfo() {
      name_ = "";
      title_ = "";
      type_ = "";
      dispatchUrl_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionSimpleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RegionSimpleInfo.class, Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    @Override
    public String getName() {
      Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TITLE_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object title_ = "";
    /**
     * <code>string title = 2;</code>
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
     * <code>string title = 2;</code>
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

    public static final int TYPE_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    @Override
    public String getType() {
      Object ref = type_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    @Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DISPATCH_URL_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile Object dispatchUrl_ = "";
    /**
     * <code>string dispatch_url = 4;</code>
     * @return The dispatchUrl.
     */
    @Override
    public String getDispatchUrl() {
      Object ref = dispatchUrl_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        dispatchUrl_ = s;
        return s;
      }
    }
    /**
     * <code>string dispatch_url = 4;</code>
     * @return The bytes for dispatchUrl.
     */
    @Override
    public com.google.protobuf.ByteString
        getDispatchUrlBytes() {
      Object ref = dispatchUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        dispatchUrl_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dispatchUrl_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dispatchUrl_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dispatchUrl_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dispatchUrl_);
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
      if (!(obj instanceof RegionSimpleInfo)) {
        return super.equals(obj);
      }
      RegionSimpleInfo other = (RegionSimpleInfo) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (!getTitle()
          .equals(other.getTitle())) return false;
      if (!getType()
          .equals(other.getType())) return false;
      if (!getDispatchUrl()
          .equals(other.getDispatchUrl())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + DISPATCH_URL_FIELD_NUMBER;
      hash = (53 * hash) + getDispatchUrl().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RegionSimpleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RegionSimpleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RegionSimpleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RegionSimpleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RegionSimpleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RegionSimpleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RegionSimpleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RegionSimpleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static RegionSimpleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static RegionSimpleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RegionSimpleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RegionSimpleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RegionSimpleInfo prototype) {
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
     * Protobuf type {@code RegionSimpleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionSimpleInfo)
        RegionSimpleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RegionSimpleInfo.class, Builder.class);
      }

      // Construct using RegionSimpleInfoOuterClass.RegionSimpleInfo.newBuilder()
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
        name_ = "";
        title_ = "";
        type_ = "";
        dispatchUrl_ = "";
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RegionSimpleInfoOuterClass.internal_static_RegionSimpleInfo_descriptor;
      }

      @Override
      public RegionSimpleInfo getDefaultInstanceForType() {
        return RegionSimpleInfo.getDefaultInstance();
      }

      @Override
      public RegionSimpleInfo build() {
        RegionSimpleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RegionSimpleInfo buildPartial() {
        RegionSimpleInfo result = new RegionSimpleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(RegionSimpleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.name_ = name_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.title_ = title_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.dispatchUrl_ = dispatchUrl_;
        }
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RegionSimpleInfo) {
          return mergeFrom((RegionSimpleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RegionSimpleInfo other) {
        if (other == RegionSimpleInfo.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getTitle().isEmpty()) {
          title_ = other.title_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getDispatchUrl().isEmpty()) {
          dispatchUrl_ = other.dispatchUrl_;
          bitField0_ |= 0x00000008;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                title_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 26: {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                dispatchUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private Object name_ = "";
      /**
       * <code>string name = 1;</code>
       * @return The name.
       */
      public String getName() {
        Object ref = name_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        name_ = getDefaultInstance().getName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        name_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object title_ = "";
      /**
       * <code>string title = 2;</code>
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
       * <code>string title = 2;</code>
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
       * <code>string title = 2;</code>
       * @param value The title to set.
       * @return This builder for chaining.
       */
      public Builder setTitle(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        title_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string title = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTitle() {
        title_ = getDefaultInstance().getTitle();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string title = 2;</code>
       * @param value The bytes for title to set.
       * @return This builder for chaining.
       */
      public Builder setTitleBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        title_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private Object type_ = "";
      /**
       * <code>string type = 3;</code>
       * @return The type.
       */
      public String getType() {
        Object ref = type_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string type = 3;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string type = 3;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = getDefaultInstance().getType();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string type = 3;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        type_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private Object dispatchUrl_ = "";
      /**
       * <code>string dispatch_url = 4;</code>
       * @return The dispatchUrl.
       */
      public String getDispatchUrl() {
        Object ref = dispatchUrl_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          dispatchUrl_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string dispatch_url = 4;</code>
       * @return The bytes for dispatchUrl.
       */
      public com.google.protobuf.ByteString
          getDispatchUrlBytes() {
        Object ref = dispatchUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          dispatchUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string dispatch_url = 4;</code>
       * @param value The dispatchUrl to set.
       * @return This builder for chaining.
       */
      public Builder setDispatchUrl(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        dispatchUrl_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string dispatch_url = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDispatchUrl() {
        dispatchUrl_ = getDefaultInstance().getDispatchUrl();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string dispatch_url = 4;</code>
       * @param value The bytes for dispatchUrl to set.
       * @return This builder for chaining.
       */
      public Builder setDispatchUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        dispatchUrl_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RegionSimpleInfo)
    }

    // @@protoc_insertion_point(class_scope:RegionSimpleInfo)
    private static final RegionSimpleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RegionSimpleInfo();
    }

    public static RegionSimpleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionSimpleInfo>
        PARSER = new com.google.protobuf.AbstractParser<RegionSimpleInfo>() {
      @Override
      public RegionSimpleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RegionSimpleInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RegionSimpleInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public RegionSimpleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionSimpleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionSimpleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026RegionSimpleInfo.proto\"S\n\020RegionSimple" +
      "Info\022\014\n\004name\030\001 \001(\t\022\r\n\005title\030\002 \001(\t\022\014\n\004typ" +
      "e\030\003 \001(\t\022\024\n\014dispatch_url\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RegionSimpleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionSimpleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionSimpleInfo_descriptor,
        new String[] { "Name", "Title", "Type", "DispatchUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
