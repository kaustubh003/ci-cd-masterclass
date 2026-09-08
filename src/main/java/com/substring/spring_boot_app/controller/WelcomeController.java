package com.substring.spring_boot_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome to spring boot app.");
    }

    @GetMapping("/users")
    public ResponseEntity<Map<String, Object>> getUser(){
        return ResponseEntity.ok(Map.of("name", "Substring Technologies", "Live", true));
    }
}
