package org.ies.demo.fornix.clientapp.exception;

public class UserExistsException extends RuntimeException {
    public UserExistsException(String message) {
        super(message);
    }
}
