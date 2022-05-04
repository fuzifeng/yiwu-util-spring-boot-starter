/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.conf;

import com.yiwu.aop.WebLogAspect;
import com.yiwu.prop.WebLogProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author fuzf
 * @Date 2022/5/4:16:36
 * @Description:
 */

/**
 * 4.1.@ConditionalOnProperty(prefix = "zzcloud.weblog",value = "enabled", matchIfMissing = true)：
 * matchIfMissing属性：默认情况下matchIfMissing为false，也就是说如果未进行属性配置，则自动配置不生效。
 * 如果matchIfMissing为true，则表示如果没有对应的属性配置，则自动配置默认生效
 * 4.2.@ConditionalOnMissingBean：
 * 在@bean定义上，它的作用就是在容器加载它作用的bean时，检查容器中是否存在目标类型（
 * ConditionalOnMissingBean注解的value值）的bean了，如果存在这跳过原始bean的BeanDefinition加载动作。
 *
 * @author fuzf
 */
@Configuration
@EnableConfigurationProperties({WebLogProperties.class})
@ConditionalOnProperty(prefix = "yiwu.weblog", value = "enable", matchIfMissing = true)
public class WebLogAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    public WebLogAspect webLogAspect() {
        return new WebLogAspect();
    }

}
