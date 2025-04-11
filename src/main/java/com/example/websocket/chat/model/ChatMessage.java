package com.example.websocket.chat.model;

public class ChatMessage {
    private String sender;
    private String content;

    // Getters e Setters
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}