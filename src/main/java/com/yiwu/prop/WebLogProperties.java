/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.prop;/**
 * @Author fuzf
 * @Date 2022/5/4:16:05
 * @Description:
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * todo 写下 你的注释
 *
 * @author
 * @version 1.0.0
 * @createdAt 2022/5/4 16:05 
 * @updatedAt 2022/5/4 16:05
 */
@ConfigurationProperties("yiwu.weblog")
public class WebLogProperties implements Serializable {

    private Boolean enable;

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
