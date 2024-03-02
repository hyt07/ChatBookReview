package com.hayate.imajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayate.imajo.entity.BookData;

public interface BookRepository extends JpaRepository<BookData, String> {

}
