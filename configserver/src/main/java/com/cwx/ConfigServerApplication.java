package com.cwx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServerApplication
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/22 15:36
 */
@SpringBootApplication
@EnableConfigServer  //声明配置中心
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
