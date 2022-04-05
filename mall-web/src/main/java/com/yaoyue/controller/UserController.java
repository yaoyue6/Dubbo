package com.yaoyue.controller;

import com.yaoyue.bean.UserAddress;
import com.yaoyue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author 王东旭
 * @CreateTime 2022/2/26 23:25
 * @Description 
 */
public class UserController {

    @Autowired
    UserService userService;
    
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);

        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
