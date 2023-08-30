package com.example.chat.global.web.Exception;

public class CustomIncorrectPassword extends CustomRuntimeException {
    public CustomIncorrectPassword() {
        super();
    }

    public CustomIncorrectPassword(String message) {
        super(message);
    }

    public CustomIncorrectPassword(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomIncorrectPassword(Throwable cause) {
        super(cause);
    }
}
