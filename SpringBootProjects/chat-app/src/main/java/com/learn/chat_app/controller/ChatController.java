package com.learn.chat_app.controller;

import com.learn.chat_app.dto.requests.ChatMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequiredArgsConstructor
public class ChatController {

    @Value("${channel.topic}")
    private String channelTopic;

    private final RedisTemplate redisTemplate;

    // Send message to the clients
    @MessageMapping("/chat.send")
    public ChatMessage sendChatMessage(@Payload ChatMessage chatMessage){
        chatMessage.setTimeStamp(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        redisTemplate.convertAndSend(channelTopic, chatMessage);
        return chatMessage;
    }
    // Add user to the application

}
