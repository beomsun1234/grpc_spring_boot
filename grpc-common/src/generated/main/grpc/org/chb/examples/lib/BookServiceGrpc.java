package org.chb.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: helloworld.proto")
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final String SERVICE_NAME = "BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.Empty,
      org.chb.examples.lib.ListBooksResponse> getGetBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBooks",
      requestType = org.chb.examples.lib.Empty.class,
      responseType = org.chb.examples.lib.ListBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.Empty,
      org.chb.examples.lib.ListBooksResponse> getGetBooksMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.Empty, org.chb.examples.lib.ListBooksResponse> getGetBooksMethod;
    if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBooksMethod = BookServiceGrpc.getGetBooksMethod) == null) {
          BookServiceGrpc.getGetBooksMethod = getGetBooksMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.Empty, org.chb.examples.lib.ListBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.ListBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBooks"))
              .build();
        }
      }
    }
    return getGetBooksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.GetBookRequest,
      org.chb.examples.lib.Book> getGetBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBook",
      requestType = org.chb.examples.lib.GetBookRequest.class,
      responseType = org.chb.examples.lib.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.GetBookRequest,
      org.chb.examples.lib.Book> getGetBookMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.GetBookRequest, org.chb.examples.lib.Book> getGetBookMethod;
    if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getGetBookMethod = BookServiceGrpc.getGetBookMethod) == null) {
          BookServiceGrpc.getGetBookMethod = getGetBookMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.GetBookRequest, org.chb.examples.lib.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.GetBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.Book.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("GetBook"))
              .build();
        }
      }
    }
    return getGetBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.chb.examples.lib.SearchBooksRequest,
      org.chb.examples.lib.SearchBooksResponse> getSearchBooksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchBooks",
      requestType = org.chb.examples.lib.SearchBooksRequest.class,
      responseType = org.chb.examples.lib.SearchBooksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.chb.examples.lib.SearchBooksRequest,
      org.chb.examples.lib.SearchBooksResponse> getSearchBooksMethod() {
    io.grpc.MethodDescriptor<org.chb.examples.lib.SearchBooksRequest, org.chb.examples.lib.SearchBooksResponse> getSearchBooksMethod;
    if ((getSearchBooksMethod = BookServiceGrpc.getSearchBooksMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSearchBooksMethod = BookServiceGrpc.getSearchBooksMethod) == null) {
          BookServiceGrpc.getSearchBooksMethod = getSearchBooksMethod =
              io.grpc.MethodDescriptor.<org.chb.examples.lib.SearchBooksRequest, org.chb.examples.lib.SearchBooksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchBooks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.SearchBooksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.chb.examples.lib.SearchBooksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("SearchBooks"))
              .build();
        }
      }
    }
    return getSearchBooksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBooks(org.chb.examples.lib.Empty request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.ListBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBooksMethod(), responseObserver);
    }

    /**
     */
    public void getBook(org.chb.examples.lib.GetBookRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookMethod(), responseObserver);
    }

    /**
     */
    public void searchBooks(org.chb.examples.lib.SearchBooksRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.SearchBooksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchBooksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBooksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.examples.lib.Empty,
                org.chb.examples.lib.ListBooksResponse>(
                  this, METHODID_GET_BOOKS)))
          .addMethod(
            getGetBookMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.examples.lib.GetBookRequest,
                org.chb.examples.lib.Book>(
                  this, METHODID_GET_BOOK)))
          .addMethod(
            getSearchBooksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.chb.examples.lib.SearchBooksRequest,
                org.chb.examples.lib.SearchBooksResponse>(
                  this, METHODID_SEARCH_BOOKS)))
          .build();
    }
  }

  /**
   */
  public static final class BookServiceStub extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBooks(org.chb.examples.lib.Empty request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.ListBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBook(org.chb.examples.lib.GetBookRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchBooks(org.chb.examples.lib.SearchBooksRequest request,
        io.grpc.stub.StreamObserver<org.chb.examples.lib.SearchBooksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchBooksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.chb.examples.lib.ListBooksResponse getBooks(org.chb.examples.lib.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBooksMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.chb.examples.lib.Book getBook(org.chb.examples.lib.GetBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.chb.examples.lib.SearchBooksResponse searchBooks(org.chb.examples.lib.SearchBooksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchBooksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.examples.lib.ListBooksResponse> getBooks(
        org.chb.examples.lib.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBooksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.examples.lib.Book> getBook(
        org.chb.examples.lib.GetBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.chb.examples.lib.SearchBooksResponse> searchBooks(
        org.chb.examples.lib.SearchBooksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchBooksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOOKS = 0;
  private static final int METHODID_GET_BOOK = 1;
  private static final int METHODID_SEARCH_BOOKS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOOKS:
          serviceImpl.getBooks((org.chb.examples.lib.Empty) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.ListBooksResponse>) responseObserver);
          break;
        case METHODID_GET_BOOK:
          serviceImpl.getBook((org.chb.examples.lib.GetBookRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.Book>) responseObserver);
          break;
        case METHODID_SEARCH_BOOKS:
          serviceImpl.searchBooks((org.chb.examples.lib.SearchBooksRequest) request,
              (io.grpc.stub.StreamObserver<org.chb.examples.lib.SearchBooksResponse>) responseObserver);
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

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.chb.examples.lib.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getGetBooksMethod())
              .addMethod(getGetBookMethod())
              .addMethod(getSearchBooksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
