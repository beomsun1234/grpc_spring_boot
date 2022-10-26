package com.example.grpcclient.exception;


import io.grpc.StatusRuntimeException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GrpcClientControllerAdvice {
    @ExceptionHandler(StatusRuntimeException.class)
    public Map<String, String> custom(StatusRuntimeException ex, WebRequest request) {
        Map<String, String> errorMessage = new HashMap<>();
        ex.getStatus().getCode();
        errorMessage.put("error_code", String.valueOf(ex.getStatus().getCode().value()));
        errorMessage.put("error_name", ex.getStatus().getCode().name());
        return errorMessage;
    }

}
