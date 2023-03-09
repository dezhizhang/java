package com.spring.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VehicleProxyProvider {
  private Vehicle targetVehicle;

  public VehicleProxyProvider(Vehicle targetVehicle) {
    this.targetVehicle = targetVehicle;
  }

  // 编写一个代理方法
  public Vehicle getProxy() {

    ClassLoader loader = targetVehicle.getClass().getClassLoader();

    Class<?>[] interfaces = targetVehicle.getClass().getInterfaces();

    InvocationHandler invocation = new InvocationHandler(){
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
      }
    };

    Proxy.newProxyInstance(loader,interfaces,invocation);
    return null;
  }

}
