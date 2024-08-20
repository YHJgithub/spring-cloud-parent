package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.entities.User;
import com.atguigu.cloud.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

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
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return userService.getById(userId);
    }

    /**
     * 用户微服务发起跨服务调用订单微服务，按照订单流水查询订单信息
     * http://localhost:10100/user/consumer/1
     *
     * @param orderId
     * @return
     */
    @GetMapping(value = "/user/consumer/{orderId}")
    public Order getOrderByOrderId(@PathVariable("orderId") Long orderId) {
        return userService.getOrderByOrderId(orderId);
    }

}
