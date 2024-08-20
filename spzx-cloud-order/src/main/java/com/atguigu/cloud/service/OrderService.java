package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.entities.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 64956
 * @description 针对表【t_order】的数据库操作Service
 * @createDate 2024-08-20 20:22:16
 */
public interface OrderService extends IService<Order> {
    User findOrderOwner(Long orderId);
}
