package com.yaoyue.service.impl;

import com.yaoyue.bean.UserAddress;
import com.yaoyue.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 王东旭
 * @CreateTime 2022/2/26 18:42
 * @Description 用户接口
 */
public class UserServiceImpl2 implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....new...");

        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return Arrays.asList(address1,address2);
    }

}
