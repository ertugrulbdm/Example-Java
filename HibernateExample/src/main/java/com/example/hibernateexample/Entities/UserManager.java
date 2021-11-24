package com.example.hibernateexample.Entities;


import com.example.hibernateexample.DataAccess.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class UserManager implements  IUser{

    private EntityManager entityManager;

    @Autowired
    public UserManager(EntityManager entityManager){
        this.entityManager=entityManager;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<User> users=session.createQuery("From User").getResultList();
        return users;
    }

    @Override
    public void add(User user) {
    Session session=entityManager.unwrap(Session.class);
    session.saveOrUpdate(user);
    }

    @Override
    public void delete(User user) {
        Session session=entityManager.unwrap(Session.class);
        User userGetId= session.get(User.class,user.getId());
        session.delete(userGetId);
    }

    @Override
    public void update(User user) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }
}
