package com.example.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.product.entity.Product;

public interface ProductRepositoryInt extends JpaRepository<Product, Long> {
}
