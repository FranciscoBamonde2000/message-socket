package com.sockets.controller;

import com.sockets.dto.MessageDto;
import com.sockets.model.Message;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/{roomId}")
    public MessageDto chat(@DestinationVariable String roomId, MessageDto messageDto) {
        System.out.println(messageDto);
        return new MessageDto(messageDto.getMessage(), messageDto.getUser());
    }

    @MessageMapping("/send")
    @SendTo("/tema/mensajes")
    public Message envio(Message message) {
        System.out.println(message);
        return new Message(message.name(), message.content());
    }
}
