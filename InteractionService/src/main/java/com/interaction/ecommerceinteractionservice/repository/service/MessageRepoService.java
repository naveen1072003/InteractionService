package com.interaction.ecommerceinteractionservice.repository.service;

import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface MessageRepoService
{
   MessageInfo save(MessageInfo usersInfo);

   List<MessageInfo> findAll();

   MessageInfo getMessageById(UUID messageId);
}
