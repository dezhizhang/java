package com.xiaozhi.pkg.inner;

public class Inner02 {
  public static void main(String[] args) {
    Outer01 outer01 = new Outer01();
    outer01.method();
  }
}

class Outer01{
  public void method() {
    IA tiger = new IA() {
      @Override
      public void cay() {
        System.out.println("老虎在叫....");
      }
    };
  }
}

interface IA {
  void cay();
}

