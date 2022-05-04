/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.conf;

import com.yiwu.utils.ArrayUtilsInterface;
import com.yiwu.utils.impl.ArrayUtilsInterfaceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author fuzf
 * @Date 2022/5/4:14:31
 * @Description:
 */
//@Configuration
//@ConditionalOnClass(value = {ArrayUtilsInterface.class, ArrayUtilsInterfaceImpl.class})
public class ArrayUtilsInterfaceAutoConfigure {

//    @Bean
//    @ConditionalOnMissingBean
    ArrayUtilsInterface arrayUtilsInterface() {
        return new ArrayUtilsInterfaceImpl();
    }
}
