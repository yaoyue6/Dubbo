package com.yaoyue.service;

import com.yaoyue.bean.UserAddress;

import java.util.List;

/**
 * @Author 王东旭
 * @createTime 2022/2/26 18:38
 * @description
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
