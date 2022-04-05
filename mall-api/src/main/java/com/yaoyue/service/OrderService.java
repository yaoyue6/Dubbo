package com.yaoyue.service;

import com.yaoyue.bean.UserAddress;

import java.util.List;

/**
 * @Author 王东旭
 * @createTime 2022/2/26 18:39
 * @description 订单服务
 */
public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     * @return
     */
     List<UserAddress> initOrder(String userId);
}
