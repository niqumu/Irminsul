// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: AbilityGadgetInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class AbilityGadgetInfoOuterClass {
  private AbilityGadgetInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AbilityGadgetInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    int getCampId();

    /**
     * <code>uint32 camp_target_type = 2;</code>
     * @return The campTargetType.
     */
    int getCampTargetType();

    /**
     * <code>uint32 target_entity_id = 3;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();
  }
  /**
   * <pre>
   * Obf: AHHOEHNNEIN
   * </pre>
   *
   * Protobuf type {@code AbilityGadgetInfo}
   */
  public static final class AbilityGadgetInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AbilityGadgetInfo)
      AbilityGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        AbilityGadgetInfo.class.getName());
    }
    // Use AbilityGadgetInfo.newBuilder() to construct.
    private AbilityGadgetInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AbilityGadgetInfo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AbilityGadgetInfo.class, Builder.class);
    }

    public static final int CAMP_ID_FIELD_NUMBER = 1;
    private int campId_ = 0;
    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    @Override
    public int getCampId() {
      return campId_;
    }

    public static final int CAMP_TARGET_TYPE_FIELD_NUMBER = 2;
    private int campTargetType_ = 0;
    /**
     * <code>uint32 camp_target_type = 2;</code>
     * @return The campTargetType.
     */
    @Override
    public int getCampTargetType() {
      return campTargetType_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 3;
    private int targetEntityId_ = 0;
    /**
     * <code>uint32 target_entity_id = 3;</code>
     * @return The targetEntityId.
     */
    @Override
    public int getTargetEntityId() {
      return targetEntityId_;
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
      if (campId_ != 0) {
        output.writeUInt32(1, campId_);
      }
      if (campTargetType_ != 0) {
        output.writeUInt32(2, campTargetType_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(3, targetEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, campId_);
      }
      if (campTargetType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, campTargetType_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, targetEntityId_);
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
      if (!(obj instanceof AbilityGadgetInfo)) {
        return super.equals(obj);
      }
      AbilityGadgetInfo other = (AbilityGadgetInfo) obj;

      if (getCampId()
          != other.getCampId()) return false;
      if (getCampTargetType()
          != other.getCampTargetType()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
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
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + CAMP_TARGET_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCampTargetType();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AbilityGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AbilityGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static AbilityGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AbilityGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityGadgetInfo parseFrom(
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
    public static Builder newBuilder(AbilityGadgetInfo prototype) {
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
     * Obf: AHHOEHNNEIN
     * </pre>
     *
     * Protobuf type {@code AbilityGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityGadgetInfo)
        AbilityGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AbilityGadgetInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.newBuilder()
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
        campId_ = 0;
        campTargetType_ = 0;
        targetEntityId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
      }

      @Override
      public AbilityGadgetInfo getDefaultInstanceForType() {
        return AbilityGadgetInfo.getDefaultInstance();
      }

      @Override
      public AbilityGadgetInfo build() {
        AbilityGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public AbilityGadgetInfo buildPartial() {
        AbilityGadgetInfo result = new AbilityGadgetInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(AbilityGadgetInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.campId_ = campId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.campTargetType_ = campTargetType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.targetEntityId_ = targetEntityId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AbilityGadgetInfo) {
          return mergeFrom((AbilityGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AbilityGadgetInfo other) {
        if (other == AbilityGadgetInfo.getDefaultInstance()) return this;
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getCampTargetType() != 0) {
          setCampTargetType(other.getCampTargetType());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
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
                campId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                campTargetType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                targetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private int campId_ ;
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return The campId.
       */
      @Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {

        campId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        campId_ = 0;
        onChanged();
        return this;
      }

      private int campTargetType_ ;
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @return The campTargetType.
       */
      @Override
      public int getCampTargetType() {
        return campTargetType_;
      }
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @param value The campTargetType to set.
       * @return This builder for chaining.
       */
      public Builder setCampTargetType(int value) {

        campTargetType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampTargetType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        campTargetType_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @return The targetEntityId.
       */
      @Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {

        targetEntityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        targetEntityId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AbilityGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:AbilityGadgetInfo)
    private static final AbilityGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AbilityGadgetInfo();
    }

    public static AbilityGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<AbilityGadgetInfo>() {
      @Override
      public AbilityGadgetInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityGadgetInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AbilityGadgetInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public AbilityGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AbilityGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\027AbilityGadgetInfo.proto\"X\n\021AbilityGadg" +
      "etInfo\022\017\n\007camp_id\030\001 \001(\r\022\030\n\020camp_target_t" +
      "ype\030\002 \001(\r\022\030\n\020target_entity_id\030\003 \001(\rB\032\n\030i" +
      "o.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AbilityGadgetInfo_descriptor,
        new String[] { "CampId", "CampTargetType", "TargetEntityId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
