package com.github.mmalaquiasdev.chocolatestore.exception;

import com.github.mmalaquiasdev.chocolatestore.exception.model.MessageError;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super(MessageError.RESOURCE_NOT_FOUND.getMsg());
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
