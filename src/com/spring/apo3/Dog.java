package com.spring.apo3;


public class Dog implements Animal {
  @Override
  public float getSub(float i, float j) {
    float result = i - j;
    return result;
  }

  @Override
  public float getSum(float i, float j) {
    float result = i + j;
    return result;
  }
}
