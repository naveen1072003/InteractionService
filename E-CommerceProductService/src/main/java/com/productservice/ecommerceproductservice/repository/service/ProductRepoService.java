package com.productservice.ecommerceproductservice.repository.service;

import com.productservice.ecommerceproductservice.entity.ProductInfo;
import org.springframework.stereotype.Service;

@Service
public interface ProductRepoService {
   ProductInfo save(ProductInfo usersInfo);
}
