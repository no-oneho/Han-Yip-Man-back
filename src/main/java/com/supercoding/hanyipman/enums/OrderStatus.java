package com.supercoding.hanyipman.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    WAIT("WAIT"),
    PAID("PAID"),
    TAKEOVER("TAKEOVER"),
    DELIVERY("DELIVERY"),
    COMPLETE("COMPLETE"),
    CANCELED("CANCELED");
    private final String status;
}