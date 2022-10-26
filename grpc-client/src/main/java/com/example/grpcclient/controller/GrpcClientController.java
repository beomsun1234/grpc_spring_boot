package com.example.grpcclient.controller;

import com.example.grpcclient.service.BookResponseDto;
import com.example.grpcclient.service.GrpcClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GrpcClientController {
    private final GrpcClientService grpcClientService;

    @GetMapping("/test")
    public String printMessage() {
        return grpcClientService.sendMessage("test");
    }

    @GetMapping("book/{id}")
    public BookResponseDto getBook(@PathVariable Long id){
        return grpcClientService.getBook(id);
    }
    @GetMapping("/book")
    public List<BookResponseDto> getBooks(){
        return grpcClientService.getBooks();
    }
}
