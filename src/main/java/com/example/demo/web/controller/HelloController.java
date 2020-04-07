package com.example.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 处理http请求
 */
//这个类的所有方法都返回给浏览器（如果是对象转换为json）
@RestController //就是@Controller +@responseBody的合体
public class HelloController {
    //配置url映射，接收来自浏览器的hello请求
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello,SpringBoot";
    }
}
