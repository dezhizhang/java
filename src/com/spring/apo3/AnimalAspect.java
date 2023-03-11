package com.spring.apo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class AnimalAspect {

  // 定义一个切入点表过式
  public void showBeginLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法执行前-方法名" + signature.getName() + Arrays.asList(joinPoint.getArgs()));
  }

  public void showSuccessEndLog(JoinPoint joinPoint,Object result) {
    Signature signature = joinPoint.getSignature();
    System.out.println("返回结果" + result);
  }

  public void showExceptLog(JoinPoint joinPoint,Throwable throwing) {
    Signature signature = joinPoint.getSignature();
    System.out.println("方法出现异常" + throwing);
  }

  public void showFinallyEndLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("最终通知");
  }

}
