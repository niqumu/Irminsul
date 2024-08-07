// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: BreakoutVector2.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class BreakoutVector2OuterClass {
  private BreakoutVector2OuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      BreakoutVector2OuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BreakoutVector2OrBuilder extends
      // @@protoc_insertion_point(interface_extends:BreakoutVector2)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 x = 1;</code>
     * @return The x.
     */
    int getX();

    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    int getY();
  }
  /**
   * <pre>
   * Obf: FIGLCLAIOJM
   * </pre>
   *
   * Protobuf type {@code BreakoutVector2}
   */
  public static final class BreakoutVector2 extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BreakoutVector2)
      BreakoutVector2OrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        BreakoutVector2.class.getName());
    }
    // Use BreakoutVector2.newBuilder() to construct.
    private BreakoutVector2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private BreakoutVector2() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BreakoutVector2OuterClass.internal_static_BreakoutVector2_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BreakoutVector2OuterClass.internal_static_BreakoutVector2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BreakoutVector2.class, Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private int x_ = 0;
    /**
     * <code>int32 x = 1;</code>
     * @return The x.
     */
    @Override
    public int getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_ = 0;
    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    @Override
    public int getY() {
      return y_;
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
      if (x_ != 0) {
        output.writeInt32(1, x_);
      }
      if (y_ != 0) {
        output.writeInt32(2, y_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (x_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (y_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
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
      if (!(obj instanceof BreakoutVector2)) {
        return super.equals(obj);
      }
      BreakoutVector2 other = (BreakoutVector2) obj;

      if (getX()
          != other.getX()) return false;
      if (getY()
          != other.getY()) return false;
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
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + getX();
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + getY();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BreakoutVector2 parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BreakoutVector2 parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BreakoutVector2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BreakoutVector2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BreakoutVector2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BreakoutVector2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BreakoutVector2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BreakoutVector2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static BreakoutVector2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static BreakoutVector2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BreakoutVector2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BreakoutVector2 parseFrom(
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
    public static Builder newBuilder(BreakoutVector2 prototype) {
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
     * Obf: FIGLCLAIOJM
     * </pre>
     *
     * Protobuf type {@code BreakoutVector2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BreakoutVector2)
        BreakoutVector2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BreakoutVector2OuterClass.internal_static_BreakoutVector2_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BreakoutVector2OuterClass.internal_static_BreakoutVector2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BreakoutVector2.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.BreakoutVector2OuterClass.BreakoutVector2.newBuilder()
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
        x_ = 0;
        y_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BreakoutVector2OuterClass.internal_static_BreakoutVector2_descriptor;
      }

      @Override
      public BreakoutVector2 getDefaultInstanceForType() {
        return BreakoutVector2.getDefaultInstance();
      }

      @Override
      public BreakoutVector2 build() {
        BreakoutVector2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public BreakoutVector2 buildPartial() {
        BreakoutVector2 result = new BreakoutVector2(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(BreakoutVector2 result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.x_ = x_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.y_ = y_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BreakoutVector2) {
          return mergeFrom((BreakoutVector2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BreakoutVector2 other) {
        if (other == BreakoutVector2.getDefaultInstance()) return this;
        if (other.getX() != 0) {
          setX(other.getX());
        }
        if (other.getY() != 0) {
          setY(other.getY());
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
                x_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                y_ = input.readInt32();
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

      private int x_ ;
      /**
       * <code>int32 x = 1;</code>
       * @return The x.
       */
      @Override
      public int getX() {
        return x_;
      }
      /**
       * <code>int32 x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(int value) {

        x_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>int32 y = 2;</code>
       * @return The y.
       */
      @Override
      public int getY() {
        return y_;
      }
      /**
       * <code>int32 y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(int value) {

        y_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BreakoutVector2)
    }

    // @@protoc_insertion_point(class_scope:BreakoutVector2)
    private static final BreakoutVector2 DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BreakoutVector2();
    }

    public static BreakoutVector2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BreakoutVector2>
        PARSER = new com.google.protobuf.AbstractParser<BreakoutVector2>() {
      @Override
      public BreakoutVector2 parsePartialFrom(
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

    public static com.google.protobuf.Parser<BreakoutVector2> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<BreakoutVector2> getParserForType() {
      return PARSER;
    }

    @Override
    public BreakoutVector2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BreakoutVector2_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BreakoutVector2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025BreakoutVector2.proto\"\'\n\017BreakoutVecto" +
      "r2\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005B\032\n\030io.irminsul." +
      "common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BreakoutVector2_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BreakoutVector2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BreakoutVector2_descriptor,
        new String[] { "X", "Y", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
