package com.spring.apo2;

import org.springframework.stereotype.Component;

@Component
public class Phone implements Usb {
  @Override
  public void work() {
    System.out.println("手机开始工作了");
  }
}
