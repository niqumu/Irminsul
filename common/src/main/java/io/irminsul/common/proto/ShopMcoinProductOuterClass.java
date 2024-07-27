// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ShopMcoinProduct.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ShopMcoinProductOuterClass {
  private ShopMcoinProductOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ShopMcoinProductOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ShopMcoinProductOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ShopMcoinProduct)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    String getProductId();
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    com.google.protobuf.ByteString
        getProductIdBytes();

    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    String getPriceTier();
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    com.google.protobuf.ByteString
        getPriceTierBytes();

    /**
     * <code>uint32 mcoin_base = 3;</code>
     * @return The mcoinBase.
     */
    int getMcoinBase();

    /**
     * <code>uint32 mcoin_non_first = 4;</code>
     * @return The mcoinNonFirst.
     */
    int getMcoinNonFirst();

    /**
     * <code>uint32 mcoin_first = 5;</code>
     * @return The mcoinFirst.
     */
    int getMcoinFirst();

    /**
     * <code>uint32 bought_num = 6;</code>
     * @return The boughtNum.
     */
    int getBoughtNum();

    /**
     * <code>bool is_audit = 7;</code>
     * @return The isAudit.
     */
    boolean getIsAudit();
  }
  /**
   * <pre>
   * Obf: BNMNBLNCBIG
   * </pre>
   *
   * Protobuf type {@code ShopMcoinProduct}
   */
  public static final class ShopMcoinProduct extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ShopMcoinProduct)
      ShopMcoinProductOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        ShopMcoinProduct.class.getName());
    }
    // Use ShopMcoinProduct.newBuilder() to construct.
    private ShopMcoinProduct(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ShopMcoinProduct() {
      productId_ = "";
      priceTier_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ShopMcoinProduct.class, Builder.class);
    }

    public static final int PRODUCT_ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile Object productId_ = "";
    /**
     * <code>string product_id = 1;</code>
     * @return The productId.
     */
    @Override
    public String getProductId() {
      Object ref = productId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      }
    }
    /**
     * <code>string product_id = 1;</code>
     * @return The bytes for productId.
     */
    @Override
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRICE_TIER_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile Object priceTier_ = "";
    /**
     * <code>string price_tier = 2;</code>
     * @return The priceTier.
     */
    @Override
    public String getPriceTier() {
      Object ref = priceTier_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        priceTier_ = s;
        return s;
      }
    }
    /**
     * <code>string price_tier = 2;</code>
     * @return The bytes for priceTier.
     */
    @Override
    public com.google.protobuf.ByteString
        getPriceTierBytes() {
      Object ref = priceTier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        priceTier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MCOIN_BASE_FIELD_NUMBER = 3;
    private int mcoinBase_ = 0;
    /**
     * <code>uint32 mcoin_base = 3;</code>
     * @return The mcoinBase.
     */
    @Override
    public int getMcoinBase() {
      return mcoinBase_;
    }

    public static final int MCOIN_NON_FIRST_FIELD_NUMBER = 4;
    private int mcoinNonFirst_ = 0;
    /**
     * <code>uint32 mcoin_non_first = 4;</code>
     * @return The mcoinNonFirst.
     */
    @Override
    public int getMcoinNonFirst() {
      return mcoinNonFirst_;
    }

    public static final int MCOIN_FIRST_FIELD_NUMBER = 5;
    private int mcoinFirst_ = 0;
    /**
     * <code>uint32 mcoin_first = 5;</code>
     * @return The mcoinFirst.
     */
    @Override
    public int getMcoinFirst() {
      return mcoinFirst_;
    }

    public static final int BOUGHT_NUM_FIELD_NUMBER = 6;
    private int boughtNum_ = 0;
    /**
     * <code>uint32 bought_num = 6;</code>
     * @return The boughtNum.
     */
    @Override
    public int getBoughtNum() {
      return boughtNum_;
    }

    public static final int IS_AUDIT_FIELD_NUMBER = 7;
    private boolean isAudit_ = false;
    /**
     * <code>bool is_audit = 7;</code>
     * @return The isAudit.
     */
    @Override
    public boolean getIsAudit() {
      return isAudit_;
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(productId_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(priceTier_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, priceTier_);
      }
      if (mcoinBase_ != 0) {
        output.writeUInt32(3, mcoinBase_);
      }
      if (mcoinNonFirst_ != 0) {
        output.writeUInt32(4, mcoinNonFirst_);
      }
      if (mcoinFirst_ != 0) {
        output.writeUInt32(5, mcoinFirst_);
      }
      if (boughtNum_ != 0) {
        output.writeUInt32(6, boughtNum_);
      }
      if (isAudit_ != false) {
        output.writeBool(7, isAudit_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(productId_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, productId_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(priceTier_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, priceTier_);
      }
      if (mcoinBase_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mcoinBase_);
      }
      if (mcoinNonFirst_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mcoinNonFirst_);
      }
      if (mcoinFirst_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, mcoinFirst_);
      }
      if (boughtNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, boughtNum_);
      }
      if (isAudit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isAudit_);
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
      if (!(obj instanceof ShopMcoinProduct)) {
        return super.equals(obj);
      }
      ShopMcoinProduct other = (ShopMcoinProduct) obj;

      if (!getProductId()
          .equals(other.getProductId())) return false;
      if (!getPriceTier()
          .equals(other.getPriceTier())) return false;
      if (getMcoinBase()
          != other.getMcoinBase()) return false;
      if (getMcoinNonFirst()
          != other.getMcoinNonFirst()) return false;
      if (getMcoinFirst()
          != other.getMcoinFirst()) return false;
      if (getBoughtNum()
          != other.getBoughtNum()) return false;
      if (getIsAudit()
          != other.getIsAudit()) return false;
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
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductId().hashCode();
      hash = (37 * hash) + PRICE_TIER_FIELD_NUMBER;
      hash = (53 * hash) + getPriceTier().hashCode();
      hash = (37 * hash) + MCOIN_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinBase();
      hash = (37 * hash) + MCOIN_NON_FIRST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinNonFirst();
      hash = (37 * hash) + MCOIN_FIRST_FIELD_NUMBER;
      hash = (53 * hash) + getMcoinFirst();
      hash = (37 * hash) + BOUGHT_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getBoughtNum();
      hash = (37 * hash) + IS_AUDIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAudit());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ShopMcoinProduct parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ShopMcoinProduct parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ShopMcoinProduct parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ShopMcoinProduct parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ShopMcoinProduct parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ShopMcoinProduct parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ShopMcoinProduct parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ShopMcoinProduct parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ShopMcoinProduct parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ShopMcoinProduct parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ShopMcoinProduct parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ShopMcoinProduct parseFrom(
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
    public static Builder newBuilder(ShopMcoinProduct prototype) {
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
     * Obf: BNMNBLNCBIG
     * </pre>
     *
     * Protobuf type {@code ShopMcoinProduct}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ShopMcoinProduct)
        ShopMcoinProductOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ShopMcoinProduct.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ShopMcoinProductOuterClass.ShopMcoinProduct.newBuilder()
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
        productId_ = "";
        priceTier_ = "";
        mcoinBase_ = 0;
        mcoinNonFirst_ = 0;
        mcoinFirst_ = 0;
        boughtNum_ = 0;
        isAudit_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ShopMcoinProductOuterClass.internal_static_ShopMcoinProduct_descriptor;
      }

      @Override
      public ShopMcoinProduct getDefaultInstanceForType() {
        return ShopMcoinProduct.getDefaultInstance();
      }

      @Override
      public ShopMcoinProduct build() {
        ShopMcoinProduct result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ShopMcoinProduct buildPartial() {
        ShopMcoinProduct result = new ShopMcoinProduct(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ShopMcoinProduct result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.productId_ = productId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.priceTier_ = priceTier_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.mcoinBase_ = mcoinBase_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.mcoinNonFirst_ = mcoinNonFirst_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.mcoinFirst_ = mcoinFirst_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.boughtNum_ = boughtNum_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.isAudit_ = isAudit_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ShopMcoinProduct) {
          return mergeFrom((ShopMcoinProduct)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ShopMcoinProduct other) {
        if (other == ShopMcoinProduct.getDefaultInstance()) return this;
        if (!other.getProductId().isEmpty()) {
          productId_ = other.productId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getPriceTier().isEmpty()) {
          priceTier_ = other.priceTier_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getMcoinBase() != 0) {
          setMcoinBase(other.getMcoinBase());
        }
        if (other.getMcoinNonFirst() != 0) {
          setMcoinNonFirst(other.getMcoinNonFirst());
        }
        if (other.getMcoinFirst() != 0) {
          setMcoinFirst(other.getMcoinFirst());
        }
        if (other.getBoughtNum() != 0) {
          setBoughtNum(other.getBoughtNum());
        }
        if (other.getIsAudit() != false) {
          setIsAudit(other.getIsAudit());
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
                productId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                priceTier_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                mcoinBase_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                mcoinNonFirst_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                mcoinFirst_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                boughtNum_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                isAudit_ = input.readBool();
                bitField0_ |= 0x00000040;
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

      private Object productId_ = "";
      /**
       * <code>string product_id = 1;</code>
       * @return The productId.
       */
      public String getProductId() {
        Object ref = productId_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          productId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @return The bytes for productId.
       */
      public com.google.protobuf.ByteString
          getProductIdBytes() {
        Object ref = productId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          productId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductId(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        productId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProductId() {
        productId_ = getDefaultInstance().getProductId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string product_id = 1;</code>
       * @param value The bytes for productId to set.
       * @return This builder for chaining.
       */
      public Builder setProductIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        productId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private Object priceTier_ = "";
      /**
       * <code>string price_tier = 2;</code>
       * @return The priceTier.
       */
      public String getPriceTier() {
        Object ref = priceTier_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          priceTier_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return The bytes for priceTier.
       */
      public com.google.protobuf.ByteString
          getPriceTierBytes() {
        Object ref = priceTier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          priceTier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTier(
          String value) {
        if (value == null) { throw new NullPointerException(); }
        priceTier_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriceTier() {
        priceTier_ = getDefaultInstance().getPriceTier();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string price_tier = 2;</code>
       * @param value The bytes for priceTier to set.
       * @return This builder for chaining.
       */
      public Builder setPriceTierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        priceTier_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int mcoinBase_ ;
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @return The mcoinBase.
       */
      @Override
      public int getMcoinBase() {
        return mcoinBase_;
      }
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @param value The mcoinBase to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinBase(int value) {

        mcoinBase_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_base = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinBase() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mcoinBase_ = 0;
        onChanged();
        return this;
      }

      private int mcoinNonFirst_ ;
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @return The mcoinNonFirst.
       */
      @Override
      public int getMcoinNonFirst() {
        return mcoinNonFirst_;
      }
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @param value The mcoinNonFirst to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinNonFirst(int value) {

        mcoinNonFirst_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_non_first = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinNonFirst() {
        bitField0_ = (bitField0_ & ~0x00000008);
        mcoinNonFirst_ = 0;
        onChanged();
        return this;
      }

      private int mcoinFirst_ ;
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @return The mcoinFirst.
       */
      @Override
      public int getMcoinFirst() {
        return mcoinFirst_;
      }
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @param value The mcoinFirst to set.
       * @return This builder for chaining.
       */
      public Builder setMcoinFirst(int value) {

        mcoinFirst_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mcoin_first = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMcoinFirst() {
        bitField0_ = (bitField0_ & ~0x00000010);
        mcoinFirst_ = 0;
        onChanged();
        return this;
      }

      private int boughtNum_ ;
      /**
       * <code>uint32 bought_num = 6;</code>
       * @return The boughtNum.
       */
      @Override
      public int getBoughtNum() {
        return boughtNum_;
      }
      /**
       * <code>uint32 bought_num = 6;</code>
       * @param value The boughtNum to set.
       * @return This builder for chaining.
       */
      public Builder setBoughtNum(int value) {

        boughtNum_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bought_num = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearBoughtNum() {
        bitField0_ = (bitField0_ & ~0x00000020);
        boughtNum_ = 0;
        onChanged();
        return this;
      }

      private boolean isAudit_ ;
      /**
       * <code>bool is_audit = 7;</code>
       * @return The isAudit.
       */
      @Override
      public boolean getIsAudit() {
        return isAudit_;
      }
      /**
       * <code>bool is_audit = 7;</code>
       * @param value The isAudit to set.
       * @return This builder for chaining.
       */
      public Builder setIsAudit(boolean value) {

        isAudit_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_audit = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAudit() {
        bitField0_ = (bitField0_ & ~0x00000040);
        isAudit_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ShopMcoinProduct)
    }

    // @@protoc_insertion_point(class_scope:ShopMcoinProduct)
    private static final ShopMcoinProduct DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ShopMcoinProduct();
    }

    public static ShopMcoinProduct getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ShopMcoinProduct>
        PARSER = new com.google.protobuf.AbstractParser<ShopMcoinProduct>() {
      @Override
      public ShopMcoinProduct parsePartialFrom(
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

    public static com.google.protobuf.Parser<ShopMcoinProduct> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ShopMcoinProduct> getParserForType() {
      return PARSER;
    }

    @Override
    public ShopMcoinProduct getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ShopMcoinProduct_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ShopMcoinProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\026ShopMcoinProduct.proto\"\242\001\n\020ShopMcoinPr" +
      "oduct\022\022\n\nproduct_id\030\001 \001(\t\022\022\n\nprice_tier\030" +
      "\002 \001(\t\022\022\n\nmcoin_base\030\003 \001(\r\022\027\n\017mcoin_non_f" +
      "irst\030\004 \001(\r\022\023\n\013mcoin_first\030\005 \001(\r\022\022\n\nbough" +
      "t_num\030\006 \001(\r\022\020\n\010is_audit\030\007 \001(\010B\032\n\030io.irmi" +
      "nsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ShopMcoinProduct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ShopMcoinProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ShopMcoinProduct_descriptor,
        new String[] { "ProductId", "PriceTier", "McoinBase", "McoinNonFirst", "McoinFirst", "BoughtNum", "IsAudit", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
