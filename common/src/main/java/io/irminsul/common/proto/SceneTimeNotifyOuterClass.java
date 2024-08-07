// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: SceneTimeNotify.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class SceneTimeNotifyOuterClass {
  private SceneTimeNotifyOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SceneTimeNotifyOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneTimeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneTimeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>uint64 scene_time = 1;</code>
     * @return The sceneTime.
     */
    long getSceneTime();

    /**
     * <code>bool is_paused = 5;</code>
     * @return The isPaused.
     */
    boolean getIsPaused();
  }
  /**
   * <pre>
   * CmdId: 21694
   * Obf: EPOHGAAPIFG
   * </pre>
   *
   * Protobuf type {@code SceneTimeNotify}
   */
  public static final class SceneTimeNotify extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SceneTimeNotify)
      SceneTimeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        SceneTimeNotify.class.getName());
    }
    // Use SceneTimeNotify.newBuilder() to construct.
    private SceneTimeNotify(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SceneTimeNotify() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SceneTimeNotify.class, Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 9;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 9;</code>
     * @return The sceneId.
     */
    @Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int SCENE_TIME_FIELD_NUMBER = 1;
    private long sceneTime_ = 0L;
    /**
     * <code>uint64 scene_time = 1;</code>
     * @return The sceneTime.
     */
    @Override
    public long getSceneTime() {
      return sceneTime_;
    }

    public static final int IS_PAUSED_FIELD_NUMBER = 5;
    private boolean isPaused_ = false;
    /**
     * <code>bool is_paused = 5;</code>
     * @return The isPaused.
     */
    @Override
    public boolean getIsPaused() {
      return isPaused_;
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
      if (sceneTime_ != 0L) {
        output.writeUInt64(1, sceneTime_);
      }
      if (isPaused_ != false) {
        output.writeBool(5, isPaused_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(9, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, sceneTime_);
      }
      if (isPaused_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isPaused_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, sceneId_);
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
      if (!(obj instanceof SceneTimeNotify)) {
        return super.equals(obj);
      }
      SceneTimeNotify other = (SceneTimeNotify) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getSceneTime()
          != other.getSceneTime()) return false;
      if (getIsPaused()
          != other.getIsPaused()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + SCENE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSceneTime());
      hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPaused());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SceneTimeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneTimeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneTimeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneTimeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneTimeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneTimeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneTimeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SceneTimeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SceneTimeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SceneTimeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneTimeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SceneTimeNotify parseFrom(
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
    public static Builder newBuilder(SceneTimeNotify prototype) {
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
     * CmdId: 21694
     * Obf: EPOHGAAPIFG
     * </pre>
     *
     * Protobuf type {@code SceneTimeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneTimeNotify)
        SceneTimeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SceneTimeNotify.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.SceneTimeNotifyOuterClass.SceneTimeNotify.newBuilder()
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
        sceneId_ = 0;
        sceneTime_ = 0L;
        isPaused_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SceneTimeNotifyOuterClass.internal_static_SceneTimeNotify_descriptor;
      }

      @Override
      public SceneTimeNotify getDefaultInstanceForType() {
        return SceneTimeNotify.getDefaultInstance();
      }

      @Override
      public SceneTimeNotify build() {
        SceneTimeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SceneTimeNotify buildPartial() {
        SceneTimeNotify result = new SceneTimeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SceneTimeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneTime_ = sceneTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isPaused_ = isPaused_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SceneTimeNotify) {
          return mergeFrom((SceneTimeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SceneTimeNotify other) {
        if (other == SceneTimeNotify.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getSceneTime() != 0L) {
          setSceneTime(other.getSceneTime());
        }
        if (other.getIsPaused() != false) {
          setIsPaused(other.getIsPaused());
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
                sceneTime_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 40: {
                isPaused_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 72: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return The sceneId.
       */
      @Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private long sceneTime_ ;
      /**
       * <code>uint64 scene_time = 1;</code>
       * @return The sceneTime.
       */
      @Override
      public long getSceneTime() {
        return sceneTime_;
      }
      /**
       * <code>uint64 scene_time = 1;</code>
       * @param value The sceneTime to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTime(long value) {

        sceneTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 scene_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneTime_ = 0L;
        onChanged();
        return this;
      }

      private boolean isPaused_ ;
      /**
       * <code>bool is_paused = 5;</code>
       * @return The isPaused.
       */
      @Override
      public boolean getIsPaused() {
        return isPaused_;
      }
      /**
       * <code>bool is_paused = 5;</code>
       * @param value The isPaused to set.
       * @return This builder for chaining.
       */
      public Builder setIsPaused(boolean value) {

        isPaused_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_paused = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPaused() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isPaused_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SceneTimeNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneTimeNotify)
    private static final SceneTimeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SceneTimeNotify();
    }

    public static SceneTimeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneTimeNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneTimeNotify>() {
      @Override
      public SceneTimeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneTimeNotify> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SceneTimeNotify> getParserForType() {
      return PARSER;
    }

    @Override
    public SceneTimeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneTimeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SceneTimeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025SceneTimeNotify.proto\"J\n\017SceneTimeNoti" +
      "fy\022\020\n\010scene_id\030\t \001(\r\022\022\n\nscene_time\030\001 \001(\004" +
      "\022\021\n\tis_paused\030\005 \001(\010B\032\n\030io.irminsul.commo" +
      "n.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneTimeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneTimeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SceneTimeNotify_descriptor,
        new String[] { "SceneId", "SceneTime", "IsPaused", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
