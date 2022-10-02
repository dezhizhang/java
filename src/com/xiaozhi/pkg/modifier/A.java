package com.xiaozhi.pkg.modifier;

public class A {
  public int n1= 100;
  protected int n2 = 200;
  int n3 = 300;
  private int n4 = 400;

  public void show() {
    System.out.println("n1=" + n1 + "\n" + "n2=" + n2 + "\n" + "n3=\n" + n3+"n4=\n"+n4);
  }
}
