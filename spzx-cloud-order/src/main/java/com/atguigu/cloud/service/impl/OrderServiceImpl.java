package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.apis.UserFeignClient;
import com.atguigu.cloud.entities.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.service.OrderService;
import com.atguigu.cloud.mapper.OrderMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 64956
 * @description 针对表【t_order】的数据库操作Service实现
 * @createDate 2024-08-20 20:22:16
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
        implements OrderService {

    // V1.0版，故意先写死地址
    // public static final String USER_INVOKE_URL = "http://localhost:10100/user/get/";

    // V2.0版，Nacos注册中心上的微服务名称
    public static final String USER_INVOKE_URL = "http://spzx-cloud-user/user/get/";


    @Resource
    private OrderMapper orderMapper;

    @Resource // 注入RestTemplate远程调用工具
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    /**
     * http://localhost:10200/order/getowner/1
     *
     * @param orderId
     * @return
     */
    /* @Override
    public User findOrderOwner(Long orderId) {
        // 根据id查询订单数据
        Order order = orderMapper.selectById(orderId);
        // 发起远程调用
        User user = restTemplate.getForObject(USER_INVOKE_URL + order.getUserid(), User.class);
        user.setExtrainfo("订单微服务发起调用，查看本订单属于谁: " + user.getId() + "\t" + user.getUsername());
        return user;
    } */

    @Resource
    private UserFeignClient userFeignClient;

    @Override
    public User findOrderOwner(Long orderId) {
        // 根据id查询订单数据
        Order order = orderMapper.selectById(orderId);

        // 发起远程调用
        User user = userFeignClient.findUserByUserId(order.getUserid());

        return user;
    }

}




