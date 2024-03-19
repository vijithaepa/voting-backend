package info.slnews.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping
public class GreetingController {

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {

        return ResponseEntity.ok("Good health " + Instant.now());
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {

        return ResponseEntity.ok("Hello, how are you " + Instant.now());
    }

    @GetMapping("/secure/greeting")
    public ResponseEntity<String> securedGreeting() {

        return ResponseEntity.ok("Hello, You are secured " + Instant.now());
    }
}
