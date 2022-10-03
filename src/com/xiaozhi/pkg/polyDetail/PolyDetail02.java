package com.xiaozhi.pkg.polyDetail;

public class PolyDetail02 {
  public static void main(String[] args) {
    // 属性没有重写之说：属性直接看编译类型

    Base base = new Sub();
    System.out.println(base.count);
  }
}


class Base{
  int count = 10;
}

class Sub extends Base {
  int count = 20;
}
