package com.interaction.ecommerceinteractionservice.api;

import com.interaction.ecommerceinteractionservice.dto.ApiResponseDTO;
import com.interaction.ecommerceinteractionservice.dto.MessageDTO;
import com.interaction.ecommerceinteractionservice.dto.UpdateMessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/collaboration")
public interface MessageApi {
    @PostMapping("/startMessage")
    ResponseEntity<ApiResponseDTO> newMessage(@RequestBody MessageDTO messageDTO);

    @GetMapping("/getAllMessages")
    ResponseEntity<ApiResponseDTO> getMessages();

    @GetMapping("/updateStatus")
    ResponseEntity<ApiResponseDTO> updateStatus(@RequestBody UpdateMessageDTO updateMessageDTO);
}
