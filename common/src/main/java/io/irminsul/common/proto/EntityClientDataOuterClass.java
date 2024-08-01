// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: EntityClientData.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class EntityClientDataOuterClass {
  private EntityClientDataOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      EntityClientDataOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityClientDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityClientData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 wind_change_scene_time = 1;</code>
     * @return The windChangeSceneTime.
     */
    int getWindChangeSceneTime();

    /**
     * <code>float windmill_sync_angle = 2;</code>
     * @return The windmillSyncAngle.
     */
    float getWindmillSyncAngle();

    /**
     * <code>int32 wind_change_target_level = 3;</code>
     * @return The windChangeTargetLevel.
     */
    int getWindChangeTargetLevel();
  }
  /**
   * <pre>
   * Obf: GCALEOBNFFH
   * </pre>
   *
   * Protobuf type {@code EntityClientData}
   */
  public static final class EntityClientData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:EntityClientData)
      EntityClientDataOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        EntityClientData.class.getName());
    }
    // Use EntityClientData.newBuilder() to construct.
    private EntityClientData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private EntityClientData() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EntityClientData.class, Builder.class);
    }

    public static final int WIND_CHANGE_SCENE_TIME_FIELD_NUMBER = 1;
    private int windChangeSceneTime_ = 0;
    /**
     * <code>uint32 wind_change_scene_time = 1;</code>
     * @return The windChangeSceneTime.
     */
    @Override
    public int getWindChangeSceneTime() {
      return windChangeSceneTime_;
    }

    public static final int WINDMILL_SYNC_ANGLE_FIELD_NUMBER = 2;
    private float windmillSyncAngle_ = 0F;
    /**
     * <code>float windmill_sync_angle = 2;</code>
     * @return The windmillSyncAngle.
     */
    @Override
    public float getWindmillSyncAngle() {
      return windmillSyncAngle_;
    }

    public static final int WIND_CHANGE_TARGET_LEVEL_FIELD_NUMBER = 3;
    private int windChangeTargetLevel_ = 0;
    /**
     * <code>int32 wind_change_target_level = 3;</code>
     * @return The windChangeTargetLevel.
     */
    @Override
    public int getWindChangeTargetLevel() {
      return windChangeTargetLevel_;
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
      if (windChangeSceneTime_ != 0) {
        output.writeUInt32(1, windChangeSceneTime_);
      }
      if (Float.floatToRawIntBits(windmillSyncAngle_) != 0) {
        output.writeFloat(2, windmillSyncAngle_);
      }
      if (windChangeTargetLevel_ != 0) {
        output.writeInt32(3, windChangeTargetLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (windChangeSceneTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, windChangeSceneTime_);
      }
      if (Float.floatToRawIntBits(windmillSyncAngle_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, windmillSyncAngle_);
      }
      if (windChangeTargetLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, windChangeTargetLevel_);
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
      if (!(obj instanceof EntityClientData)) {
        return super.equals(obj);
      }
      EntityClientData other = (EntityClientData) obj;

      if (getWindChangeSceneTime()
          != other.getWindChangeSceneTime()) return false;
      if (Float.floatToIntBits(getWindmillSyncAngle())
          != Float.floatToIntBits(
              other.getWindmillSyncAngle())) return false;
      if (getWindChangeTargetLevel()
          != other.getWindChangeTargetLevel()) return false;
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
      hash = (37 * hash) + WIND_CHANGE_SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getWindChangeSceneTime();
      hash = (37 * hash) + WINDMILL_SYNC_ANGLE_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getWindmillSyncAngle());
      hash = (37 * hash) + WIND_CHANGE_TARGET_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getWindChangeTargetLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EntityClientData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EntityClientData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EntityClientData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static EntityClientData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static EntityClientData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static EntityClientData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EntityClientData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static EntityClientData parseFrom(
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
    public static Builder newBuilder(EntityClientData prototype) {
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
     * Obf: GCALEOBNFFH
     * </pre>
     *
     * Protobuf type {@code EntityClientData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityClientData)
        EntityClientDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EntityClientDataOuterClass.internal_static_EntityClientData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EntityClientData.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.EntityClientDataOuterClass.EntityClientData.newBuilder()
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
        windChangeSceneTime_ = 0;
        windmillSyncAngle_ = 0F;
        windChangeTargetLevel_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EntityClientDataOuterClass.internal_static_EntityClientData_descriptor;
      }

      @Override
      public EntityClientData getDefaultInstanceForType() {
        return EntityClientData.getDefaultInstance();
      }

      @Override
      public EntityClientData build() {
        EntityClientData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public EntityClientData buildPartial() {
        EntityClientData result = new EntityClientData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(EntityClientData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.windChangeSceneTime_ = windChangeSceneTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.windmillSyncAngle_ = windmillSyncAngle_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.windChangeTargetLevel_ = windChangeTargetLevel_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EntityClientData) {
          return mergeFrom((EntityClientData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EntityClientData other) {
        if (other == EntityClientData.getDefaultInstance()) return this;
        if (other.getWindChangeSceneTime() != 0) {
          setWindChangeSceneTime(other.getWindChangeSceneTime());
        }
        if (other.getWindmillSyncAngle() != 0F) {
          setWindmillSyncAngle(other.getWindmillSyncAngle());
        }
        if (other.getWindChangeTargetLevel() != 0) {
          setWindChangeTargetLevel(other.getWindChangeTargetLevel());
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
                windChangeSceneTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 21: {
                windmillSyncAngle_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
              case 24: {
                windChangeTargetLevel_ = input.readInt32();
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

      private int windChangeSceneTime_ ;
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @return The windChangeSceneTime.
       */
      @Override
      public int getWindChangeSceneTime() {
        return windChangeSceneTime_;
      }
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @param value The windChangeSceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setWindChangeSceneTime(int value) {

        windChangeSceneTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wind_change_scene_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindChangeSceneTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        windChangeSceneTime_ = 0;
        onChanged();
        return this;
      }

      private float windmillSyncAngle_ ;
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @return The windmillSyncAngle.
       */
      @Override
      public float getWindmillSyncAngle() {
        return windmillSyncAngle_;
      }
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @param value The windmillSyncAngle to set.
       * @return This builder for chaining.
       */
      public Builder setWindmillSyncAngle(float value) {

        windmillSyncAngle_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>float windmill_sync_angle = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindmillSyncAngle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        windmillSyncAngle_ = 0F;
        onChanged();
        return this;
      }

      private int windChangeTargetLevel_ ;
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @return The windChangeTargetLevel.
       */
      @Override
      public int getWindChangeTargetLevel() {
        return windChangeTargetLevel_;
      }
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @param value The windChangeTargetLevel to set.
       * @return This builder for chaining.
       */
      public Builder setWindChangeTargetLevel(int value) {

        windChangeTargetLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 wind_change_target_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWindChangeTargetLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        windChangeTargetLevel_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:EntityClientData)
    }

    // @@protoc_insertion_point(class_scope:EntityClientData)
    private static final EntityClientData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EntityClientData();
    }

    public static EntityClientData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityClientData>
        PARSER = new com.google.protobuf.AbstractParser<EntityClientData>() {
      @Override
      public EntityClientData parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityClientData> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<EntityClientData> getParserForType() {
      return PARSER;
    }

    @Override
    public EntityClientData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityClientData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_EntityClientData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026EntityClientData.proto\"q\n\020EntityClient" +
      "Data\022\036\n\026wind_change_scene_time\030\001 \001(\r\022\033\n\023" +
      "windmill_sync_angle\030\002 \001(\002\022 \n\030wind_change" +
      "_target_level\030\003 \001(\005B\032\n\030io.irminsul.commo" +
      "n.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityClientData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityClientData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_EntityClientData_descriptor,
        new String[] { "WindChangeSceneTime", "WindmillSyncAngle", "WindChangeTargetLevel", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}