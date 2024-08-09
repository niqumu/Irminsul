// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: PullPrivateChatReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class PullPrivateChatReqOuterClass {
  private PullPrivateChatReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PullPrivateChatReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PullPrivateChatReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PullPrivateChatReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 from_sequence = 6;</code>
     * @return The fromSequence.
     */
    int getFromSequence();

    /**
     * <code>uint32 pull_num = 12;</code>
     * @return The pullNum.
     */
    int getPullNum();

    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * <pre>
   * CmdId: 22346
   * Obf: CDBDGACCDJI
   * </pre>
   *
   * Protobuf type {@code PullPrivateChatReq}
   */
  public static final class PullPrivateChatReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PullPrivateChatReq)
      PullPrivateChatReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        PullPrivateChatReq.class.getName());
    }
    // Use PullPrivateChatReq.newBuilder() to construct.
    private PullPrivateChatReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private PullPrivateChatReq() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PullPrivateChatReq.class, Builder.class);
    }

    public static final int FROM_SEQUENCE_FIELD_NUMBER = 6;
    private int fromSequence_ = 0;
    /**
     * <code>uint32 from_sequence = 6;</code>
     * @return The fromSequence.
     */
    @Override
    public int getFromSequence() {
      return fromSequence_;
    }

    public static final int PULL_NUM_FIELD_NUMBER = 12;
    private int pullNum_ = 0;
    /**
     * <code>uint32 pull_num = 12;</code>
     * @return The pullNum.
     */
    @Override
    public int getPullNum() {
      return pullNum_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 14;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 14;</code>
     * @return The targetUid.
     */
    @Override
    public int getTargetUid() {
      return targetUid_;
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
      if (fromSequence_ != 0) {
        output.writeUInt32(6, fromSequence_);
      }
      if (pullNum_ != 0) {
        output.writeUInt32(12, pullNum_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(14, targetUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fromSequence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, fromSequence_);
      }
      if (pullNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, pullNum_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, targetUid_);
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
      if (!(obj instanceof PullPrivateChatReq)) {
        return super.equals(obj);
      }
      PullPrivateChatReq other = (PullPrivateChatReq) obj;

      if (getFromSequence()
          != other.getFromSequence()) return false;
      if (getPullNum()
          != other.getPullNum()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + FROM_SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getFromSequence();
      hash = (37 * hash) + PULL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getPullNum();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PullPrivateChatReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PullPrivateChatReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PullPrivateChatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PullPrivateChatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PullPrivateChatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PullPrivateChatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PullPrivateChatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PullPrivateChatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static PullPrivateChatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static PullPrivateChatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PullPrivateChatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static PullPrivateChatReq parseFrom(
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
    public static Builder newBuilder(PullPrivateChatReq prototype) {
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
     * CmdId: 22346
     * Obf: CDBDGACCDJI
     * </pre>
     *
     * Protobuf type {@code PullPrivateChatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PullPrivateChatReq)
        PullPrivateChatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PullPrivateChatReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.PullPrivateChatReqOuterClass.PullPrivateChatReq.newBuilder()
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
        fromSequence_ = 0;
        pullNum_ = 0;
        targetUid_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
      }

      @Override
      public PullPrivateChatReq getDefaultInstanceForType() {
        return PullPrivateChatReq.getDefaultInstance();
      }

      @Override
      public PullPrivateChatReq build() {
        PullPrivateChatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public PullPrivateChatReq buildPartial() {
        PullPrivateChatReq result = new PullPrivateChatReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(PullPrivateChatReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fromSequence_ = fromSequence_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pullNum_ = pullNum_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.targetUid_ = targetUid_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PullPrivateChatReq) {
          return mergeFrom((PullPrivateChatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PullPrivateChatReq other) {
        if (other == PullPrivateChatReq.getDefaultInstance()) return this;
        if (other.getFromSequence() != 0) {
          setFromSequence(other.getFromSequence());
        }
        if (other.getPullNum() != 0) {
          setPullNum(other.getPullNum());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
              case 48: {
                fromSequence_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 96: {
                pullNum_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
              case 112: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int fromSequence_ ;
      /**
       * <code>uint32 from_sequence = 6;</code>
       * @return The fromSequence.
       */
      @Override
      public int getFromSequence() {
        return fromSequence_;
      }
      /**
       * <code>uint32 from_sequence = 6;</code>
       * @param value The fromSequence to set.
       * @return This builder for chaining.
       */
      public Builder setFromSequence(int value) {

        fromSequence_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 from_sequence = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFromSequence() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fromSequence_ = 0;
        onChanged();
        return this;
      }

      private int pullNum_ ;
      /**
       * <code>uint32 pull_num = 12;</code>
       * @return The pullNum.
       */
      @Override
      public int getPullNum() {
        return pullNum_;
      }
      /**
       * <code>uint32 pull_num = 12;</code>
       * @param value The pullNum to set.
       * @return This builder for chaining.
       */
      public Builder setPullNum(int value) {

        pullNum_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pull_num = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPullNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pullNum_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return The targetUid.
       */
      @Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {

        targetUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        targetUid_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PullPrivateChatReq)
    }

    // @@protoc_insertion_point(class_scope:PullPrivateChatReq)
    private static final PullPrivateChatReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PullPrivateChatReq();
    }

    public static PullPrivateChatReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PullPrivateChatReq>
        PARSER = new com.google.protobuf.AbstractParser<PullPrivateChatReq>() {
      @Override
      public PullPrivateChatReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PullPrivateChatReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<PullPrivateChatReq> getParserForType() {
      return PARSER;
    }

    @Override
    public PullPrivateChatReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PullPrivateChatReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PullPrivateChatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030PullPrivateChatReq.proto\"Q\n\022PullPrivat" +
      "eChatReq\022\025\n\rfrom_sequence\030\006 \001(\r\022\020\n\010pull_" +
      "num\030\014 \001(\r\022\022\n\ntarget_uid\030\016 \001(\rB\032\n\030io.irmi" +
      "nsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PullPrivateChatReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PullPrivateChatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PullPrivateChatReq_descriptor,
        new String[] { "FromSequence", "PullNum", "TargetUid", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
