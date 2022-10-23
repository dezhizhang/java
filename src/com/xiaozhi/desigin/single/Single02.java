package com.xiaozhi.desigin.single;

public class Single02 {
  public static void main(String[] args) {
    SingleTon02 singleTon02 = SingleTon02.getInstance();
    SingleTon02 singleTon03 = SingleTon02.getInstance();

    System.out.println(singleTon02 == singleTon03);
  }
}
class SingleTon02{
  private SingleTon02() {

  }
  private static SingleTon02 instance;

  static {
    instance = new SingleTon02();
  }
  public static SingleTon02 getInstance() {
    return instance;
  }
}
