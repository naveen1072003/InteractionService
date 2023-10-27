package com.productservice.ecommerceproductservice.repository;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductInfoRepo extends JpaRepository<ProductInfo, UUID> {
}
