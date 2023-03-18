package com.example.product.service.impl;

import com.example.product.domain.Product;
import com.example.product.mapper.ProductMapper;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired ProductRepository productRepository;
    @Override
    public Product updateProductStatus(Product product) {
        ProductMapper productMapper = new ProductMapper();
        productRepository.save(productMapper.mapDomainToEntity(product));
        return product ;
    }
}
