package com.dream.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 本服务启动后会自动注册进eureka服务中
 * 服务发现
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(value = "com.dream.cloud.provider_dept_8002.mapper")
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class, args);
    }
}
