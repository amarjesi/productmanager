package com.example.product.repository;

import com.example.product.entity.ProductEntity;
import com.example.product.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
