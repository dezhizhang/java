package com.xiaozhi.pkg.object;

public class Finalize {
  public static void main(String[] args) {
    Car car = new Car("小汽车");
    car = null;

  }
}

class Car{
  private String name;
  public Car(String name) {
    this.name = name;
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }
}


