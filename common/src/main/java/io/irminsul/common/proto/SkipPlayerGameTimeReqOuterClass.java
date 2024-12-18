// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: SkipPlayerGameTimeReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class SkipPlayerGameTimeReqOuterClass {
  private SkipPlayerGameTimeReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SkipPlayerGameTimeReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SkipPlayerGameTimeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SkipPlayerGameTimeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    int getGameTime();

    /**
     * <code>bool is_force_set = 1;</code>
     * @return The isForceSet.
     */
    boolean getIsForceSet();

    /**
     * <code>uint32 client_game_time = 7;</code>
     * @return The clientGameTime.
     */
    int getClientGameTime();
  }
  /**
   * <pre>
   * CmdId: 22076
   * Obf: DEFBFNOLMID
   * </pre>
   *
   * Protobuf type {@code SkipPlayerGameTimeReq}
   */
  public static final class SkipPlayerGameTimeReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SkipPlayerGameTimeReq)
      SkipPlayerGameTimeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        SkipPlayerGameTimeReq.class.getName());
    }
    // Use SkipPlayerGameTimeReq.newBuilder() to construct.
    private SkipPlayerGameTimeReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SkipPlayerGameTimeReq() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SkipPlayerGameTimeReq.class, Builder.class);
    }

    public static final int GAME_TIME_FIELD_NUMBER = 12;
    private int gameTime_ = 0;
    /**
     * <code>uint32 game_time = 12;</code>
     * @return The gameTime.
     */
    @Override
    public int getGameTime() {
      return gameTime_;
    }

    public static final int IS_FORCE_SET_FIELD_NUMBER = 1;
    private boolean isForceSet_ = false;
    /**
     * <code>bool is_force_set = 1;</code>
     * @return The isForceSet.
     */
    @Override
    public boolean getIsForceSet() {
      return isForceSet_;
    }

    public static final int CLIENT_GAME_TIME_FIELD_NUMBER = 7;
    private int clientGameTime_ = 0;
    /**
     * <code>uint32 client_game_time = 7;</code>
     * @return The clientGameTime.
     */
    @Override
    public int getClientGameTime() {
      return clientGameTime_;
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
      if (isForceSet_ != false) {
        output.writeBool(1, isForceSet_);
      }
      if (clientGameTime_ != 0) {
        output.writeUInt32(7, clientGameTime_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(12, gameTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isForceSet_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isForceSet_);
      }
      if (clientGameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, clientGameTime_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gameTime_);
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
      if (!(obj instanceof SkipPlayerGameTimeReq)) {
        return super.equals(obj);
      }
      SkipPlayerGameTimeReq other = (SkipPlayerGameTimeReq) obj;

      if (getGameTime()
          != other.getGameTime()) return false;
      if (getIsForceSet()
          != other.getIsForceSet()) return false;
      if (getClientGameTime()
          != other.getClientGameTime()) return false;
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
      hash = (37 * hash) + GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (37 * hash) + IS_FORCE_SET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForceSet());
      hash = (37 * hash) + CLIENT_GAME_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getClientGameTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SkipPlayerGameTimeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkipPlayerGameTimeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SkipPlayerGameTimeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static SkipPlayerGameTimeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static SkipPlayerGameTimeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SkipPlayerGameTimeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static SkipPlayerGameTimeReq parseFrom(
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
    public static Builder newBuilder(SkipPlayerGameTimeReq prototype) {
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
     * CmdId: 22076
     * Obf: DEFBFNOLMID
     * </pre>
     *
     * Protobuf type {@code SkipPlayerGameTimeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SkipPlayerGameTimeReq)
        SkipPlayerGameTimeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SkipPlayerGameTimeReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.SkipPlayerGameTimeReqOuterClass.SkipPlayerGameTimeReq.newBuilder()
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
        gameTime_ = 0;
        isForceSet_ = false;
        clientGameTime_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SkipPlayerGameTimeReqOuterClass.internal_static_SkipPlayerGameTimeReq_descriptor;
      }

      @Override
      public SkipPlayerGameTimeReq getDefaultInstanceForType() {
        return SkipPlayerGameTimeReq.getDefaultInstance();
      }

      @Override
      public SkipPlayerGameTimeReq build() {
        SkipPlayerGameTimeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public SkipPlayerGameTimeReq buildPartial() {
        SkipPlayerGameTimeReq result = new SkipPlayerGameTimeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(SkipPlayerGameTimeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gameTime_ = gameTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isForceSet_ = isForceSet_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.clientGameTime_ = clientGameTime_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SkipPlayerGameTimeReq) {
          return mergeFrom((SkipPlayerGameTimeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SkipPlayerGameTimeReq other) {
        if (other == SkipPlayerGameTimeReq.getDefaultInstance()) return this;
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
        }
        if (other.getIsForceSet() != false) {
          setIsForceSet(other.getIsForceSet());
        }
        if (other.getClientGameTime() != 0) {
          setClientGameTime(other.getClientGameTime());
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
                isForceSet_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 56: {
                clientGameTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 96: {
                gameTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int gameTime_ ;
      /**
       * <code>uint32 game_time = 12;</code>
       * @return The gameTime.
       */
      @Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {

        gameTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 game_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gameTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isForceSet_ ;
      /**
       * <code>bool is_force_set = 1;</code>
       * @return The isForceSet.
       */
      @Override
      public boolean getIsForceSet() {
        return isForceSet_;
      }
      /**
       * <code>bool is_force_set = 1;</code>
       * @param value The isForceSet to set.
       * @return This builder for chaining.
       */
      public Builder setIsForceSet(boolean value) {

        isForceSet_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_force_set = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForceSet() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isForceSet_ = false;
        onChanged();
        return this;
      }

      private int clientGameTime_ ;
      /**
       * <code>uint32 client_game_time = 7;</code>
       * @return The clientGameTime.
       */
      @Override
      public int getClientGameTime() {
        return clientGameTime_;
      }
      /**
       * <code>uint32 client_game_time = 7;</code>
       * @param value The clientGameTime to set.
       * @return This builder for chaining.
       */
      public Builder setClientGameTime(int value) {

        clientGameTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 client_game_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientGameTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        clientGameTime_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SkipPlayerGameTimeReq)
    }

    // @@protoc_insertion_point(class_scope:SkipPlayerGameTimeReq)
    private static final SkipPlayerGameTimeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SkipPlayerGameTimeReq();
    }

    public static SkipPlayerGameTimeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SkipPlayerGameTimeReq>
        PARSER = new com.google.protobuf.AbstractParser<SkipPlayerGameTimeReq>() {
      @Override
      public SkipPlayerGameTimeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<SkipPlayerGameTimeReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<SkipPlayerGameTimeReq> getParserForType() {
      return PARSER;
    }

    @Override
    public SkipPlayerGameTimeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SkipPlayerGameTimeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SkipPlayerGameTimeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\033SkipPlayerGameTimeReq.proto\"Z\n\025SkipPla" +
      "yerGameTimeReq\022\021\n\tgame_time\030\014 \001(\r\022\024\n\014is_" +
      "force_set\030\001 \001(\010\022\030\n\020client_game_time\030\007 \001(" +
      "\rB\032\n\030io.irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SkipPlayerGameTimeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SkipPlayerGameTimeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SkipPlayerGameTimeReq_descriptor,
        new String[] { "GameTime", "IsForceSet", "ClientGameTime", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
