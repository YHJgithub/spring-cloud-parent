package com.atguigu.cloud.controller;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.entities.User;
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
    public Order findOrderByOrderId(@PathVariable("orderId") Long orderId) {
        System.out.println("----Order Module port: " + port);
        Order retValue = orderService.getById(orderId);
        retValue.setExtrainfo(retValue.getExtrainfo() + " \t 服务端口:" + port);
        return retValue;
    }

    /**
     * 查看订单拥有者信息
     *
     * @param orderId
     * @return
     */
    @GetMapping(value = "/order/owner/{orderId}")
    public User findOrderOwner(@PathVariable("orderId") Long orderId) {
        return orderService.findOrderOwner(orderId);
    }
}
