package com.xiaozhi.pkg.mysql;

public class Users {
  private Integer id;
  private String name;
  private int age;

  public Users() {

  }

  public Users(Integer id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "id=" + this.id + "name=" + this.name + "age=" + this.age;
  }
}
