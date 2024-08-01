// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: CustomGadgetTreeInfo.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class CustomGadgetTreeInfoOuterClass {
  private CustomGadgetTreeInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      CustomGadgetTreeInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomGadgetTreeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomGadgetTreeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>
        getNodeListList();
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(int index);
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    int getNodeListCount();
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    java.util.List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>
        getNodeListOrBuilderList();
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: POAIMCJGABA
   * </pre>
   *
   * Protobuf type {@code CustomGadgetTreeInfo}
   */
  public static final class CustomGadgetTreeInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CustomGadgetTreeInfo)
      CustomGadgetTreeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        CustomGadgetTreeInfo.class.getName());
    }
    // Use CustomGadgetTreeInfo.newBuilder() to construct.
    private CustomGadgetTreeInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CustomGadgetTreeInfo() {
      nodeList_ = java.util.Collections.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CustomGadgetTreeInfo.class, Builder.class);
    }

    public static final int NODE_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> nodeList_;
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    @Override
    public java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getNodeListList() {
      return nodeList_;
    }
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    @Override
    public java.util.List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>
        getNodeListOrBuilderList() {
      return nodeList_;
    }
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    @Override
    public int getNodeListCount() {
      return nodeList_.size();
    }
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    @Override
    public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(int index) {
      return nodeList_.get(index);
    }
    /**
     * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
     */
    @Override
    public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(
        int index) {
      return nodeList_.get(index);
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
      for (int i = 0; i < nodeList_.size(); i++) {
        output.writeMessage(1, nodeList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nodeList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nodeList_.get(i));
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
      if (!(obj instanceof CustomGadgetTreeInfo)) {
        return super.equals(obj);
      }
      CustomGadgetTreeInfo other = (CustomGadgetTreeInfo) obj;

      if (!getNodeListList()
          .equals(other.getNodeListList())) return false;
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
      if (getNodeListCount() > 0) {
        hash = (37 * hash) + NODE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getNodeListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CustomGadgetTreeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomGadgetTreeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomGadgetTreeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomGadgetTreeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomGadgetTreeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomGadgetTreeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomGadgetTreeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static CustomGadgetTreeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static CustomGadgetTreeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static CustomGadgetTreeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomGadgetTreeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static CustomGadgetTreeInfo parseFrom(
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
    public static Builder newBuilder(CustomGadgetTreeInfo prototype) {
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
     * Obf: POAIMCJGABA
     * </pre>
     *
     * Protobuf type {@code CustomGadgetTreeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomGadgetTreeInfo)
        CustomGadgetTreeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CustomGadgetTreeInfo.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.CustomGadgetTreeInfoOuterClass.CustomGadgetTreeInfo.newBuilder()
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
        if (nodeListBuilder_ == null) {
          nodeList_ = java.util.Collections.emptyList();
        } else {
          nodeList_ = null;
          nodeListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CustomGadgetTreeInfoOuterClass.internal_static_CustomGadgetTreeInfo_descriptor;
      }

      @Override
      public CustomGadgetTreeInfo getDefaultInstanceForType() {
        return CustomGadgetTreeInfo.getDefaultInstance();
      }

      @Override
      public CustomGadgetTreeInfo build() {
        CustomGadgetTreeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public CustomGadgetTreeInfo buildPartial() {
        CustomGadgetTreeInfo result = new CustomGadgetTreeInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(CustomGadgetTreeInfo result) {
        if (nodeListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nodeList_ = java.util.Collections.unmodifiableList(nodeList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nodeList_ = nodeList_;
        } else {
          result.nodeList_ = nodeListBuilder_.build();
        }
      }

      private void buildPartial0(CustomGadgetTreeInfo result) {
        int from_bitField0_ = bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof CustomGadgetTreeInfo) {
          return mergeFrom((CustomGadgetTreeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CustomGadgetTreeInfo other) {
        if (other == CustomGadgetTreeInfo.getDefaultInstance()) return this;
        if (nodeListBuilder_ == null) {
          if (!other.nodeList_.isEmpty()) {
            if (nodeList_.isEmpty()) {
              nodeList_ = other.nodeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNodeListIsMutable();
              nodeList_.addAll(other.nodeList_);
            }
            onChanged();
          }
        } else {
          if (!other.nodeList_.isEmpty()) {
            if (nodeListBuilder_.isEmpty()) {
              nodeListBuilder_.dispose();
              nodeListBuilder_ = null;
              nodeList_ = other.nodeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nodeListBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNodeListFieldBuilder() : null;
            } else {
              nodeListBuilder_.addAllMessages(other.nodeList_);
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
                CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo m =
                    input.readMessage(
                        CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.parser(),
                        extensionRegistry);
                if (nodeListBuilder_ == null) {
                  ensureNodeListIsMutable();
                  nodeList_.add(m);
                } else {
                  nodeListBuilder_.addMessage(m);
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

      private java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> nodeList_ =
        java.util.Collections.emptyList();
      private void ensureNodeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nodeList_ = new java.util.ArrayList<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo>(nodeList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder> nodeListBuilder_;

      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> getNodeListList() {
        if (nodeListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nodeList_);
        } else {
          return nodeListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public int getNodeListCount() {
        if (nodeListBuilder_ == null) {
          return nodeList_.size();
        } else {
          return nodeListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getNodeList(int index) {
        if (nodeListBuilder_ == null) {
          return nodeList_.get(index);
        } else {
          return nodeListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder setNodeList(
          int index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (nodeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeListIsMutable();
          nodeList_.set(index, value);
          onChanged();
        } else {
          nodeListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder setNodeList(
          int index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (nodeListBuilder_ == null) {
          ensureNodeListIsMutable();
          nodeList_.set(index, builderForValue.build());
          onChanged();
        } else {
          nodeListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder addNodeList(CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (nodeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeListIsMutable();
          nodeList_.add(value);
          onChanged();
        } else {
          nodeListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder addNodeList(
          int index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo value) {
        if (nodeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNodeListIsMutable();
          nodeList_.add(index, value);
          onChanged();
        } else {
          nodeListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder addNodeList(
          CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (nodeListBuilder_ == null) {
          ensureNodeListIsMutable();
          nodeList_.add(builderForValue.build());
          onChanged();
        } else {
          nodeListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder addNodeList(
          int index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder builderForValue) {
        if (nodeListBuilder_ == null) {
          ensureNodeListIsMutable();
          nodeList_.add(index, builderForValue.build());
          onChanged();
        } else {
          nodeListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder addAllNodeList(
          Iterable<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo> values) {
        if (nodeListBuilder_ == null) {
          ensureNodeListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nodeList_);
          onChanged();
        } else {
          nodeListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder clearNodeList() {
        if (nodeListBuilder_ == null) {
          nodeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nodeListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public Builder removeNodeList(int index) {
        if (nodeListBuilder_ == null) {
          ensureNodeListIsMutable();
          nodeList_.remove(index);
          onChanged();
        } else {
          nodeListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder getNodeListBuilder(
          int index) {
        return getNodeListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder getNodeListOrBuilder(
          int index) {
        if (nodeListBuilder_ == null) {
          return nodeList_.get(index);  } else {
          return nodeListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public java.util.List<? extends CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>
           getNodeListOrBuilderList() {
        if (nodeListBuilder_ != null) {
          return nodeListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nodeList_);
        }
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addNodeListBuilder() {
        return getNodeListFieldBuilder().addBuilder(
            CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder addNodeListBuilder(
          int index) {
        return getNodeListFieldBuilder().addBuilder(
            index, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .CustomCommonNodeInfo node_list = 1;</code>
       */
      public java.util.List<CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder>
           getNodeListBuilderList() {
        return getNodeListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>
          getNodeListFieldBuilder() {
        if (nodeListBuilder_ == null) {
          nodeListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder, CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder>(
                  nodeList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nodeList_ = null;
        }
        return nodeListBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:CustomGadgetTreeInfo)
    }

    // @@protoc_insertion_point(class_scope:CustomGadgetTreeInfo)
    private static final CustomGadgetTreeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CustomGadgetTreeInfo();
    }

    public static CustomGadgetTreeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomGadgetTreeInfo>
        PARSER = new com.google.protobuf.AbstractParser<CustomGadgetTreeInfo>() {
      @Override
      public CustomGadgetTreeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomGadgetTreeInfo> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<CustomGadgetTreeInfo> getParserForType() {
      return PARSER;
    }

    @Override
    public CustomGadgetTreeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomGadgetTreeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CustomGadgetTreeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\032CustomGadgetTreeInfo.proto\032\032CustomComm" +
      "onNodeInfo.proto\"@\n\024CustomGadgetTreeInfo" +
      "\022(\n\tnode_list\030\001 \003(\0132\025.CustomCommonNodeIn" +
      "foB\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          CustomCommonNodeInfoOuterClass.getDescriptor(),
        });
    internal_static_CustomGadgetTreeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomGadgetTreeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CustomGadgetTreeInfo_descriptor,
        new String[] { "NodeList", });
    descriptor.resolveAllFeaturesImmutable();
    CustomCommonNodeInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
