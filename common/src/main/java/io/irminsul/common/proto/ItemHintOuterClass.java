// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ItemHint.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ItemHintOuterClass {
  private ItemHintOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ItemHintOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ItemHintOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ItemHint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 count = 7;</code>
     * @return The count.
     */
    int getCount();

    /**
     * <code>uint32 item_id = 9;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 guid = 14;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>bool is_new = 8;</code>
     * @return The isNew.
     */
    boolean getIsNew();
  }
  /**
   * <pre>
   * Obf: OLBNAADPLKJ
   * </pre>
   *
   * Protobuf type {@code ItemHint}
   */
  public static final class ItemHint extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ItemHint)
      ItemHintOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        ItemHint.class.getName());
    }
    // Use ItemHint.newBuilder() to construct.
    private ItemHint(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ItemHint() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ItemHintOuterClass.internal_static_ItemHint_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ItemHintOuterClass.internal_static_ItemHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ItemHint.class, Builder.class);
    }

    public static final int COUNT_FIELD_NUMBER = 7;
    private int count_ = 0;
    /**
     * <code>uint32 count = 7;</code>
     * @return The count.
     */
    @Override
    public int getCount() {
      return count_;
    }

    public static final int ITEM_ID_FIELD_NUMBER = 9;
    private int itemId_ = 0;
    /**
     * <code>uint32 item_id = 9;</code>
     * @return The itemId.
     */
    @Override
    public int getItemId() {
      return itemId_;
    }

    public static final int GUID_FIELD_NUMBER = 14;
    private long guid_ = 0L;
    /**
     * <code>uint64 guid = 14;</code>
     * @return The guid.
     */
    @Override
    public long getGuid() {
      return guid_;
    }

    public static final int IS_NEW_FIELD_NUMBER = 8;
    private boolean isNew_ = false;
    /**
     * <code>bool is_new = 8;</code>
     * @return The isNew.
     */
    @Override
    public boolean getIsNew() {
      return isNew_;
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
      if (count_ != 0) {
        output.writeUInt32(7, count_);
      }
      if (isNew_ != false) {
        output.writeBool(8, isNew_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(9, itemId_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(14, guid_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (count_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, count_);
      }
      if (isNew_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isNew_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, itemId_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(14, guid_);
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
      if (!(obj instanceof ItemHint)) {
        return super.equals(obj);
      }
      ItemHint other = (ItemHint) obj;

      if (getCount()
          != other.getCount()) return false;
      if (getItemId()
          != other.getItemId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getIsNew()
          != other.getIsNew()) return false;
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
      hash = (37 * hash) + COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCount();
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + IS_NEW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNew());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ItemHint parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ItemHint parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ItemHint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ItemHint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ItemHint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ItemHint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ItemHint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ItemHint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ItemHint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ItemHint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ItemHint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ItemHint parseFrom(
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
    public static Builder newBuilder(ItemHint prototype) {
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
     * Obf: OLBNAADPLKJ
     * </pre>
     *
     * Protobuf type {@code ItemHint}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ItemHint)
        ItemHintOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ItemHintOuterClass.internal_static_ItemHint_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ItemHintOuterClass.internal_static_ItemHint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ItemHint.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ItemHintOuterClass.ItemHint.newBuilder()
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
        count_ = 0;
        itemId_ = 0;
        guid_ = 0L;
        isNew_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ItemHintOuterClass.internal_static_ItemHint_descriptor;
      }

      @Override
      public ItemHint getDefaultInstanceForType() {
        return ItemHint.getDefaultInstance();
      }

      @Override
      public ItemHint build() {
        ItemHint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public ItemHint buildPartial() {
        ItemHint result = new ItemHint(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ItemHint result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.count_ = count_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.itemId_ = itemId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isNew_ = isNew_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ItemHint) {
          return mergeFrom((ItemHint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ItemHint other) {
        if (other == ItemHint.getDefaultInstance()) return this;
        if (other.getCount() != 0) {
          setCount(other.getCount());
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getIsNew() != false) {
          setIsNew(other.getIsNew());
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
              case 56: {
                count_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 64: {
                isNew_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 72: {
                itemId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 112: {
                guid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
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

      private int count_ ;
      /**
       * <code>uint32 count = 7;</code>
       * @return The count.
       */
      @Override
      public int getCount() {
        return count_;
      }
      /**
       * <code>uint32 count = 7;</code>
       * @param value The count to set.
       * @return This builder for chaining.
       */
      public Builder setCount(int value) {

        count_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 count = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        count_ = 0;
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 9;</code>
       * @return The itemId.
       */
      @Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 9;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {

        itemId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 14;</code>
       * @return The guid.
       */
      @Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 14;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {

        guid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        guid_ = 0L;
        onChanged();
        return this;
      }

      private boolean isNew_ ;
      /**
       * <code>bool is_new = 8;</code>
       * @return The isNew.
       */
      @Override
      public boolean getIsNew() {
        return isNew_;
      }
      /**
       * <code>bool is_new = 8;</code>
       * @param value The isNew to set.
       * @return This builder for chaining.
       */
      public Builder setIsNew(boolean value) {

        isNew_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNew() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isNew_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ItemHint)
    }

    // @@protoc_insertion_point(class_scope:ItemHint)
    private static final ItemHint DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ItemHint();
    }

    public static ItemHint getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ItemHint>
        PARSER = new com.google.protobuf.AbstractParser<ItemHint>() {
      @Override
      public ItemHint parsePartialFrom(
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

    public static com.google.protobuf.Parser<ItemHint> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ItemHint> getParserForType() {
      return PARSER;
    }

    @Override
    public ItemHint getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ItemHint_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ItemHint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\016ItemHint.proto\"H\n\010ItemHint\022\r\n\005count\030\007 " +
      "\001(\r\022\017\n\007item_id\030\t \001(\r\022\014\n\004guid\030\016 \001(\004\022\016\n\006is" +
      "_new\030\010 \001(\010B\032\n\030io.irminsul.common.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ItemHint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ItemHint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ItemHint_descriptor,
        new String[] { "Count", "ItemId", "Guid", "IsNew", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
