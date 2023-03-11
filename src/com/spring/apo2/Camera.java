package com.spring.apo2;

import org.springframework.stereotype.Component;

@Component
public class Camera implements Usb {
  @Override
  public void work() {
    System.out.println("相机在工作");
  }
}
