package com.vladkharchenko.spring.mvc_hibernate_aop.service;

import com.vladkharchenko.spring.mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserService {

    public void  saveUser(User user);

    public List<User> giveAllUsers();



}
