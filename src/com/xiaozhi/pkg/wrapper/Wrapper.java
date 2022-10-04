package com.xiaozhi.pkg.wrapper;

public class Wrapper {
  public static void main(String[] args) {
    //手动装箱
//    int n1 = 100;
//    Integer integer = new Integer(n1);
//    Integer integer1 = Integer.valueOf(n1);
//
//    System.out.println(integer);
//    System.out.println(integer1);
//
//    // 手动拆箱
//    int i = integer.intValue();
//    System.out.println(i);

    int n2 = 100;
    Integer integer = n2;
    System.out.println(integer);


    int n3 = integer;
    System.out.println(n3);
  }
}
