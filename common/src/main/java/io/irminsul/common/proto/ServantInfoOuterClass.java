// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ServantInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ServantInfoOuterClass {
  private ServantInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ServantInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ServantInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServantInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 master_entity_id = 1;</code>
     * @return The masterEntityId.
     */
    int getMasterEntityId();

    /**
     * <code>uint32 born_slot_index = 2;</code>
     * @return The bornSlotIndex.
     */
    int getBornSlotIndex();
  }
  /**
   * <pre>
   * Obf: CILIBMDMDLK
   * </pre>
   *
   * Protobuf type {@code ServantInfo}
   */
  public static final class ServantInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ServantInfo)
      ServantInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        ServantInfo.class.getName());
    }
    // Use ServantInfo.newBuilder() to construct.
    private ServantInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ServantInfo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServantInfo.class, Builder.class);
    }

    public static final int MASTER_ENTITY_ID_FIELD_NUMBER = 1;
    private int masterEntityId_ = 0;
    /**
     * <code>uint32 master_entity_id = 1;</code>
     * @return The masterEntityId.
     */
    @Override
    public int getMasterEntityId() {
      return masterEntityId_;
    }

    public static final int BORN_SLOT_INDEX_FIELD_NUMBER = 2;
    private int bornSlotIndex_ = 0;
    /**
     * <code>uint32 born_slot_index = 2;</code>
     * @return The bornSlotIndex.
     */
    @Override
    public int getBornSlotIndex() {
      return bornSlotIndex_;
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
      if (masterEntityId_ != 0) {
        output.writeUInt32(1, masterEntityId_);
      }
      if (bornSlotIndex_ != 0) {
        output.writeUInt32(2, bornSlotIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (masterEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, masterEntityId_);
      }
      if (bornSlotIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, bornSlotIndex_);
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
      if (!(obj instanceof ServantInfo)) {
        return super.equals(obj);
      }
      ServantInfo other = (ServantInfo) obj;

      if (getMasterEntityId()
          != other.getMasterEntityId()) return false;
      if (getBornSlotIndex()
          != other.getBornSlotIndex()) return false;
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
      hash = (37 * hash) + MASTER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMasterEntityId();
      hash = (37 * hash) + BORN_SLOT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getBornSlotIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServantInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServantInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServantInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ServantInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServantInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ServantInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServantInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ServantInfo parseFrom(
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
    public static Builder newBuilder(ServantInfo prototype) {
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
     * Obf: CILIBMDMDLK
     * </pre>
     *
     * Protobuf type {@code ServantInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServantInfo)
        ServantInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServantInfoOuterClass.internal_static_ServantInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServantInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ServantInfoOuterClass.ServantInfo.newBuilder()
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
        masterEntityId_ = 0;
        bornSlotIndex_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServantInfoOuterClass.internal_static_ServantInfo_descriptor;
      }

      @Override
      public ServantInfo getDefaultInstanceForType() {
        return ServantInfo.getDefaultInstance();
      }

      @Override
      public ServantInfo build() {
        ServantInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ServantInfo buildPartial() {
        ServantInfo result = new ServantInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ServantInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.masterEntityId_ = masterEntityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bornSlotIndex_ = bornSlotIndex_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServantInfo) {
          return mergeFrom((ServantInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServantInfo other) {
        if (other == ServantInfo.getDefaultInstance()) return this;
        if (other.getMasterEntityId() != 0) {
          setMasterEntityId(other.getMasterEntityId());
        }
        if (other.getBornSlotIndex() != 0) {
          setBornSlotIndex(other.getBornSlotIndex());
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
                masterEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                bornSlotIndex_ = input.readUInt32();
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

      private int masterEntityId_ ;
      /**
       * <code>uint32 master_entity_id = 1;</code>
       * @return The masterEntityId.
       */
      @Override
      public int getMasterEntityId() {
        return masterEntityId_;
      }
      /**
       * <code>uint32 master_entity_id = 1;</code>
       * @param value The masterEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setMasterEntityId(int value) {

        masterEntityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 master_entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMasterEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        masterEntityId_ = 0;
        onChanged();
        return this;
      }

      private int bornSlotIndex_ ;
      /**
       * <code>uint32 born_slot_index = 2;</code>
       * @return The bornSlotIndex.
       */
      @Override
      public int getBornSlotIndex() {
        return bornSlotIndex_;
      }
      /**
       * <code>uint32 born_slot_index = 2;</code>
       * @param value The bornSlotIndex to set.
       * @return This builder for chaining.
       */
      public Builder setBornSlotIndex(int value) {

        bornSlotIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 born_slot_index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBornSlotIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bornSlotIndex_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ServantInfo)
    }

    // @@protoc_insertion_point(class_scope:ServantInfo)
    private static final ServantInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServantInfo();
    }

    public static ServantInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServantInfo>
        PARSER = new com.google.protobuf.AbstractParser<ServantInfo>() {
      @Override
      public ServantInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ServantInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ServantInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public ServantInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServantInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ServantInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021ServantInfo.proto\"@\n\013ServantInfo\022\030\n\020ma" +
      "ster_entity_id\030\001 \001(\r\022\027\n\017born_slot_index\030" +
      "\002 \001(\rB\032\n\030io.irminsul.common.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServantInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServantInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ServantInfo_descriptor,
        new String[] { "MasterEntityId", "BornSlotIndex", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}