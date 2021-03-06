// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sign.proto

package com.hifun.soul.proto.common;

public final class Signs {
  private Signs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StarMapOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 starMapId = 1;
    boolean hasStarMapId();
    int getStarMapId();
    
    // required bool activated = 2;
    boolean hasActivated();
    boolean getActivated();
  }
  public static final class StarMap extends
      com.google.protobuf.GeneratedMessage
      implements StarMapOrBuilder {
    // Use StarMap.newBuilder() to construct.
    private StarMap(Builder builder) {
      super(builder);
    }
    private StarMap(boolean noInit) {}
    
    private static final StarMap defaultInstance;
    public static StarMap getDefaultInstance() {
      return defaultInstance;
    }
    
    public StarMap getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_StarMap_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_StarMap_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 starMapId = 1;
    public static final int STARMAPID_FIELD_NUMBER = 1;
    private int starMapId_;
    public boolean hasStarMapId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getStarMapId() {
      return starMapId_;
    }
    
    // required bool activated = 2;
    public static final int ACTIVATED_FIELD_NUMBER = 2;
    private boolean activated_;
    public boolean hasActivated() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getActivated() {
      return activated_;
    }
    
    private void initFields() {
      starMapId_ = 0;
      activated_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasStarMapId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasActivated()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, starMapId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, activated_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, starMapId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, activated_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.StarMap parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Signs.StarMap prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hifun.soul.proto.common.Signs.StarMapOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_StarMap_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_StarMap_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Signs.StarMap.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        starMapId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        activated_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Signs.StarMap.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Signs.StarMap getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Signs.StarMap.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Signs.StarMap build() {
        com.hifun.soul.proto.common.Signs.StarMap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Signs.StarMap buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Signs.StarMap result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Signs.StarMap buildPartial() {
        com.hifun.soul.proto.common.Signs.StarMap result = new com.hifun.soul.proto.common.Signs.StarMap(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.starMapId_ = starMapId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.activated_ = activated_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Signs.StarMap) {
          return mergeFrom((com.hifun.soul.proto.common.Signs.StarMap)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Signs.StarMap other) {
        if (other == com.hifun.soul.proto.common.Signs.StarMap.getDefaultInstance()) return this;
        if (other.hasStarMapId()) {
          setStarMapId(other.getStarMapId());
        }
        if (other.hasActivated()) {
          setActivated(other.getActivated());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasStarMapId()) {
          
          return false;
        }
        if (!hasActivated()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              starMapId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              activated_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 starMapId = 1;
      private int starMapId_ ;
      public boolean hasStarMapId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getStarMapId() {
        return starMapId_;
      }
      public Builder setStarMapId(int value) {
        bitField0_ |= 0x00000001;
        starMapId_ = value;
        onChanged();
        return this;
      }
      public Builder clearStarMapId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        starMapId_ = 0;
        onChanged();
        return this;
      }
      
      // required bool activated = 2;
      private boolean activated_ ;
      public boolean hasActivated() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getActivated() {
        return activated_;
      }
      public Builder setActivated(boolean value) {
        bitField0_ |= 0x00000002;
        activated_ = value;
        onChanged();
        return this;
      }
      public Builder clearActivated() {
        bitField0_ = (bitField0_ & ~0x00000002);
        activated_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.StarMap)
    }
    
    static {
      defaultInstance = new StarMap(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.StarMap)
  }
  
  public interface SignOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 signId = 1;
    boolean hasSignId();
    int getSignId();
    
    // required bool activated = 2;
    boolean hasActivated();
    boolean getActivated();
  }
  public static final class Sign extends
      com.google.protobuf.GeneratedMessage
      implements SignOrBuilder {
    // Use Sign.newBuilder() to construct.
    private Sign(Builder builder) {
      super(builder);
    }
    private Sign(boolean noInit) {}
    
    private static final Sign defaultInstance;
    public static Sign getDefaultInstance() {
      return defaultInstance;
    }
    
    public Sign getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_Sign_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_Sign_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 signId = 1;
    public static final int SIGNID_FIELD_NUMBER = 1;
    private int signId_;
    public boolean hasSignId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getSignId() {
      return signId_;
    }
    
    // required bool activated = 2;
    public static final int ACTIVATED_FIELD_NUMBER = 2;
    private boolean activated_;
    public boolean hasActivated() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getActivated() {
      return activated_;
    }
    
    private void initFields() {
      signId_ = 0;
      activated_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasSignId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasActivated()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, signId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, activated_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, signId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, activated_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.hifun.soul.proto.common.Signs.Sign parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hifun.soul.proto.common.Signs.Sign prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.hifun.soul.proto.common.Signs.SignOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_Sign_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hifun.soul.proto.common.Signs.internal_static_com_hifun_soul_proto_common_Sign_fieldAccessorTable;
      }
      
      // Construct using com.hifun.soul.proto.common.Signs.Sign.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        signId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        activated_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hifun.soul.proto.common.Signs.Sign.getDescriptor();
      }
      
      public com.hifun.soul.proto.common.Signs.Sign getDefaultInstanceForType() {
        return com.hifun.soul.proto.common.Signs.Sign.getDefaultInstance();
      }
      
      public com.hifun.soul.proto.common.Signs.Sign build() {
        com.hifun.soul.proto.common.Signs.Sign result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.hifun.soul.proto.common.Signs.Sign buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.hifun.soul.proto.common.Signs.Sign result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.hifun.soul.proto.common.Signs.Sign buildPartial() {
        com.hifun.soul.proto.common.Signs.Sign result = new com.hifun.soul.proto.common.Signs.Sign(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.signId_ = signId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.activated_ = activated_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hifun.soul.proto.common.Signs.Sign) {
          return mergeFrom((com.hifun.soul.proto.common.Signs.Sign)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.hifun.soul.proto.common.Signs.Sign other) {
        if (other == com.hifun.soul.proto.common.Signs.Sign.getDefaultInstance()) return this;
        if (other.hasSignId()) {
          setSignId(other.getSignId());
        }
        if (other.hasActivated()) {
          setActivated(other.getActivated());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasSignId()) {
          
          return false;
        }
        if (!hasActivated()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              signId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              activated_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 signId = 1;
      private int signId_ ;
      public boolean hasSignId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getSignId() {
        return signId_;
      }
      public Builder setSignId(int value) {
        bitField0_ |= 0x00000001;
        signId_ = value;
        onChanged();
        return this;
      }
      public Builder clearSignId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        signId_ = 0;
        onChanged();
        return this;
      }
      
      // required bool activated = 2;
      private boolean activated_ ;
      public boolean hasActivated() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getActivated() {
        return activated_;
      }
      public Builder setActivated(boolean value) {
        bitField0_ |= 0x00000002;
        activated_ = value;
        onChanged();
        return this;
      }
      public Builder clearActivated() {
        bitField0_ = (bitField0_ & ~0x00000002);
        activated_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.hifun.soul.proto.common.Sign)
    }
    
    static {
      defaultInstance = new Sign(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.hifun.soul.proto.common.Sign)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_StarMap_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_StarMap_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hifun_soul_proto_common_Sign_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hifun_soul_proto_common_Sign_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nSign.proto\022\033com.hifun.soul.proto.commo" +
      "n\"/\n\007StarMap\022\021\n\tstarMapId\030\001 \002(\005\022\021\n\tactiv" +
      "ated\030\002 \002(\010\")\n\004Sign\022\016\n\006signId\030\001 \002(\005\022\021\n\tac" +
      "tivated\030\002 \002(\010B$\n\033com.hifun.soul.proto.co" +
      "mmonB\005Signs"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_hifun_soul_proto_common_StarMap_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_hifun_soul_proto_common_StarMap_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_StarMap_descriptor,
              new java.lang.String[] { "StarMapId", "Activated", },
              com.hifun.soul.proto.common.Signs.StarMap.class,
              com.hifun.soul.proto.common.Signs.StarMap.Builder.class);
          internal_static_com_hifun_soul_proto_common_Sign_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_com_hifun_soul_proto_common_Sign_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_hifun_soul_proto_common_Sign_descriptor,
              new java.lang.String[] { "SignId", "Activated", },
              com.hifun.soul.proto.common.Signs.Sign.class,
              com.hifun.soul.proto.common.Signs.Sign.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
