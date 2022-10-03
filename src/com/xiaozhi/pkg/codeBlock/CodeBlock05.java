package com.xiaozhi.pkg.codeBlock;


public class CodeBlock05 {
  public static void main(String[] args) {
    A a = new A(); //1.B静态代码初始化2.B静态代码块3.A静态属性初始化
    // 4A普通代码执行5.B普通属性初始化6.A普通属性初始化7B的无参构造器8.A的无参构造器执行

  }
}

class B {
  public static int n1 = getN1();

  static {
    System.out.println("B静态代码块");
  }

  public int n2 = getN2();

  B() {
    System.out.println("B的无参构造器");
  }

  public static int getN1() {
    System.out.println("B静态代码初始化");
    return 10;
  }

  public int getN2() {
    System.out.println("B普通属性初始化");
    return 20;
  }
}

class A extends B {
  static {
    System.out.println("A代码执行");
  }

  public static int n1 = getN1();
  public int n2 = getN2();

  public static int getN1() {
    System.out.println("A静态属性初始化");
    return 10;
  }

  public int getN2() {
    System.out.println("A普通属性初始化");
    return 20;
  }

  {
    System.out.println("A普通代码执行");
  }

  A() {
    System.out.println("A的无参构造器执行");
  }

}


