package com.xiaozhi.pkg.inner;

public class Inner01 {
  public static void main(String[] args) {
    Outer outer = new Outer(12);
    outer.m1();
  }
}

class Outer{
  private int n1;
  Outer(int n1) {
    this.n1 = n1;
  }
  private void  m2() {
    System.out.println("m2");
  }

  public void  m1() {
    class Inner{
      private int n1;
      public  void  f1() {
        System.out.println("n1="+Outer.this.n1);
      }
    }
    Inner inner = new Inner();
    inner.f1();
  }
}


