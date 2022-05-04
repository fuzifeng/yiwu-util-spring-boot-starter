/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.utils.impl;

import com.yiwu.utils.SmsService;

/**
 * @Author fuzf
 * @Date 2022/5/4:15:10
 * @Description:
 */

public class SmsServiceImpl implements SmsService {
    private String accessId;
    private String accessSecret;

    public SmsServiceImpl(String accessId, String accessSecret) {
        this.accessId = accessId;
        this.accessSecret = accessSecret;
    }

    @Override
    public void sendSms(String phone, String sign, String templateCode, String date) {
        System.out.println("接受短信系统，accessId=" + accessId + ",accessSecret=" + accessSecret);
        System.out.println("发送短信信息给用户+" + phone + ",内容是:" + sign + "," + templateCode + "," + date);
    }
}
