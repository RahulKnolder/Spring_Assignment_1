package com.knoldus;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePrinter {
    @Autowired
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }
}
