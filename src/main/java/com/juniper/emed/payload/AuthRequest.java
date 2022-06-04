package com.juniper.emed.payload;

import lombok.Data;

@Data
public class AuthRequest {
    private String phone;
    private String password;
}
