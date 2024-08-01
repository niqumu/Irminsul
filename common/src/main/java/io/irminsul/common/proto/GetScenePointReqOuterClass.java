// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: GetScenePointReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class GetScenePointReqOuterClass {
  private GetScenePointReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      GetScenePointReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetScenePointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetScenePointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 belong_uid = 12;</code>
     * @return The belongUid.
     */
    int getBelongUid();

    /**
     * <code>bool FBFJPEPMAOF = 5;</code>
     * @return The fBFJPEPMAOF.
     */
    boolean getFBFJPEPMAOF();

    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * CmdId: 23197
   * Obf: PBIPDICGDKH
   * </pre>
   *
   * Protobuf type {@code GetScenePointReq}
   */
  public static final class GetScenePointReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetScenePointReq)
      GetScenePointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        GetScenePointReq.class.getName());
    }
    // Use GetScenePointReq.newBuilder() to construct.
    private GetScenePointReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private GetScenePointReq() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetScenePointReq.class, Builder.class);
    }

    public static final int BELONG_UID_FIELD_NUMBER = 12;
    private int belongUid_ = 0;
    /**
     * <code>uint32 belong_uid = 12;</code>
     * @return The belongUid.
     */
    @Override
    public int getBelongUid() {
      return belongUid_;
    }

    public static final int FBFJPEPMAOF_FIELD_NUMBER = 5;
    private boolean fBFJPEPMAOF_ = false;
    /**
     * <code>bool FBFJPEPMAOF = 5;</code>
     * @return The fBFJPEPMAOF.
     */
    @Override
    public boolean getFBFJPEPMAOF() {
      return fBFJPEPMAOF_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 3;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(3, sceneId_);
      }
      if (fBFJPEPMAOF_ != false) {
        output.writeBool(5, fBFJPEPMAOF_);
      }
      if (belongUid_ != 0) {
        output.writeUInt32(12, belongUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneId_);
      }
      if (fBFJPEPMAOF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, fBFJPEPMAOF_);
      }
      if (belongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, belongUid_);
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
      if (!(obj instanceof GetScenePointReq)) {
        return super.equals(obj);
      }
      GetScenePointReq other = (GetScenePointReq) obj;

      if (getBelongUid()
          != other.getBelongUid()) return false;
      if (getFBFJPEPMAOF()
          != other.getFBFJPEPMAOF()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + BELONG_UID_FIELD_NUMBER;
      hash = (53 * hash) + getBelongUid();
      hash = (37 * hash) + FBFJPEPMAOF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFBFJPEPMAOF());
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GetScenePointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetScenePointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetScenePointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GetScenePointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GetScenePointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static GetScenePointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static GetScenePointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static GetScenePointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GetScenePointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static GetScenePointReq parseFrom(
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
    public static Builder newBuilder(GetScenePointReq prototype) {
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
     * CmdId: 23197
     * Obf: PBIPDICGDKH
     * </pre>
     *
     * Protobuf type {@code GetScenePointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetScenePointReq)
        GetScenePointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GetScenePointReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.GetScenePointReqOuterClass.GetScenePointReq.newBuilder()
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
        belongUid_ = 0;
        fBFJPEPMAOF_ = false;
        sceneId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @Override
      public GetScenePointReq getDefaultInstanceForType() {
        return GetScenePointReq.getDefaultInstance();
      }

      @Override
      public GetScenePointReq build() {
        GetScenePointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public GetScenePointReq buildPartial() {
        GetScenePointReq result = new GetScenePointReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(GetScenePointReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.belongUid_ = belongUid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fBFJPEPMAOF_ = fBFJPEPMAOF_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.sceneId_ = sceneId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GetScenePointReq) {
          return mergeFrom((GetScenePointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GetScenePointReq other) {
        if (other == GetScenePointReq.getDefaultInstance()) return this;
        if (other.getBelongUid() != 0) {
          setBelongUid(other.getBelongUid());
        }
        if (other.getFBFJPEPMAOF() != false) {
          setFBFJPEPMAOF(other.getFBFJPEPMAOF());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
              case 24: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 40: {
                fBFJPEPMAOF_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 96: {
                belongUid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int belongUid_ ;
      /**
       * <code>uint32 belong_uid = 12;</code>
       * @return The belongUid.
       */
      @Override
      public int getBelongUid() {
        return belongUid_;
      }
      /**
       * <code>uint32 belong_uid = 12;</code>
       * @param value The belongUid to set.
       * @return This builder for chaining.
       */
      public Builder setBelongUid(int value) {

        belongUid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 belong_uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBelongUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        belongUid_ = 0;
        onChanged();
        return this;
      }

      private boolean fBFJPEPMAOF_ ;
      /**
       * <code>bool FBFJPEPMAOF = 5;</code>
       * @return The fBFJPEPMAOF.
       */
      @Override
      public boolean getFBFJPEPMAOF() {
        return fBFJPEPMAOF_;
      }
      /**
       * <code>bool FBFJPEPMAOF = 5;</code>
       * @param value The fBFJPEPMAOF to set.
       * @return This builder for chaining.
       */
      public Builder setFBFJPEPMAOF(boolean value) {

        fBFJPEPMAOF_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool FBFJPEPMAOF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFBFJPEPMAOF() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fBFJPEPMAOF_ = false;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return The sceneId.
       */
      @Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GetScenePointReq)
    }

    // @@protoc_insertion_point(class_scope:GetScenePointReq)
    private static final GetScenePointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GetScenePointReq();
    }

    public static GetScenePointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetScenePointReq>
        PARSER = new com.google.protobuf.AbstractParser<GetScenePointReq>() {
      @Override
      public GetScenePointReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetScenePointReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<GetScenePointReq> getParserForType() {
      return PARSER;
    }

    @Override
    public GetScenePointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetScenePointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetScenePointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026GetScenePointReq.proto\"M\n\020GetScenePoin" +
      "tReq\022\022\n\nbelong_uid\030\014 \001(\r\022\023\n\013FBFJPEPMAOF\030" +
      "\005 \001(\010\022\020\n\010scene_id\030\003 \001(\rB\032\n\030io.irminsul.c" +
      "ommon.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetScenePointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetScenePointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetScenePointReq_descriptor,
        new String[] { "BelongUid", "FBFJPEPMAOF", "SceneId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
