package com.juniper.emed.service;


import com.juniper.emed.entity.Roles;
import com.juniper.emed.entity.Users;
import com.juniper.emed.payload.UserDto;
import com.juniper.emed.repository.RoleRepository;
import com.juniper.emed.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    ModelMapper modelMapper=new ModelMapper();



    //saving user
    @Override
    public String saveUser(UserDto userDto) {
        if (!userRepository.existsByPhone(userDto.getPhone()))
        {
            Users users = modelMapper.map(userDto, Users.class);
            Set<Roles> roles=new HashSet<>();
            roles.add(roleRepository.findById(userDto.getRoleId()).get());
            users.setRoles(roles);
            userRepository.save(users);
            return "Saqlandi";
        }

        return "Bu User mavjud";
    }

}
