package fpl.smartlib.recommandationgrpcservice.grpc.stub;

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
    comments = "Source: recommandation.proto")
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final String SERVICE_NAME = "RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest,
      fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> getGetRecommendationsForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecommendationsForUser",
      requestType = fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest.class,
      responseType = fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest,
      fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> getGetRecommendationsForUserMethod() {
    io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest, fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> getGetRecommendationsForUserMethod;
    if ((getGetRecommendationsForUserMethod = RecommendationServiceGrpc.getGetRecommendationsForUserMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetRecommendationsForUserMethod = RecommendationServiceGrpc.getGetRecommendationsForUserMethod) == null) {
          RecommendationServiceGrpc.getGetRecommendationsForUserMethod = getGetRecommendationsForUserMethod = 
              io.grpc.MethodDescriptor.<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest, fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RecommendationService", "GetRecommendationsForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetRecommendationsForUser"))
                  .build();
          }
        }
     }
     return getGetRecommendationsForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest,
      fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> getCreateOrUpdateRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrUpdateRecommendation",
      requestType = fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest.class,
      responseType = fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest,
      fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> getCreateOrUpdateRecommendationMethod() {
    io.grpc.MethodDescriptor<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest, fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> getCreateOrUpdateRecommendationMethod;
    if ((getCreateOrUpdateRecommendationMethod = RecommendationServiceGrpc.getCreateOrUpdateRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getCreateOrUpdateRecommendationMethod = RecommendationServiceGrpc.getCreateOrUpdateRecommendationMethod) == null) {
          RecommendationServiceGrpc.getCreateOrUpdateRecommendationMethod = getCreateOrUpdateRecommendationMethod = 
              io.grpc.MethodDescriptor.<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest, fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RecommendationService", "CreateOrUpdateRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("CreateOrUpdateRecommendation"))
                  .build();
          }
        }
     }
     return getCreateOrUpdateRecommendationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    return new RecommendationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RecommendationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRecommendationsForUser(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest request,
        io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecommendationsForUserMethod(), responseObserver);
    }

    /**
     */
    public void createOrUpdateRecommendation(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest request,
        io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrUpdateRecommendationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRecommendationsForUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest,
                fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse>(
                  this, METHODID_GET_RECOMMENDATIONS_FOR_USER)))
          .addMethod(
            getCreateOrUpdateRecommendationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest,
                fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse>(
                  this, METHODID_CREATE_OR_UPDATE_RECOMMENDATION)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendationServiceStub extends io.grpc.stub.AbstractStub<RecommendationServiceStub> {
    private RecommendationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRecommendationsForUser(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest request,
        io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecommendationsForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createOrUpdateRecommendation(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest request,
        io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrUpdateRecommendationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendationServiceBlockingStub extends io.grpc.stub.AbstractStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse getRecommendationsForUser(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecommendationsForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse createOrUpdateRecommendation(fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrUpdateRecommendationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendationServiceFutureStub extends io.grpc.stub.AbstractStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse> getRecommendationsForUser(
        fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecommendationsForUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse> createOrUpdateRecommendation(
        fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrUpdateRecommendationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RECOMMENDATIONS_FOR_USER = 0;
  private static final int METHODID_CREATE_OR_UPDATE_RECOMMENDATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RECOMMENDATIONS_FOR_USER:
          serviceImpl.getRecommendationsForUser((fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.GetRecommendationsResponse>) responseObserver);
          break;
        case METHODID_CREATE_OR_UPDATE_RECOMMENDATION:
          serviceImpl.createOrUpdateRecommendation((fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.CreateOrUpdateRecommendationResponse>) responseObserver);
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

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return fpl.smartlib.recommandationgrpcservice.grpc.stub.Recommandation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getGetRecommendationsForUserMethod())
              .addMethod(getCreateOrUpdateRecommendationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
