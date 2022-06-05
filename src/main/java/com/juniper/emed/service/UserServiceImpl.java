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
import java.util.List;
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
    public Users saveUser(UserDto userDto) {
        if (!userRepository.existsByPhone(userDto.getPhone()))
        {
            Users users = modelMapper.map(userDto, Users.class);


            users.setRoles(roleRepository.findAllByName(userDto.getRoleName()));
            return userRepository.save(users);
        }

        return new Users();
    }

    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        if (userRepository.existsById(id))
        {
            return userRepository.findById(id).get();
        }
        return new Users();
    }
}
