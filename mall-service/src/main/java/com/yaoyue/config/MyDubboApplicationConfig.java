package com.yaoyue.config;

import com.alibaba.dubbo.config.*;
import com.yaoyue.service.UserService;
import com.yaoyue.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王东旭
 * @createTime 2022/2/27 11:43
 * @description 自定义dubbo配置
 */
@Configuration
public class MyDubboApplicationConfig {

    @Bean
    public UserService userService() {
        UserService userService = new UserServiceImpl();
        return userService;
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("mall-provider");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://106.14.19.0:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(21881);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig<UserService> userServiceConfig(UserService userService) {
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setTimeout(100000);
        serviceConfig.setVersion("*");

        // 配置每一个Method信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("");
        methodConfig.setTimeout(1000);

        // 将method添加到serviceConfig中
        List<MethodConfig> list = new ArrayList<>();
        list.add(methodConfig);
        serviceConfig.setMethods(list);
        return serviceConfig;
    }
}
