package com.enriquecabe.coffeegql.shared.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationException extends RuntimeException{
    private final List<String> messages;

    public ValidationException(List<String> messages) {
        this.messages = messages;
    }

    public ValidationException(String message) {
        super(message);
        this.messages = new ArrayList<>();
        this.messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}
