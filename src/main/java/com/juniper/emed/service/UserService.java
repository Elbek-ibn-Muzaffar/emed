package com.juniper.emed.service;


import com.juniper.emed.entity.Users;
import com.juniper.emed.payload.UserDto;
import com.juniper.emed.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    ModelMapper modelMapper=new ModelMapper();

    @Autowired
    private PasswordEncoder passwordEncoder;

    //saving user
    public String saveUser(UserDto userDto)
    {
        if (!userRepository.existsByName(userDto.getName()))
        {
            userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
            userRepository.save(modelMapper.map(userDto, Users.class));
            return "Saqlandi";
        }

        return "Bu User mavjud";
    }


}
