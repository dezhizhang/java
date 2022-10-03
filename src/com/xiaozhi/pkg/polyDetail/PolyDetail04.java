package com.xiaozhi.pkg.polyDetail;

public class PolyDetail04 {
  public static void main(String[] args) {
    Sub1 sub1 = new Sub1();
    System.out.println(sub1.count);
    sub1.display();

    Base1 base1 = sub1;
    System.out.println(sub1 == base1);
    System.out.println(base1.count);
    base1.display();
  }
}


class Base1{
  int count = 10;
  public void display() {
    System.out.println(this.count);
  }
}

class Sub1 extends Base1 {
  int count = 20;
  public void display() {
    System.out.println(this.count);
  }
}
