package com.xiaozhi.pkg.set;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Hashmap06 {
  public static void main(String[] args) {
    LinkedHashSet<Car> objects = new LinkedHashSet<>();

    objects.add(new Car("本田", 100000));
    objects.add(new Car("本田", 100000));
    objects.add(new Car("宝马", 100000));
    objects.add(new Car("小马", 100000));

    System.out.println(objects);
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Car car)) return false;
    return Double.compare(car.getPrice(), getPrice()) == 0 && Objects.equals(getName(), car.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getPrice());
  }
}


