package com.example.springusermodel.repositories;

import com.example.springusermodel.models.Login;
import com.example.springusermodel.models.User;

public interface IUserRepository {
    User checkLogin(Login login);
}
