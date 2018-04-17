package com.github.mmalaquiasdev.chocolatestore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Eduardo Morgon <eduardo.morgon at gmail.com>
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ResourceNotFound.class)
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    @ResponseBody
    public ResponseError handleResourceNotFound(ResourceNotFound ex) {
        
        ResponseError responseError = new ResponseError(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return responseError;
    }

}
