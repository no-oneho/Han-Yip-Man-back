package com.supercoding.hanyipman.error.domain;

import com.supercoding.hanyipman.error.ErrorCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum PaymentErrorCode implements ErrorCode {

    // HTTP 상태 코드 404

    IM_PORT_NON_EXISTENT_MEMBER(HttpStatus.NOT_FOUND.value(), "존재하지 않는 회원입니다."),
    IM_PORT_NOT_BUYER(HttpStatus.FORBIDDEN.value(), "소비자가 아닙니다."),
    IM_PORT_NO_ORDER(HttpStatus.NOT_FOUND.value(), "결제할 주문건이 존재하지 않습니다."),

    IM_PORT_MISMATCH_IMP_UID(HttpStatus.BAD_REQUEST.value(), "Imp_uid 가 맞지 않습니다."),
    IM_PORT_MISMATCH_MERCHANT_UID(HttpStatus.BAD_REQUEST.value(), "Merchant_uid 가 맞지 않습니다."),
    IM_PORT_MISMATCH_ORDER_AND_BUYER(HttpStatus.BAD_REQUEST.value(), "주문건의 소비자와 결제건의 소비자가 일치하지 않습니다."),

    IM_PORT_API_COMMUNICATION_ERROR(HttpStatus.BAD_REQUEST.value(), "아임포트 통신에 실패했습니다."),
    IM_PORT_API_INVALID_MERCHANT_UID(HttpStatus.BAD_REQUEST.value(), "유효하지 않는 merchant_uid 입니다."),
    IM_PORT_API_INVALID_AMOUNT(HttpStatus.BAD_REQUEST.value(), "유효하지 않는 amount 입니다."),
    IM_PORT_API_PAYMENT_FAILED(HttpStatus.BAD_REQUEST.value(), "결제에 실패하였습니다.");


    private final int code;
    private final String message;

    private PaymentErrorCode(int code, String message){
        this.code = code;
        this.message = message;
    }

}