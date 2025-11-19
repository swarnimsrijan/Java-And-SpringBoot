package com.learn.chat_app.listener;

import com.learn.chat_app.model.ChatMessage;
import com.learn.chat_app.enums.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebsocketEventListener {

    private final RedisTemplate<String, Object> redisTemplate;

    @EventListener
    public void handleWebsocketDisconnectListener(SessionDisconnectEvent event){
        SimpMessageHeaderAccessor headerAccessor = SimpMessageHeaderAccessor.wrap(event.getMessage());
        Object username = (String) headerAccessor.getSessionAttributes().get("username");
        if(username != null){
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.setMessageType(MessageType.LEFT);
            chatMessage.setUserName(username.toString());
            chatMessage.setMessage(username + " left the chat");
            log.info("User disconnected: {}", username);
            redisTemplate.convertAndSend("chat", chatMessage);
        }
    }
}
