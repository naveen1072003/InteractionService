package com.userservice.ecommerce_users.repository.service.Impl;

import com.userservice.ecommerce_users.entity.UsersInfo;
import com.userservice.ecommerce_users.repository.UserInfoRepo;
import com.userservice.ecommerce_users.repository.service.UserRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepoImpl implements UserRepoService {

    @Autowired
    private UserInfoRepo userInfoRepo;

    @Override
    public UsersInfo save(UsersInfo usersInfo) {
        return userInfoRepo.save(usersInfo);
    }
}
