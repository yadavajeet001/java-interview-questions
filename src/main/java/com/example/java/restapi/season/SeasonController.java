package com.example.java.restapi.season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @PostMapping("/create-season")
    public ResponseEntity<?> createSeason(@RequestBody SeasonRequest seasonRequest ){
        try {
            Season season = seasonService.createSeason(seasonRequest);
            return ResponseEntity.status(HttpStatus.CREATED).body(season);
        } catch (Exception exception){
            return ResponseEntity.badRequest().body(Map.of("Error", exception.getMessage()));
        }
    }
}
