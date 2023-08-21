package com.example.chat.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChatMessageDto {
    private ChatMessageType type;
    private String roomId;
    private String sender;
    private String message;
    private long userCount;
}
