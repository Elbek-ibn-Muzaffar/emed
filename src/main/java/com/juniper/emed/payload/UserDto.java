package com.juniper.emed.payload;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String phone;

    @NotNull
    private String roleName;
}
