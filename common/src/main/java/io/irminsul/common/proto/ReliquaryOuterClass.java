// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Reliquary.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class ReliquaryOuterClass {
  private ReliquaryOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ReliquaryOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Reliquary)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    int getExp();

    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    int getPromoteLevel();

    /**
     * <code>uint32 main_prop_id = 4;</code>
     * @return The mainPropId.
     */
    int getMainPropId();

    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return A list containing the appendPropIdList.
     */
    java.util.List<Integer> getAppendPropIdListList();
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return The count of appendPropIdList.
     */
    int getAppendPropIdListCount();
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The appendPropIdList at the given index.
     */
    int getAppendPropIdList(int index);
  }
  /**
   * <pre>
   * Obf: EGIJNLNKCFH
   * </pre>
   *
   * Protobuf type {@code Reliquary}
   */
  public static final class Reliquary extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Reliquary)
      ReliquaryOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Reliquary.class.getName());
    }
    // Use Reliquary.newBuilder() to construct.
    private Reliquary(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Reliquary() {
      appendPropIdList_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Reliquary.class, Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 1;
    private int level_ = 0;
    /**
     * <code>uint32 level = 1;</code>
     * @return The level.
     */
    @Override
    public int getLevel() {
      return level_;
    }

    public static final int EXP_FIELD_NUMBER = 2;
    private int exp_ = 0;
    /**
     * <code>uint32 exp = 2;</code>
     * @return The exp.
     */
    @Override
    public int getExp() {
      return exp_;
    }

    public static final int PROMOTE_LEVEL_FIELD_NUMBER = 3;
    private int promoteLevel_ = 0;
    /**
     * <code>uint32 promote_level = 3;</code>
     * @return The promoteLevel.
     */
    @Override
    public int getPromoteLevel() {
      return promoteLevel_;
    }

    public static final int MAIN_PROP_ID_FIELD_NUMBER = 4;
    private int mainPropId_ = 0;
    /**
     * <code>uint32 main_prop_id = 4;</code>
     * @return The mainPropId.
     */
    @Override
    public int getMainPropId() {
      return mainPropId_;
    }

    public static final int APPEND_PROP_ID_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList appendPropIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return A list containing the appendPropIdList.
     */
    @Override
    public java.util.List<Integer>
        getAppendPropIdListList() {
      return appendPropIdList_;
    }
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @return The count of appendPropIdList.
     */
    public int getAppendPropIdListCount() {
      return appendPropIdList_.size();
    }
    /**
     * <code>repeated uint32 append_prop_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The appendPropIdList at the given index.
     */
    public int getAppendPropIdList(int index) {
      return appendPropIdList_.getInt(index);
    }
    private int appendPropIdListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (level_ != 0) {
        output.writeUInt32(1, level_);
      }
      if (exp_ != 0) {
        output.writeUInt32(2, exp_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(3, promoteLevel_);
      }
      if (mainPropId_ != 0) {
        output.writeUInt32(4, mainPropId_);
      }
      if (getAppendPropIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(appendPropIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < appendPropIdList_.size(); i++) {
        output.writeUInt32NoTag(appendPropIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, level_);
      }
      if (exp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, exp_);
      }
      if (promoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, promoteLevel_);
      }
      if (mainPropId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mainPropId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < appendPropIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(appendPropIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAppendPropIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        appendPropIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof Reliquary)) {
        return super.equals(obj);
      }
      Reliquary other = (Reliquary) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getExp()
          != other.getExp()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
      if (getMainPropId()
          != other.getMainPropId()) return false;
      if (!getAppendPropIdListList()
          .equals(other.getAppendPropIdListList())) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + EXP_FIELD_NUMBER;
      hash = (53 * hash) + getExp();
      hash = (37 * hash) + PROMOTE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getPromoteLevel();
      hash = (37 * hash) + MAIN_PROP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMainPropId();
      if (getAppendPropIdListCount() > 0) {
        hash = (37 * hash) + APPEND_PROP_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAppendPropIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Reliquary parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Reliquary parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Reliquary parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Reliquary parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Reliquary parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Reliquary parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Reliquary parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Reliquary parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Reliquary parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Reliquary parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Reliquary parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Reliquary parseFrom(
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
    public static Builder newBuilder(Reliquary prototype) {
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
     * Obf: EGIJNLNKCFH
     * </pre>
     *
     * Protobuf type {@code Reliquary}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Reliquary)
        ReliquaryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ReliquaryOuterClass.internal_static_Reliquary_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Reliquary.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.ReliquaryOuterClass.Reliquary.newBuilder()
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
        level_ = 0;
        exp_ = 0;
        promoteLevel_ = 0;
        mainPropId_ = 0;
        appendPropIdList_ = emptyIntList();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ReliquaryOuterClass.internal_static_Reliquary_descriptor;
      }

      @Override
      public Reliquary getDefaultInstanceForType() {
        return Reliquary.getDefaultInstance();
      }

      @Override
      public Reliquary build() {
        Reliquary result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Reliquary buildPartial() {
        Reliquary result = new Reliquary(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Reliquary result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.exp_ = exp_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.promoteLevel_ = promoteLevel_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.mainPropId_ = mainPropId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          appendPropIdList_.makeImmutable();
          result.appendPropIdList_ = appendPropIdList_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Reliquary) {
          return mergeFrom((Reliquary)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Reliquary other) {
        if (other == Reliquary.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
        }
        if (other.getMainPropId() != 0) {
          setMainPropId(other.getMainPropId());
        }
        if (!other.appendPropIdList_.isEmpty()) {
          if (appendPropIdList_.isEmpty()) {
            appendPropIdList_ = other.appendPropIdList_;
            appendPropIdList_.makeImmutable();
            bitField0_ |= 0x00000010;
          } else {
            ensureAppendPropIdListIsMutable();
            appendPropIdList_.addAll(other.appendPropIdList_);
          }
          onChanged();
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
                level_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                exp_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                promoteLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                mainPropId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                int v = input.readUInt32();
                ensureAppendPropIdListIsMutable();
                appendPropIdList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAppendPropIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  appendPropIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
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

      private int level_ ;
      /**
       * <code>uint32 level = 1;</code>
       * @return The level.
       */
      @Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {

        level_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>uint32 exp = 2;</code>
       * @return The exp.
       */
      @Override
      public int getExp() {
        return exp_;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @param value The exp to set.
       * @return This builder for chaining.
       */
      public Builder setExp(int value) {

        exp_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearExp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        exp_ = 0;
        onChanged();
        return this;
      }

      private int promoteLevel_ ;
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return The promoteLevel.
       */
      @Override
      public int getPromoteLevel() {
        return promoteLevel_;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @param value The promoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setPromoteLevel(int value) {

        promoteLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 promote_level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPromoteLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        promoteLevel_ = 0;
        onChanged();
        return this;
      }

      private int mainPropId_ ;
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @return The mainPropId.
       */
      @Override
      public int getMainPropId() {
        return mainPropId_;
      }
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @param value The mainPropId to set.
       * @return This builder for chaining.
       */
      public Builder setMainPropId(int value) {

        mainPropId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 main_prop_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMainPropId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        mainPropId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList appendPropIdList_ = emptyIntList();
      private void ensureAppendPropIdListIsMutable() {
        if (!appendPropIdList_.isModifiable()) {
          appendPropIdList_ = makeMutableCopy(appendPropIdList_);
        }
        bitField0_ |= 0x00000010;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return A list containing the appendPropIdList.
       */
      public java.util.List<Integer>
          getAppendPropIdListList() {
        appendPropIdList_.makeImmutable();
        return appendPropIdList_;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return The count of appendPropIdList.
       */
      public int getAppendPropIdListCount() {
        return appendPropIdList_.size();
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The appendPropIdList at the given index.
       */
      public int getAppendPropIdList(int index) {
        return appendPropIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The appendPropIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAppendPropIdList(
          int index, int value) {

        ensureAppendPropIdListIsMutable();
        appendPropIdList_.setInt(index, value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param value The appendPropIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAppendPropIdList(int value) {

        ensureAppendPropIdListIsMutable();
        appendPropIdList_.addInt(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @param values The appendPropIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAppendPropIdList(
          Iterable<? extends Integer> values) {
        ensureAppendPropIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, appendPropIdList_);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 append_prop_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAppendPropIdList() {
        appendPropIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Reliquary)
    }

    // @@protoc_insertion_point(class_scope:Reliquary)
    private static final Reliquary DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Reliquary();
    }

    public static Reliquary getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Reliquary>
        PARSER = new com.google.protobuf.AbstractParser<Reliquary>() {
      @Override
      public Reliquary parsePartialFrom(
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

    public static com.google.protobuf.Parser<Reliquary> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Reliquary> getParserForType() {
      return PARSER;
    }

    @Override
    public Reliquary getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reliquary_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Reliquary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\017Reliquary.proto\"q\n\tReliquary\022\r\n\005level\030" +
      "\001 \001(\r\022\013\n\003exp\030\002 \001(\r\022\025\n\rpromote_level\030\003 \001(" +
      "\r\022\024\n\014main_prop_id\030\004 \001(\r\022\033\n\023append_prop_i" +
      "d_list\030\005 \003(\rB\032\n\030io.irminsul.common.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Reliquary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Reliquary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Reliquary_descriptor,
        new String[] { "Level", "Exp", "PromoteLevel", "MainPropId", "AppendPropIdList", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
