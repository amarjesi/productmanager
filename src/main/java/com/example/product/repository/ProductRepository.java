package com.example.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
