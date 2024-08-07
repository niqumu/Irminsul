// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: NpcTalkReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class NpcTalkReqOuterClass {
  private NpcTalkReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      NpcTalkReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NpcTalkReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NpcTalkReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 talk_id = 8;</code>
     * @return The talkId.
     */
    int getTalkId();

    /**
     * <code>uint32 npc_entity_id = 11;</code>
     * @return The npcEntityId.
     */
    int getNpcEntityId();

    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 3174
   * Obf: NMMAMHCFAAD
   * </pre>
   *
   * Protobuf type {@code NpcTalkReq}
   */
  public static final class NpcTalkReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:NpcTalkReq)
      NpcTalkReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        NpcTalkReq.class.getName());
    }
    // Use NpcTalkReq.newBuilder() to construct.
    private NpcTalkReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private NpcTalkReq() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              NpcTalkReq.class, Builder.class);
    }

    public static final int TALK_ID_FIELD_NUMBER = 8;
    private int talkId_ = 0;
    /**
     * <code>uint32 talk_id = 8;</code>
     * @return The talkId.
     */
    @Override
    public int getTalkId() {
      return talkId_;
    }

    public static final int NPC_ENTITY_ID_FIELD_NUMBER = 11;
    private int npcEntityId_ = 0;
    /**
     * <code>uint32 npc_entity_id = 11;</code>
     * @return The npcEntityId.
     */
    @Override
    public int getNpcEntityId() {
      return npcEntityId_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 3;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 3;</code>
     * @return The entityId.
     */
    @Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(3, entityId_);
      }
      if (talkId_ != 0) {
        output.writeUInt32(8, talkId_);
      }
      if (npcEntityId_ != 0) {
        output.writeUInt32(11, npcEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, entityId_);
      }
      if (talkId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, talkId_);
      }
      if (npcEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, npcEntityId_);
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
      if (!(obj instanceof NpcTalkReq)) {
        return super.equals(obj);
      }
      NpcTalkReq other = (NpcTalkReq) obj;

      if (getTalkId()
          != other.getTalkId()) return false;
      if (getNpcEntityId()
          != other.getNpcEntityId()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + TALK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTalkId();
      hash = (37 * hash) + NPC_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNpcEntityId();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static NpcTalkReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NpcTalkReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NpcTalkReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NpcTalkReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NpcTalkReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static NpcTalkReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static NpcTalkReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static NpcTalkReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static NpcTalkReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static NpcTalkReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static NpcTalkReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static NpcTalkReq parseFrom(
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
    public static Builder newBuilder(NpcTalkReq prototype) {
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
     * CmdId: 3174
     * Obf: NMMAMHCFAAD
     * </pre>
     *
     * Protobuf type {@code NpcTalkReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NpcTalkReq)
        NpcTalkReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return NpcTalkReqOuterClass.internal_static_NpcTalkReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                NpcTalkReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.NpcTalkReqOuterClass.NpcTalkReq.newBuilder()
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
        talkId_ = 0;
        npcEntityId_ = 0;
        entityId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return NpcTalkReqOuterClass.internal_static_NpcTalkReq_descriptor;
      }

      @Override
      public NpcTalkReq getDefaultInstanceForType() {
        return NpcTalkReq.getDefaultInstance();
      }

      @Override
      public NpcTalkReq build() {
        NpcTalkReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public NpcTalkReq buildPartial() {
        NpcTalkReq result = new NpcTalkReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(NpcTalkReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.talkId_ = talkId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.npcEntityId_ = npcEntityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entityId_ = entityId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof NpcTalkReq) {
          return mergeFrom((NpcTalkReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(NpcTalkReq other) {
        if (other == NpcTalkReq.getDefaultInstance()) return this;
        if (other.getTalkId() != 0) {
          setTalkId(other.getTalkId());
        }
        if (other.getNpcEntityId() != 0) {
          setNpcEntityId(other.getNpcEntityId());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 64: {
                talkId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 88: {
                npcEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
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

      private int talkId_ ;
      /**
       * <code>uint32 talk_id = 8;</code>
       * @return The talkId.
       */
      @Override
      public int getTalkId() {
        return talkId_;
      }
      /**
       * <code>uint32 talk_id = 8;</code>
       * @param value The talkId to set.
       * @return This builder for chaining.
       */
      public Builder setTalkId(int value) {

        talkId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talk_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalkId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        talkId_ = 0;
        onChanged();
        return this;
      }

      private int npcEntityId_ ;
      /**
       * <code>uint32 npc_entity_id = 11;</code>
       * @return The npcEntityId.
       */
      @Override
      public int getNpcEntityId() {
        return npcEntityId_;
      }
      /**
       * <code>uint32 npc_entity_id = 11;</code>
       * @param value The npcEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setNpcEntityId(int value) {

        npcEntityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 npc_entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearNpcEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        npcEntityId_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return The entityId.
       */
      @Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entityId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:NpcTalkReq)
    }

    // @@protoc_insertion_point(class_scope:NpcTalkReq)
    private static final NpcTalkReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new NpcTalkReq();
    }

    public static NpcTalkReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NpcTalkReq>
        PARSER = new com.google.protobuf.AbstractParser<NpcTalkReq>() {
      @Override
      public NpcTalkReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<NpcTalkReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<NpcTalkReq> getParserForType() {
      return PARSER;
    }

    @Override
    public NpcTalkReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NpcTalkReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_NpcTalkReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020NpcTalkReq.proto\"G\n\nNpcTalkReq\022\017\n\007talk" +
      "_id\030\010 \001(\r\022\025\n\rnpc_entity_id\030\013 \001(\r\022\021\n\tenti" +
      "ty_id\030\003 \001(\rB\032\n\030io.irminsul.common.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NpcTalkReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NpcTalkReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_NpcTalkReq_descriptor,
        new String[] { "TalkId", "NpcEntityId", "EntityId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
