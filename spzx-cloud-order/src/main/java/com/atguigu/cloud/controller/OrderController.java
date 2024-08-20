package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.service.OrderService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class OrderController {
    @Value("${server.port}")
    private String port;

    @Resource
    private OrderService orderService;

    @PostMapping(value = "/order/add")
    public boolean addOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping(value = "/order/get/{orderId}")
    public Order findUserByOrderId(@PathVariable(value = "orderId") Long orderId) {
        System.out.println("********Order Module port: " + port);

        return orderService.getById(orderId);
    }
}
