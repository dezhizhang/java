package com.spring.apo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class InjectAspect {
  @Before(value = "execution(void Phone.work())")
  public void showBeginLog(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("前置方法" + signature.getName());
  }

  @Before(value = "execution(void Car.run())")
  public void showBeginLog1(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    System.out.println("执行方法" + signature.getName());
    System.out.println("类名" + signature.getDeclaringTypeName());
    System.out.println("修饰类型" + signature.getModifiers());

    System.out.println("前置方法" + signature.getName());
  }

}
