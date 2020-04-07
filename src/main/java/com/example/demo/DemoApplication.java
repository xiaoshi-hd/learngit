package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注一个主程序类，说明这是一个springboot应用
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //springboot启动起来
        SpringApplication.run(DemoApplication.class, args);
    }
}
