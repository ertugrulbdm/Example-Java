package com.example.hibernateexample.Bussines;

import com.example.hibernateexample.DataAccess.User;

import java.util.List;

public interface IControllerDao {
    List<User> getAll();
    void add(User user);
    void delete(User user);
    void update(User user);
}
