package com.interaction.ecommerceinteractionservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class MessageInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID messageId;

    private String messageContent;

    private UUID sender;
    private UUID receiver;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Timestamp uploadedDate;
    private MessageStatus status;
}
