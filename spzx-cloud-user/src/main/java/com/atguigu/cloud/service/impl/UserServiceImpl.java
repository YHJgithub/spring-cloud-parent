package com.atguigu.cloud.service.impl;

import com.atguigu.cloud.entities.User;
import com.atguigu.cloud.mapper.UserMapper;
import com.atguigu.cloud.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author 64956
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2024-08-20 19:45:16
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




