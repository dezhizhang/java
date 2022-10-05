package com.xiaozhi.pkg.list;

import java.util.ArrayList;
import java.util.List;

public class List3 {
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add(new Book("红楼梦", 88.0, "曹雪芹"));
    list.add(new Book("三国演义", 44.00, "罗贯中"));
    list.add(new Book("水浒传", 100.00, "水浒传"));
    list.add(new Book("西游记", 90.00, "吴承恩"));
    sort(list);

    for(Object o:list) {
      System.out.println(o);
    }


  }

  public static void sort(List list) {
    for (int i = 0; i < list.size() - 1; i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        Book book = (Book) list.get(j);
        Book book1 = (Book) list.get(j + 1);
        if (book.getPrice() > book1.getPrice()) {
          list.set(j,book1);
          list.set(j + 1,book);
        }
      }
    }

  }
}

class Book {
  public String name;
  public double price;
  public String author;

  public Book(String name, double price, String author) {
    this.name = name;
    this.price = price;
    this.author = author;
  }

  public double getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "名称：" + this.name +"\t\t"+ "价格：" + this.price + "\t\t"+ "作者：" + this.author;
  }
}


