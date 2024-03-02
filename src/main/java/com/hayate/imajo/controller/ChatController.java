package com.hayate.imajo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hayate.imajo.service.BookService;
import com.hayate.imajo.service.ChatService;

@Controller
public class ChatController {

    private final ChatService chatService;
    private final BookService bookService;

    @Autowired
    public ChatController(ChatService chatService, BookService bookService) {
        this.chatService = chatService;
        this.bookService = bookService;
    }

    // チャット入力画面
    @GetMapping("/{isbn}")
    public String inputChat(@PathVariable String isbn, Model model) {

        model.addAttribute("bookData", bookService.findByIsbn(isbn));
        model.addAttribute("chatList", chatService.findALL());

        return "chat";
    }

    // チャット送信
    @PostMapping("/{isbn}/send")
    public String sendChat(@RequestParam("chat") String chat, @PathVariable("isbn") String isbn, Model model) {
        chatService.save(chat);
        model.addAttribute("bookData", bookService.findByIsbn(isbn));
        model.addAttribute("chatList", chatService.findALL());

        return "redirect:/{isbn}";
    }

}