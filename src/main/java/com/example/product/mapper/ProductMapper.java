package com.example.product.mapper;

import com.example.product.domain.Product;
import com.example.product.entity.ProductEntity;

public class ProductMapper {

    public ProductEntity mapDomainToEntity (Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(product.getProductName());
        productEntity.setProductLocation(product.getProductLocation());
        productEntity.setProductCategory(product.getProductCategory());
        productEntity.setProductPrice(product.getProductPrice());
        productEntity.setProductDescription(product.getProductDescription());
        return productEntity;
    }
}
