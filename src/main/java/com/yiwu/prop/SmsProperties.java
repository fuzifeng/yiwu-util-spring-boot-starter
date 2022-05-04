/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @Author fuzf
 * @Date 2022/5/4:15:06
 * @Description:
 */

@ConfigurationProperties("yiwu.sms")
public class SmsProperties implements Serializable {

    private String accessId;
    private String accessSecret;

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }
}
