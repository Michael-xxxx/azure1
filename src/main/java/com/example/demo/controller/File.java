package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class File {
    @GetMapping("/xxx")
    public String home() {
        return "someView";
    }

}
