package com.learn.chat_app.controller;

import com.learn.chat_app.dto.requests.ChatMessage;
import com.learn.chat_app.enums.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequiredArgsConstructor
@Slf4j
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
    @MessageMapping("/chat.addUser")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor simpMessageHeaderAccessor){
        // Get username from the chatMessage object and add it to the Websocket Session
        simpMessageHeaderAccessor.getSessionAttributes().put("username", chatMessage.getUserName());
        chatMessage.setMessageType(MessageType.JOIN);
        chatMessage.setMessage(chatMessage.getUserName()+  " joined the chat");
        chatMessage.setTimeStamp(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        log.info("user Joined: {}", chatMessage.getUserName());

        // send the chat message back to the client with message Types as join
        redisTemplate.convertAndSend("chat", chatMessage);
        return chatMessage;
    }

}
