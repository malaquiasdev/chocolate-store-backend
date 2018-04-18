package com.github.mmalaquiasdev.chocolatestore.exception.handler;

import com.github.mmalaquiasdev.chocolatestore.exception.ResourceNotFoundException;
import com.github.mmalaquiasdev.chocolatestore.exception.model.ResponseError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.METHOD_NOT_ALLOWED;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
class GlobalExceptionHandler {

    private static final String ERROR = "error: ";

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public HttpEntity<ResponseError> handlerHttpRequestMethodNotSupportedException(Exception ex){
        log.debug(ERROR + ex);

        ResponseError error = ResponseError.builder()
                .status(METHOD_NOT_ALLOWED.value())
                .error(METHOD_NOT_ALLOWED.name())
                .msg(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public HttpEntity<ResponseError> handlerResourceNotFoundException(final ResourceNotFoundException ex) {
        log.debug(ERROR + ex);

        ResponseError error = ResponseError.builder()
                .status(NOT_FOUND.value())
                .error(NOT_FOUND.name())
                .msg(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(error, NOT_FOUND);
    }
}
