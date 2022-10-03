package com.xiaozhi.pkg.final_;

public class Final03 {
  public static void main(String[] args) {
    BB bb = new BB();
    bb.show();

  }
}

class BB{
  //如果final修饰的属性是静态的，
  //则初始化的位置是定义时和静态代码块不能在构造器中赋值
  public static final double TAX_RATE;

  static {
    TAX_RATE = 0.2;
  }

  public void  show() {
    System.out.println(BB.TAX_RATE);
  }
}
