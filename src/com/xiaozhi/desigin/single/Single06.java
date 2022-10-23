package com.xiaozhi.desigin.single;

public class Single06 {
  public static void main(String[] args) {
    SingleTon06 singleTon06 = SingleTon06.getInstance();
    SingleTon06 singleTon07 = SingleTon06.getInstance();
    System.out.println(singleTon07 == singleTon06);
  }
}

class SingleTon06{
  private static volatile  SingleTon06 instance;

  private  SingleTon06() {

  }
  private static class SingleTon06Instance{
    private static final SingleTon06 INSTANCE = new SingleTon06();
  }
  public static synchronized  SingleTon06 getInstance() {
    return SingleTon06Instance.INSTANCE;
  }
}


