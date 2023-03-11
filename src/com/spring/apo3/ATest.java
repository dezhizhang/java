package com.spring.apo3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ATest {

  @Test
  public void testAopXml() {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans06.xml");
    Animal animal = ioc.getBean(Animal.class);

    animal.getSum(10,20);



  }
}
