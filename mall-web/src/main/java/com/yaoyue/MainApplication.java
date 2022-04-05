package com.yaoyue;

import com.yaoyue.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author 王东旭
 * @CreateTime 2022/2/26 23:50
 * @Description 
 */
public class MainApplication {

    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        UserController userController = context.getBean(UserController.class);

        userController.initOrder("1");
        System.in.read();
    }
}
