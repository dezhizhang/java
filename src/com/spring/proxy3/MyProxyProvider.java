package com.spring.proxy3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class MyProxyProvider {
  private Animal targetObj;

  public MyProxyProvider(Animal targetObj) {
    this.targetObj = targetObj;
  }

  public Animal getProxy() {
    ClassLoader classLoader = targetObj.getClass().getClassLoader();

    // 得到目标对像接口信息
    Class<?>[] interfaces = targetObj.getClass().getInterfaces();

    //3. 创建
    InvocationHandler invocationHandler = new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
          System.out.println("方法执行前" + method.getName() + "参数" + Arrays.asList(args));
          result = method.invoke(targetObj, args);
          System.out.println("方法执行后结果" + result);
          return result;
        } catch (Exception e) {
          e.printStackTrace();
          System.out.println("方法执行出现异常" + method.getName());
        } finally {
          System.out.println("方法最终结束" + method.getName());
        }
        return result;
      }
    };

    Animal proxy = (Animal) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    return proxy;

  }
}
