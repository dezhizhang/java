package com.xiaozhi.pkg.generic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Generic08 {
  public static void main(String[] args) {
    List<Object> list1 = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    List<AA> list3 = new LinkedList<>();
    List<BB> list4 = new LinkedList<>();
    List<CC> list5 = new LinkedList<>();

    print1(list1);
    print1(list2);
    print1(list3);
    print1(list4);
    print1(list5);

    print2(list3);
    print2(list4);
    print2(list5);

    print3(list1);
    print3(list3);

  }

  public static void print1(List<?> c) {
    for (Object object:c) {
      System.out.println(object);
    }
  }

  public static void print2(List<? extends AA> c) {
    for (Object object:c) {
      System.out.println(object);
    }
  }

  public static void print3(List<? super AA> c) {
    for (Object object:c) {
      System.out.println(object);
    }
  }
}

class AA{

}

class BB extends  AA{

}

class CC extends BB {

}
