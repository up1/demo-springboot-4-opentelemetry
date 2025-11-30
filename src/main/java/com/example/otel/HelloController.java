package com.example.otel;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    private final HellService service;

    public HelloController(HellService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String sayHi() {
        LOGGER.info("Called sayHi()");
        this.service.doSth();
        return "Hello Spring Boot 4.0.0";
    }
}
