package com.example.hibernateexample.Entities;

import com.example.hibernateexample.DataAccess.User;

import java.util.List;

public interface IUser {
    List<User> getAll();
    void add(User user);
    void delete(User user);
    void update(User user);
}
