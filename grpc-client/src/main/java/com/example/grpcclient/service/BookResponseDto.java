package com.example.grpcclient.service;


import lombok.Builder;
import lombok.Getter;

@Getter
public class BookResponseDto {
    private Long book_id;
    private String author;
    private String title;

    @Builder
    public BookResponseDto(Long id, String author, String title){
        this.book_id = id;
        this.author  = author;
        this.title   = title;
    }
}
