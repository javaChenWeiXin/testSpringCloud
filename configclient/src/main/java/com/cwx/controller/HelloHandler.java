package com.cwx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloHandler
 * @Description TODO
 * @author:chenweixin
 * @Date:2020/10/22 15:41
 */
@RestController
@RequestMapping("/config")
public class HelloHandler {

    @Value("${server.port}")
    private int port;

    @RequestMapping(value = "/index")
    public String index(){
        return "当前端口："+this.port;
    }
}
