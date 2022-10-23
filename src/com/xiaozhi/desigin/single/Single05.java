package com.xiaozhi.desigin.single;

public class Single05 {
  public static void main(String[] args) {
    SingleTon05 instance = SingleTon05.getInstance();
    SingleTon05 instance1 = SingleTon05.getInstance();
    System.out.println(instance == instance1);


  }
}

class SingleTon05 {
  private static volatile SingleTon05 instance;

  private SingleTon05() {

  }

  public static synchronized SingleTon05 getInstance() {
    if (instance == null) {
      synchronized (SingleTon05.class) {
        if (instance == null) {
          instance = new SingleTon05();
        }
      }
    }
    return instance;
  }
}

