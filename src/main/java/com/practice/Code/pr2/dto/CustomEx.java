package com.practice.Code.pr2.dto;

public class CustomEx extends RuntimeException {

    private final int statusCode;

    public CustomEx(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
