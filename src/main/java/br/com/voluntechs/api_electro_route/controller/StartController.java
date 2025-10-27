package br.com.voluntechs.api_electro_route.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping("/")
    public String start() {
        return "API Electro Route is running!";
    }
}
