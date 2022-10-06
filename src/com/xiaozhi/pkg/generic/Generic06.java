package com.xiaozhi.pkg.generic;

public class Generic06 {
  public static void main(String[] args) {
      Car car = new Car();
      car.run("hello",123);

  }
}


class Car<T,R>{

  public<T,R> void  run(T t, R r) {
  }

  public<T> void  hi(T t) {

  }
}
