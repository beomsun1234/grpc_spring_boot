package com.example.grpcclient.service;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.chb.examples.lib.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrpcClientService {
    @GrpcClient("grpc-book-server")
    private SimpleGrpc.SimpleBlockingStub simpleStub;
    @GrpcClient("grpc-book-server")
    private BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub;


    public String sendMessage(final String name) {
        try{
            HelloReply response = this.simpleStub.sayHello(HelloRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }

    public List<BookResponseDto> getBooks(){
        Empty empty = Empty.newBuilder().build();

        ListBooksResponse books = bookServiceBlockingStub.getBooks(empty);

        List<BookResponseDto>  listBooks = new ArrayList<>();
        books.getBookList().forEach(book -> {
            BookResponseDto bookDto = BookResponseDto.builder()
                    .author(book.getBookAuthor())
                    .title(book.getBookTitle())
                    .id(book.getBookId()).build();
            listBooks.add(bookDto);
        });
        return listBooks;
    }

    public BookResponseDto getBook(Long bookId){
        GetBookRequest getBookRequestById = GetBookRequest.newBuilder().setBookId(bookId).build();
        Book book = bookServiceBlockingStub.getBook(getBookRequestById);
        return BookResponseDto.builder().id(book.getBookId()).author(book.getBookAuthor()).title(book.getBookTitle()).build();

    }
}
