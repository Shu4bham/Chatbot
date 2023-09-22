package com.shu4bham.chatbot;

public class ChatsModal {
    private String message;
    private String Sender;

    public ChatsModal(String message, String sender) {
        this.message = message;
        this.Sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        this.Sender = sender;
    }
}
