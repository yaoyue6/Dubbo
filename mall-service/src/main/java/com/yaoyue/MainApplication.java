package com.yaoyue;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author 王东旭
 * @CreateTime 2022/2/26 18:43
 * @Description 生产者启动类
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println( "Hello World!" );
        System.in.read();
    }
}
