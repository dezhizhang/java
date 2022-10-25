package com.xiaozhi.adapter;

public class Phone {
  public void charging(IVoltage5v iVoltage5v) {
    if (iVoltage5v.output5v() == 5) {
      System.out.println("电压为5v开始充电");
    } else if (iVoltage5v.output5v() > 5) {
      System.out.println("电压过高");
    }
  }
}
