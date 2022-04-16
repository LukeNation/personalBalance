package com.lukenation.personal.balance.service.impl;

import com.lukenation.personal.balance.DTO.request.UserRequest;
import com.lukenation.personal.balance.model.User;
import com.lukenation.personal.balance.repository.UserRepository;
import com.lukenation.personal.balance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User createNewUser(UserRequest userRequest) {
        User user = User.builder()
                .name(userRequest.getName())
                .lastname(userRequest.getLastName())
                .email(userRequest.getEmail())
                .password(passwordEncoder.encode(userRequest.getPasswordRaw()))
                .build();

        userRepository.save(user);
        return user;
    }
}
