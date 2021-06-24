package com.example.pokemons.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrors runtimeException(RuntimeException ex) {
        return new ApiErrors(HttpStatus.BAD_REQUEST.value(), ex.getMessage()); // hide in the future
    }
}
