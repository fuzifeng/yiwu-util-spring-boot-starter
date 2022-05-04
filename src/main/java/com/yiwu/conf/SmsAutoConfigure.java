/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.conf;

import com.yiwu.prop.SmsProperties;
import com.yiwu.utils.impl.SmsServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Author fuzf
 * @Date 2022/5/4:15:13
 * @Description:
 */
@Configuration
/**
 * //使@ConfigurationProperties注解生效。如果只配置@ConfigurationProperties注解，
 * 在IOC容器中是获取不到properties配置文件转化的bean的
 */
@EnableConfigurationProperties({SmsProperties.class})
public class SmsAutoConfigure {

    @Resource
    private SmsProperties smsProperties;

    @Bean
    public SmsServiceImpl smsService() {
        return new SmsServiceImpl(smsProperties.getAccessId(), smsProperties.getAccessSecret());
    }

}
