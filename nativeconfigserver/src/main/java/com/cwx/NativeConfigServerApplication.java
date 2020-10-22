package com.cwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName NativeConfigServerApplication
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/22 9:11
 */
@SpringBootApplication   //声明该类是 Spring Boot 服务的入口
@EnableConfigServer  //声明配置中心
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
