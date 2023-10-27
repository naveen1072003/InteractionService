package com.interaction.ecommerceinteractionservice.service;

import com.interaction.ecommerceinteractionservice.dto.ApiResponseDTO;
import com.interaction.ecommerceinteractionservice.dto.MessageDTO;
import com.interaction.ecommerceinteractionservice.dto.UpdateMessageDTO;
import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface MessageService {
    ResponseEntity<ApiResponseDTO> saveConversation(MessageDTO messageDTO);

    List<MessageInfo> getAllMessages();

    ResponseEntity<?> getMessageById(UpdateMessageDTO updateMessageDTO);
}
