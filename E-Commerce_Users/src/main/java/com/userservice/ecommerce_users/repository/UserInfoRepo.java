package com.userservice.ecommerce_users.repository;

import com.userservice.ecommerce_users.entity.UsersInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserInfoRepo extends JpaRepository<UsersInfo, UUID> {
}
