package com.spring.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  @org.junit.jupiter.api.Test
  public void testAop() {
     ApplicationContext ioc = new ClassPathXmlApplicationContext("beans04.xml");
    Animal animal = ioc.getBean(Animal.class);

    Object result = animal.getSum(10,2);
    Object result1 = animal.getSub(10,2);

    System.out.println(result1);
    System.out.println(result);
//    System.out.println(animal.getClass());

  }
}
