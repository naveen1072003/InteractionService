package com.productservice.ecommerceproductservice.service.Impl;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import com.productservice.ecommerceproductservice.repository.service.ProductRepoService;
import com.productservice.ecommerceproductservice.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductRepoService productRepoService;

    @Override
    public ResponseEntity<?> saveProduct(ProductInfo productInfo) {
        return new ResponseEntity<>(productRepoService.save(productInfo), HttpStatus.OK);
    }
}
