package com.example.product.mapper;

import com.example.product.domain.Product;
import com.example.product.entity.ProductEntity;

public class ProductMapper {
    public ProductEntity mapDomainToEntity(Product product) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName(product.getProductName());
        productEntity.setProductPrice(product.getProductPrice());
        productEntity.setProductCategory(product.getProductCategory());
        productEntity.setProductDescription(product.getProductDescription());
        productEntity.setProductLocation(product.getProductLocation());
        return productEntity;
    }


    public Product mapEntityToDomain(ProductEntity productEntity) {
        Product product = new Product();
        product.setProductName(productEntity.getProductName());
        product.setProductPrice(productEntity.getProductPrice());
        product.setProductCategory(productEntity.getProductCategory());
        product.setProductDescription(productEntity.getProductDescription());
        product.setProductLocation(productEntity.getProductLocation());

        return product;
    }
}
