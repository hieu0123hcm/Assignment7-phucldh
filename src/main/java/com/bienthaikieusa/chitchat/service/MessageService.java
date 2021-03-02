package com.bienthaikieusa.chitchat.service;

import java.util.List;
import java.util.Optional;

import com.bienthaikieusa.chitchat.model.Message;

public interface MessageService {
	List<Message> findAll();
	Optional<Message> findLatestMessage(String username);
    void save(Message message);
    void remove(Message message);
    Optional<Message> findById(Long id);
    List<Message> findByUsername(String username);
}
