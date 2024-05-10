package com.example.mycrudaprel.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Aspect
@Component
public class LogAspect {
    @Before(value = "execution(* com.example.mycrudaprel.controller.CommentController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        log.info("Called this method  - " + joinPoint.getSignature().getName() + " " + new Date());
    }

    @After(value = "execution(* com.example.mycrudaprel.controller.CommentController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        log.info("Called this method  - " + joinPoint.getSignature().getName() + " " + new Date());
    }
}
