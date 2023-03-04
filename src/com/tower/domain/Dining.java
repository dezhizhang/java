package com.tower.domain;

public class Dining {
  private Integer id;
  private Integer status;
  private String name;
  private String phone;

  public Dining() {

  }

  public Dining(Integer id, Integer status, String name, String phone) {
    this.id = id;
    this.status = status;
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
