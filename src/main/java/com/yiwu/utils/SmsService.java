/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.utils;

/**
 * @Author fuzf
 * @Date 2022/5/4:15:08
 * @Description:
 */

public interface SmsService {

    /**
     * 发送短信
     * @param phone
     * @param sign
     * @param templateCode
     * @param date
     */
    void sendSms(String phone, String sign, String templateCode, String date);
}
