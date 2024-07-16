package com.example.springusermodel.services.impl;

import com.example.springusermodel.models.Login;
import com.example.springusermodel.models.User;
import com.example.springusermodel.repositories.IUserRepository;
import com.example.springusermodel.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public User checkLogin(Login login) {
        return userRepository.checkLogin(login);
    }
}
