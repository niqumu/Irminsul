// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: TrialAvatarGrantRecord.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class TrialAvatarGrantRecordOuterClass {
  private TrialAvatarGrantRecordOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      TrialAvatarGrantRecordOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarGrantRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarGrantRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 grant_reason = 1;</code>
     * @return The grantReason.
     */
    int getGrantReason();

    /**
     * <code>uint32 from_parent_quest_id = 2;</code>
     * @return The fromParentQuestId.
     */
    int getFromParentQuestId();
  }
  /**
   * <pre>
   * Obf: KBNIDGMCKMD
   * </pre>
   *
   * Protobuf type {@code TrialAvatarGrantRecord}
   */
  public static final class TrialAvatarGrantRecord extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TrialAvatarGrantRecord)
      TrialAvatarGrantRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        TrialAvatarGrantRecord.class.getName());
    }
    // Use TrialAvatarGrantRecord.newBuilder() to construct.
    private TrialAvatarGrantRecord(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarGrantRecord() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TrialAvatarGrantRecord.class, Builder.class);
    }

    public static final int GRANT_REASON_FIELD_NUMBER = 1;
    private int grantReason_ = 0;
    /**
     * <code>uint32 grant_reason = 1;</code>
     * @return The grantReason.
     */
    @Override
    public int getGrantReason() {
      return grantReason_;
    }

    public static final int FROM_PARENT_QUEST_ID_FIELD_NUMBER = 2;
    private int fromParentQuestId_ = 0;
    /**
     * <code>uint32 from_parent_quest_id = 2;</code>
     * @return The fromParentQuestId.
     */
    @Override
    public int getFromParentQuestId() {
      return fromParentQuestId_;
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
      if (grantReason_ != 0) {
        output.writeUInt32(1, grantReason_);
      }
      if (fromParentQuestId_ != 0) {
        output.writeUInt32(2, fromParentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (grantReason_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, grantReason_);
      }
      if (fromParentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, fromParentQuestId_);
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
      if (!(obj instanceof TrialAvatarGrantRecord)) {
        return super.equals(obj);
      }
      TrialAvatarGrantRecord other = (TrialAvatarGrantRecord) obj;

      if (getGrantReason()
          != other.getGrantReason()) return false;
      if (getFromParentQuestId()
          != other.getFromParentQuestId()) return false;
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
      hash = (37 * hash) + GRANT_REASON_FIELD_NUMBER;
      hash = (53 * hash) + getGrantReason();
      hash = (37 * hash) + FROM_PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFromParentQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static TrialAvatarGrantRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TrialAvatarGrantRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TrialAvatarGrantRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TrialAvatarGrantRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TrialAvatarGrantRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static TrialAvatarGrantRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static TrialAvatarGrantRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static TrialAvatarGrantRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static TrialAvatarGrantRecord parseFrom(
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
    public static Builder newBuilder(TrialAvatarGrantRecord prototype) {
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
     * Obf: KBNIDGMCKMD
     * </pre>
     *
     * Protobuf type {@code TrialAvatarGrantRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarGrantRecord)
        TrialAvatarGrantRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TrialAvatarGrantRecord.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.newBuilder()
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
        grantReason_ = 0;
        fromParentQuestId_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
      }

      @Override
      public TrialAvatarGrantRecord getDefaultInstanceForType() {
        return TrialAvatarGrantRecord.getDefaultInstance();
      }

      @Override
      public TrialAvatarGrantRecord build() {
        TrialAvatarGrantRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public TrialAvatarGrantRecord buildPartial() {
        TrialAvatarGrantRecord result = new TrialAvatarGrantRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(TrialAvatarGrantRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.grantReason_ = grantReason_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fromParentQuestId_ = fromParentQuestId_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TrialAvatarGrantRecord) {
          return mergeFrom((TrialAvatarGrantRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TrialAvatarGrantRecord other) {
        if (other == TrialAvatarGrantRecord.getDefaultInstance()) return this;
        if (other.getGrantReason() != 0) {
          setGrantReason(other.getGrantReason());
        }
        if (other.getFromParentQuestId() != 0) {
          setFromParentQuestId(other.getFromParentQuestId());
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
                grantReason_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                fromParentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private int grantReason_ ;
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @return The grantReason.
       */
      @Override
      public int getGrantReason() {
        return grantReason_;
      }
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @param value The grantReason to set.
       * @return This builder for chaining.
       */
      public Builder setGrantReason(int value) {

        grantReason_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrantReason() {
        bitField0_ = (bitField0_ & ~0x00000001);
        grantReason_ = 0;
        onChanged();
        return this;
      }

      private int fromParentQuestId_ ;
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @return The fromParentQuestId.
       */
      @Override
      public int getFromParentQuestId() {
        return fromParentQuestId_;
      }
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @param value The fromParentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setFromParentQuestId(int value) {

        fromParentQuestId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFromParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fromParentQuestId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TrialAvatarGrantRecord)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarGrantRecord)
    private static final TrialAvatarGrantRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TrialAvatarGrantRecord();
    }

    public static TrialAvatarGrantRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarGrantRecord>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarGrantRecord>() {
      @Override
      public TrialAvatarGrantRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<TrialAvatarGrantRecord> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<TrialAvatarGrantRecord> getParserForType() {
      return PARSER;
    }

    @Override
    public TrialAvatarGrantRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarGrantRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TrialAvatarGrantRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\034TrialAvatarGrantRecord.proto\"L\n\026TrialA" +
      "vatarGrantRecord\022\024\n\014grant_reason\030\001 \001(\r\022\034" +
      "\n\024from_parent_quest_id\030\002 \001(\rB\032\n\030io.irmin" +
      "sul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TrialAvatarGrantRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarGrantRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TrialAvatarGrantRecord_descriptor,
        new String[] { "GrantReason", "FromParentQuestId", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
