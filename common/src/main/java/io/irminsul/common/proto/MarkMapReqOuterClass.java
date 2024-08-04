// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: MarkMapReq.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class MarkMapReqOuterClass {
  private MarkMapReqOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      MarkMapReqOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MarkMapReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MarkMapReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MapMarkPoint mark = 6;</code>
     * @return Whether the mark field is set.
     */
    boolean hasMark();
    /**
     * <code>.MapMarkPoint mark = 6;</code>
     * @return The mark.
     */
    MapMarkPointOuterClass.MapMarkPoint getMark();
    /**
     * <code>.MapMarkPoint mark = 6;</code>
     */
    MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder();

    /**
     * <code>.MarkMapReq.Operation op = 3;</code>
     * @return The enum numeric value on the wire for op.
     */
    int getOpValue();
    /**
     * <code>.MarkMapReq.Operation op = 3;</code>
     * @return The op.
     */
    MarkMapReq.Operation getOp();

    /**
     * <code>.MapMarkPoint old = 15;</code>
     * @return Whether the old field is set.
     */
    boolean hasOld();
    /**
     * <code>.MapMarkPoint old = 15;</code>
     * @return The old.
     */
    MapMarkPointOuterClass.MapMarkPoint getOld();
    /**
     * <code>.MapMarkPoint old = 15;</code>
     */
    MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 1812
   * Obf: OIHCCJMLEGJ
   * </pre>
   *
   * Protobuf type {@code MarkMapReq}
   */
  public static final class MarkMapReq extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MarkMapReq)
      MarkMapReqOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        MarkMapReq.class.getName());
    }
    // Use MarkMapReq.newBuilder() to construct.
    private MarkMapReq(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private MarkMapReq() {
      op_ = 0;
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MarkMapReq.class, Builder.class);
    }

    /**
     * <pre>
     * Obf: NIELEKBPCIJ
     * </pre>
     *
     * Protobuf enum {@code MarkMapReq.Operation}
     */
    public enum Operation
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>OPERATION_ADD = 0;</code>
       */
      OPERATION_ADD(0),
      /**
       * <code>OPERATION_MOD = 1;</code>
       */
      OPERATION_MOD(1),
      /**
       * <code>OPERATION_DEL = 2;</code>
       */
      OPERATION_DEL(2),
      /**
       * <code>OPERATION_GET = 3;</code>
       */
      OPERATION_GET(3),
      UNRECOGNIZED(-1),
      ;

      static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
          com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
          /* major= */ 4,
          /* minor= */ 27,
          /* patch= */ 2,
          /* suffix= */ "",
          Operation.class.getName());
      }
      /**
       * <code>OPERATION_ADD = 0;</code>
       */
      public static final int OPERATION_ADD_VALUE = 0;
      /**
       * <code>OPERATION_MOD = 1;</code>
       */
      public static final int OPERATION_MOD_VALUE = 1;
      /**
       * <code>OPERATION_DEL = 2;</code>
       */
      public static final int OPERATION_DEL_VALUE = 2;
      /**
       * <code>OPERATION_GET = 3;</code>
       */
      public static final int OPERATION_GET_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @Deprecated
      public static Operation valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static Operation forNumber(int value) {
        switch (value) {
          case 0: return OPERATION_ADD;
          case 1: return OPERATION_MOD;
          case 2: return OPERATION_DEL;
          case 3: return OPERATION_GET;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Operation>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Operation> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
              public Operation findValueByNumber(int number) {
                return Operation.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return MarkMapReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final Operation[] VALUES = values();

      public static Operation valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private Operation(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MarkMapReq.Operation)
    }

    private int bitField0_;
    public static final int MARK_FIELD_NUMBER = 6;
    private MapMarkPointOuterClass.MapMarkPoint mark_;
    /**
     * <code>.MapMarkPoint mark = 6;</code>
     * @return Whether the mark field is set.
     */
    @Override
    public boolean hasMark() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.MapMarkPoint mark = 6;</code>
     * @return The mark.
     */
    @Override
    public MapMarkPointOuterClass.MapMarkPoint getMark() {
      return mark_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
    }
    /**
     * <code>.MapMarkPoint mark = 6;</code>
     */
    @Override
    public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
      return mark_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
    }

    public static final int OP_FIELD_NUMBER = 3;
    private int op_ = 0;
    /**
     * <code>.MarkMapReq.Operation op = 3;</code>
     * @return The enum numeric value on the wire for op.
     */
    @Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.MarkMapReq.Operation op = 3;</code>
     * @return The op.
     */
    @Override public Operation getOp() {
      Operation result = Operation.forNumber(op_);
      return result == null ? Operation.UNRECOGNIZED : result;
    }

    public static final int OLD_FIELD_NUMBER = 15;
    private MapMarkPointOuterClass.MapMarkPoint old_;
    /**
     * <code>.MapMarkPoint old = 15;</code>
     * @return Whether the old field is set.
     */
    @Override
    public boolean hasOld() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.MapMarkPoint old = 15;</code>
     * @return The old.
     */
    @Override
    public MapMarkPointOuterClass.MapMarkPoint getOld() {
      return old_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
    }
    /**
     * <code>.MapMarkPoint old = 15;</code>
     */
    @Override
    public MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
      return old_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
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
      if (op_ != Operation.OPERATION_ADD.getNumber()) {
        output.writeEnum(3, op_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(6, getMark());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(15, getOld());
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (op_ != Operation.OPERATION_ADD.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, op_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getMark());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getOld());
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
      if (!(obj instanceof MarkMapReq)) {
        return super.equals(obj);
      }
      MarkMapReq other = (MarkMapReq) obj;

      if (hasMark() != other.hasMark()) return false;
      if (hasMark()) {
        if (!getMark()
            .equals(other.getMark())) return false;
      }
      if (op_ != other.op_) return false;
      if (hasOld() != other.hasOld()) return false;
      if (hasOld()) {
        if (!getOld()
            .equals(other.getOld())) return false;
      }
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
      if (hasMark()) {
        hash = (37 * hash) + MARK_FIELD_NUMBER;
        hash = (53 * hash) + getMark().hashCode();
      }
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + op_;
      if (hasOld()) {
        hash = (37 * hash) + OLD_FIELD_NUMBER;
        hash = (53 * hash) + getOld().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MarkMapReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MarkMapReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MarkMapReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MarkMapReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MarkMapReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MarkMapReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MarkMapReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MarkMapReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static MarkMapReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static MarkMapReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MarkMapReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static MarkMapReq parseFrom(
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
    public static Builder newBuilder(MarkMapReq prototype) {
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
     * CmdId: 1812
     * Obf: OIHCCJMLEGJ
     * </pre>
     *
     * Protobuf type {@code MarkMapReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MarkMapReq)
        MarkMapReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MarkMapReqOuterClass.internal_static_MarkMapReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MarkMapReq.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.MarkMapReqOuterClass.MarkMapReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
          getMarkFieldBuilder();
          getOldFieldBuilder();
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        mark_ = null;
        if (markBuilder_ != null) {
          markBuilder_.dispose();
          markBuilder_ = null;
        }
        op_ = 0;
        old_ = null;
        if (oldBuilder_ != null) {
          oldBuilder_.dispose();
          oldBuilder_ = null;
        }
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MarkMapReqOuterClass.internal_static_MarkMapReq_descriptor;
      }

      @Override
      public MarkMapReq getDefaultInstanceForType() {
        return MarkMapReq.getDefaultInstance();
      }

      @Override
      public MarkMapReq build() {
        MarkMapReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public MarkMapReq buildPartial() {
        MarkMapReq result = new MarkMapReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(MarkMapReq result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.mark_ = markBuilder_ == null
              ? mark_
              : markBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.op_ = op_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.old_ = oldBuilder_ == null
              ? old_
              : oldBuilder_.build();
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MarkMapReq) {
          return mergeFrom((MarkMapReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MarkMapReq other) {
        if (other == MarkMapReq.getDefaultInstance()) return this;
        if (other.hasMark()) {
          mergeMark(other.getMark());
        }
        if (other.op_ != 0) {
          setOpValue(other.getOpValue());
        }
        if (other.hasOld()) {
          mergeOld(other.getOld());
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
              case 24: {
                op_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 50: {
                input.readMessage(
                    getMarkFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 50
              case 122: {
                input.readMessage(
                    getOldFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 122
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

      private MapMarkPointOuterClass.MapMarkPoint mark_;
      private com.google.protobuf.SingleFieldBuilder<
          MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> markBuilder_;
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       * @return Whether the mark field is set.
       */
      public boolean hasMark() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       * @return The mark.
       */
      public MapMarkPointOuterClass.MapMarkPoint getMark() {
        if (markBuilder_ == null) {
          return mark_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
        } else {
          return markBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public Builder setMark(MapMarkPointOuterClass.MapMarkPoint value) {
        if (markBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mark_ = value;
        } else {
          markBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public Builder setMark(
          MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (markBuilder_ == null) {
          mark_ = builderForValue.build();
        } else {
          markBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public Builder mergeMark(MapMarkPointOuterClass.MapMarkPoint value) {
        if (markBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            mark_ != null &&
            mark_ != MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance()) {
            getMarkBuilder().mergeFrom(value);
          } else {
            mark_ = value;
          }
        } else {
          markBuilder_.mergeFrom(value);
        }
        if (mark_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public Builder clearMark() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mark_ = null;
        if (markBuilder_ != null) {
          markBuilder_.dispose();
          markBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public MapMarkPointOuterClass.MapMarkPoint.Builder getMarkBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMarkFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      public MapMarkPointOuterClass.MapMarkPointOrBuilder getMarkOrBuilder() {
        if (markBuilder_ != null) {
          return markBuilder_.getMessageOrBuilder();
        } else {
          return mark_ == null ?
              MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : mark_;
        }
      }
      /**
       * <code>.MapMarkPoint mark = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>
          getMarkFieldBuilder() {
        if (markBuilder_ == null) {
          markBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>(
                  getMark(),
                  getParentForChildren(),
                  isClean());
          mark_ = null;
        }
        return markBuilder_;
      }

      private int op_ = 0;
      /**
       * <code>.MarkMapReq.Operation op = 3;</code>
       * @return The enum numeric value on the wire for op.
       */
      @Override public int getOpValue() {
        return op_;
      }
      /**
       * <code>.MarkMapReq.Operation op = 3;</code>
       * @param value The enum numeric value on the wire for op to set.
       * @return This builder for chaining.
       */
      public Builder setOpValue(int value) {
        op_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.MarkMapReq.Operation op = 3;</code>
       * @return The op.
       */
      @Override
      public Operation getOp() {
        Operation result = Operation.forNumber(op_);
        return result == null ? Operation.UNRECOGNIZED : result;
      }
      /**
       * <code>.MarkMapReq.Operation op = 3;</code>
       * @param value The op to set.
       * @return This builder for chaining.
       */
      public Builder setOp(Operation value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        op_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MarkMapReq.Operation op = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        op_ = 0;
        onChanged();
        return this;
      }

      private MapMarkPointOuterClass.MapMarkPoint old_;
      private com.google.protobuf.SingleFieldBuilder<
          MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder> oldBuilder_;
      /**
       * <code>.MapMarkPoint old = 15;</code>
       * @return Whether the old field is set.
       */
      public boolean hasOld() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       * @return The old.
       */
      public MapMarkPointOuterClass.MapMarkPoint getOld() {
        if (oldBuilder_ == null) {
          return old_ == null ? MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
        } else {
          return oldBuilder_.getMessage();
        }
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public Builder setOld(MapMarkPointOuterClass.MapMarkPoint value) {
        if (oldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          old_ = value;
        } else {
          oldBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public Builder setOld(
          MapMarkPointOuterClass.MapMarkPoint.Builder builderForValue) {
        if (oldBuilder_ == null) {
          old_ = builderForValue.build();
        } else {
          oldBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public Builder mergeOld(MapMarkPointOuterClass.MapMarkPoint value) {
        if (oldBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            old_ != null &&
            old_ != MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance()) {
            getOldBuilder().mergeFrom(value);
          } else {
            old_ = value;
          }
        } else {
          oldBuilder_.mergeFrom(value);
        }
        if (old_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public Builder clearOld() {
        bitField0_ = (bitField0_ & ~0x00000004);
        old_ = null;
        if (oldBuilder_ != null) {
          oldBuilder_.dispose();
          oldBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public MapMarkPointOuterClass.MapMarkPoint.Builder getOldBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getOldFieldBuilder().getBuilder();
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      public MapMarkPointOuterClass.MapMarkPointOrBuilder getOldOrBuilder() {
        if (oldBuilder_ != null) {
          return oldBuilder_.getMessageOrBuilder();
        } else {
          return old_ == null ?
              MapMarkPointOuterClass.MapMarkPoint.getDefaultInstance() : old_;
        }
      }
      /**
       * <code>.MapMarkPoint old = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>
          getOldFieldBuilder() {
        if (oldBuilder_ == null) {
          oldBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              MapMarkPointOuterClass.MapMarkPoint, MapMarkPointOuterClass.MapMarkPoint.Builder, MapMarkPointOuterClass.MapMarkPointOrBuilder>(
                  getOld(),
                  getParentForChildren(),
                  isClean());
          old_ = null;
        }
        return oldBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:MarkMapReq)
    }

    // @@protoc_insertion_point(class_scope:MarkMapReq)
    private static final MarkMapReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MarkMapReq();
    }

    public static MarkMapReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MarkMapReq>
        PARSER = new com.google.protobuf.AbstractParser<MarkMapReq>() {
      @Override
      public MarkMapReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<MarkMapReq> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<MarkMapReq> getParserForType() {
      return PARSER;
    }

    @Override
    public MarkMapReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MarkMapReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MarkMapReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020MarkMapReq.proto\032\022MapMarkPoint.proto\"\301" +
      "\001\n\nMarkMapReq\022\033\n\004mark\030\006 \001(\0132\r.MapMarkPoi" +
      "nt\022!\n\002op\030\003 \001(\0162\025.MarkMapReq.Operation\022\032\n" +
      "\003old\030\017 \001(\0132\r.MapMarkPoint\"W\n\tOperation\022\021" +
      "\n\rOPERATION_ADD\020\000\022\021\n\rOPERATION_MOD\020\001\022\021\n\r" +
      "OPERATION_DEL\020\002\022\021\n\rOPERATION_GET\020\003B\032\n\030io" +
      ".irminsul.common.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          MapMarkPointOuterClass.getDescriptor(),
        });
    internal_static_MarkMapReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MarkMapReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MarkMapReq_descriptor,
        new String[] { "Mark", "Op", "Old", });
    descriptor.resolveAllFeaturesImmutable();
    MapMarkPointOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}