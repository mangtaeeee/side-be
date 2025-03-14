package com.example.bowchat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatViewController {

    @GetMapping("/chat")
    public String chatView() {
        return "chat";  // src/main/resources/templates/chat.html 렌더링
    }
}
