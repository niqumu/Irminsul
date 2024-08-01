// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: SceneEntityAppearNotify.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class SceneEntityAppearNotifyOuterClass {
  private SceneEntityAppearNotifyOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SceneEntityAppearNotifyOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneEntityAppearNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneEntityAppearNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo>
        getEntityListList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index);
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    int getEntityListCount();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    java.util.List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>
        getEntityListOrBuilderList();
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index);

    /**
     * <code>.VisionType appear_type = 5;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    int getAppearTypeValue();
    /**
     * <code>.VisionType appear_type = 5;</code>
     * @return The appearType.
     */
    VisionTypeOuterClass.VisionType getAppearType();

    /**
     * <code>uint32 param = 15;</code>
     * @return The param.
     */
    int getParam();
  }
  /**
   * <pre>
   * CmdId: 24016
   * Obf: PBPDCGDBNHJ
   * </pre>
   *
   * Protobuf type {@code SceneEntityAppearNotify}
   */
  public static final class SceneEntityAppearNotify extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SceneEntityAppearNotify)
      SceneEntityAppearNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        SceneEntityAppearNotify.class.getName());
    }
    // Use SceneEntityAppearNotify.newBuilder() to construct.
    private SceneEntityAppearNotify(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SceneEntityAppearNotify() {
      entityList_ = java.util.Collections.emptyList();
      appearType_ = 0;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SceneEntityAppearNotify.class, Builder.class);
    }

    public static final int ENTITY_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo> entityList_;
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    @Override
    public java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    @Override
    public java.util.List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>
        getEntityListOrBuilderList() {
      return entityList_;
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    @Override
    public int getEntityListCount() {
      return entityList_.size();
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    @Override
    public SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
      return entityList_.get(index);
    }
    /**
     * <code>repeated .SceneEntityInfo entity_list = 7;</code>
     */
    @Override
    public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
        int index) {
      return entityList_.get(index);
    }

    public static final int APPEAR_TYPE_FIELD_NUMBER = 5;
    private int appearType_ = 0;
    /**
     * <code>.VisionType appear_type = 5;</code>
     * @return The enum numeric value on the wire for appearType.
     */
    @Override public int getAppearTypeValue() {
      return appearType_;
    }
    /**
     * <code>.VisionType appear_type = 5;</code>
     * @return The appearType.
     */
    @Override public VisionTypeOuterClass.VisionType getAppearType() {
      VisionTypeOuterClass.VisionType result = VisionTypeOuterClass.VisionType.forNumber(appearType_);
      return result == null ? VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
    }

    public static final int PARAM_FIELD_NUMBER = 15;
    private int param_ = 0;
    /**
     * <code>uint32 param = 15;</code>
     * @return The param.
     */
    @Override
    public int getParam() {
      return param_;
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
      if (appearType_ != VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        output.writeEnum(5, appearType_);
      }
      for (int i = 0; i < entityList_.size(); i++) {
        output.writeMessage(7, entityList_.get(i));
      }
      if (param_ != 0) {
        output.writeUInt32(15, param_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (appearType_ != VisionTypeOuterClass.VisionType.VISION_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, appearType_);
      }
      for (int i = 0; i < entityList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, entityList_.get(i));
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, param_);
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
      if (!(obj instanceof SceneEntityAppearNotify)) {
        return super.equals(obj);
      }
      SceneEntityAppearNotify other = (SceneEntityAppearNotify) obj;

      if (!getEntityListList()
          .equals(other.getEntityListList())) return false;
      if (appearType_ != other.appearType_) return false;
      if (getParam()
          != other.getParam()) return false;
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
      if (getEntityListCount() > 0) {
        hash = (37 * hash) + ENTITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEntityListList().hashCode();
      }
      hash = (37 * hash) + APPEAR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + appearType_;
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SceneEntityAppearNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneEntityAppearNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneEntityAppearNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneEntityAppearNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneEntityAppearNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SceneEntityAppearNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SceneEntityAppearNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SceneEntityAppearNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SceneEntityAppearNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SceneEntityAppearNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SceneEntityAppearNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SceneEntityAppearNotify parseFrom(
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
    public static Builder newBuilder(SceneEntityAppearNotify prototype) {
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
     * CmdId: 24016
     * Obf: PBPDCGDBNHJ
     * </pre>
     *
     * Protobuf type {@code SceneEntityAppearNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneEntityAppearNotify)
        SceneEntityAppearNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SceneEntityAppearNotify.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.SceneEntityAppearNotifyOuterClass.SceneEntityAppearNotify.newBuilder()
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
        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
        } else {
          entityList_ = null;
          entityListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        appearType_ = 0;
        param_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SceneEntityAppearNotifyOuterClass.internal_static_SceneEntityAppearNotify_descriptor;
      }

      @Override
      public SceneEntityAppearNotify getDefaultInstanceForType() {
        return SceneEntityAppearNotify.getDefaultInstance();
      }

      @Override
      public SceneEntityAppearNotify build() {
        SceneEntityAppearNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SceneEntityAppearNotify buildPartial() {
        SceneEntityAppearNotify result = new SceneEntityAppearNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(SceneEntityAppearNotify result) {
        if (entityListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            entityList_ = java.util.Collections.unmodifiableList(entityList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.entityList_ = entityList_;
        } else {
          result.entityList_ = entityListBuilder_.build();
        }
      }

      private void buildPartial0(SceneEntityAppearNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.appearType_ = appearType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.param_ = param_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SceneEntityAppearNotify) {
          return mergeFrom((SceneEntityAppearNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SceneEntityAppearNotify other) {
        if (other == SceneEntityAppearNotify.getDefaultInstance()) return this;
        if (entityListBuilder_ == null) {
          if (!other.entityList_.isEmpty()) {
            if (entityList_.isEmpty()) {
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureEntityListIsMutable();
              entityList_.addAll(other.entityList_);
            }
            onChanged();
          }
        } else {
          if (!other.entityList_.isEmpty()) {
            if (entityListBuilder_.isEmpty()) {
              entityListBuilder_.dispose();
              entityListBuilder_ = null;
              entityList_ = other.entityList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              entityListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getEntityListFieldBuilder() : null;
            } else {
              entityListBuilder_.addAllMessages(other.entityList_);
            }
          }
        }
        if (other.appearType_ != 0) {
          setAppearTypeValue(other.getAppearTypeValue());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
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
              case 40: {
                appearType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 58: {
                SceneEntityInfoOuterClass.SceneEntityInfo m =
                    input.readMessage(
                        SceneEntityInfoOuterClass.SceneEntityInfo.parser(),
                        extensionRegistry);
                if (entityListBuilder_ == null) {
                  ensureEntityListIsMutable();
                  entityList_.add(m);
                } else {
                  entityListBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 120: {
                param_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 120
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

      private java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo> entityList_ =
        java.util.Collections.emptyList();
      private void ensureEntityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          entityList_ = new java.util.ArrayList<SceneEntityInfoOuterClass.SceneEntityInfo>(entityList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder> entityListBuilder_;

      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityListList() {
        if (entityListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entityList_);
        } else {
          return entityListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public int getEntityListCount() {
        if (entityListBuilder_ == null) {
          return entityList_.size();
        } else {
          return entityListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public SceneEntityInfoOuterClass.SceneEntityInfo getEntityList(int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);
        } else {
          return entityListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder setEntityList(
          int index, SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.set(index, value);
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder setEntityList(
          int index, SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder addEntityList(SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder addEntityList(
          int index, SceneEntityInfoOuterClass.SceneEntityInfo value) {
        if (entityListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityListIsMutable();
          entityList_.add(index, value);
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder addEntityList(
          SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder addEntityList(
          int index, SceneEntityInfoOuterClass.SceneEntityInfo.Builder builderForValue) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder addAllEntityList(
          Iterable<? extends SceneEntityInfoOuterClass.SceneEntityInfo> values) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, entityList_);
          onChanged();
        } else {
          entityListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder clearEntityList() {
        if (entityListBuilder_ == null) {
          entityList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          entityListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public Builder removeEntityList(int index) {
        if (entityListBuilder_ == null) {
          ensureEntityListIsMutable();
          entityList_.remove(index);
          onChanged();
        } else {
          entityListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public SceneEntityInfoOuterClass.SceneEntityInfo.Builder getEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder getEntityListOrBuilder(
          int index) {
        if (entityListBuilder_ == null) {
          return entityList_.get(index);  } else {
          return entityListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public java.util.List<? extends SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>
           getEntityListOrBuilderList() {
        if (entityListBuilder_ != null) {
          return entityListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entityList_);
        }
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder() {
        return getEntityListFieldBuilder().addBuilder(
            SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public SceneEntityInfoOuterClass.SceneEntityInfo.Builder addEntityListBuilder(
          int index) {
        return getEntityListFieldBuilder().addBuilder(
            index, SceneEntityInfoOuterClass.SceneEntityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .SceneEntityInfo entity_list = 7;</code>
       */
      public java.util.List<SceneEntityInfoOuterClass.SceneEntityInfo.Builder>
           getEntityListBuilderList() {
        return getEntityListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>
          getEntityListFieldBuilder() {
        if (entityListBuilder_ == null) {
          entityListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              SceneEntityInfoOuterClass.SceneEntityInfo, SceneEntityInfoOuterClass.SceneEntityInfo.Builder, SceneEntityInfoOuterClass.SceneEntityInfoOrBuilder>(
                  entityList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          entityList_ = null;
        }
        return entityListBuilder_;
      }

      private int appearType_ = 0;
      /**
       * <code>.VisionType appear_type = 5;</code>
       * @return The enum numeric value on the wire for appearType.
       */
      @Override public int getAppearTypeValue() {
        return appearType_;
      }
      /**
       * <code>.VisionType appear_type = 5;</code>
       * @param value The enum numeric value on the wire for appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearTypeValue(int value) {
        appearType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 5;</code>
       * @return The appearType.
       */
      @Override
      public VisionTypeOuterClass.VisionType getAppearType() {
        VisionTypeOuterClass.VisionType result = VisionTypeOuterClass.VisionType.forNumber(appearType_);
        return result == null ? VisionTypeOuterClass.VisionType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VisionType appear_type = 5;</code>
       * @param value The appearType to set.
       * @return This builder for chaining.
       */
      public Builder setAppearType(VisionTypeOuterClass.VisionType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        appearType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VisionType appear_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        appearType_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 15;</code>
       * @return The param.
       */
      @Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 15;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {

        param_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SceneEntityAppearNotify)
    }

    // @@protoc_insertion_point(class_scope:SceneEntityAppearNotify)
    private static final SceneEntityAppearNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SceneEntityAppearNotify();
    }

    public static SceneEntityAppearNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneEntityAppearNotify>
        PARSER = new com.google.protobuf.AbstractParser<SceneEntityAppearNotify>() {
      @Override
      public SceneEntityAppearNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneEntityAppearNotify> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SceneEntityAppearNotify> getParserForType() {
      return PARSER;
    }

    @Override
    public SceneEntityAppearNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneEntityAppearNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SceneEntityAppearNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\035SceneEntityAppearNotify.proto\032\025SceneEn" +
      "tityInfo.proto\032\020VisionType.proto\"q\n\027Scen" +
      "eEntityAppearNotify\022%\n\013entity_list\030\007 \003(\013" +
      "2\020.SceneEntityInfo\022 \n\013appear_type\030\005 \001(\0162" +
      "\013.VisionType\022\r\n\005param\030\017 \001(\rB\032\n\030io.irmins" +
      "ul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SceneEntityInfoOuterClass.getDescriptor(),
          VisionTypeOuterClass.getDescriptor(),
        });
    internal_static_SceneEntityAppearNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneEntityAppearNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SceneEntityAppearNotify_descriptor,
        new String[] { "EntityList", "AppearType", "Param", });
    descriptor.resolveAllFeaturesImmutable();
    SceneEntityInfoOuterClass.getDescriptor();
    VisionTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}