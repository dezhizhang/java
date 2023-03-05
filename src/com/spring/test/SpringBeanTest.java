package com.spring.test;

import com.spring.bean.Monster;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class SpringBeanTest {

  @Test
  public void  getMonster() {
//    ApplicationContext ico = new ClassPathXmlApplicationContext("beans.xml");
//
//    Monster monster01 = ico.getBean("monster01",Monster.class);
//    System.out.println(monster01);

    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

    Monster monster01 = ioc.getBean("monster01",Monster.class);

    System.out.println(monster01);

  }

  //类加载路径
  @Test
  public void  classPath() {
    File file = new File(this.getClass().getResource("/").getPath());
    System.out.println("file=" + file);

  }
}
