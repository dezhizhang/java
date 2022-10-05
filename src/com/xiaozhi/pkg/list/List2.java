package com.xiaozhi.pkg.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List2 {
  public static void main(String[] args) {
    List list = new ArrayList();

    for(int i=0;i < 11;i++) {
      list.add("hello");
    }

    System.out.println(list);

    list.add(1,"韩顺平教育");

    String name = (String) (list.get(5));

    System.out.println(name);

    list.set(6,"world");

    Iterator integer =  list.iterator();
    while (integer.hasNext()) {
      Object next = integer.next();
      System.out.println(next);
    }

    for(Object name1:list) {
      System.out.println(name1);
    }

  }
}
