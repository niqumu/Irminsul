// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: EntityClientExtraInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class EntityClientExtraInfoOuterClass {
  private EntityClientExtraInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      EntityClientExtraInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityClientExtraInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityClientExtraInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    boolean hasSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return The skillAnchorPosition.
     */
    VectorOuterClass.Vector getSkillAnchorPosition();
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder();
  }
  /**
   * <pre>
   * Obf: LCJDLMMKJCK
   * </pre>
   *
   * Protobuf type {@code EntityClientExtraInfo}
   */
  public static final class EntityClientExtraInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:EntityClientExtraInfo)
      EntityClientExtraInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        EntityClientExtraInfo.class.getName());
    }
    // Use EntityClientExtraInfo.newBuilder() to construct.
    private EntityClientExtraInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private EntityClientExtraInfo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EntityClientExtraInfo.class, Builder.class);
    }

    private int bitField0_;
    public static final int SKILL_ANCHOR_POSITION_FIELD_NUMBER = 1;
    private VectorOuterClass.Vector skillAnchorPosition_;
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    @Override
    public boolean hasSkillAnchorPosition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return The skillAnchorPosition.
     */
    @Override
    public VectorOuterClass.Vector getSkillAnchorPosition() {
      return skillAnchorPosition_ == null ? VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    @Override
    public VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
      return skillAnchorPosition_ == null ? VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getSkillAnchorPosition());
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSkillAnchorPosition());
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
      if (!(obj instanceof EntityClientExtraInfo)) {
        return super.equals(obj);
      }
      EntityClientExtraInfo other = (EntityClientExtraInfo) obj;

      if (hasSkillAnchorPosition() != other.hasSkillAnchorPosition()) return false;
      if (hasSkillAnchorPosition()) {
        if (!getSkillAnchorPosition()
            .equals(other.getSkillAnchorPosition())) return false;
      }
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
      if (hasSkillAnchorPosition()) {
        hash = (37 * hash) + SKILL_ANCHOR_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getSkillAnchorPosition().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EntityClientExtraInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientExtraInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientExtraInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientExtraInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientExtraInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientExtraInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientExtraInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static EntityClientExtraInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static EntityClientExtraInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static EntityClientExtraInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EntityClientExtraInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static EntityClientExtraInfo parseFrom(
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
    public static Builder newBuilder(EntityClientExtraInfo prototype) {
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
     * Obf: LCJDLMMKJCK
     * </pre>
     *
     * Protobuf type {@code EntityClientExtraInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityClientExtraInfo)
        EntityClientExtraInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EntityClientExtraInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.EntityClientExtraInfoOuterClass.EntityClientExtraInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
          getSkillAnchorPositionFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        skillAnchorPosition_ = null;
        if (skillAnchorPositionBuilder_ != null) {
          skillAnchorPositionBuilder_.dispose();
          skillAnchorPositionBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EntityClientExtraInfoOuterClass.internal_static_EntityClientExtraInfo_descriptor;
      }

      @Override
      public EntityClientExtraInfo getDefaultInstanceForType() {
        return EntityClientExtraInfo.getDefaultInstance();
      }

      @Override
      public EntityClientExtraInfo build() {
        EntityClientExtraInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public EntityClientExtraInfo buildPartial() {
        EntityClientExtraInfo result = new EntityClientExtraInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(EntityClientExtraInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillAnchorPosition_ = skillAnchorPositionBuilder_ == null
              ? skillAnchorPosition_
              : skillAnchorPositionBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EntityClientExtraInfo) {
          return mergeFrom((EntityClientExtraInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EntityClientExtraInfo other) {
        if (other == EntityClientExtraInfo.getDefaultInstance()) return this;
        if (other.hasSkillAnchorPosition()) {
          mergeSkillAnchorPosition(other.getSkillAnchorPosition());
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
              case 10: {
                input.readMessage(
                    getSkillAnchorPositionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private VectorOuterClass.Vector skillAnchorPosition_;
      private com.google.protobuf.SingleFieldBuilder<
          VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> skillAnchorPositionBuilder_;
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       * @return Whether the skillAnchorPosition field is set.
       */
      public boolean hasSkillAnchorPosition() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       * @return The skillAnchorPosition.
       */
      public VectorOuterClass.Vector getSkillAnchorPosition() {
        if (skillAnchorPositionBuilder_ == null) {
          return skillAnchorPosition_ == null ? VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        } else {
          return skillAnchorPositionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder setSkillAnchorPosition(VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          skillAnchorPosition_ = value;
        } else {
          skillAnchorPositionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder setSkillAnchorPosition(
          VectorOuterClass.Vector.Builder builderForValue) {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPosition_ = builderForValue.build();
        } else {
          skillAnchorPositionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder mergeSkillAnchorPosition(VectorOuterClass.Vector value) {
        if (skillAnchorPositionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            skillAnchorPosition_ != null &&
            skillAnchorPosition_ != VectorOuterClass.Vector.getDefaultInstance()) {
            getSkillAnchorPositionBuilder().mergeFrom(value);
          } else {
            skillAnchorPosition_ = value;
          }
        } else {
          skillAnchorPositionBuilder_.mergeFrom(value);
        }
        if (skillAnchorPosition_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public Builder clearSkillAnchorPosition() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillAnchorPosition_ = null;
        if (skillAnchorPositionBuilder_ != null) {
          skillAnchorPositionBuilder_.dispose();
          skillAnchorPositionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public VectorOuterClass.Vector.Builder getSkillAnchorPositionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSkillAnchorPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      public VectorOuterClass.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
        if (skillAnchorPositionBuilder_ != null) {
          return skillAnchorPositionBuilder_.getMessageOrBuilder();
        } else {
          return skillAnchorPosition_ == null ?
              VectorOuterClass.Vector.getDefaultInstance() : skillAnchorPosition_;
        }
      }
      /**
       * <code>.Vector skill_anchor_position = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>
          getSkillAnchorPositionFieldBuilder() {
        if (skillAnchorPositionBuilder_ == null) {
          skillAnchorPositionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(
                  getSkillAnchorPosition(),
                  getParentForChildren(),
                  isClean());
          skillAnchorPosition_ = null;
        }
        return skillAnchorPositionBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:EntityClientExtraInfo)
    }

    // @@protoc_insertion_point(class_scope:EntityClientExtraInfo)
    private static final EntityClientExtraInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EntityClientExtraInfo();
    }

    public static EntityClientExtraInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityClientExtraInfo>
        PARSER = new com.google.protobuf.AbstractParser<EntityClientExtraInfo>() {
      @Override
      public EntityClientExtraInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityClientExtraInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EntityClientExtraInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public EntityClientExtraInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityClientExtraInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EntityClientExtraInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033EntityClientExtraInfo.proto\032\014Vector.pr" +
      "oto\"?\n\025EntityClientExtraInfo\022&\n\025skill_an" +
      "chor_position\030\001 \001(\0132\007.VectorB\032\n\030io.irmin" +
      "sul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          VectorOuterClass.getDescriptor(),
        });
    internal_static_EntityClientExtraInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityClientExtraInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_EntityClientExtraInfo_descriptor,
        new String[] { "SkillAnchorPosition", });
    descriptor.resolveAllFeaturesImmutable();
    VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
