package com.spring.proxy;

public class Car implements Vehicle {
  @Override
  public void run() {
    System.out.println("交通工具开始运行了...");
    System.out.println("小汽车....");
    System.out.println("交通工具停止....");
  }
}
