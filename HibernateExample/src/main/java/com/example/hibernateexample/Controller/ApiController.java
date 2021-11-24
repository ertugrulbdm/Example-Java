package com.example.hibernateexample.Controller;

import com.example.hibernateexample.DataAccess.User;
import com.example.hibernateexample.Entities.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private UserManager userManager;

    @Autowired
    public ApiController(UserManager userManager){
        this.userManager=userManager;
    }

    @GetMapping("/list")
    public List<User> list(){
    return this.userManager.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody User user){
        this.userManager.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        this.userManager.update(user);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody User user){
        this.userManager.delete(user);
    }
}
