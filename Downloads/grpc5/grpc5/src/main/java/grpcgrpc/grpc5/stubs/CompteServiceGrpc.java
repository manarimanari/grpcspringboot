package grpcgrpc.grpc5.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: compteservice.proto")
public final class CompteServiceGrpc {

  private CompteServiceGrpc() {}

  public static final String SERVICE_NAME = "CompteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetAllComptesRequest,
      grpcgrpc.grpc5.stubs.GetAllComptesResponse> getGetAllComptesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllComptes",
      requestType = grpcgrpc.grpc5.stubs.GetAllComptesRequest.class,
      responseType = grpcgrpc.grpc5.stubs.GetAllComptesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetAllComptesRequest,
      grpcgrpc.grpc5.stubs.GetAllComptesResponse> getGetAllComptesMethod() {
    io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetAllComptesRequest, grpcgrpc.grpc5.stubs.GetAllComptesResponse> getGetAllComptesMethod;
    if ((getGetAllComptesMethod = CompteServiceGrpc.getGetAllComptesMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetAllComptesMethod = CompteServiceGrpc.getGetAllComptesMethod) == null) {
          CompteServiceGrpc.getGetAllComptesMethod = getGetAllComptesMethod = 
              io.grpc.MethodDescriptor.<grpcgrpc.grpc5.stubs.GetAllComptesRequest, grpcgrpc.grpc5.stubs.GetAllComptesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "getAllComptes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetAllComptesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetAllComptesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("getAllComptes"))
                  .build();
          }
        }
     }
     return getGetAllComptesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetCompteByIdRequest,
      grpcgrpc.grpc5.stubs.GetCompteByIdResponse> getGetCompteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCompteById",
      requestType = grpcgrpc.grpc5.stubs.GetCompteByIdRequest.class,
      responseType = grpcgrpc.grpc5.stubs.GetCompteByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetCompteByIdRequest,
      grpcgrpc.grpc5.stubs.GetCompteByIdResponse> getGetCompteByIdMethod() {
    io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetCompteByIdRequest, grpcgrpc.grpc5.stubs.GetCompteByIdResponse> getGetCompteByIdMethod;
    if ((getGetCompteByIdMethod = CompteServiceGrpc.getGetCompteByIdMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetCompteByIdMethod = CompteServiceGrpc.getGetCompteByIdMethod) == null) {
          CompteServiceGrpc.getGetCompteByIdMethod = getGetCompteByIdMethod = 
              io.grpc.MethodDescriptor.<grpcgrpc.grpc5.stubs.GetCompteByIdRequest, grpcgrpc.grpc5.stubs.GetCompteByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "getCompteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetCompteByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetCompteByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("getCompteById"))
                  .build();
          }
        }
     }
     return getGetCompteByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetTotalSoldeRequest,
      grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTotalSolde",
      requestType = grpcgrpc.grpc5.stubs.GetTotalSoldeRequest.class,
      responseType = grpcgrpc.grpc5.stubs.GetTotalSoldeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetTotalSoldeRequest,
      grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod() {
    io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.GetTotalSoldeRequest, grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> getGetTotalSoldeMethod;
    if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getGetTotalSoldeMethod = CompteServiceGrpc.getGetTotalSoldeMethod) == null) {
          CompteServiceGrpc.getGetTotalSoldeMethod = getGetTotalSoldeMethod = 
              io.grpc.MethodDescriptor.<grpcgrpc.grpc5.stubs.GetTotalSoldeRequest, grpcgrpc.grpc5.stubs.GetTotalSoldeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "getTotalSolde"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetTotalSoldeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.GetTotalSoldeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("getTotalSolde"))
                  .build();
          }
        }
     }
     return getGetTotalSoldeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.SaveCompteRequest,
      grpcgrpc.grpc5.stubs.SaveCompteResponse> getSaveCompteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCompte",
      requestType = grpcgrpc.grpc5.stubs.SaveCompteRequest.class,
      responseType = grpcgrpc.grpc5.stubs.SaveCompteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.SaveCompteRequest,
      grpcgrpc.grpc5.stubs.SaveCompteResponse> getSaveCompteMethod() {
    io.grpc.MethodDescriptor<grpcgrpc.grpc5.stubs.SaveCompteRequest, grpcgrpc.grpc5.stubs.SaveCompteResponse> getSaveCompteMethod;
    if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
      synchronized (CompteServiceGrpc.class) {
        if ((getSaveCompteMethod = CompteServiceGrpc.getSaveCompteMethod) == null) {
          CompteServiceGrpc.getSaveCompteMethod = getSaveCompteMethod = 
              io.grpc.MethodDescriptor.<grpcgrpc.grpc5.stubs.SaveCompteRequest, grpcgrpc.grpc5.stubs.SaveCompteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CompteService", "saveCompte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.SaveCompteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpcgrpc.grpc5.stubs.SaveCompteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CompteServiceMethodDescriptorSupplier("saveCompte"))
                  .build();
          }
        }
     }
     return getSaveCompteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CompteServiceStub newStub(io.grpc.Channel channel) {
    return new CompteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CompteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CompteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CompteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CompteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CompteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllComptes(grpcgrpc.grpc5.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllComptesMethod(), responseObserver);
    }

    /**
     */
    public void getCompteById(grpcgrpc.grpc5.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCompteByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTotalSolde(grpcgrpc.grpc5.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTotalSoldeMethod(), responseObserver);
    }

    /**
     */
    public void saveCompte(grpcgrpc.grpc5.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.SaveCompteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCompteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllComptesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcgrpc.grpc5.stubs.GetAllComptesRequest,
                grpcgrpc.grpc5.stubs.GetAllComptesResponse>(
                  this, METHODID_GET_ALL_COMPTES)))
          .addMethod(
            getGetCompteByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcgrpc.grpc5.stubs.GetCompteByIdRequest,
                grpcgrpc.grpc5.stubs.GetCompteByIdResponse>(
                  this, METHODID_GET_COMPTE_BY_ID)))
          .addMethod(
            getGetTotalSoldeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcgrpc.grpc5.stubs.GetTotalSoldeRequest,
                grpcgrpc.grpc5.stubs.GetTotalSoldeResponse>(
                  this, METHODID_GET_TOTAL_SOLDE)))
          .addMethod(
            getSaveCompteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpcgrpc.grpc5.stubs.SaveCompteRequest,
                grpcgrpc.grpc5.stubs.SaveCompteResponse>(
                  this, METHODID_SAVE_COMPTE)))
          .build();
    }
  }

  /**
   */
  public static final class CompteServiceStub extends io.grpc.stub.AbstractStub<CompteServiceStub> {
    private CompteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllComptes(grpcgrpc.grpc5.stubs.GetAllComptesRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetAllComptesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllComptesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCompteById(grpcgrpc.grpc5.stubs.GetCompteByIdRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetCompteByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCompteByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTotalSolde(grpcgrpc.grpc5.stubs.GetTotalSoldeRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCompte(grpcgrpc.grpc5.stubs.SaveCompteRequest request,
        io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.SaveCompteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CompteServiceBlockingStub extends io.grpc.stub.AbstractStub<CompteServiceBlockingStub> {
    private CompteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpcgrpc.grpc5.stubs.GetAllComptesResponse getAllComptes(grpcgrpc.grpc5.stubs.GetAllComptesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllComptesMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcgrpc.grpc5.stubs.GetCompteByIdResponse getCompteById(grpcgrpc.grpc5.stubs.GetCompteByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCompteByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcgrpc.grpc5.stubs.GetTotalSoldeResponse getTotalSolde(grpcgrpc.grpc5.stubs.GetTotalSoldeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTotalSoldeMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpcgrpc.grpc5.stubs.SaveCompteResponse saveCompte(grpcgrpc.grpc5.stubs.SaveCompteRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCompteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CompteServiceFutureStub extends io.grpc.stub.AbstractStub<CompteServiceFutureStub> {
    private CompteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CompteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CompteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CompteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcgrpc.grpc5.stubs.GetAllComptesResponse> getAllComptes(
        grpcgrpc.grpc5.stubs.GetAllComptesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllComptesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcgrpc.grpc5.stubs.GetCompteByIdResponse> getCompteById(
        grpcgrpc.grpc5.stubs.GetCompteByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCompteByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcgrpc.grpc5.stubs.GetTotalSoldeResponse> getTotalSolde(
        grpcgrpc.grpc5.stubs.GetTotalSoldeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTotalSoldeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpcgrpc.grpc5.stubs.SaveCompteResponse> saveCompte(
        grpcgrpc.grpc5.stubs.SaveCompteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCompteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_COMPTES = 0;
  private static final int METHODID_GET_COMPTE_BY_ID = 1;
  private static final int METHODID_GET_TOTAL_SOLDE = 2;
  private static final int METHODID_SAVE_COMPTE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CompteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CompteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_COMPTES:
          serviceImpl.getAllComptes((grpcgrpc.grpc5.stubs.GetAllComptesRequest) request,
              (io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetAllComptesResponse>) responseObserver);
          break;
        case METHODID_GET_COMPTE_BY_ID:
          serviceImpl.getCompteById((grpcgrpc.grpc5.stubs.GetCompteByIdRequest) request,
              (io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetCompteByIdResponse>) responseObserver);
          break;
        case METHODID_GET_TOTAL_SOLDE:
          serviceImpl.getTotalSolde((grpcgrpc.grpc5.stubs.GetTotalSoldeRequest) request,
              (io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.GetTotalSoldeResponse>) responseObserver);
          break;
        case METHODID_SAVE_COMPTE:
          serviceImpl.saveCompte((grpcgrpc.grpc5.stubs.SaveCompteRequest) request,
              (io.grpc.stub.StreamObserver<grpcgrpc.grpc5.stubs.SaveCompteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CompteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpcgrpc.grpc5.stubs.Compteservice.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CompteService");
    }
  }

  private static final class CompteServiceFileDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier {
    CompteServiceFileDescriptorSupplier() {}
  }

  private static final class CompteServiceMethodDescriptorSupplier
      extends CompteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CompteServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CompteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CompteServiceFileDescriptorSupplier())
              .addMethod(getGetAllComptesMethod())
              .addMethod(getGetCompteByIdMethod())
              .addMethod(getGetTotalSoldeMethod())
              .addMethod(getSaveCompteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
