package com.xiaozhi.pkg.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("jack");
    list.add("tom");
    list.add("mary");
    list.add("tom");

    for(int i=0;i < list.size();i++) {
      System.out.println(list.get(i));
    }

    list.set(1,"马力");
    System.out.println(list);

    System.out.println(list.lastIndexOf("tom"));

    List list1 = list.subList(1,3);
    System.out.println(list1);


  }
}
