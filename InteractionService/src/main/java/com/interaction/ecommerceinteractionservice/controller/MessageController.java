package com.interaction.ecommerceinteractionservice.controller;

import com.interaction.ecommerceinteractionservice.api.MessageApi;
import com.interaction.ecommerceinteractionservice.dto.ApiResponseDTO;
import com.interaction.ecommerceinteractionservice.dto.MessageDTO;
import com.interaction.ecommerceinteractionservice.dto.UpdateMessageDTO;
import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import com.interaction.ecommerceinteractionservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MessageController implements MessageApi {

    @Autowired
    private MessageService messageService;
    @Override
    public ResponseEntity<ApiResponseDTO> newMessage(MessageDTO messageDTO) {
        return messageService.saveConversation(messageDTO);
    }

    @Override
    public ResponseEntity<ApiResponseDTO> getMessages() {
        return new ResponseEntity<>(new ApiResponseDTO(HttpStatus.OK,"ALL CONVERSATIONS",messageService.getAllMessages()),HttpStatus.OK);
    }



    @Override
    public ResponseEntity<ApiResponseDTO> updateStatus(UpdateMessageDTO updateMessageDTO) {
        return new ResponseEntity<>(messageService.getMessageById(updateMessageDTO),HttpStatus.OK);
    }
}
