package com.sockets.model;

import lombok.Data;

@Data
public class MessageModel {
    private int DN_id;
    private String DC_user;
    private String DC_message;
    private String DC_roomId;
}
