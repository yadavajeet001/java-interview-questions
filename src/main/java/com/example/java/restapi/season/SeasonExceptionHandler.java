package com.example.java.restapi.season;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class SeasonExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleSeasonException(Exception exception){
        return ResponseEntity.badRequest().body(Map.of("Error", exception.getMessage()));
    }
}
