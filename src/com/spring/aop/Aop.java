package com.spring.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Aop {
  public static void before(Method method, Object[] args) {
    System.out.println("方法执行前" + method.getName() + "参数" + Arrays.asList(args));
  }

  public static void after( Object result) {
    System.out.println("方法执行后结果" + result);
  }
}
