package com.example.product.service;

import com.example.product.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User createUser (User user);
}
