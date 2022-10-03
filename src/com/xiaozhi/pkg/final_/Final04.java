package com.xiaozhi.pkg.final_;

public class Final04 {
  public static void main(String[] args) {
      D d = new D();
      d.show();
      d.cal();
  }
}

class C {
  //如果类不是final类
  //但含有final方法
  //则方法不能重写但是可以被继承
  final public void  cal() {
      System.out.println("final的方法执行了cal");
  }
}

class D extends C{
  public void show() {
    System.out.println("class D is show");
  }
}
