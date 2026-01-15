package com.dramalog.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dramalog.dto.ChatMessageResponse;
import com.dramalog.model.ChatMessage;
import com.dramalog.repository.ChatMessageRepository;

@Service
public class ChatMessageService {

    private final ChatMessageRepository chatRepo;

    public ChatMessageService(ChatMessageRepository chatRepo) {
        this.chatRepo = chatRepo;
    }

    @Transactional
    public void save(Integer dramaId, String sender, String text, long ts) {
        chatRepo.save(new ChatMessage(dramaId, sender, text, ts));
    }

    @Transactional(readOnly = true)
    public List<ChatMessageResponse> getRecent(Integer dramaId, int limit) {
        var rows = chatRepo.findByDramaIdOrderByIdDesc(dramaId, PageRequest.of(0, limit));
        // desc로 가져왔으니 화면은 오래된 -> 최신 순으로 뒤집기
        Collections.reverse(rows);

        return rows.stream()
                .map(m -> new ChatMessageResponse(m.getSender(), m.getText(), m.getTs()))
                .collect(Collectors.toList());
    }
}