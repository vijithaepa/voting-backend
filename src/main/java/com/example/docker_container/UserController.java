package com.example.docker_container;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/docker")
public class UserController {

    @GetMapping("greeting")
    public ResponseEntity<String> getGreetings() {

        return ResponseEntity.ok("Hello, How are you, today is " + Instant.now().toString());
    }

}
