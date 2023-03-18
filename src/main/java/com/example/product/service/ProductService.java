package com.example.product.service;

import com.example.product.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public interface ProductService {
    public Product updateProductStatus (Product product);
}
