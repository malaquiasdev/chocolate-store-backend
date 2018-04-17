package com.github.mmalaquiasdev.chocolatestore.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

/**
 *
 * @author Eduardo Morgon <eduardo.morgon at gmail.com>
 */
@Getter
@RequiredArgsConstructor
@Value
public class ResponseError {
    
    private int status;
    private String msg;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date = LocalDate.now();
}
