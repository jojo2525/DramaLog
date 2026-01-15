package com.dramalog.repository;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dramalog.model.ChatMessage;

public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

    // 최신 메시지부터 가져오기 (Pageable로 개수 제한)
    List<ChatMessage> findByDramaIdOrderByIdDesc(Integer dramaId, Pageable pageable);
}