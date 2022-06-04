package com.juniper.emed.payload;

import lombok.Data;

@Data
public class AuthRequest {
    private String name;
    private String password;
}
