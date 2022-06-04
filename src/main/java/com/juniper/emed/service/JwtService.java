package com.juniper.emed.service;


import com.juniper.emed.payload.AuthRequest;
import com.juniper.emed.payload.AuthResponce;
import com.juniper.emed.repository.UserRepository;
import com.juniper.emed.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserRepository userRepository;

    public AuthResponce createToken(AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getName(), authRequest.getPassword())
            );


        } catch (BadCredentialsException e) {
            throw new Exception("Password yoki login hato", e);
        }
        catch (NullPointerException e)
        {
            throw new Exception("Hechnarsa topilmadi", e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getName());

        final String jwt = jwtUtils.generateToken(userDetails);

        return new AuthResponce(jwt);
    }
}
