package com.spring.bean;

public class House {
  private String name;

  public House() {
    System.out.println("House() 构造器");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void init() {
    System.out.println("House init() 初始化");
  }

  public void destroy() {
    System.out.println("House destroy()方法销毁了");
  }
}
