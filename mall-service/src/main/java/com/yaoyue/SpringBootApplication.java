package com.yaoyue;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author 王东旭
 * @CreateTime 2022/2/27 11:33
 * @Description 启动类
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@ImportResource(locations = "classpath:provider.xml")
public class SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class);
        System.out.println(123);
    }
}
