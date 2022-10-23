package com.xiaozhi.desigin.single;

public class Single07 {
  public static void main(String[] args) {
    SingleTon07 instance = SingleTon07.INSTANCE;
    SingleTon07 instance1 = SingleTon07.INSTANCE;

    instance1.sayOk();

    System.out.println(instance == instance1);
  }
}

enum SingleTon07{
  INSTANCE;
  public void sayOk() {
    System.out.println("ok");
  }
}
