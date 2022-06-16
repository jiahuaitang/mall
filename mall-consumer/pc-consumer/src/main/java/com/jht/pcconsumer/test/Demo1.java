package com.jht.pcconsumer.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Component
public class Demo1 {

    @Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public Object aroun(ProceedingJoinPoint point, RequestMapping requestMapping){
        String className = point.getClass().getName();
        String methodName = point.getSignature().getName();
        String[] value = requestMapping.value();
        String[] path = requestMapping.path();
        String str = "类"+className+"中"+methodName+"方法"+"运行的值为："+value[0];
        return str;
    }

}
