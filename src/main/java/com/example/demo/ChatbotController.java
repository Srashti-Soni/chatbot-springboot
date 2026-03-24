package com.example.demo; // Change this to your actual package name

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ChatbotController {


    @PostMapping("/webhook")
    public Map<String, String> handleWhatsAppMessage(@RequestBody Map<String, String> request) {


        String incomingMessage = request.getOrDefault("message", "").trim();


        System.out.println("Received WhatsApp Message: " + incomingMessage);


        String replyText;
        if (incomingMessage.equalsIgnoreCase("Hi")) {
            replyText = "Hello";
        } else if (incomingMessage.equalsIgnoreCase("Bye")) {
            replyText = "Goodbye";
        } else {
            replyText = "I am a simple bot. I only understand 'Hi' and 'Bye' right now! ";
        }

        return Map.of("reply", replyText);
    }
}