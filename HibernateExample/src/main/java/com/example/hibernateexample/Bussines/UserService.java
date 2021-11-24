package com.example.hibernateexample.Bussines;


import com.example.hibernateexample.DataAccess.User;
import com.example.hibernateexample.Entities.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserService implements IControllerDao {

    private UserManager userManager;

    @Autowired
    public UserService(UserManager userManager){
        this.userManager=userManager;
    }


    @Override
    public List<User> getAll() {
        return this.userManager.getAll();
    }

    @Override
    public void add(User user) {
        this.userManager.add(user);
    }

    @Override
    public void delete(User user) {
    this.userManager.delete(user);
    }

    @Override
    public void update(User user) {
    this.userManager.update(user);
    }
}
