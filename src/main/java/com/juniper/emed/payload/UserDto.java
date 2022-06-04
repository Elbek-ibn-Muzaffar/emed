package com.juniper.emed.payload;

import lombok.Data;

import java.util.Set;

@Data
public class UserDto {

    private String name;

    private String password;

    private String phone;
    private Set<RoleDto> roles;
}
