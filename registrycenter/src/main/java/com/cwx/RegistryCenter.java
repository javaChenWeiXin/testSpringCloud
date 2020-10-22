package com.cwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName RegistryCenter
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/20 17:03
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistryCenter {
    public static void main(String[] args) {
        SpringApplication.run(RegistryCenter.class,args);
    }
}
