package com.dramalog.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "chat_messages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="drama_id", nullable=false)
    private Integer dramaId;

    @Column(nullable=false, length=50)
    private String sender;

    @Column(nullable=false, length=300)
    private String text;

    @Column(nullable=false)
    private Long ts; // epoch milli

    protected ChatMessage() {}

    public ChatMessage(Integer dramaId, String sender, String text, Long ts) {
        this.dramaId = dramaId;
        this.sender = sender;
        this.text = text;
        this.ts = ts;
    }

    public Long getId() { return id; }
    public Integer getDramaId() { return dramaId; }
    public String getSender() { return sender; }
    public String getText() { return text; }
    public Long getTs() { return ts; }
}