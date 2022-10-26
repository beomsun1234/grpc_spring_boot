package com.example.grpcserver;

import com.example.grpcserver.service.BookServerService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrpcServerApplication {

	public static void main(String[] args) {
        System.setProperty("grpc.server.port","9096");
        System.out.println("tset");
		SpringApplication.run(GrpcServerApplication.class, args);
	}

}
