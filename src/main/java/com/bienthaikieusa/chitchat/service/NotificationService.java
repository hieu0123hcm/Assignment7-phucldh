package com.bienthaikieusa.chitchat.service;

import com.bienthaikieusa.chitchat.model.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationService {
    List<Notification> findAll();
    Optional<Notification> findNoticeById(Long noticeID);
    List<Notification> findByReceiverID(String receiverID);
    void createNotification(Notification notification);
}
