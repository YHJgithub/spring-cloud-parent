package com.atguigu.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@MapperScan("com.atguigu.cloud.mapper") // import org.mybatis.spring.annotation.MapperScan;
@EnableFeignClients // 启用feign客户端,定义服务+绑定接口，以声明式的方法优雅而简单的实现服务调用
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
 
 
