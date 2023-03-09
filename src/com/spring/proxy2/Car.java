package com.spring.proxy2;

public class Car implements Vehicle {
  @Override
  public void run() {
    System.out.println("小汽车在运行。。。");
  }
}
