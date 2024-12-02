// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: CombatInvokeEntry.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class CombatInvokeEntryOuterClass {
  private CombatInvokeEntryOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      CombatInvokeEntryOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombatInvokeEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombatInvokeEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The forwardType.
     */
    io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.CombatTypeArgument argument_type = 9;</code>
     * @return The enum numeric value on the wire for argumentType.
     */
    int getArgumentTypeValue();
    /**
     * <code>.CombatTypeArgument argument_type = 9;</code>
     * @return The argumentType.
     */
    io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType();

    /**
     * <code>bytes combat_data = 11;</code>
     * @return The combatData.
     */
    com.google.protobuf.ByteString getCombatData();
  }
  /**
   * <pre>
   * Obf: CDKBNNNPIIC
   * </pre>
   *
   * Protobuf type {@code CombatInvokeEntry}
   */
  public static final class CombatInvokeEntry extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CombatInvokeEntry)
      CombatInvokeEntryOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        CombatInvokeEntry.class.getName());
    }
    // Use CombatInvokeEntry.newBuilder() to construct.
    private CombatInvokeEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CombatInvokeEntry() {
      forwardType_ = 0;
      argumentType_ = 0;
      combatData_ = com.google.protobuf.ByteString.EMPTY;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CombatInvokeEntry.class, Builder.class);
    }

    public static final int FORWARD_TYPE_FIELD_NUMBER = 14;
    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 14;</code>
     * @return The forwardType.
     */
    @Override public io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType result = io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
      return result == null ? io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int ARGUMENT_TYPE_FIELD_NUMBER = 9;
    private int argumentType_ = 0;
    /**
     * <code>.CombatTypeArgument argument_type = 9;</code>
     * @return The enum numeric value on the wire for argumentType.
     */
    @Override public int getArgumentTypeValue() {
      return argumentType_;
    }
    /**
     * <code>.CombatTypeArgument argument_type = 9;</code>
     * @return The argumentType.
     */
    @Override public io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
      io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument result = io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.forNumber(argumentType_);
      return result == null ? io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
    }

    public static final int COMBAT_DATA_FIELD_NUMBER = 11;
    private com.google.protobuf.ByteString combatData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes combat_data = 11;</code>
     * @return The combatData.
     */
    @Override
    public com.google.protobuf.ByteString getCombatData() {
      return combatData_;
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
      if (argumentType_ != io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
        output.writeEnum(9, argumentType_);
      }
      if (!combatData_.isEmpty()) {
        output.writeBytes(11, combatData_);
      }
      if (forwardType_ != io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(14, forwardType_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (argumentType_ != io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, argumentType_);
      }
      if (!combatData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(11, combatData_);
      }
      if (forwardType_ != io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, forwardType_);
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
      if (!(obj instanceof CombatInvokeEntry)) {
        return super.equals(obj);
      }
      CombatInvokeEntry other = (CombatInvokeEntry) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (argumentType_ != other.argumentType_) return false;
      if (!getCombatData()
          .equals(other.getCombatData())) return false;
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
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (37 * hash) + ARGUMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + argumentType_;
      hash = (37 * hash) + COMBAT_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getCombatData().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CombatInvokeEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CombatInvokeEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CombatInvokeEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CombatInvokeEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CombatInvokeEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CombatInvokeEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CombatInvokeEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static CombatInvokeEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static CombatInvokeEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static CombatInvokeEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CombatInvokeEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static CombatInvokeEntry parseFrom(
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
    public static Builder newBuilder(CombatInvokeEntry prototype) {
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
     * Obf: CDKBNNNPIIC
     * </pre>
     *
     * Protobuf type {@code CombatInvokeEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombatInvokeEntry)
        CombatInvokeEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CombatInvokeEntry.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.newBuilder()
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
        forwardType_ = 0;
        argumentType_ = 0;
        combatData_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
      }

      @Override
      public CombatInvokeEntry getDefaultInstanceForType() {
        return CombatInvokeEntry.getDefaultInstance();
      }

      @Override
      public CombatInvokeEntry build() {
        CombatInvokeEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public CombatInvokeEntry buildPartial() {
        CombatInvokeEntry result = new CombatInvokeEntry(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(CombatInvokeEntry result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.forwardType_ = forwardType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.argumentType_ = argumentType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.combatData_ = combatData_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CombatInvokeEntry) {
          return mergeFrom((CombatInvokeEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CombatInvokeEntry other) {
        if (other == CombatInvokeEntry.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.argumentType_ != 0) {
          setArgumentTypeValue(other.getArgumentTypeValue());
        }
        if (other.getCombatData() != com.google.protobuf.ByteString.EMPTY) {
          setCombatData(other.getCombatData());
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
              case 72: {
                argumentType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 90: {
                combatData_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 90
              case 112: {
                forwardType_ = input.readEnum();
                bitField0_ |= 0x00000001;
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

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        forwardType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @return The forwardType.
       */
      @Override
      public io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType result = io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
        return result == null ? io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(io.irminsul.common.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private int argumentType_ = 0;
      /**
       * <code>.CombatTypeArgument argument_type = 9;</code>
       * @return The enum numeric value on the wire for argumentType.
       */
      @Override public int getArgumentTypeValue() {
        return argumentType_;
      }
      /**
       * <code>.CombatTypeArgument argument_type = 9;</code>
       * @param value The enum numeric value on the wire for argumentType to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentTypeValue(int value) {
        argumentType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.CombatTypeArgument argument_type = 9;</code>
       * @return The argumentType.
       */
      @Override
      public io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
        io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument result = io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.forNumber(argumentType_);
        return result == null ? io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
      }
      /**
       * <code>.CombatTypeArgument argument_type = 9;</code>
       * @param value The argumentType to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentType(io.irminsul.common.proto.CombatTypeArgumentOuterClass.CombatTypeArgument value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        argumentType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CombatTypeArgument argument_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgumentType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        argumentType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString combatData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes combat_data = 11;</code>
       * @return The combatData.
       */
      @Override
      public com.google.protobuf.ByteString getCombatData() {
        return combatData_;
      }
      /**
       * <code>bytes combat_data = 11;</code>
       * @param value The combatData to set.
       * @return This builder for chaining.
       */
      public Builder setCombatData(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        combatData_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes combat_data = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombatData() {
        bitField0_ = (bitField0_ & ~0x00000004);
        combatData_ = getDefaultInstance().getCombatData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CombatInvokeEntry)
    }

    // @@protoc_insertion_point(class_scope:CombatInvokeEntry)
    private static final CombatInvokeEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CombatInvokeEntry();
    }

    public static CombatInvokeEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombatInvokeEntry>
        PARSER = new com.google.protobuf.AbstractParser<CombatInvokeEntry>() {
      @Override
      public CombatInvokeEntry parsePartialFrom(
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

    public static com.google.protobuf.Parser<CombatInvokeEntry> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<CombatInvokeEntry> getParserForType() {
      return PARSER;
    }

    @Override
    public CombatInvokeEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombatInvokeEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CombatInvokeEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027CombatInvokeEntry.proto\032\021ForwardType.p" +
      "roto\032\030CombatTypeArgument.proto\"x\n\021Combat" +
      "InvokeEntry\022\"\n\014forward_type\030\016 \001(\0162\014.Forw" +
      "ardType\022*\n\rargument_type\030\t \001(\0162\023.CombatT" +
      "ypeArgument\022\023\n\013combat_data\030\013 \001(\014B\032\n\030io.i" +
      "rminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.irminsul.common.proto.ForwardTypeOuterClass.getDescriptor(),
          io.irminsul.common.proto.CombatTypeArgumentOuterClass.getDescriptor(),
        });
    internal_static_CombatInvokeEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombatInvokeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CombatInvokeEntry_descriptor,
        new String[] { "ForwardType", "ArgumentType", "CombatData", });
    descriptor.resolveAllFeaturesImmutable();
    io.irminsul.common.proto.ForwardTypeOuterClass.getDescriptor();
    io.irminsul.common.proto.CombatTypeArgumentOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
