package com.example.product.mapper;

import com.example.product.domain.User;
import com.example.product.entity.UserEntity;

public class UserMapper {

    public UserEntity mapDomainToEntity(User user) {
        UserEntity userEntity = new UserEntity();

        userEntity.setUserId(user.getUserId());
        userEntity.setUserCust(user.getUserCust());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setUserName(user.getUserName());
        userEntity.setUserStatus(user.getUserStatus());
        return userEntity;
    }
}