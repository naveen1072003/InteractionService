package com.productservice.ecommerceproductservice.api;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/productDetails")
public interface ProductsApi {
    @PostMapping("/newProduct")
    ResponseEntity<?> addUser(@RequestBody ProductInfo usersInfo);
}
