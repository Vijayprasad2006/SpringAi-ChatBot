package com.chatbot.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.chatbot.demo.service.geminiservice;

@RestController
@RequestMapping("/api/gemini")
@RequiredArgsConstructor
public class geminicontroller {
    private final geminiservice gemservice;
    @PostMapping("/ask")
    public String askgeminiapi(@RequestBody String prompt){
        return gemservice.askgemini(prompt);
    }
}
