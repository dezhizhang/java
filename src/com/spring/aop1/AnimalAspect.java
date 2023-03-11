package com.spring.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AnimalAspect {

  // 定义一个切入点表过式
  @Pointcut(value = "execution(public float com.spring.aop1.Dog.*(..))")
  public void  myPointCut() {

  }




  @Before(value = "myPointCut()")
  public void showBeginLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法执行前-方法名" + signature.getName() + Arrays.asList(joinPoint.getArgs()));
  }

  // 返回通知
  @AfterReturning(value = "myPointCut()",returning = "result")
  public void showSuccessEndLog(JoinPoint joinPoint,Object result) {
    Signature signature = joinPoint.getSignature();
    System.out.println("返回结果" + result);
  }

  @AfterThrowing(value = "myPointCut()",throwing = "throwing")
  public void showExceptLog(JoinPoint joinPoint,Throwable throwing) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法出现异常" + throwing);
  }

  // 最终通知
  @After(value = "myPointCut()")
  public void showFinallyEndLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("最终通知");
  }

}
