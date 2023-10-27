package com.interaction.ecommerceinteractionservice.repository;

import com.interaction.ecommerceinteractionservice.entity.MessageInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MessageInfoRepo extends JpaRepository<MessageInfo, UUID> {
}
