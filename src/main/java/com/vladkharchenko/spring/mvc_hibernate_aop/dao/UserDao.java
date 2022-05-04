package com.vladkharchenko.spring.mvc_hibernate_aop.dao;

import com.vladkharchenko.spring.mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserDao {

    public void  saveUser(User user);
    public List<User> giveAllUsers();
    public User getUser(int id);

}
