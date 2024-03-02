package com.hayate.imajo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hayate.imajo.entity.Chat;

public interface ChatRepository extends JpaRepository<Chat, Integer> {

}
