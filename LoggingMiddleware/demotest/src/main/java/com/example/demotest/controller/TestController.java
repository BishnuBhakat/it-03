package com.example.demotest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demotest.service.LoggingService;

@RestController
public class TestController {

    private final LoggingService loggingService;

    public TestController(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @GetMapping("/test")
    public String testLogging() {
        loggingService.log("backend", "error", "handler", "Received string, expected bool");
        loggingService.log("backend", "fatal", "db", "Critical database connection failure.");
        return "Logs sent!";
    }
}

