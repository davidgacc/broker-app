package com.example.Application.exceptions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BrokerExceptionHandler {

    @Value(value = "${data.exception.message}")
    private String message;

    @ExceptionHandler(value = StatusException.class)
    public ResponseEntity statusException(StatusException statusException) {
        return new ResponseEntity(message, HttpStatus.CONFLICT);
    }

}
