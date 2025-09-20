package com.chatbot.demo.config;

import com.google.genai.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class geminiconfig {
    @Bean
    public Client geminiclient(){
        return  new Client();
    }
}
