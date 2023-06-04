package com.example.backend.service;

import com.example.backend.entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * /24
 * @JDKVersion 17.0.4
 */
@Service
public interface MessageService {
    List<Message> findActivityAllMessage(Long activityId);

    int addMessage(Message message);
}
