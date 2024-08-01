// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: SetNameCardRsp.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class SetNameCardRspOuterClass {
  private SetNameCardRspOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SetNameCardRspOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetNameCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetNameCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 name_card_id = 13;</code>
     * @return The nameCardId.
     */
    int getNameCardId();

    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 22422
   * Obf: BPEHJKPKNGO
   * </pre>
   *
   * Protobuf type {@code SetNameCardRsp}
   */
  public static final class SetNameCardRsp extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SetNameCardRsp)
      SetNameCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        SetNameCardRsp.class.getName());
    }
    // Use SetNameCardRsp.newBuilder() to construct.
    private SetNameCardRsp(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SetNameCardRsp() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SetNameCardRspOuterClass.internal_static_SetNameCardRsp_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SetNameCardRspOuterClass.internal_static_SetNameCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SetNameCardRsp.class, Builder.class);
    }

    public static final int NAME_CARD_ID_FIELD_NUMBER = 13;
    private int nameCardId_ = 0;
    /**
     * <code>uint32 name_card_id = 13;</code>
     * @return The nameCardId.
     */
    @Override
    public int getNameCardId() {
      return nameCardId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @Override
    public int getRetcode() {
      return retcode_;
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
        output.writeInt32(4, retcode_);
      }
      if (nameCardId_ != 0) {
        output.writeUInt32(13, nameCardId_);
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
          .computeInt32Size(4, retcode_);
      }
      if (nameCardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, nameCardId_);
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
      if (!(obj instanceof SetNameCardRsp)) {
        return super.equals(obj);
      }
      SetNameCardRsp other = (SetNameCardRsp) obj;

      if (getNameCardId()
          != other.getNameCardId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + NAME_CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNameCardId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SetNameCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetNameCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetNameCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetNameCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetNameCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SetNameCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SetNameCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SetNameCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SetNameCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SetNameCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SetNameCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SetNameCardRsp parseFrom(
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
    public static Builder newBuilder(SetNameCardRsp prototype) {
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
     * CmdId: 22422
     * Obf: BPEHJKPKNGO
     * </pre>
     *
     * Protobuf type {@code SetNameCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetNameCardRsp)
        SetNameCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SetNameCardRspOuterClass.internal_static_SetNameCardRsp_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SetNameCardRspOuterClass.internal_static_SetNameCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SetNameCardRsp.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.SetNameCardRspOuterClass.SetNameCardRsp.newBuilder()
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
        nameCardId_ = 0;
        retcode_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SetNameCardRspOuterClass.internal_static_SetNameCardRsp_descriptor;
      }

      @Override
      public SetNameCardRsp getDefaultInstanceForType() {
        return SetNameCardRsp.getDefaultInstance();
      }

      @Override
      public SetNameCardRsp build() {
        SetNameCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SetNameCardRsp buildPartial() {
        SetNameCardRsp result = new SetNameCardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SetNameCardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nameCardId_ = nameCardId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SetNameCardRsp) {
          return mergeFrom((SetNameCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SetNameCardRsp other) {
        if (other == SetNameCardRsp.getDefaultInstance()) return this;
        if (other.getNameCardId() != 0) {
          setNameCardId(other.getNameCardId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 32: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 104: {
                nameCardId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int nameCardId_ ;
      /**
       * <code>uint32 name_card_id = 13;</code>
       * @return The nameCardId.
       */
      @Override
      public int getNameCardId() {
        return nameCardId_;
      }
      /**
       * <code>uint32 name_card_id = 13;</code>
       * @param value The nameCardId to set.
       * @return This builder for chaining.
       */
      public Builder setNameCardId(int value) {

        nameCardId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 name_card_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameCardId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nameCardId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
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
       * <code>int32 retcode = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SetNameCardRsp)
    }

    // @@protoc_insertion_point(class_scope:SetNameCardRsp)
    private static final SetNameCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SetNameCardRsp();
    }

    public static SetNameCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetNameCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetNameCardRsp>() {
      @Override
      public SetNameCardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetNameCardRsp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SetNameCardRsp> getParserForType() {
      return PARSER;
    }

    @Override
    public SetNameCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetNameCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SetNameCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024SetNameCardRsp.proto\"7\n\016SetNameCardRsp" +
      "\022\024\n\014name_card_id\030\r \001(\r\022\017\n\007retcode\030\004 \001(\005B" +
      "\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetNameCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetNameCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SetNameCardRsp_descriptor,
        new String[] { "NameCardId", "Retcode", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
