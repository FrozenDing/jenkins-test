package com.csu.jenkinstest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:dingrui
 * @date: 2022-08-06 03:50
 * interface：/yuqing/chat/list
 * 标题：在线会话框根据用户名或uuid查找全部对话
 */

@RestController
public class helloController {

    @GetMapping("/hello")
    public String hello(){
        String a = "hello";
        return a;
    }

}
