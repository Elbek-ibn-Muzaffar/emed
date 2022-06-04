package com.juniper.emed.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String phone;


    //    @Transient
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_name", referencedColumnName = "name")}
    )
    private Set<Roles> roles;

}
