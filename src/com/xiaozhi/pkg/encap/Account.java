package com.xiaozhi.pkg.encap;

public class Account {
  private String name;
  private double balance;
  private String password;

  public Account(String name, double balance, String password) {
    this.setName(name);
    this.setBalance(balance);
    this.setPassword(password);
  }

  //设置名字
  public void setName(String name) {
    if (name.length() <= 1 || name.length() >= 5) {
      System.out.println("输入的用户名不合法");
      return;
    }
    this.name = name;
  }

  // 获取名字
  public String getName() {

    return this.name;
  }

  // 设置余额
  public void setBalance(double balance) {
    this.balance = balance;
  }

  // 获取余额
  public double getBalance() {
    if (this.balance <= 20) {
      System.out.println("余额不能低于:20");
      return 0;
    }
    return this.balance;
  }

  // 设置密码
  public void setPassword(String password) {
    if (password.length() != 6) {
      System.out.println("输入的密码不合法");
      return;
    }
    this.password = password;
  }

  public  void info() {
    System.out.println("姓名:" + this.name + "密码:" +this.password +"余额"+this.balance);
  }


}
