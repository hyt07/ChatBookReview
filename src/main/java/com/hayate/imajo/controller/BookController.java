package com.hayate.imajo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hayate.imajo.service.BookService;

@Controller
@RequestMapping("chatbookreview")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 本の一覧画面
    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("bookList", bookService.findALL());
        return "list";
    }

}