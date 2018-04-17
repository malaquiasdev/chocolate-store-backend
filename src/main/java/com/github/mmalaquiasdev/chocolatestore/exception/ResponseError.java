package com.github.mmalaquiasdev.chocolatestore.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Eduardo Morgon <eduardo.morgon at gmail.com>
 */
@Getter
@RequiredArgsConstructor
public class ResponseError {
    
    private final int status;
    private final String msg;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private final Date date = new Date();
}
