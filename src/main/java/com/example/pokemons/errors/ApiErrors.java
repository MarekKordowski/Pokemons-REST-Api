package com.example.pokemons.errors;

import lombok.Data;

import java.time.Instant;

@Data
public class ApiErrors {
    private int code;
    private String message;
    private Instant timestamp;

    public ApiErrors(int code, String message) {
        this.code = code;
        this.message = message;
        this.timestamp = Instant.now();
    }
}
