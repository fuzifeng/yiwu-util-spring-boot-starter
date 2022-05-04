/*
 * Copyright (c) 2012, 2021, Wedon and/or its affiliates. All rights reserved.
 *
 */

package com.yiwu.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Author fuzf
 * @Date 2022/5/4:16:09
 * @Description:
 */
@Aspect
@Component
@Slf4j
public class WebLogAspect {

    @Pointcut("execution(* *..*Controller..*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint point) throws Throwable {
        ServletRequestAttributes requestAttributes =
                (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        log.info("开始服务:{}", request.getRequestURL().toString());
        log.info("客户端ip:{}", request.getRemoteAddr());
        log.info("参数值为:{}", Arrays.toString(point.getArgs()));
    }

    @AfterReturning(returning = "ret",pointcut = "webLog()")
    public void after(Object ret) throws Throwable{
        log.info("返回值:{}", ret);
    }

}
