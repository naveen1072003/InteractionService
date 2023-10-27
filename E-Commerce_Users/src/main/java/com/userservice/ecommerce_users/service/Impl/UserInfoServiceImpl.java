package com.userservice.ecommerce_users.service.Impl;

import com.userservice.ecommerce_users.dto.ApiResponseDTO;
import com.userservice.ecommerce_users.dto.MessageDTO;
import com.userservice.ecommerce_users.entity.UsersInfo;
import com.userservice.ecommerce_users.repository.service.UserRepoService;
import com.userservice.ecommerce_users.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserRepoService userRepoService;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity<?> newUser(UsersInfo usersInfo) {
        return new ResponseEntity<>(userRepoService.save(usersInfo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getSellerProducts(UUID sellerId) {
        String getProductsUrl = "http://localhost:8081/api/v1/productDetails/getProducts/" + sellerId;
        ResponseEntity<ApiResponseDTO> responseEntity = restTemplate.getForEntity(getProductsUrl, ApiResponseDTO.class);
//        ResponseEntity<List<?>> responseEntity = restTemplate.exchange(
//                getProductsUrl,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<?>>() {}
//        );
        return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<ApiResponseDTO> saveMessage(MessageDTO messageDTO) {
        String postMessageUrl = "http://localhost:8082/api/v1/collaboration/startMessage";
        ResponseEntity<ApiResponseDTO> response = restTemplate.postForEntity(postMessageUrl, messageDTO, ApiResponseDTO.class);
        return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getMessagesBySeller(UUID sellerId) {
        String getMessageUrl = "http://localhost:8082/api/v1/collaboration/getAllMessages";
        return ;
    }
}
