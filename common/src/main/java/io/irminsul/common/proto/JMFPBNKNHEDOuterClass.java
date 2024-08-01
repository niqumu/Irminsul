// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: JMFPBNKNHED.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class JMFPBNKNHEDOuterClass {
  private JMFPBNKNHEDOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      JMFPBNKNHEDOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JMFPBNKNHEDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JMFPBNKNHED)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 start_time = 1;</code>
     * @return The startTime.
     */
    long getStartTime();

    /**
     * <code>uint32 IFFAGNNKDOB = 2;</code>
     * @return The iFFAGNNKDOB.
     */
    int getIFFAGNNKDOB();

    /**
     * <code>uint32 KHBBKMCEBKA = 3;</code>
     * @return The kHBBKMCEBKA.
     */
    int getKHBBKMCEBKA();

    /**
     * <code>float JLLNGEKIHMN = 4;</code>
     * @return The jLLNGEKIHMN.
     */
    float getJLLNGEKIHMN();

    /**
     * <code>float speed = 5;</code>
     * @return The speed.
     */
    float getSpeed();

    /**
     * <code>bool is_started = 6;</code>
     * @return The isStarted.
     */
    boolean getIsStarted();
  }
  /**
   * Protobuf type {@code JMFPBNKNHED}
   */
  public static final class JMFPBNKNHED extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:JMFPBNKNHED)
      JMFPBNKNHEDOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        JMFPBNKNHED.class.getName());
    }
    // Use JMFPBNKNHED.newBuilder() to construct.
    private JMFPBNKNHED(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private JMFPBNKNHED() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              JMFPBNKNHED.class, Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 1;
    private long startTime_ = 0L;
    /**
     * <code>uint64 start_time = 1;</code>
     * @return The startTime.
     */
    @Override
    public long getStartTime() {
      return startTime_;
    }

    public static final int IFFAGNNKDOB_FIELD_NUMBER = 2;
    private int iFFAGNNKDOB_ = 0;
    /**
     * <code>uint32 IFFAGNNKDOB = 2;</code>
     * @return The iFFAGNNKDOB.
     */
    @Override
    public int getIFFAGNNKDOB() {
      return iFFAGNNKDOB_;
    }

    public static final int KHBBKMCEBKA_FIELD_NUMBER = 3;
    private int kHBBKMCEBKA_ = 0;
    /**
     * <code>uint32 KHBBKMCEBKA = 3;</code>
     * @return The kHBBKMCEBKA.
     */
    @Override
    public int getKHBBKMCEBKA() {
      return kHBBKMCEBKA_;
    }

    public static final int JLLNGEKIHMN_FIELD_NUMBER = 4;
    private float jLLNGEKIHMN_ = 0F;
    /**
     * <code>float JLLNGEKIHMN = 4;</code>
     * @return The jLLNGEKIHMN.
     */
    @Override
    public float getJLLNGEKIHMN() {
      return jLLNGEKIHMN_;
    }

    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_ = 0F;
    /**
     * <code>float speed = 5;</code>
     * @return The speed.
     */
    @Override
    public float getSpeed() {
      return speed_;
    }

    public static final int IS_STARTED_FIELD_NUMBER = 6;
    private boolean isStarted_ = false;
    /**
     * <code>bool is_started = 6;</code>
     * @return The isStarted.
     */
    @Override
    public boolean getIsStarted() {
      return isStarted_;
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
      if (startTime_ != 0L) {
        output.writeUInt64(1, startTime_);
      }
      if (iFFAGNNKDOB_ != 0) {
        output.writeUInt32(2, iFFAGNNKDOB_);
      }
      if (kHBBKMCEBKA_ != 0) {
        output.writeUInt32(3, kHBBKMCEBKA_);
      }
      if (Float.floatToRawIntBits(jLLNGEKIHMN_) != 0) {
        output.writeFloat(4, jLLNGEKIHMN_);
      }
      if (Float.floatToRawIntBits(speed_) != 0) {
        output.writeFloat(5, speed_);
      }
      if (isStarted_ != false) {
        output.writeBool(6, isStarted_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, startTime_);
      }
      if (iFFAGNNKDOB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, iFFAGNNKDOB_);
      }
      if (kHBBKMCEBKA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, kHBBKMCEBKA_);
      }
      if (Float.floatToRawIntBits(jLLNGEKIHMN_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, jLLNGEKIHMN_);
      }
      if (Float.floatToRawIntBits(speed_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, speed_);
      }
      if (isStarted_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isStarted_);
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
      if (!(obj instanceof JMFPBNKNHED)) {
        return super.equals(obj);
      }
      JMFPBNKNHED other = (JMFPBNKNHED) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
      if (getIFFAGNNKDOB()
          != other.getIFFAGNNKDOB()) return false;
      if (getKHBBKMCEBKA()
          != other.getKHBBKMCEBKA()) return false;
      if (Float.floatToIntBits(getJLLNGEKIHMN())
          != Float.floatToIntBits(
              other.getJLLNGEKIHMN())) return false;
      if (Float.floatToIntBits(getSpeed())
          != Float.floatToIntBits(
              other.getSpeed())) return false;
      if (getIsStarted()
          != other.getIsStarted()) return false;
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
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartTime());
      hash = (37 * hash) + IFFAGNNKDOB_FIELD_NUMBER;
      hash = (53 * hash) + getIFFAGNNKDOB();
      hash = (37 * hash) + KHBBKMCEBKA_FIELD_NUMBER;
      hash = (53 * hash) + getKHBBKMCEBKA();
      hash = (37 * hash) + JLLNGEKIHMN_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getJLLNGEKIHMN());
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + Float.floatToIntBits(
          getSpeed());
      hash = (37 * hash) + IS_STARTED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsStarted());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static JMFPBNKNHED parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JMFPBNKNHED parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JMFPBNKNHED parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JMFPBNKNHED parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JMFPBNKNHED parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static JMFPBNKNHED parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static JMFPBNKNHED parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static JMFPBNKNHED parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static JMFPBNKNHED parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static JMFPBNKNHED parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static JMFPBNKNHED parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static JMFPBNKNHED parseFrom(
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
    public static Builder newBuilder(JMFPBNKNHED prototype) {
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
     * Protobuf type {@code JMFPBNKNHED}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JMFPBNKNHED)
        JMFPBNKNHEDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                JMFPBNKNHED.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.JMFPBNKNHEDOuterClass.JMFPBNKNHED.newBuilder()
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
        startTime_ = 0L;
        iFFAGNNKDOB_ = 0;
        kHBBKMCEBKA_ = 0;
        jLLNGEKIHMN_ = 0F;
        speed_ = 0F;
        isStarted_ = false;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return JMFPBNKNHEDOuterClass.internal_static_JMFPBNKNHED_descriptor;
      }

      @Override
      public JMFPBNKNHED getDefaultInstanceForType() {
        return JMFPBNKNHED.getDefaultInstance();
      }

      @Override
      public JMFPBNKNHED build() {
        JMFPBNKNHED result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public JMFPBNKNHED buildPartial() {
        JMFPBNKNHED result = new JMFPBNKNHED(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(JMFPBNKNHED result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startTime_ = startTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.iFFAGNNKDOB_ = iFFAGNNKDOB_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.kHBBKMCEBKA_ = kHBBKMCEBKA_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.jLLNGEKIHMN_ = jLLNGEKIHMN_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.speed_ = speed_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isStarted_ = isStarted_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof JMFPBNKNHED) {
          return mergeFrom((JMFPBNKNHED)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(JMFPBNKNHED other) {
        if (other == JMFPBNKNHED.getDefaultInstance()) return this;
        if (other.getStartTime() != 0L) {
          setStartTime(other.getStartTime());
        }
        if (other.getIFFAGNNKDOB() != 0) {
          setIFFAGNNKDOB(other.getIFFAGNNKDOB());
        }
        if (other.getKHBBKMCEBKA() != 0) {
          setKHBBKMCEBKA(other.getKHBBKMCEBKA());
        }
        if (other.getJLLNGEKIHMN() != 0F) {
          setJLLNGEKIHMN(other.getJLLNGEKIHMN());
        }
        if (other.getSpeed() != 0F) {
          setSpeed(other.getSpeed());
        }
        if (other.getIsStarted() != false) {
          setIsStarted(other.getIsStarted());
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
                startTime_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                iFFAGNNKDOB_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                kHBBKMCEBKA_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 37: {
                jLLNGEKIHMN_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 37
              case 45: {
                speed_ = input.readFloat();
                bitField0_ |= 0x00000010;
                break;
              } // case 45
              case 48: {
                isStarted_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
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

      private long startTime_ ;
      /**
       * <code>uint64 start_time = 1;</code>
       * @return The startTime.
       */
      @Override
      public long getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint64 start_time = 1;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(long value) {

        startTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 start_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startTime_ = 0L;
        onChanged();
        return this;
      }

      private int iFFAGNNKDOB_ ;
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @return The iFFAGNNKDOB.
       */
      @Override
      public int getIFFAGNNKDOB() {
        return iFFAGNNKDOB_;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @param value The iFFAGNNKDOB to set.
       * @return This builder for chaining.
       */
      public Builder setIFFAGNNKDOB(int value) {

        iFFAGNNKDOB_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IFFAGNNKDOB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIFFAGNNKDOB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        iFFAGNNKDOB_ = 0;
        onChanged();
        return this;
      }

      private int kHBBKMCEBKA_ ;
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @return The kHBBKMCEBKA.
       */
      @Override
      public int getKHBBKMCEBKA() {
        return kHBBKMCEBKA_;
      }
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @param value The kHBBKMCEBKA to set.
       * @return This builder for chaining.
       */
      public Builder setKHBBKMCEBKA(int value) {

        kHBBKMCEBKA_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KHBBKMCEBKA = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKHBBKMCEBKA() {
        bitField0_ = (bitField0_ & ~0x00000004);
        kHBBKMCEBKA_ = 0;
        onChanged();
        return this;
      }

      private float jLLNGEKIHMN_ ;
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @return The jLLNGEKIHMN.
       */
      @Override
      public float getJLLNGEKIHMN() {
        return jLLNGEKIHMN_;
      }
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @param value The jLLNGEKIHMN to set.
       * @return This builder for chaining.
       */
      public Builder setJLLNGEKIHMN(float value) {

        jLLNGEKIHMN_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>float JLLNGEKIHMN = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearJLLNGEKIHMN() {
        bitField0_ = (bitField0_ & ~0x00000008);
        jLLNGEKIHMN_ = 0F;
        onChanged();
        return this;
      }

      private float speed_ ;
      /**
       * <code>float speed = 5;</code>
       * @return The speed.
       */
      @Override
      public float getSpeed() {
        return speed_;
      }
      /**
       * <code>float speed = 5;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(float value) {

        speed_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>float speed = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        bitField0_ = (bitField0_ & ~0x00000010);
        speed_ = 0F;
        onChanged();
        return this;
      }

      private boolean isStarted_ ;
      /**
       * <code>bool is_started = 6;</code>
       * @return The isStarted.
       */
      @Override
      public boolean getIsStarted() {
        return isStarted_;
      }
      /**
       * <code>bool is_started = 6;</code>
       * @param value The isStarted to set.
       * @return This builder for chaining.
       */
      public Builder setIsStarted(boolean value) {

        isStarted_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_started = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsStarted() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isStarted_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:JMFPBNKNHED)
    }

    // @@protoc_insertion_point(class_scope:JMFPBNKNHED)
    private static final JMFPBNKNHED DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new JMFPBNKNHED();
    }

    public static JMFPBNKNHED getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JMFPBNKNHED>
        PARSER = new com.google.protobuf.AbstractParser<JMFPBNKNHED>() {
      @Override
      public JMFPBNKNHED parsePartialFrom(
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

    public static com.google.protobuf.Parser<JMFPBNKNHED> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<JMFPBNKNHED> getParserForType() {
      return PARSER;
    }

    @Override
    public JMFPBNKNHED getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JMFPBNKNHED_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_JMFPBNKNHED_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021JMFPBNKNHED.proto\"\203\001\n\013JMFPBNKNHED\022\022\n\ns" +
      "tart_time\030\001 \001(\004\022\023\n\013IFFAGNNKDOB\030\002 \001(\r\022\023\n\013" +
      "KHBBKMCEBKA\030\003 \001(\r\022\023\n\013JLLNGEKIHMN\030\004 \001(\002\022\r" +
      "\n\005speed\030\005 \001(\002\022\022\n\nis_started\030\006 \001(\010B\032\n\030io." +
      "irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JMFPBNKNHED_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JMFPBNKNHED_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_JMFPBNKNHED_descriptor,
        new String[] { "StartTime", "IFFAGNNKDOB", "KHBBKMCEBKA", "JLLNGEKIHMN", "Speed", "IsStarted", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
