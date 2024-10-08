// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: AbilityEmbryo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class AbilityEmbryoOuterClass {
  private AbilityEmbryoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AbilityEmbryoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityEmbryoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityEmbryo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 ability_id = 1;</code>
     * @return The abilityId.
     */
    int getAbilityId();

    /**
     * <code>fixed32 ability_name_hash = 2;</code>
     * @return The abilityNameHash.
     */
    int getAbilityNameHash();

    /**
     * <code>fixed32 ability_override_name_hash = 3;</code>
     * @return The abilityOverrideNameHash.
     */
    int getAbilityOverrideNameHash();
  }
  /**
   * <pre>
   * Obf: PLELJEGMEOD
   * </pre>
   *
   * Protobuf type {@code AbilityEmbryo}
   */
  public static final class AbilityEmbryo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AbilityEmbryo)
      AbilityEmbryoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        AbilityEmbryo.class.getName());
    }
    // Use AbilityEmbryo.newBuilder() to construct.
    private AbilityEmbryo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AbilityEmbryo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AbilityEmbryo.class, Builder.class);
    }

    public static final int ABILITY_ID_FIELD_NUMBER = 1;
    private int abilityId_ = 0;
    /**
     * <code>uint32 ability_id = 1;</code>
     * @return The abilityId.
     */
    @Override
    public int getAbilityId() {
      return abilityId_;
    }

    public static final int ABILITY_NAME_HASH_FIELD_NUMBER = 2;
    private int abilityNameHash_ = 0;
    /**
     * <code>fixed32 ability_name_hash = 2;</code>
     * @return The abilityNameHash.
     */
    @Override
    public int getAbilityNameHash() {
      return abilityNameHash_;
    }

    public static final int ABILITY_OVERRIDE_NAME_HASH_FIELD_NUMBER = 3;
    private int abilityOverrideNameHash_ = 0;
    /**
     * <code>fixed32 ability_override_name_hash = 3;</code>
     * @return The abilityOverrideNameHash.
     */
    @Override
    public int getAbilityOverrideNameHash() {
      return abilityOverrideNameHash_;
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
      if (abilityId_ != 0) {
        output.writeUInt32(1, abilityId_);
      }
      if (abilityNameHash_ != 0) {
        output.writeFixed32(2, abilityNameHash_);
      }
      if (abilityOverrideNameHash_ != 0) {
        output.writeFixed32(3, abilityOverrideNameHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (abilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, abilityId_);
      }
      if (abilityNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(2, abilityNameHash_);
      }
      if (abilityOverrideNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed32Size(3, abilityOverrideNameHash_);
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
      if (!(obj instanceof AbilityEmbryo)) {
        return super.equals(obj);
      }
      AbilityEmbryo other = (AbilityEmbryo) obj;

      if (getAbilityId()
          != other.getAbilityId()) return false;
      if (getAbilityNameHash()
          != other.getAbilityNameHash()) return false;
      if (getAbilityOverrideNameHash()
          != other.getAbilityOverrideNameHash()) return false;
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
      hash = (37 * hash) + ABILITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityId();
      hash = (37 * hash) + ABILITY_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityNameHash();
      hash = (37 * hash) + ABILITY_OVERRIDE_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAbilityOverrideNameHash();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AbilityEmbryo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityEmbryo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityEmbryo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityEmbryo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityEmbryo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityEmbryo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityEmbryo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityEmbryo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AbilityEmbryo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static AbilityEmbryo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AbilityEmbryo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityEmbryo parseFrom(
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
    public static Builder newBuilder(AbilityEmbryo prototype) {
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
     * Obf: PLELJEGMEOD
     * </pre>
     *
     * Protobuf type {@code AbilityEmbryo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityEmbryo)
        AbilityEmbryoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AbilityEmbryo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.AbilityEmbryoOuterClass.AbilityEmbryo.newBuilder()
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
        abilityId_ = 0;
        abilityNameHash_ = 0;
        abilityOverrideNameHash_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AbilityEmbryoOuterClass.internal_static_AbilityEmbryo_descriptor;
      }

      @Override
      public AbilityEmbryo getDefaultInstanceForType() {
        return AbilityEmbryo.getDefaultInstance();
      }

      @Override
      public AbilityEmbryo build() {
        AbilityEmbryo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public AbilityEmbryo buildPartial() {
        AbilityEmbryo result = new AbilityEmbryo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(AbilityEmbryo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.abilityId_ = abilityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.abilityNameHash_ = abilityNameHash_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.abilityOverrideNameHash_ = abilityOverrideNameHash_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AbilityEmbryo) {
          return mergeFrom((AbilityEmbryo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AbilityEmbryo other) {
        if (other == AbilityEmbryo.getDefaultInstance()) return this;
        if (other.getAbilityId() != 0) {
          setAbilityId(other.getAbilityId());
        }
        if (other.getAbilityNameHash() != 0) {
          setAbilityNameHash(other.getAbilityNameHash());
        }
        if (other.getAbilityOverrideNameHash() != 0) {
          setAbilityOverrideNameHash(other.getAbilityOverrideNameHash());
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
                abilityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 21: {
                abilityNameHash_ = input.readFixed32();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
              case 29: {
                abilityOverrideNameHash_ = input.readFixed32();
                bitField0_ |= 0x00000004;
                break;
              } // case 29
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

      private int abilityId_ ;
      /**
       * <code>uint32 ability_id = 1;</code>
       * @return The abilityId.
       */
      @Override
      public int getAbilityId() {
        return abilityId_;
      }
      /**
       * <code>uint32 ability_id = 1;</code>
       * @param value The abilityId to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityId(int value) {

        abilityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ability_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        abilityId_ = 0;
        onChanged();
        return this;
      }

      private int abilityNameHash_ ;
      /**
       * <code>fixed32 ability_name_hash = 2;</code>
       * @return The abilityNameHash.
       */
      @Override
      public int getAbilityNameHash() {
        return abilityNameHash_;
      }
      /**
       * <code>fixed32 ability_name_hash = 2;</code>
       * @param value The abilityNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityNameHash(int value) {

        abilityNameHash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 ability_name_hash = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityNameHash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        abilityNameHash_ = 0;
        onChanged();
        return this;
      }

      private int abilityOverrideNameHash_ ;
      /**
       * <code>fixed32 ability_override_name_hash = 3;</code>
       * @return The abilityOverrideNameHash.
       */
      @Override
      public int getAbilityOverrideNameHash() {
        return abilityOverrideNameHash_;
      }
      /**
       * <code>fixed32 ability_override_name_hash = 3;</code>
       * @param value The abilityOverrideNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAbilityOverrideNameHash(int value) {

        abilityOverrideNameHash_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>fixed32 ability_override_name_hash = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAbilityOverrideNameHash() {
        bitField0_ = (bitField0_ & ~0x00000004);
        abilityOverrideNameHash_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AbilityEmbryo)
    }

    // @@protoc_insertion_point(class_scope:AbilityEmbryo)
    private static final AbilityEmbryo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AbilityEmbryo();
    }

    public static AbilityEmbryo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityEmbryo>
        PARSER = new com.google.protobuf.AbstractParser<AbilityEmbryo>() {
      @Override
      public AbilityEmbryo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityEmbryo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AbilityEmbryo> getParserForType() {
      return PARSER;
    }

    @Override
    public AbilityEmbryo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityEmbryo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AbilityEmbryo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023AbilityEmbryo.proto\"b\n\rAbilityEmbryo\022\022" +
      "\n\nability_id\030\001 \001(\r\022\031\n\021ability_name_hash\030" +
      "\002 \001(\007\022\"\n\032ability_override_name_hash\030\003 \001(" +
      "\007B\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityEmbryo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityEmbryo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AbilityEmbryo_descriptor,
        new String[] { "AbilityId", "AbilityNameHash", "AbilityOverrideNameHash", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
