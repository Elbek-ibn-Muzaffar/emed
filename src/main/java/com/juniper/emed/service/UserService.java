package com.juniper.emed.service;

import com.juniper.emed.entity.Users;
import com.juniper.emed.payload.UserDto;

public interface UserService {
    Users saveUser(UserDto userDto);
}
