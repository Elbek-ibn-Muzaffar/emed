package com.juniper.emed.service;

import com.juniper.emed.entity.Users;
import com.juniper.emed.payload.UserDto;

import java.util.List;

public interface UserService {
    Users saveUser(UserDto userDto);

    List<Users> getAll();

    Users findById(Long id);
}
