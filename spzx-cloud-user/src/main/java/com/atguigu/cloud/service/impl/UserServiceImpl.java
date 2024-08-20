package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.entities.User;
import com.atguigu.cloud.mapper.UserMapper;
import com.atguigu.cloud.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 64956
 * @description 针对表【t_user】的数据库操作Service实现
 * @createDate 2024-08-20 19:45:16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    public static final String ORDER_INVOKE_URL = "http://spzx-cloud-order/order/get/";// 服务注册中心上的微服务名称
    
    @Resource
    private RestTemplate restTemplate;

    @Override
    public Order getOrderByOrderId(Long orderId) {
        // 发起远程调用，用户调用订单
        return restTemplate.getForObject(ORDER_INVOKE_URL + orderId, Order.class);
    }

}




