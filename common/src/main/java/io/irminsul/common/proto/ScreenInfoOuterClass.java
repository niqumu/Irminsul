// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ScreenInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ScreenInfoOuterClass {
  private ScreenInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ScreenInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScreenInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScreenInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 live_id = 1;</code>
     * @return The liveId.
     */
    int getLiveId();

    /**
     * <code>uint32 projector_entity_id = 2;</code>
     * @return The projectorEntityId.
     */
    int getProjectorEntityId();
  }
  /**
   * <pre>
   * Obf: MPEEPHMCGKD
   * </pre>
   *
   * Protobuf type {@code ScreenInfo}
   */
  public static final class ScreenInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ScreenInfo)
      ScreenInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        ScreenInfo.class.getName());
    }
    // Use ScreenInfo.newBuilder() to construct.
    private ScreenInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ScreenInfo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ScreenInfo.class, Builder.class);
    }

    public static final int LIVE_ID_FIELD_NUMBER = 1;
    private int liveId_ = 0;
    /**
     * <code>uint32 live_id = 1;</code>
     * @return The liveId.
     */
    @Override
    public int getLiveId() {
      return liveId_;
    }

    public static final int PROJECTOR_ENTITY_ID_FIELD_NUMBER = 2;
    private int projectorEntityId_ = 0;
    /**
     * <code>uint32 projector_entity_id = 2;</code>
     * @return The projectorEntityId.
     */
    @Override
    public int getProjectorEntityId() {
      return projectorEntityId_;
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
      if (liveId_ != 0) {
        output.writeUInt32(1, liveId_);
      }
      if (projectorEntityId_ != 0) {
        output.writeUInt32(2, projectorEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, liveId_);
      }
      if (projectorEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, projectorEntityId_);
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
      if (!(obj instanceof ScreenInfo)) {
        return super.equals(obj);
      }
      ScreenInfo other = (ScreenInfo) obj;

      if (getLiveId()
          != other.getLiveId()) return false;
      if (getProjectorEntityId()
          != other.getProjectorEntityId()) return false;
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
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (37 * hash) + PROJECTOR_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProjectorEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ScreenInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScreenInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScreenInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScreenInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScreenInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScreenInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScreenInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ScreenInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ScreenInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ScreenInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ScreenInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ScreenInfo parseFrom(
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
    public static Builder newBuilder(ScreenInfo prototype) {
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
     * Obf: MPEEPHMCGKD
     * </pre>
     *
     * Protobuf type {@code ScreenInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScreenInfo)
        ScreenInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ScreenInfoOuterClass.internal_static_ScreenInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ScreenInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ScreenInfoOuterClass.ScreenInfo.newBuilder()
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
        liveId_ = 0;
        projectorEntityId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ScreenInfoOuterClass.internal_static_ScreenInfo_descriptor;
      }

      @Override
      public ScreenInfo getDefaultInstanceForType() {
        return ScreenInfo.getDefaultInstance();
      }

      @Override
      public ScreenInfo build() {
        ScreenInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ScreenInfo buildPartial() {
        ScreenInfo result = new ScreenInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ScreenInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.liveId_ = liveId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.projectorEntityId_ = projectorEntityId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ScreenInfo) {
          return mergeFrom((ScreenInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ScreenInfo other) {
        if (other == ScreenInfo.getDefaultInstance()) return this;
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
        }
        if (other.getProjectorEntityId() != 0) {
          setProjectorEntityId(other.getProjectorEntityId());
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
                liveId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                projectorEntityId_ = input.readUInt32();
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

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 1;</code>
       * @return The liveId.
       */
      @Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 1;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(int value) {

        liveId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        liveId_ = 0;
        onChanged();
        return this;
      }

      private int projectorEntityId_ ;
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @return The projectorEntityId.
       */
      @Override
      public int getProjectorEntityId() {
        return projectorEntityId_;
      }
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @param value The projectorEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setProjectorEntityId(int value) {

        projectorEntityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 projector_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProjectorEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        projectorEntityId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ScreenInfo)
    }

    // @@protoc_insertion_point(class_scope:ScreenInfo)
    private static final ScreenInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ScreenInfo();
    }

    public static ScreenInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScreenInfo>
        PARSER = new com.google.protobuf.AbstractParser<ScreenInfo>() {
      @Override
      public ScreenInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScreenInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ScreenInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public ScreenInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScreenInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ScreenInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020ScreenInfo.proto\":\n\nScreenInfo\022\017\n\007live" +
      "_id\030\001 \001(\r\022\033\n\023projector_entity_id\030\002 \001(\rB\032" +
      "\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScreenInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScreenInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ScreenInfo_descriptor,
        new String[] { "LiveId", "ProjectorEntityId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
