package com.spring.test;

import com.spring.bean.Monster;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {

  @Test
  public void  getMonster() {
    ApplicationContext ico = new ClassPathXmlApplicationContext("beans.xml");

    Monster monster01 = (Monster) ico.getBean("monster01");
    System.out.println(monster01);

  }
}
