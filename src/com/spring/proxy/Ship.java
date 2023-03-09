package com.spring.proxy;

public class Ship implements Vehicle{
  @Override
  public void run() {
    System.out.println("大轮船....");
  }
}
