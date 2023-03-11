package com.spring.proxy3;

public class Dog implements Animal {
  @Override
  public float getSum(float i, float j) {
    System.out.println("方法名getSum");
    float result = i + j;
    System.out.println("结果" + result);
    return  result;
  }

  @Override
  public float getSub(float i, float j) {
    System.out.println("方法名getSub");
    float result = i - j;
    System.out.println("结果" + result);
    return  result;
  }
}
