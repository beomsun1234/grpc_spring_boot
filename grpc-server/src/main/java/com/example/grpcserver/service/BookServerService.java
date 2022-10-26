package com.example.grpcserver.service;

import com.example.grpcserver.repository.BookRepository;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.chb.examples.lib.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;




@GrpcService
@RequiredArgsConstructor
public class BookServerService extends BookServiceGrpc.BookServiceImplBase {
    private final BookRepository bookRepository;
    @Override
    public void getBooks(Empty request, StreamObserver<ListBooksResponse> responseObserver) {
        ListBooksResponse.Builder listBooksResponse = ListBooksResponse.newBuilder();
        List<Book> grpcBookList = new ArrayList<>();

        List<com.example.grpcserver.domain.Book> books = bookRepository.findAll();
        books.forEach(domain_book -> {
            Book book = Book.newBuilder()
                    .setBookAuthor(domain_book.getAuthor())
                    .setBookTitle(domain_book.getTitle())
                    .setBookId(domain_book.getId())
                    .build();
            grpcBookList.add(book);
        });

        responseObserver.onNext(listBooksResponse.addAllBook(grpcBookList).build());
        responseObserver.onCompleted();
    }

    @Override
    public void getBook(GetBookRequest request, StreamObserver<Book> responseObserver) {
        com.example.grpcserver.domain.Book book = bookRepository.findById(request.getBookId()).orElseThrow(() -> new NoSuchElementException());

        Book grpcBook = Book.newBuilder()
                .setBookAuthor(book.getAuthor())
                .setBookTitle(book.getTitle())
                .setBookId(book.getId())
                .build();
        responseObserver.onNext(grpcBook);
        responseObserver.onCompleted();
    }

    @Override
    public void searchBooks(SearchBooksRequest request, StreamObserver<SearchBooksResponse> responseObserver) {
    }
}
