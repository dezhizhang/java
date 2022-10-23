package com.xiaozhi.desigin.single;

public class Single03 {
  public static void main(String[] args) {
    SingleTon03 singleTon03 = SingleTon03.getInstance();
    SingleTon03 singleTon04 = SingleTon03.getInstance();
    System.out.println(singleTon04 == singleTon03);
  }
}

class SingleTon03{
  private static SingleTon03 instance;

  private  SingleTon03() {

  }
  public   static SingleTon03 getInstance() {
    if(instance == null) {
      instance = new SingleTon03();
    }
    return instance;
  }
}


