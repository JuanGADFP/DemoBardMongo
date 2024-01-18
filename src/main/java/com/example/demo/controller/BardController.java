package com.example.demo.controller;

import com.example.demo.Service.BardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bard")
public class BardController {

    @Autowired
    private BardService bardService;

    @GetMapping("/chat")
    public String chat(String message) {
        return bardService.generate(message);
    }
}
