package com.vladkharchenko.spring.mvc_hibernate_aop.controller;

import com.vladkharchenko.spring.mvc_hibernate_aop.entity.User;
import com.vladkharchenko.spring.mvc_hibernate_aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    public UserService userService;

    @RequestMapping("/")
    public String showStartMenu(){
        return "show-start-menu";
    }

    @RequestMapping("/Registry")
    public String registryMenu(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "registry-menu";
    }
    @RequestMapping("/registryDone")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "correct-registry";
    }
    @RequestMapping("/allUsers")
    public String showAllUsers(Model model){
        List<User> users = userService.giveAllUsers();
        model.addAttribute("allUsers",users);
        return "all-users";


    }

}
