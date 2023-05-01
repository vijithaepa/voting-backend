package com.example.docker_container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/docker")
public class UserController {

    @GetMapping("greeting")
    public String getGreetings() {

        return "Hello, How are you, today is " + Instant.now().toString();
    }

}
