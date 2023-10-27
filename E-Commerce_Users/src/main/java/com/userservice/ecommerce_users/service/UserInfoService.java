package com.userservice.ecommerce_users.service;

import com.userservice.ecommerce_users.dto.ApiResponseDTO;
import com.userservice.ecommerce_users.dto.MessageDTO;
import com.userservice.ecommerce_users.entity.UsersInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface UserInfoService {
    ResponseEntity<?> newUser(UsersInfo usersInfo);

    ResponseEntity<?> getSellerProducts(UUID sellerId);

    ResponseEntity<ApiResponseDTO> saveMessage(MessageDTO messageDTO);

    ResponseEntity<?> getMessagesBySeller(UUID sellerId);
}
