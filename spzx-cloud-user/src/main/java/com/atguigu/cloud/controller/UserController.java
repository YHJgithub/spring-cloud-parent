package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.User;
import com.atguigu.cloud.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class UserController {
    
    @Value("${server.port}")
    private String port;

    @Resource
    private UserService userService;

    @PostMapping(value = "/user/add")
    public boolean addUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(value = "/user/get/{userId}")
    public User findUserByUserId(@PathVariable(value = "userId") Long userId) {
        System.out.println("********User Module port: " + port);

        return userService.getById(userId);
    }

}
