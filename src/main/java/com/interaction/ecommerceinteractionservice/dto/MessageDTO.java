package com.interaction.ecommerceinteractionservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {

    private String messageContent;

    private UUID sender;
    private UUID receiver;
}
