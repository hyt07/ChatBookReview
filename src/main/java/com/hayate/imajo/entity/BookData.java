package com.hayate.imajo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "bookData")
public class BookData {

    // ISBN
    @Id
    private String isbn;

    // タイトル
    private String bookTitle;

    // 著者
    private String author;

    // 出版社
    private String publisher;

    // 出版年月
    private String yearAndMonth;

    // chatとのリレーション

}
