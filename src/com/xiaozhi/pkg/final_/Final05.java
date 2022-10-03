package com.xiaozhi.pkg.final_;

public class Final05 {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(10);
    System.out.println(c.calculate());
  }
}

class Circle {
  private double radius;
  public final double PI;

  Circle() {
    PI = 3.14;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double calculate() {
    return (PI * radius * radius);
  }
}
