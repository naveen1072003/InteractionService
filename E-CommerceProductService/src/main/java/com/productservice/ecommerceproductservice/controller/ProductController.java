package com.productservice.ecommerceproductservice.controller;

import com.productservice.ecommerceproductservice.api.ProductsApi;
import com.productservice.ecommerceproductservice.entity.ProductInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductsApi {
    @Override
    public ResponseEntity<?> addUser(ProductInfo usersInfo) {
        return null;
    }
}
