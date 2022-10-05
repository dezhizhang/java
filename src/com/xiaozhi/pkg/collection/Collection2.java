package com.xiaozhi.pkg.collection;


import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {
  public static void main(String[] args) {
    Collection col = new ArrayList();
    col.add(new Book("三国演义", "罗轴中", 10.1));
    col.add(new Book("小李飞刀", "古龙", 5.1));
    col.add(new Book("红楼梦", "蓝雪匠", 34.6));

    Iterator iterator = col.iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println(next);
    }
  }
}


class Book {
  private String name;
  private String author;
  private double price;

  public Book(String name, String author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  @Override
  public String toString() {
    return "书名：" + this.name + "作者：" + this.author + "价格:" + this.price;
  }
}
