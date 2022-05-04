/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.utils;

import java.util.List;

/**
 * @Author fuzf
 * @Date 2022/5/4:14:22
 * @Description:
 */

public interface ArrayUtilsInterface {

    /**
     * 字符串转化list
     * @param value
     * @param splitChar
     * @return
     */
    List<?> transList(String value, char splitChar);

}
