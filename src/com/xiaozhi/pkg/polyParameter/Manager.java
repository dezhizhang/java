package com.xiaozhi.pkg.polyParameter;

public class Manager extends Employee {
  private double bonus;

  Manager(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  public double getBonus() {
    return this.bonus;
  }

  public double getAnnual() {
    return super.getAnnual() + this.getBonus();
  }

  public void manage() {
    System.out.println("经理的管理方法");
  }
}
