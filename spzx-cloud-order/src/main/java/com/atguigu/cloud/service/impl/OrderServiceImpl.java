package com.atguigu.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.cloud.entities.Order;
import com.atguigu.cloud.service.OrderService;
import com.atguigu.cloud.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author 64956
* @description 针对表【t_order】的数据库操作Service实现
* @createDate 2024-08-20 20:22:16
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




