// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compteservice.proto

package grpcgrpc.grpc5.stubs;

public interface CompteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CompteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float solde = 1;</code>
   * @return The solde.
   */
  float getSolde();

  /**
   * <code>string dateCreation = 2;</code>
   * @return The dateCreation.
   */
  java.lang.String getDateCreation();
  /**
   * <code>string dateCreation = 2;</code>
   * @return The bytes for dateCreation.
   */
  com.google.protobuf.ByteString
      getDateCreationBytes();

  /**
   * <code>.TypeCompte type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.TypeCompte type = 3;</code>
   * @return The type.
   */
  grpcgrpc.grpc5.stubs.TypeCompte getType();
}