package com.productservice.ecommerceproductservice.service;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProductInfoService {
    ResponseEntity<?> saveProduct(ProductInfo usersInfo);
}
