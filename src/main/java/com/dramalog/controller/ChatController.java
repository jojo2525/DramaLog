package com.dramalog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.dramalog.dto.ChatMessageResponse;
import com.dramalog.service.ChatMessageService;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatMessageService chatService;

    public ChatController(ChatMessageService chatService) {
        this.chatService = chatService;
    }

    // 최근 100개 기본 (limit 파라미터로 조절 가능!)
    @GetMapping("/{dramaId}/history")
    public List<ChatMessageResponse> history(
            @PathVariable Integer dramaId,
            @RequestParam(defaultValue = "100") int limit
    ) {
        return chatService.getRecent(dramaId, Math.min(limit, 300));
    }
}