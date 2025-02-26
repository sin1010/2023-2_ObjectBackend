package com.example.demo.user.exception;

import lombok.Getter;

public enum ErrorCode {
    SAME_ID("동일한 ID가 있습니다"),
    ID_NOT_FOUND("해당 ID를 찾을 수 없습니다");

    @Getter
    private String massage;
    ErrorCode(String massage){this.massage=massage;}
}
