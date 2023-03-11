package com.spring.proxy2;

import com.spring.proxy.Ship;
import org.junit.jupiter.api.Test;

public class TestVehicle {
  @Test
  public void testVehicle() {
    Vehicle vehicle = new Car();
    VehicleProxyProvider vehicleProxyProvider = new VehicleProxyProvider(vehicle);

    Vehicle proxy = vehicleProxyProvider.getProxy();

    System.out.println(proxy);

    proxy.run();

  }
}
