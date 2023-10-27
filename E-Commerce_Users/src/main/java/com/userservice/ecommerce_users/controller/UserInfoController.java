package com.userservice.ecommerce_users.controller;

import com.userservice.ecommerce_users.api.UserApi;
import com.userservice.ecommerce_users.dto.ApiResponseDTO;
import com.userservice.ecommerce_users.dto.MessageDTO;
import com.userservice.ecommerce_users.entity.UsersInfo;
import com.userservice.ecommerce_users.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserInfoController implements UserApi {

    @Autowired
    private UserInfoService userInfoService;
    @Override
    public ResponseEntity<?> addUser(UsersInfo usersInfo) {
        return userInfoService.newUser(usersInfo);
    }

    @Override
    public ResponseEntity<?> getSellerProducts(String sellerId) {
        System.out.println(sellerId);

        return userInfoService.getSellerProducts(UUID.fromString(sellerId));
    }

    @Override
    public ResponseEntity<ApiResponseDTO> addnewMessage(MessageDTO messageDTO) {
        return userInfoService.saveMessage(messageDTO);
    }

    @Override
    public ResponseEntity<?> getSellerMessages(UUID sellerId) {
        return userInfoService.getMessagesBySeller(sellerId);
    }
}
