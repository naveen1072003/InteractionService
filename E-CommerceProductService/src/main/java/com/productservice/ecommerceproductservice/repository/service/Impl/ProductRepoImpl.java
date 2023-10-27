package com.productservice.ecommerceproductservice.repository.service.Impl;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import com.productservice.ecommerceproductservice.repository.ProductInfoRepo;
import com.productservice.ecommerceproductservice.repository.service.ProductRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductRepoImpl implements ProductRepoService {

    @Autowired
    private ProductInfoRepo productInfoRepo;

    @Override
    public ProductInfo save(ProductInfo usersInfo) {
        return productInfoRepo.save(usersInfo);
    }
}
