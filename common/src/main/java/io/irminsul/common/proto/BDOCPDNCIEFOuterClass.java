// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: BDOCPDNCIEF.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class BDOCPDNCIEFOuterClass {
  private BDOCPDNCIEFOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      BDOCPDNCIEFOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BDOCPDNCIEFOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BDOCPDNCIEF)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 guid = 2;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>uint32 MJIANPPECND = 3;</code>
     * @return The mJIANPPECND.
     */
    int getMJIANPPECND();
  }
  /**
   * Protobuf type {@code BDOCPDNCIEF}
   */
  public static final class BDOCPDNCIEF extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BDOCPDNCIEF)
      BDOCPDNCIEFOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        BDOCPDNCIEF.class.getName());
    }
    // Use BDOCPDNCIEF.newBuilder() to construct.
    private BDOCPDNCIEF(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private BDOCPDNCIEF() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BDOCPDNCIEF.class, Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMBER = 1;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 1;</code>
     * @return The groupId.
     */
    @Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int GUID_FIELD_NUMBER = 2;
    private int guid_ = 0;
    /**
     * <code>uint32 guid = 2;</code>
     * @return The guid.
     */
    @Override
    public int getGuid() {
      return guid_;
    }

    public static final int MJIANPPECND_FIELD_NUMBER = 3;
    private int mJIANPPECND_ = 0;
    /**
     * <code>uint32 MJIANPPECND = 3;</code>
     * @return The mJIANPPECND.
     */
    @Override
    public int getMJIANPPECND() {
      return mJIANPPECND_;
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
      if (groupId_ != 0) {
        output.writeUInt32(1, groupId_);
      }
      if (guid_ != 0) {
        output.writeUInt32(2, guid_);
      }
      if (mJIANPPECND_ != 0) {
        output.writeUInt32(3, mJIANPPECND_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, groupId_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, guid_);
      }
      if (mJIANPPECND_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mJIANPPECND_);
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
      if (!(obj instanceof BDOCPDNCIEF)) {
        return super.equals(obj);
      }
      BDOCPDNCIEF other = (BDOCPDNCIEF) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getMJIANPPECND()
          != other.getMJIANPPECND()) return false;
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
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + MJIANPPECND_FIELD_NUMBER;
      hash = (53 * hash) + getMJIANPPECND();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static BDOCPDNCIEF parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BDOCPDNCIEF parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BDOCPDNCIEF parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BDOCPDNCIEF parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BDOCPDNCIEF parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static BDOCPDNCIEF parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static BDOCPDNCIEF parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BDOCPDNCIEF parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static BDOCPDNCIEF parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static BDOCPDNCIEF parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static BDOCPDNCIEF parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static BDOCPDNCIEF parseFrom(
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
    public static Builder newBuilder(BDOCPDNCIEF prototype) {
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
     * Protobuf type {@code BDOCPDNCIEF}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BDOCPDNCIEF)
        BDOCPDNCIEFOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                BDOCPDNCIEF.class, Builder.class);
      }

      // Construct using io.irminsul.common.proto.BDOCPDNCIEFOuterClass.BDOCPDNCIEF.newBuilder()
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
        groupId_ = 0;
        guid_ = 0;
        mJIANPPECND_ = 0;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BDOCPDNCIEFOuterClass.internal_static_BDOCPDNCIEF_descriptor;
      }

      @Override
      public BDOCPDNCIEF getDefaultInstanceForType() {
        return BDOCPDNCIEF.getDefaultInstance();
      }

      @Override
      public BDOCPDNCIEF build() {
        BDOCPDNCIEF result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public BDOCPDNCIEF buildPartial() {
        BDOCPDNCIEF result = new BDOCPDNCIEF(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(BDOCPDNCIEF result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.groupId_ = groupId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.mJIANPPECND_ = mJIANPPECND_;
        }
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BDOCPDNCIEF) {
          return mergeFrom((BDOCPDNCIEF)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(BDOCPDNCIEF other) {
        if (other == BDOCPDNCIEF.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getMJIANPPECND() != 0) {
          setMJIANPPECND(other.getMJIANPPECND());
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
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                guid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                mJIANPPECND_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 1;</code>
       * @return The groupId.
       */
      @Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 2;</code>
       * @return The guid.
       */
      @Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 2;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {

        guid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guid_ = 0;
        onChanged();
        return this;
      }

      private int mJIANPPECND_ ;
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @return The mJIANPPECND.
       */
      @Override
      public int getMJIANPPECND() {
        return mJIANPPECND_;
      }
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @param value The mJIANPPECND to set.
       * @return This builder for chaining.
       */
      public Builder setMJIANPPECND(int value) {

        mJIANPPECND_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MJIANPPECND = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMJIANPPECND() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mJIANPPECND_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BDOCPDNCIEF)
    }

    // @@protoc_insertion_point(class_scope:BDOCPDNCIEF)
    private static final BDOCPDNCIEF DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new BDOCPDNCIEF();
    }

    public static BDOCPDNCIEF getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BDOCPDNCIEF>
        PARSER = new com.google.protobuf.AbstractParser<BDOCPDNCIEF>() {
      @Override
      public BDOCPDNCIEF parsePartialFrom(
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

    public static com.google.protobuf.Parser<BDOCPDNCIEF> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<BDOCPDNCIEF> getParserForType() {
      return PARSER;
    }

    @Override
    public BDOCPDNCIEF getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BDOCPDNCIEF_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BDOCPDNCIEF_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\021BDOCPDNCIEF.proto\"B\n\013BDOCPDNCIEF\022\020\n\010gr" +
      "oup_id\030\001 \001(\r\022\014\n\004guid\030\002 \001(\r\022\023\n\013MJIANPPECN" +
      "D\030\003 \001(\rB\032\n\030io.irminsul.common.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BDOCPDNCIEF_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BDOCPDNCIEF_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BDOCPDNCIEF_descriptor,
        new String[] { "GroupId", "Guid", "MJIANPPECND", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}