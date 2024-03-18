package com.chatbookreview.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbookreview.entity.BookData;
import com.chatbookreview.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // 本の一覧取得
    public List<BookData> findALL() {
        return bookRepository.findAll();
    }

    // 1件の本を取得
    public BookData findByIsbn(String isbn) {
        // findByIdで検索
        Optional<BookData> option = bookRepository.findById(isbn);
        // 取得できなかった場合はnullを返す
        BookData bookData = option.orElse(null);
        return bookData;
    }

}
