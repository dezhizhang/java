package com.xiaozhi.desigin.single;

public class Single04 {
  public static void main(String[] args) {
    SingleTon04 singleTon04 = SingleTon04.getInstance();
    SingleTon04 singleTon05 = SingleTon04.getInstance();
    System.out.println(singleTon04 == singleTon05);
  }
}

class SingleTon04 {
  private static SingleTon04 instance;

  private SingleTon04() {

  }

  public static synchronized SingleTon04 getInstance() {
    if (instance == null) {
      instance = new SingleTon04();
    }
    return instance;
  }
}
