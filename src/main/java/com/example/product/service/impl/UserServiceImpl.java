package com.example.product.service.impl;

import com.example.product.domain.User;
import com.example.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired UserReository userReopitory;
    @Override
    public User createUser(User user) {
        userReopitory.save

        return null;
    }


}
