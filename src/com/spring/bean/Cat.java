package com.spring.bean;

public class Cat {
  private Integer id;
  private String name;

  public Cat() {
    System.out.println("cat执行了");
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
