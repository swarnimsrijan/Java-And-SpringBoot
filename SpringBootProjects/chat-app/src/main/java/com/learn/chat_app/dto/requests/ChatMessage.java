package com.learn.chat_app.dto.requests;

import com.learn.chat_app.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
    private String message;
    private String timeStamp;
    private String userName;
    private MessageType messageType;
}
