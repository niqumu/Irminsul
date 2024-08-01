// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: PingRsp.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class PingRspOuterClass {
  private PingRspOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PingRspOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PingRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PingRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 seq = 6;</code>
     * @return The seq.
     */
    int getSeq();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 client_time = 12;</code>
     * @return The clientTime.
     */
    int getClientTime();
  }
  /**
   * <pre>
   * CmdId: 8231
   * Obf: BLIJCEANDPM
   * </pre>
   *
   * Protobuf type {@code PingRsp}
   */
  public static final class PingRsp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PingRsp)
      PingRspOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        PingRsp.class.getName());
    }
    // Use PingRsp.newBuilder() to construct.
    private PingRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private PingRsp() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PingRspOuterClass.internal_static_PingRsp_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PingRsp.class, Builder.class);
    }

    public static final int SEQ_FIELD_NUMBER = 6;
    private int seq_ = 0;
    /**
     * <code>uint32 seq = 6;</code>
     * @return The seq.
     */
    @Override
    public int getSeq() {
      return seq_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CLIENT_TIME_FIELD_NUMBER = 12;
    private int clientTime_ = 0;
    /**
     * <code>uint32 client_time = 12;</code>
     * @return The clientTime.
     */
    @Override
    public int getClientTime() {
      return clientTime_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (seq_ != 0) {
        output.writeUInt32(6, seq_);
      }
      if (clientTime_ != 0) {
        output.writeUInt32(12, clientTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (seq_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, seq_);
      }
      if (clientTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, clientTime_);
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
      if (!(obj instanceof PingRsp)) {
        return super.equals(obj);
      }
      PingRsp other = (PingRsp) obj;

      if (getSeq()
          != other.getSeq()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getClientTime()
          != other.getClientTime()) return false;
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
      hash = (37 * hash) + SEQ_FIELD_NUMBER;
      hash = (53 * hash) + getSeq();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CLIENT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PingRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PingRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PingRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PingRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PingRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PingRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PingRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PingRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PingRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static PingRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PingRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PingRsp parseFrom(
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
    public static Builder newBuilder(PingRsp prototype) {
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
     * CmdId: 8231
     * Obf: BLIJCEANDPM
     * </pre>
     *
     * Protobuf type {@code PingRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PingRsp)
        PingRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PingRspOuterClass.internal_static_PingRsp_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PingRspOuterClass.internal_static_PingRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PingRsp.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.PingRspOuterClass.PingRsp.newBuilder()
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
        seq_ = 0;
        retcode_ = 0;
        clientTime_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PingRspOuterClass.internal_static_PingRsp_descriptor;
      }

      @Override
      public PingRsp getDefaultInstanceForType() {
        return PingRsp.getDefaultInstance();
      }

      @Override
      public PingRsp build() {
        PingRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public PingRsp buildPartial() {
        PingRsp result = new PingRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(PingRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.seq_ = seq_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.clientTime_ = clientTime_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PingRsp) {
          return mergeFrom((PingRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PingRsp other) {
        if (other == PingRsp.getDefaultInstance()) return this;
        if (other.getSeq() != 0) {
          setSeq(other.getSeq());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getClientTime() != 0) {
          setClientTime(other.getClientTime());
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
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 48: {
                seq_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 96: {
                clientTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int seq_ ;
      /**
       * <code>uint32 seq = 6;</code>
       * @return The seq.
       */
      @Override
      public int getSeq() {
        return seq_;
      }
      /**
       * <code>uint32 seq = 6;</code>
       * @param value The seq to set.
       * @return This builder for chaining.
       */
      public Builder setSeq(int value) {

        seq_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seq = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeq() {
        bitField0_ = (bitField0_ & ~0x00000001);
        seq_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
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
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int clientTime_ ;
      /**
       * <code>uint32 client_time = 12;</code>
       * @return The clientTime.
       */
      @Override
      public int getClientTime() {
        return clientTime_;
      }
      /**
       * <code>uint32 client_time = 12;</code>
       * @param value The clientTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientTime(int value) {

        clientTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientTime_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PingRsp)
    }

    // @@protoc_insertion_point(class_scope:PingRsp)
    private static final PingRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PingRsp();
    }

    public static PingRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PingRsp>
        PARSER = new com.google.protobuf.AbstractParser<PingRsp>() {
      @Override
      public PingRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<PingRsp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<PingRsp> getParserForType() {
      return PARSER;
    }

    @Override
    public PingRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PingRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PingRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rPingRsp.proto\"<\n\007PingRsp\022\013\n\003seq\030\006 \001(\r\022" +
      "\017\n\007retcode\030\002 \001(\005\022\023\n\013client_time\030\014 \001(\rB\032\n" +
      "\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PingRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PingRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PingRsp_descriptor,
        new String[] { "Seq", "Retcode", "ClientTime", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}