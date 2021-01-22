package com.restapi.friend.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ErrorMessage {

    private String status;
    private String message;

    public ErrorMessage(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
