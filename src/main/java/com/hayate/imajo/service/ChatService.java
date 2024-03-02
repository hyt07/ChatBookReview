package com.hayate.imajo.service;

import java.time.LocalDateTime;
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
    public void save(String chat) {
        LocalDateTime now = LocalDateTime.now();
        Chat newchat = createChat(chat, now);

        chatRepository.save(newchat);
    }

    // チャットの保存
    private Chat createChat(String chat, LocalDateTime sendAt) {
        Chat newChat = new Chat();
        newChat.setChat(chat);
        newChat.setSendAt(sendAt);
        return newChat;
    }

}
