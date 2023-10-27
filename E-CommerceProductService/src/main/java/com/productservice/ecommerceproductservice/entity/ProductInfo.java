package com.productservice.ecommerceproductservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID prodId;

    private String prodName;
    private String description;
    private String prodPrice;
    private UUID sellerId;
}
