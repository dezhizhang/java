package com.xiaozhi.pkg.set;

import java.util.LinkedHashSet;
import java.util.List;

public class Hashmap06 {
  public static void main(String[] args) {
    LinkedHashSet<Car> objects = new LinkedHashSet<>();


  }
}

class Car {
  private String name;
  private double price;

  public Car(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Car{" + "name='" + name + '\'' + ", price=" + price + '}';
  }
}


