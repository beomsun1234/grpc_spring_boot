package com.example.grpcserver.exception;


import io.grpc.Status;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

import java.util.NoSuchElementException;

@GrpcAdvice
public class GrpcExceptionAdvice {

    @GrpcExceptionHandler
    public Status handleInvalidArgument(IllegalArgumentException e) {
        return Status.INVALID_ARGUMENT.withDescription("IllegalArgumentException").withCause(e);
    }

    @GrpcExceptionHandler
    public Status noSuchElementException(NoSuchElementException e) {
        return Status.NOT_FOUND.withDescription("NoSuchElementException").withCause(e);
    }

}
