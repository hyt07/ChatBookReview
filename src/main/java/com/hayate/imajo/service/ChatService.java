package com.hayate.imajo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hayate.imajo.entity.Chat;
import com.hayate.imajo.repository.ChatRepository;

@Service
public class ChatService {

    private final ChatRepository chatRepository;

    public ChatService (ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    // チャットの取得
    public List<Chat> findALL() {
        return chatRepository.findAll();
    }

    // チャットの送信処理

}
