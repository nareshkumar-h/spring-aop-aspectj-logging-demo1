package com.naresh.aspects;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {


    @Before("execution(* *.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log Method - " + joinPoint.getSignature().getName() + ",arguments:" + Arrays.toString(joinPoint.getArgs()));
    }

}
