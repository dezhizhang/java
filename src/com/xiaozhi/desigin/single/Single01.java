package com.xiaozhi.desigin.single;

public class Single01 {
  public static void main(String[] args) {

    SingleTon singleTon = SingleTon.getInstance();
    SingleTon singleTon1 = SingleTon.getInstance();

    System.out.println(singleTon1 == singleTon);
  }
}


class SingleTon{
  private SingleTon() {

  }
  private final static SingleTon instance = new SingleTon();

  public static SingleTon getInstance() {
    return instance;
  }
}


