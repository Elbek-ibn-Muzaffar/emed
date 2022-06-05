package com.juniper.emed.components;



import com.juniper.emed.entity.Roles;
import com.juniper.emed.entity.Users;
import com.juniper.emed.repository.RoleRepository;
import com.juniper.emed.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.HashSet;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;


    @Value("${spring.sql.init.mode}")
    private String initMode;

    @Override
    public void run(String... args) throws Exception {
        if (initMode.equals("always")) {
            Roles roles=new Roles();
            roles.setName("ROLE_ADMIN");
            roleRepository.save(roles);

            Users users=new Users();
            users.setName("Elbek");
            users.setPhone("931788058");
            users.setPassword("112233");
            users.setRoles(roleRepository.findAllByName("ROLE_ADMIN"));

            userRepository.save(users);

        }
    }
}
