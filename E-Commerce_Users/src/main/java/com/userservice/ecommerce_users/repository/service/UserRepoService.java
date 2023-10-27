package com.userservice.ecommerce_users.repository.service;

import com.userservice.ecommerce_users.entity.UsersInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserRepoService {
   UsersInfo save(UsersInfo usersInfo);
}
