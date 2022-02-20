package com.example.Application.exceptions;

public class StatusException extends RuntimeException {

    private String message;

    public StatusException(String message) {
        super(message);
        this.message = message;
    }

    public StatusException() {
    }
}
