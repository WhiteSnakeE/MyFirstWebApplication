package com.vladkharchenko.spring.mvc_hibernate_aop.dao;

import com.vladkharchenko.spring.mvc_hibernate_aop.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void saveUser(User user) {
       Session session =  sessionFactory.getCurrentSession();
            session.saveOrUpdate(user);
    }

    @Override
    public List<User> giveAllUsers() {
        Session session =  sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User",User.class).getResultList();
        return users;
    }
}
