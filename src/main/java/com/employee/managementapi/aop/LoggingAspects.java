package com.employee.managementapi.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ロギングAOP
 */
@Slf4j
@Aspect
@Component
public class LoggingAspects {
    /**
     * 実行時前処理
     * 
     * @param joinPoint
     */
    @Before("execution(* *..*.*Controller.*(..))")
    public void controllerStartLog(JoinPoint joinPoint) {
        String string = joinPoint.toString();
        String args = Arrays.toString(joinPoint.getArgs());

        log.info("Start {}, args: {}", string, args);
    }

    /**
     * 正常成功時処理
     * 
     * @param joinPoint
     */
    @AfterReturning("execution(* *..*.*Controller.*(..))")
    public void controllerEndLog(JoinPoint joinPoint) {
        String string = joinPoint.toString();
        String args = Arrays.toString(joinPoint.getArgs());

        log.info("End {}, args: {}", string, args);
    }

    /**
     * 異常時処理
     * 
     * @param joinPoint
     * @param e         エラー内容
     */
    @AfterThrowing(value = ("execution(* *..*.*Controller.*(..))"), throwing = "e")
    public void afterException(JoinPoint joinPoint, Exception e) {
        String string = joinPoint.toString();
        String args = Arrays.toString(joinPoint.getArgs());

        log.error("Error!, Exception: {}, {}, args = {}", e.getMessage(), string, args);
    }
}
