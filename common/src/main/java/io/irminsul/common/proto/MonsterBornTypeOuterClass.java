// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: MonsterBornType.proto
// Protobuf Java Version: 4.27.2

package io.irminsul.common.proto;

public final class MonsterBornTypeOuterClass {
  private MonsterBornTypeOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      MonsterBornTypeOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Obf: LNFJOAGMCEF
   * </pre>
   *
   * Protobuf enum {@code MonsterBornType}
   */
  public enum MonsterBornType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MONSTER_BORN_TYPE_NONE = 0;</code>
     */
    MONSTER_BORN_TYPE_NONE(0),
    /**
     * <code>MONSTER_BORN_TYPE_DEFAULT = 1;</code>
     */
    MONSTER_BORN_TYPE_DEFAULT(1),
    /**
     * <code>MONSTER_BORN_TYPE_RANDOM = 2;</code>
     */
    MONSTER_BORN_TYPE_RANDOM(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        MonsterBornType.class.getName());
    }
    /**
     * <code>MONSTER_BORN_TYPE_NONE = 0;</code>
     */
    public static final int MONSTER_BORN_TYPE_NONE_VALUE = 0;
    /**
     * <code>MONSTER_BORN_TYPE_DEFAULT = 1;</code>
     */
    public static final int MONSTER_BORN_TYPE_DEFAULT_VALUE = 1;
    /**
     * <code>MONSTER_BORN_TYPE_RANDOM = 2;</code>
     */
    public static final int MONSTER_BORN_TYPE_RANDOM_VALUE = 2;


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
    public static MonsterBornType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MonsterBornType forNumber(int value) {
      switch (value) {
        case 0: return MONSTER_BORN_TYPE_NONE;
        case 1: return MONSTER_BORN_TYPE_DEFAULT;
        case 2: return MONSTER_BORN_TYPE_RANDOM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MonsterBornType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MonsterBornType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MonsterBornType>() {
            public MonsterBornType findValueByNumber(int number) {
              return MonsterBornType.forNumber(number);
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
      return MonsterBornTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MonsterBornType[] VALUES = values();

    public static MonsterBornType valueOf(
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

    private MonsterBornType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MonsterBornType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025MonsterBornType.proto*j\n\017MonsterBornTy" +
      "pe\022\032\n\026MONSTER_BORN_TYPE_NONE\020\000\022\035\n\031MONSTE" +
      "R_BORN_TYPE_DEFAULT\020\001\022\034\n\030MONSTER_BORN_TY" +
      "PE_RANDOM\020\002B\032\n\030io.irminsul.common.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}