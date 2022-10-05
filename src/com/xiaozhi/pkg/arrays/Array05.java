package com.xiaozhi.pkg.arrays;


import java.util.Arrays;
import java.util.Comparator;

public class Array05 {
  public static void main(String[] args) {
    Book[] books = new Book[4];
    books[0] = new Book("红楼梦~", 100);
    books[1] = new Book("金瓶梅~", 90);
    books[2] = new Book("青年文摘~", 5);
    books[3] = new Book("java从入门到放弃", 300);
    Arrays.sort(books, new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return (int) (o2.getPrice() - o1.getPrice());
      }
    });

    for (int i = 0; i < books.length; i++) {
      System.out.println(books[i].getName().toString());
    }

  }
}

class Book {
  private String name;
  private double price;

  Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

}
