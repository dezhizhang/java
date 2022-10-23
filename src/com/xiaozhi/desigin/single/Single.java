package com.xiaozhi.desigin.single;

public class Single {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.run("汽转");
  }
}


class Vehicle {
  public void run(String vehicle) {
    System.out.println(vehicle + "交通工具在跑");
  }
}
