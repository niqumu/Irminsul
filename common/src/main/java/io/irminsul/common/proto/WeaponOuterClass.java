// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: Weapon.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class WeaponOuterClass {
  private WeaponOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      WeaponOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Weapon)
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
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    int getAffixMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    boolean containsAffixMap(
        int key);
    /**
     * Use {@link #getAffixMapMap()} instead.
     */
    @Deprecated
    java.util.Map<Integer, Integer>
    getAffixMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    java.util.Map<Integer, Integer>
    getAffixMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    int getAffixMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    int getAffixMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: NHOLFKPNLCH
   * </pre>
   *
   * Protobuf type {@code Weapon}
   */
  public static final class Weapon extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Weapon)
      WeaponOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Weapon.class.getName());
    }
    // Use Weapon.newBuilder() to construct.
    private Weapon(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Weapon() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return WeaponOuterClass.internal_static_Weapon_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @Override
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 4:
          return internalGetAffixMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return WeaponOuterClass.internal_static_Weapon_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Weapon.class, Builder.class);
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

    public static final int AFFIX_MAP_FIELD_NUMBER = 4;
    private static final class AffixMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          Integer, Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<Integer, Integer>newDefaultInstance(
                  WeaponOuterClass.internal_static_Weapon_AffixMapEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        Integer, Integer> affixMap_;
    private com.google.protobuf.MapField<Integer, Integer>
    internalGetAffixMap() {
      if (affixMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AffixMapDefaultEntryHolder.defaultEntry);
      }
      return affixMap_;
    }
    public int getAffixMapCount() {
      return internalGetAffixMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @Override
    public boolean containsAffixMap(
        int key) {

      return internalGetAffixMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAffixMapMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<Integer, Integer> getAffixMap() {
      return getAffixMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @Override
    public java.util.Map<Integer, Integer> getAffixMapMap() {
      return internalGetAffixMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @Override
    public int getAffixMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<Integer, Integer> map =
          internalGetAffixMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
     */
    @Override
    public int getAffixMapOrThrow(
        int key) {

      java.util.Map<Integer, Integer> map =
          internalGetAffixMap().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
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
      if (level_ != 0) {
        output.writeUInt32(1, level_);
      }
      if (exp_ != 0) {
        output.writeUInt32(2, exp_);
      }
      if (promoteLevel_ != 0) {
        output.writeUInt32(3, promoteLevel_);
      }
      com.google.protobuf.GeneratedMessage
        .serializeIntegerMapTo(
          output,
          internalGetAffixMap(),
          AffixMapDefaultEntryHolder.defaultEntry,
          4);
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
      for (java.util.Map.Entry<Integer, Integer> entry
           : internalGetAffixMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<Integer, Integer>
        affixMap__ = AffixMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, affixMap__);
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
      if (!(obj instanceof Weapon)) {
        return super.equals(obj);
      }
      Weapon other = (Weapon) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getExp()
          != other.getExp()) return false;
      if (getPromoteLevel()
          != other.getPromoteLevel()) return false;
      if (!internalGetAffixMap().equals(
          other.internalGetAffixMap())) return false;
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
      if (!internalGetAffixMap().getMap().isEmpty()) {
        hash = (37 * hash) + AFFIX_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetAffixMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Weapon parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Weapon parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Weapon parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Weapon parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Weapon parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Weapon parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Weapon parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Weapon parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Weapon parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static Weapon parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Weapon parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static Weapon parseFrom(
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
    public static Builder newBuilder(Weapon prototype) {
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
     * Obf: NHOLFKPNLCH
     * </pre>
     *
     * Protobuf type {@code Weapon}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Weapon)
        WeaponOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return WeaponOuterClass.internal_static_Weapon_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
          int number) {
        switch (number) {
          case 4:
            return internalGetAffixMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableAffixMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return WeaponOuterClass.internal_static_Weapon_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Weapon.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.WeaponOuterClass.Weapon.newBuilder()
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
        internalGetMutableAffixMap().clear();
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return WeaponOuterClass.internal_static_Weapon_descriptor;
      }

      @Override
      public Weapon getDefaultInstanceForType() {
        return Weapon.getDefaultInstance();
      }

      @Override
      public Weapon build() {
        Weapon result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Weapon buildPartial() {
        Weapon result = new Weapon(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(Weapon result) {
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
          result.affixMap_ = internalGetAffixMap();
          result.affixMap_.makeImmutable();
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Weapon) {
          return mergeFrom((Weapon)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Weapon other) {
        if (other == Weapon.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getExp() != 0) {
          setExp(other.getExp());
        }
        if (other.getPromoteLevel() != 0) {
          setPromoteLevel(other.getPromoteLevel());
        }
        internalGetMutableAffixMap().mergeFrom(
            other.internalGetAffixMap());
        bitField0_ |= 0x00000008;
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
              case 34: {
                com.google.protobuf.MapEntry<Integer, Integer>
                affixMap__ = input.readMessage(
                    AffixMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableAffixMap().getMutableMap().put(
                    affixMap__.getKey(), affixMap__.getValue());
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private com.google.protobuf.MapField<
          Integer, Integer> affixMap_;
      private com.google.protobuf.MapField<Integer, Integer>
          internalGetAffixMap() {
        if (affixMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              AffixMapDefaultEntryHolder.defaultEntry);
        }
        return affixMap_;
      }
      private com.google.protobuf.MapField<Integer, Integer>
          internalGetMutableAffixMap() {
        if (affixMap_ == null) {
          affixMap_ = com.google.protobuf.MapField.newMapField(
              AffixMapDefaultEntryHolder.defaultEntry);
        }
        if (!affixMap_.isMutable()) {
          affixMap_ = affixMap_.copy();
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return affixMap_;
      }
      public int getAffixMapCount() {
        return internalGetAffixMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @Override
      public boolean containsAffixMap(
          int key) {

        return internalGetAffixMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getAffixMapMap()} instead.
       */
      @Override
      @Deprecated
      public java.util.Map<Integer, Integer> getAffixMap() {
        return getAffixMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @Override
      public java.util.Map<Integer, Integer> getAffixMapMap() {
        return internalGetAffixMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @Override
      public int getAffixMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<Integer, Integer> map =
            internalGetAffixMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      @Override
      public int getAffixMapOrThrow(
          int key) {

        java.util.Map<Integer, Integer> map =
            internalGetAffixMap().getMap();
        if (!map.containsKey(key)) {
          throw new IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearAffixMap() {
        bitField0_ = (bitField0_ & ~0x00000008);
        internalGetMutableAffixMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      public Builder removeAffixMap(
          int key) {

        internalGetMutableAffixMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @Deprecated
      public java.util.Map<Integer, Integer>
          getMutableAffixMap() {
        bitField0_ |= 0x00000008;
        return internalGetMutableAffixMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      public Builder putAffixMap(
          int key,
          int value) {


        internalGetMutableAffixMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; affix_map = 4;</code>
       */
      public Builder putAllAffixMap(
          java.util.Map<Integer, Integer> values) {
        internalGetMutableAffixMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000008;
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Weapon)
    }

    // @@protoc_insertion_point(class_scope:Weapon)
    private static final Weapon DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Weapon();
    }

    public static Weapon getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Weapon>
        PARSER = new com.google.protobuf.AbstractParser<Weapon>() {
      @Override
      public Weapon parsePartialFrom(
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

    public static com.google.protobuf.Parser<Weapon> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Weapon> getParserForType() {
      return PARSER;
    }

    @Override
    public Weapon getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Weapon_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Weapon_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Weapon_AffixMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Weapon_AffixMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014Weapon.proto\"\226\001\n\006Weapon\022\r\n\005level\030\001 \001(\r" +
      "\022\013\n\003exp\030\002 \001(\r\022\025\n\rpromote_level\030\003 \001(\r\022(\n\t" +
      "affix_map\030\004 \003(\0132\025.Weapon.AffixMapEntry\032/" +
      "\n\rAffixMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 " +
      "\001(\r:\0028\001B\032\n\030io.irminsul.common.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Weapon_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Weapon_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Weapon_descriptor,
        new String[] { "Level", "Exp", "PromoteLevel", "AffixMap", });
    internal_static_Weapon_AffixMapEntry_descriptor =
      internal_static_Weapon_descriptor.getNestedTypes().get(0);
    internal_static_Weapon_AffixMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Weapon_AffixMapEntry_descriptor,
        new String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
