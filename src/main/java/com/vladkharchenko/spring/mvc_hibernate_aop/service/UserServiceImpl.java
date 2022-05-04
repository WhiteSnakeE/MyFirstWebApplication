package com.vladkharchenko.spring.mvc_hibernate_aop.service;

import com.vladkharchenko.spring.mvc_hibernate_aop.dao.UserDao;
import com.vladkharchenko.spring.mvc_hibernate_aop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public List<User> giveAllUsers() {
        return  userDao.giveAllUsers();
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDao.getUser(id);
    }
}
