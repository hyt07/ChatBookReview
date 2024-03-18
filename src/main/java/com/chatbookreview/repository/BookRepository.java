package com.chatbookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbookreview.entity.BookData;

public interface BookRepository extends JpaRepository<BookData, String> {

}
