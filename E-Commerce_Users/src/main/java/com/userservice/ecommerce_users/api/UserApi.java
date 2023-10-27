package com.userservice.ecommerce_users.api;

import com.userservice.ecommerce_users.dto.ApiResponseDTO;
import com.userservice.ecommerce_users.dto.MessageDTO;
import com.userservice.ecommerce_users.entity.UsersInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/userdetails")
public interface UserApi {
    @PostMapping("/newUser")
    ResponseEntity<?> addUser(@RequestBody UsersInfo usersInfo);

    @GetMapping("/getProducts/{sellerId}")
    ResponseEntity<?> getSellerProducts(@PathVariable String sellerId);
    
    @PostMapping("/newMessage")
    ResponseEntity<ApiResponseDTO> addnewMessage(@RequestBody MessageDTO messageDTO);

    @GetMapping("/getAllMessages/{sellerId}")
    ResponseEntity<?> getSellerMessages(@PathVariable UUID sellerId);
}
