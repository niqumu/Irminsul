// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: AbilityControlBlock.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class AbilityControlBlockOuterClass {
  private AbilityControlBlockOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AbilityControlBlockOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityControlBlockOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityControlBlock)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo>
        getAbilityEmbryoListList();
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(int index);
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    int getAbilityEmbryoListCount();
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    java.util.List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>
        getAbilityEmbryoListOrBuilderList();
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: GGPHMELJCOL
   * </pre>
   *
   * Protobuf type {@code AbilityControlBlock}
   */
  public static final class AbilityControlBlock extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AbilityControlBlock)
      AbilityControlBlockOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        AbilityControlBlock.class.getName());
    }
    // Use AbilityControlBlock.newBuilder() to construct.
    private AbilityControlBlock(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AbilityControlBlock() {
      abilityEmbryoList_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AbilityControlBlock.class, Builder.class);
    }

    public static final int ABILITY_EMBRYO_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo> abilityEmbryoList_;
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    @Override
    public java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo> getAbilityEmbryoListList() {
      return abilityEmbryoList_;
    }
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    @Override
    public java.util.List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>
        getAbilityEmbryoListOrBuilderList() {
      return abilityEmbryoList_;
    }
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    @Override
    public int getAbilityEmbryoListCount() {
      return abilityEmbryoList_.size();
    }
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    @Override
    public AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(int index) {
      return abilityEmbryoList_.get(index);
    }
    /**
     * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
     */
    @Override
    public AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(
        int index) {
      return abilityEmbryoList_.get(index);
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
      for (int i = 0; i < abilityEmbryoList_.size(); i++) {
        output.writeMessage(1, abilityEmbryoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < abilityEmbryoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, abilityEmbryoList_.get(i));
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
      if (!(obj instanceof AbilityControlBlock)) {
        return super.equals(obj);
      }
      AbilityControlBlock other = (AbilityControlBlock) obj;

      if (!getAbilityEmbryoListList()
          .equals(other.getAbilityEmbryoListList())) return false;
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
      if (getAbilityEmbryoListCount() > 0) {
        hash = (37 * hash) + ABILITY_EMBRYO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAbilityEmbryoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static AbilityControlBlock parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityControlBlock parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityControlBlock parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityControlBlock parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityControlBlock parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static AbilityControlBlock parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static AbilityControlBlock parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityControlBlock parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static AbilityControlBlock parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static AbilityControlBlock parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static AbilityControlBlock parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static AbilityControlBlock parseFrom(
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
    public static Builder newBuilder(AbilityControlBlock prototype) {
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
     * Obf: GGPHMELJCOL
     * </pre>
     *
     * Protobuf type {@code AbilityControlBlock}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityControlBlock)
        AbilityControlBlockOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                AbilityControlBlock.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.AbilityControlBlockOuterClass.AbilityControlBlock.newBuilder()
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
        if (abilityEmbryoListBuilder_ == null) {
          abilityEmbryoList_ = java.util.Collections.emptyList();
        } else {
          abilityEmbryoList_ = null;
          abilityEmbryoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return AbilityControlBlockOuterClass.internal_static_AbilityControlBlock_descriptor;
      }

      @Override
      public AbilityControlBlock getDefaultInstanceForType() {
        return AbilityControlBlock.getDefaultInstance();
      }

      @Override
      public AbilityControlBlock build() {
        AbilityControlBlock result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public AbilityControlBlock buildPartial() {
        AbilityControlBlock result = new AbilityControlBlock(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(AbilityControlBlock result) {
        if (abilityEmbryoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            abilityEmbryoList_ = java.util.Collections.unmodifiableList(abilityEmbryoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.abilityEmbryoList_ = abilityEmbryoList_;
        } else {
          result.abilityEmbryoList_ = abilityEmbryoListBuilder_.build();
        }
      }

      private void buildPartial0(AbilityControlBlock result) {
        int from_bitField0_ = bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof AbilityControlBlock) {
          return mergeFrom((AbilityControlBlock)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(AbilityControlBlock other) {
        if (other == AbilityControlBlock.getDefaultInstance()) return this;
        if (abilityEmbryoListBuilder_ == null) {
          if (!other.abilityEmbryoList_.isEmpty()) {
            if (abilityEmbryoList_.isEmpty()) {
              abilityEmbryoList_ = other.abilityEmbryoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAbilityEmbryoListIsMutable();
              abilityEmbryoList_.addAll(other.abilityEmbryoList_);
            }
            onChanged();
          }
        } else {
          if (!other.abilityEmbryoList_.isEmpty()) {
            if (abilityEmbryoListBuilder_.isEmpty()) {
              abilityEmbryoListBuilder_.dispose();
              abilityEmbryoListBuilder_ = null;
              abilityEmbryoList_ = other.abilityEmbryoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              abilityEmbryoListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getAbilityEmbryoListFieldBuilder() : null;
            } else {
              abilityEmbryoListBuilder_.addAllMessages(other.abilityEmbryoList_);
            }
          }
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
                AbilityEmbryoOuterClass.AbilityEmbryo m =
                    input.readMessage(
                        AbilityEmbryoOuterClass.AbilityEmbryo.parser(),
                        extensionRegistry);
                if (abilityEmbryoListBuilder_ == null) {
                  ensureAbilityEmbryoListIsMutable();
                  abilityEmbryoList_.add(m);
                } else {
                  abilityEmbryoListBuilder_.addMessage(m);
                }
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

      private java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo> abilityEmbryoList_ =
        java.util.Collections.emptyList();
      private void ensureAbilityEmbryoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          abilityEmbryoList_ = new java.util.ArrayList<AbilityEmbryoOuterClass.AbilityEmbryo>(abilityEmbryoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder> abilityEmbryoListBuilder_;

      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo> getAbilityEmbryoListList() {
        if (abilityEmbryoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(abilityEmbryoList_);
        } else {
          return abilityEmbryoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public int getAbilityEmbryoListCount() {
        if (abilityEmbryoListBuilder_ == null) {
          return abilityEmbryoList_.size();
        } else {
          return abilityEmbryoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public AbilityEmbryoOuterClass.AbilityEmbryo getAbilityEmbryoList(int index) {
        if (abilityEmbryoListBuilder_ == null) {
          return abilityEmbryoList_.get(index);
        } else {
          return abilityEmbryoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder setAbilityEmbryoList(
          int index, AbilityEmbryoOuterClass.AbilityEmbryo value) {
        if (abilityEmbryoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.set(index, value);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder setAbilityEmbryoList(
          int index, AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
        if (abilityEmbryoListBuilder_ == null) {
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          abilityEmbryoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder addAbilityEmbryoList(AbilityEmbryoOuterClass.AbilityEmbryo value) {
        if (abilityEmbryoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.add(value);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder addAbilityEmbryoList(
          int index, AbilityEmbryoOuterClass.AbilityEmbryo value) {
        if (abilityEmbryoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.add(index, value);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder addAbilityEmbryoList(
          AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
        if (abilityEmbryoListBuilder_ == null) {
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.add(builderForValue.build());
          onChanged();
        } else {
          abilityEmbryoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder addAbilityEmbryoList(
          int index, AbilityEmbryoOuterClass.AbilityEmbryo.Builder builderForValue) {
        if (abilityEmbryoListBuilder_ == null) {
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          abilityEmbryoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder addAllAbilityEmbryoList(
          Iterable<? extends AbilityEmbryoOuterClass.AbilityEmbryo> values) {
        if (abilityEmbryoListBuilder_ == null) {
          ensureAbilityEmbryoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, abilityEmbryoList_);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder clearAbilityEmbryoList() {
        if (abilityEmbryoListBuilder_ == null) {
          abilityEmbryoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public Builder removeAbilityEmbryoList(int index) {
        if (abilityEmbryoListBuilder_ == null) {
          ensureAbilityEmbryoListIsMutable();
          abilityEmbryoList_.remove(index);
          onChanged();
        } else {
          abilityEmbryoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public AbilityEmbryoOuterClass.AbilityEmbryo.Builder getAbilityEmbryoListBuilder(
          int index) {
        return getAbilityEmbryoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder getAbilityEmbryoListOrBuilder(
          int index) {
        if (abilityEmbryoListBuilder_ == null) {
          return abilityEmbryoList_.get(index);  } else {
          return abilityEmbryoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public java.util.List<? extends AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>
           getAbilityEmbryoListOrBuilderList() {
        if (abilityEmbryoListBuilder_ != null) {
          return abilityEmbryoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(abilityEmbryoList_);
        }
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public AbilityEmbryoOuterClass.AbilityEmbryo.Builder addAbilityEmbryoListBuilder() {
        return getAbilityEmbryoListFieldBuilder().addBuilder(
            AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public AbilityEmbryoOuterClass.AbilityEmbryo.Builder addAbilityEmbryoListBuilder(
          int index) {
        return getAbilityEmbryoListFieldBuilder().addBuilder(
            index, AbilityEmbryoOuterClass.AbilityEmbryo.getDefaultInstance());
      }
      /**
       * <code>repeated .AbilityEmbryo ability_embryo_list = 1;</code>
       */
      public java.util.List<AbilityEmbryoOuterClass.AbilityEmbryo.Builder>
           getAbilityEmbryoListBuilderList() {
        return getAbilityEmbryoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>
          getAbilityEmbryoListFieldBuilder() {
        if (abilityEmbryoListBuilder_ == null) {
          abilityEmbryoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              AbilityEmbryoOuterClass.AbilityEmbryo, AbilityEmbryoOuterClass.AbilityEmbryo.Builder, AbilityEmbryoOuterClass.AbilityEmbryoOrBuilder>(
                  abilityEmbryoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          abilityEmbryoList_ = null;
        }
        return abilityEmbryoListBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:AbilityControlBlock)
    }

    // @@protoc_insertion_point(class_scope:AbilityControlBlock)
    private static final AbilityControlBlock DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new AbilityControlBlock();
    }

    public static AbilityControlBlock getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityControlBlock>
        PARSER = new com.google.protobuf.AbstractParser<AbilityControlBlock>() {
      @Override
      public AbilityControlBlock parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityControlBlock> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<AbilityControlBlock> getParserForType() {
      return PARSER;
    }

    @Override
    public AbilityControlBlock getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityControlBlock_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AbilityControlBlock_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\031AbilityControlBlock.proto\032\023AbilityEmbr" +
      "yo.proto\"B\n\023AbilityControlBlock\022+\n\023abili" +
      "ty_embryo_list\030\001 \003(\0132\016.AbilityEmbryoB\032\n\030" +
      "io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          AbilityEmbryoOuterClass.getDescriptor(),
        });
    internal_static_AbilityControlBlock_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityControlBlock_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AbilityControlBlock_descriptor,
        new String[] { "AbilityEmbryoList", });
    descriptor.resolveAllFeaturesImmutable();
    AbilityEmbryoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
