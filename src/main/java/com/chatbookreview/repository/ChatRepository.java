package com.chatbookreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbookreview.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer> {

}
