package com.spring.apo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApoTest {


  @Test
  public void testAop() {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans05.xml");
    Usb phone = (Usb) ioc.getBean("phone");
    Usb camera = (Usb) ioc.getBean("camera");

    phone.work();
    camera.work();

  }
}
