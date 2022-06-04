package com.juniper.emed.payload;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class AuthResponce {
    private final  String jwt;
}
