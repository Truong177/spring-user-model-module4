package com.example.springusermodel.controllers;

import com.example.springusermodel.models.Login;
import com.example.springusermodel.models.User;
import com.example.springusermodel.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("login",new Login());
        return "home";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("login") Login login, Model model){
        User user = userService.checkLogin(login);
        if (user == null){
            return "error";
        }else {
            model.addAttribute("user",user);
            return "user";
        }
    }
}
