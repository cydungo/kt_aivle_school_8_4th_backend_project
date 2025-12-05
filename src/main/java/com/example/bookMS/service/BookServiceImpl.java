package com.example.bookMS.service;

import com.example.bookMS.model.*;
import com.example.bookMS.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    @Transactional
    public BookResponse createBook(BookCreateRequest request) {
        Book book = BookMapper.toEntity(request);
        bookRepository.save(book);

        return BookMapper.toResponse(book);
    }

    @Override
    public List<BookResponse> getBookList() {
        List<Book> bookList = bookRepository.findAll();
        return bookList.stream().map(BookMapper::toResponse).toList();
    }

    // 책 id로 가져오기
    @Override
    public BookResponse getBook(Long id){
        Optional<Book> book = bookRepository.findById(id);
        if(book.isEmpty()){
            throw new IllegalArgumentException("존재하지 않는 책입니다.");
        }
        return BookMapper.toResponse(book.get());
    }

    @Override
    @Transactional
    public BookResponse updateBook(Long id, BookUpdateRequest request) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isEmpty()){
            throw new IllegalArgumentException("존재하지 않는 책입니다.");
        }
        BookMapper.updateEntity(book.get(), request);
        bookRepository.save(book.get());
        return BookMapper.toResponse(book.get());
    }

    @Override
    @Transactional
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public BookResponse updateBookCover(Long id, String string) {
        Book book = bookRepository.findById(id).get();
        book.setCoverImageUrl(string);
        bookRepository.save(book);
        return BookMapper.toResponse(book);
    }

}