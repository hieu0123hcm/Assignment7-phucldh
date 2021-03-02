package com.bienthaikieusa.chitchat.service.impl;

import com.bienthaikieusa.chitchat.model.Notification;
import com.bienthaikieusa.chitchat.repository.NotificationRepository;
import com.bienthaikieusa.chitchat.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public List<Notification> findAll() {
        return (List<Notification>) notificationRepository.findAll();
    }

    @Override
    public Optional<Notification> findNoticeById(Long noticeID) {
        return notificationRepository.findById(noticeID);
    }

    @Override
    public List<Notification> findByReceiverID(String receiverID) {
        return notificationRepository.findByReceiverId(receiverID);
    }

    @Override
    public void createNotification(Notification notification) {
        notificationRepository.save(notification);
    }


}
