package com.example.springusermodel.services;

import com.example.springusermodel.models.Login;
import com.example.springusermodel.models.User;

public interface IUserService {
    User checkLogin(Login login);
}
