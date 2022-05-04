/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.utils.impl;

import com.yiwu.utils.ArrayUtilsInterface;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author fuzf
 * @Date 2022/5/4:14:27
 * @Description:
 */

public class ArrayUtilsInterfaceImpl implements ArrayUtilsInterface {

    @Override
    public List<?> transList(String value, char splitChar) {
        return Stream.of(value.split(splitChar + "")).collect(Collectors.toList());
    }
}
