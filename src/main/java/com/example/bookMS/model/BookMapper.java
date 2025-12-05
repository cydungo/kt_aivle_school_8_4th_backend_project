package com.example.bookMS.model;

import jakarta.transaction.Transactional;
import lombok.Builder;

@Builder
public class BookMapper {
    @Transactional
    public static BookResponse toResponse(Book book) {
        return BookResponse.builder()
                .id(book.getBookId())
                .title(book.getTitle())
                .content(book.getContent())
                .coverImageUrl(book.getCoverImageUrl())
                .createdAt(book.getCreatedAt())
                .updatedAt(book.getUpdatedAt())
                .build();
    }

    public static void updateEntity(Book book, BookUpdateRequest request) {
        if (request.getTitle() != null) {
            book.setTitle(request.getTitle());
        }
        if (request.getContent() != null) {
            book.setContent(request.getContent());
        }
    }

    public static Book toEntity(BookCreateRequest request) {
        return Book.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }
}