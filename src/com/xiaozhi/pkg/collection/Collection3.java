package com.xiaozhi.pkg.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
  public static void main(String[] args) {
    Collection col = new ArrayList();
    col.add(new Book("三国演义", "罗轴中", 10.1));
    col.add(new Book("小李飞刀", "古龙", 5.1));
    col.add(new Book("红楼梦", "蓝雪匠", 34.6));

    for(Object book:col) {
      System.out.println(book);
    }
  }
}
