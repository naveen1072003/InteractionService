package com.interaction.ecommerceinteractionservice.repository.service.Impl;

import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import com.interaction.ecommerceinteractionservice.repository.MessageInfoRepo;
import com.interaction.ecommerceinteractionservice.repository.service.MessageRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageInfoRepoImpl implements MessageRepoService {

    @Autowired
    private MessageInfoRepo messageInfoRepo;

    @Override
    public MessageInfo save(MessageInfo messageInfo) {
        return messageInfoRepo.save(messageInfo);
    }

    @Override
    public List<MessageInfo> findAll() {
        return messageInfoRepo.findAll();
    }

    @Override
    public MessageInfo getMessageById(UUID messageId) {
        return null;
    }

}
