package com.deysi.blogdesafio.service;

import com.deysi.blogdesafio.dto.RegisterRequest;
import com.deysi.blogdesafio.model.User;
import com.deysi.blogdesafio.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void signup(RegisterRequest registerRequest) {
    
        @Autowired 
        private UserRepository userRepository;


        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
    
}
