package io.irminsul.common.proto.http;
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QueryRegionListHttpRsp.proto

// Protobuf Java Version: 3.25.4
public final class QueryRegionListHttpRspOuterClass {
  private QueryRegionListHttpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryRegionListHttpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QueryRegionListHttpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo> 
        getRegionListList();
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(int index);
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    int getRegionListCount();
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    java.util.List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> 
        getRegionListOrBuilderList();
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(
        int index);

    /**
     * <code>bytes client_secret_key = 5;</code>
     * @return The clientSecretKey.
     */
    com.google.protobuf.ByteString getClientSecretKey();

    /**
     * <code>bytes client_custom_config_encrypted = 6;</code>
     * @return The clientCustomConfigEncrypted.
     */
    com.google.protobuf.ByteString getClientCustomConfigEncrypted();

    /**
     * <code>bool enable_login_pc = 7;</code>
     * @return The enableLoginPc.
     */
    boolean getEnableLoginPc();
  }
  /**
   * Protobuf type {@code QueryRegionListHttpRsp}
   */
  public static final class QueryRegionListHttpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QueryRegionListHttpRsp)
      QueryRegionListHttpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryRegionListHttpRsp.newBuilder() to construct.
    private QueryRegionListHttpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryRegionListHttpRsp() {
      regionList_ = java.util.Collections.emptyList();
      clientSecretKey_ = com.google.protobuf.ByteString.EMPTY;
      clientCustomConfigEncrypted_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryRegionListHttpRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              QueryRegionListHttpRsp.class, Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int REGION_LIST_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo> regionList_;
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    @Override
    public java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo> getRegionListList() {
      return regionList_;
    }
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    @Override
    public java.util.List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> 
        getRegionListOrBuilderList() {
      return regionList_;
    }
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    @Override
    public int getRegionListCount() {
      return regionList_.size();
    }
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    @Override
    public RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(int index) {
      return regionList_.get(index);
    }
    /**
     * <code>repeated .RegionSimpleInfo region_list = 2;</code>
     */
    @Override
    public RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(
        int index) {
      return regionList_.get(index);
    }

    public static final int CLIENT_SECRET_KEY_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString clientSecretKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes client_secret_key = 5;</code>
     * @return The clientSecretKey.
     */
    @Override
    public com.google.protobuf.ByteString getClientSecretKey() {
      return clientSecretKey_;
    }

    public static final int CLIENT_CUSTOM_CONFIG_ENCRYPTED_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString clientCustomConfigEncrypted_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes client_custom_config_encrypted = 6;</code>
     * @return The clientCustomConfigEncrypted.
     */
    @Override
    public com.google.protobuf.ByteString getClientCustomConfigEncrypted() {
      return clientCustomConfigEncrypted_;
    }

    public static final int ENABLE_LOGIN_PC_FIELD_NUMBER = 7;
    private boolean enableLoginPc_ = false;
    /**
     * <code>bool enable_login_pc = 7;</code>
     * @return The enableLoginPc.
     */
    @Override
    public boolean getEnableLoginPc() {
      return enableLoginPc_;
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
        output.writeInt32(1, retcode_);
      }
      for (int i = 0; i < regionList_.size(); i++) {
        output.writeMessage(2, regionList_.get(i));
      }
      if (!clientSecretKey_.isEmpty()) {
        output.writeBytes(5, clientSecretKey_);
      }
      if (!clientCustomConfigEncrypted_.isEmpty()) {
        output.writeBytes(6, clientCustomConfigEncrypted_);
      }
      if (enableLoginPc_ != false) {
        output.writeBool(7, enableLoginPc_);
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
          .computeInt32Size(1, retcode_);
      }
      for (int i = 0; i < regionList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, regionList_.get(i));
      }
      if (!clientSecretKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, clientSecretKey_);
      }
      if (!clientCustomConfigEncrypted_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, clientCustomConfigEncrypted_);
      }
      if (enableLoginPc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, enableLoginPc_);
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
      if (!(obj instanceof QueryRegionListHttpRsp)) {
        return super.equals(obj);
      }
      QueryRegionListHttpRsp other = (QueryRegionListHttpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRegionListList()
          .equals(other.getRegionListList())) return false;
      if (!getClientSecretKey()
          .equals(other.getClientSecretKey())) return false;
      if (!getClientCustomConfigEncrypted()
          .equals(other.getClientCustomConfigEncrypted())) return false;
      if (getEnableLoginPc()
          != other.getEnableLoginPc()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (getRegionListCount() > 0) {
        hash = (37 * hash) + REGION_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRegionListList().hashCode();
      }
      hash = (37 * hash) + CLIENT_SECRET_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getClientSecretKey().hashCode();
      hash = (37 * hash) + CLIENT_CUSTOM_CONFIG_ENCRYPTED_FIELD_NUMBER;
      hash = (53 * hash) + getClientCustomConfigEncrypted().hashCode();
      hash = (37 * hash) + ENABLE_LOGIN_PC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getEnableLoginPc());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static QueryRegionListHttpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static QueryRegionListHttpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static QueryRegionListHttpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static QueryRegionListHttpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static QueryRegionListHttpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static QueryRegionListHttpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static QueryRegionListHttpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static QueryRegionListHttpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static QueryRegionListHttpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static QueryRegionListHttpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static QueryRegionListHttpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static QueryRegionListHttpRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(QueryRegionListHttpRsp prototype) {
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
     * Protobuf type {@code QueryRegionListHttpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QueryRegionListHttpRsp)
        QueryRegionListHttpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                QueryRegionListHttpRsp.class, Builder.class);
      }

      // Construct using QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp.newBuilder()
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
        retcode_ = 0;
        if (regionListBuilder_ == null) {
          regionList_ = java.util.Collections.emptyList();
        } else {
          regionList_ = null;
          regionListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        clientSecretKey_ = com.google.protobuf.ByteString.EMPTY;
        clientCustomConfigEncrypted_ = com.google.protobuf.ByteString.EMPTY;
        enableLoginPc_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return QueryRegionListHttpRspOuterClass.internal_static_QueryRegionListHttpRsp_descriptor;
      }

      @Override
      public QueryRegionListHttpRsp getDefaultInstanceForType() {
        return QueryRegionListHttpRsp.getDefaultInstance();
      }

      @Override
      public QueryRegionListHttpRsp build() {
        QueryRegionListHttpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public QueryRegionListHttpRsp buildPartial() {
        QueryRegionListHttpRsp result = new QueryRegionListHttpRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(QueryRegionListHttpRsp result) {
        if (regionListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            regionList_ = java.util.Collections.unmodifiableList(regionList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.regionList_ = regionList_;
        } else {
          result.regionList_ = regionListBuilder_.build();
        }
      }

      private void buildPartial0(QueryRegionListHttpRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.clientSecretKey_ = clientSecretKey_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.clientCustomConfigEncrypted_ = clientCustomConfigEncrypted_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.enableLoginPc_ = enableLoginPc_;
        }
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof QueryRegionListHttpRsp) {
          return mergeFrom((QueryRegionListHttpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(QueryRegionListHttpRsp other) {
        if (other == QueryRegionListHttpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (regionListBuilder_ == null) {
          if (!other.regionList_.isEmpty()) {
            if (regionList_.isEmpty()) {
              regionList_ = other.regionList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRegionListIsMutable();
              regionList_.addAll(other.regionList_);
            }
            onChanged();
          }
        } else {
          if (!other.regionList_.isEmpty()) {
            if (regionListBuilder_.isEmpty()) {
              regionListBuilder_.dispose();
              regionListBuilder_ = null;
              regionList_ = other.regionList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              regionListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRegionListFieldBuilder() : null;
            } else {
              regionListBuilder_.addAllMessages(other.regionList_);
            }
          }
        }
        if (other.getClientSecretKey() != com.google.protobuf.ByteString.EMPTY) {
          setClientSecretKey(other.getClientSecretKey());
        }
        if (other.getClientCustomConfigEncrypted() != com.google.protobuf.ByteString.EMPTY) {
          setClientCustomConfigEncrypted(other.getClientCustomConfigEncrypted());
        }
        if (other.getEnableLoginPc() != false) {
          setEnableLoginPc(other.getEnableLoginPc());
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                RegionSimpleInfoOuterClass.RegionSimpleInfo m =
                    input.readMessage(
                        RegionSimpleInfoOuterClass.RegionSimpleInfo.parser(),
                        extensionRegistry);
                if (regionListBuilder_ == null) {
                  ensureRegionListIsMutable();
                  regionList_.add(m);
                } else {
                  regionListBuilder_.addMessage(m);
                }
                break;
              } // case 18
              case 42: {
                clientSecretKey_ = input.readBytes();
                bitField0_ |= 0x00000004;
                break;
              } // case 42
              case 50: {
                clientCustomConfigEncrypted_ = input.readBytes();
                bitField0_ |= 0x00000008;
                break;
              } // case 50
              case 56: {
                enableLoginPc_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 56
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo> regionList_ =
        java.util.Collections.emptyList();
      private void ensureRegionListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          regionList_ = new java.util.ArrayList<RegionSimpleInfoOuterClass.RegionSimpleInfo>(regionList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> regionListBuilder_;

      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo> getRegionListList() {
        if (regionListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(regionList_);
        } else {
          return regionListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public int getRegionListCount() {
        if (regionListBuilder_ == null) {
          return regionList_.size();
        } else {
          return regionListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public RegionSimpleInfoOuterClass.RegionSimpleInfo getRegionList(int index) {
        if (regionListBuilder_ == null) {
          return regionList_.get(index);
        } else {
          return regionListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder setRegionList(
          int index, RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
        if (regionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionListIsMutable();
          regionList_.set(index, value);
          onChanged();
        } else {
          regionListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder setRegionList(
          int index, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
        if (regionListBuilder_ == null) {
          ensureRegionListIsMutable();
          regionList_.set(index, builderForValue.build());
          onChanged();
        } else {
          regionListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder addRegionList(RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
        if (regionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionListIsMutable();
          regionList_.add(value);
          onChanged();
        } else {
          regionListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder addRegionList(
          int index, RegionSimpleInfoOuterClass.RegionSimpleInfo value) {
        if (regionListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionListIsMutable();
          regionList_.add(index, value);
          onChanged();
        } else {
          regionListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder addRegionList(
          RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
        if (regionListBuilder_ == null) {
          ensureRegionListIsMutable();
          regionList_.add(builderForValue.build());
          onChanged();
        } else {
          regionListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder addRegionList(
          int index, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder builderForValue) {
        if (regionListBuilder_ == null) {
          ensureRegionListIsMutable();
          regionList_.add(index, builderForValue.build());
          onChanged();
        } else {
          regionListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder addAllRegionList(
          Iterable<? extends RegionSimpleInfoOuterClass.RegionSimpleInfo> values) {
        if (regionListBuilder_ == null) {
          ensureRegionListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, regionList_);
          onChanged();
        } else {
          regionListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder clearRegionList() {
        if (regionListBuilder_ == null) {
          regionList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          regionListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public Builder removeRegionList(int index) {
        if (regionListBuilder_ == null) {
          ensureRegionListIsMutable();
          regionList_.remove(index);
          onChanged();
        } else {
          regionListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder getRegionListBuilder(
          int index) {
        return getRegionListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder getRegionListOrBuilder(
          int index) {
        if (regionListBuilder_ == null) {
          return regionList_.get(index);  } else {
          return regionListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public java.util.List<? extends RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> 
           getRegionListOrBuilderList() {
        if (regionListBuilder_ != null) {
          return regionListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(regionList_);
        }
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder addRegionListBuilder() {
        return getRegionListFieldBuilder().addBuilder(
            RegionSimpleInfoOuterClass.RegionSimpleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder addRegionListBuilder(
          int index) {
        return getRegionListFieldBuilder().addBuilder(
            index, RegionSimpleInfoOuterClass.RegionSimpleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .RegionSimpleInfo region_list = 2;</code>
       */
      public java.util.List<RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder> 
           getRegionListBuilderList() {
        return getRegionListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder> 
          getRegionListFieldBuilder() {
        if (regionListBuilder_ == null) {
          regionListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              RegionSimpleInfoOuterClass.RegionSimpleInfo, RegionSimpleInfoOuterClass.RegionSimpleInfo.Builder, RegionSimpleInfoOuterClass.RegionSimpleInfoOrBuilder>(
                  regionList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          regionList_ = null;
        }
        return regionListBuilder_;
      }

      private com.google.protobuf.ByteString clientSecretKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes client_secret_key = 5;</code>
       * @return The clientSecretKey.
       */
      @Override
      public com.google.protobuf.ByteString getClientSecretKey() {
        return clientSecretKey_;
      }
      /**
       * <code>bytes client_secret_key = 5;</code>
       * @param value The clientSecretKey to set.
       * @return This builder for chaining.
       */
      public Builder setClientSecretKey(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        clientSecretKey_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bytes client_secret_key = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientSecretKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientSecretKey_ = getDefaultInstance().getClientSecretKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString clientCustomConfigEncrypted_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes client_custom_config_encrypted = 6;</code>
       * @return The clientCustomConfigEncrypted.
       */
      @Override
      public com.google.protobuf.ByteString getClientCustomConfigEncrypted() {
        return clientCustomConfigEncrypted_;
      }
      /**
       * <code>bytes client_custom_config_encrypted = 6;</code>
       * @param value The clientCustomConfigEncrypted to set.
       * @return This builder for chaining.
       */
      public Builder setClientCustomConfigEncrypted(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        clientCustomConfigEncrypted_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bytes client_custom_config_encrypted = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientCustomConfigEncrypted() {
        bitField0_ = (bitField0_ & ~0x00000008);
        clientCustomConfigEncrypted_ = getDefaultInstance().getClientCustomConfigEncrypted();
        onChanged();
        return this;
      }

      private boolean enableLoginPc_ ;
      /**
       * <code>bool enable_login_pc = 7;</code>
       * @return The enableLoginPc.
       */
      @Override
      public boolean getEnableLoginPc() {
        return enableLoginPc_;
      }
      /**
       * <code>bool enable_login_pc = 7;</code>
       * @param value The enableLoginPc to set.
       * @return This builder for chaining.
       */
      public Builder setEnableLoginPc(boolean value) {

        enableLoginPc_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool enable_login_pc = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnableLoginPc() {
        bitField0_ = (bitField0_ & ~0x00000010);
        enableLoginPc_ = false;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:QueryRegionListHttpRsp)
    }

    // @@protoc_insertion_point(class_scope:QueryRegionListHttpRsp)
    private static final QueryRegionListHttpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new QueryRegionListHttpRsp();
    }

    public static QueryRegionListHttpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryRegionListHttpRsp>
        PARSER = new com.google.protobuf.AbstractParser<QueryRegionListHttpRsp>() {
      @Override
      public QueryRegionListHttpRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueryRegionListHttpRsp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<QueryRegionListHttpRsp> getParserForType() {
      return PARSER;
    }

    @Override
    public QueryRegionListHttpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryRegionListHttpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QueryRegionListHttpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034QueryRegionListHttpRsp.proto\032\026RegionSi" +
      "mpleInfo.proto\"\255\001\n\026QueryRegionListHttpRs" +
      "p\022\017\n\007retcode\030\001 \001(\005\022&\n\013region_list\030\002 \003(\0132" +
      "\021.RegionSimpleInfo\022\031\n\021client_secret_key\030" +
      "\005 \001(\014\022&\n\036client_custom_config_encrypted\030" +
      "\006 \001(\014\022\027\n\017enable_login_pc\030\007 \001(\010b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          RegionSimpleInfoOuterClass.getDescriptor(),
        });
    internal_static_QueryRegionListHttpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QueryRegionListHttpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QueryRegionListHttpRsp_descriptor,
        new String[] { "Retcode", "RegionList", "ClientSecretKey", "ClientCustomConfigEncrypted", "EnableLoginPc", });
    RegionSimpleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
