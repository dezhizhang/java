package com.spring.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AnimalAspect {
  @Before(value = "execution(public float com.spring.aop1.Dog.*(..))")
  public void showBeginLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法执行前-方法名" + signature.getName() + Arrays.asList(joinPoint.getArgs()));
  }

  // 返回通知
  @AfterReturning(value = "execution(public float com.spring.aop1.Dog.*(..))",returning = "result")
  public void showSuccessEndLog(JoinPoint joinPoint,Object result) {
    Signature signature = joinPoint.getSignature();
    System.out.println("返回结果" + result);
  }

  @AfterThrowing(value = "execution(public float com.spring.aop1.Dog.*(..))",throwing = "throwing")
  public void showExceptLog(JoinPoint joinPoint,Throwable throwing) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法出现异常" + throwing);
  }

  // 最终通知
  @After(value = "execution(public float  com.spring.aop1.Dog.*(..))")
  public void showFinallyEndLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("最终通知");
  }

}
