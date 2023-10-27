package com.interaction.ecommerceinteractionservice.service.Impl;

import com.interaction.ecommerceinteractionservice.dto.ApiResponseDTO;
import com.interaction.ecommerceinteractionservice.dto.MessageDTO;
import com.interaction.ecommerceinteractionservice.dto.UpdateMessageDTO;
import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import com.interaction.ecommerceinteractionservice.entity.MessageStatus;
import com.interaction.ecommerceinteractionservice.repository.service.MessageRepoService;
import com.interaction.ecommerceinteractionservice.service.MessageService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepoService messageRepoService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ResponseEntity<ApiResponseDTO> saveConversation(MessageDTO messageDTO) {

        MessageInfo messageInfo = modelMapper.map(messageDTO,MessageInfo.class);
        messageInfo.setStatus(MessageStatus.PENDING);
        return new ResponseEntity<>(new ApiResponseDTO(HttpStatus.OK,"Message sended",messageRepoService.save(messageInfo)), HttpStatus.OK);
    }

    @Override
    public List<MessageInfo> getAllMessages() {
        return messageRepoService.findAll();
    }

    @Override
    public ResponseEntity<?> getMessageById(UpdateMessageDTO updateMessageDTO) {
        MessageInfo messageInfo = messageRepoService.getMessageById(messageId);

        return ;
    }
}
