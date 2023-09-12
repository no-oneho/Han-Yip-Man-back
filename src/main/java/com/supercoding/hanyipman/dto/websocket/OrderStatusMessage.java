package com.supercoding.hanyipman.dto.websocket;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderStatusMessage {

    private String room;
    private com.supercoding.hanyipman.enums.OrderStatus orderStatus;
    private String message;


    public OrderStatusMessage(com.supercoding.hanyipman.enums.OrderStatus orderStatus, String message) {
        this.orderStatus = orderStatus;
        this.message = message;
    }
}
