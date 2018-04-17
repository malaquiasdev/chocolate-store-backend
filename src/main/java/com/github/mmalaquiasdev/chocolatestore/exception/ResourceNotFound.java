package com.github.mmalaquiasdev.chocolatestore.exception;

/**
 *
 * @author Eduardo Morgon <eduardo.morgon at gmail.com>
 */
public class ResourceNotFound extends RuntimeException {

    public ResourceNotFound() {
        super();
    }

    public ResourceNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFound(String message) {
        super(message);
    }

    public ResourceNotFound(Throwable cause) {
        super(cause);
    }

}
