package com.spring.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AnimalAspect {
  @Before(value = "execution(public float com.spring.aop1.Dog.getSum(float, float))")
  public void f1(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法执行前-方法名" + signature.getName() + Arrays.asList(joinPoint.getArgs()));
  }

  // 返回通知
  @AfterReturning(value = "execution(public float com.spring.aop1.Dog.getSum(float,float))")
  public void f2(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("返回结果" + signature.getDeclaringTypeName());
  }

  @AfterThrowing(value = "execution(public float com.spring.aop1.Dog.getSum(float,float))")
  public void f3(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法出现异常" + signature.getDeclaringType());
  }

  // 最终通知
  @After(value = "execution(public float  com.spring.aop1.Dog.getSum(float,float))")
  public void f4(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("最终通知");
  }
}
