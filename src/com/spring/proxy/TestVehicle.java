package com.spring.proxy;

import org.junit.jupiter.api.Test;

public class TestVehicle {
  @Test
  public void run() {
    Vehicle vehicle = new Car();
    vehicle.run();
  }
}
