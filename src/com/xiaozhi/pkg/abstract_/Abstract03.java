package com.xiaozhi.pkg.abstract_;

public class Abstract03 {
  public static void main(String[] args) {
     Employee employee = new Employee("小明","012",1200);
     employee.work();

     Manager manager = new Manager("王经理","024",8000);
     manager.work();
  }
}


abstract class  CommonEmployee {
  private String name;
  private String id;
  private double salary;
  CommonEmployee(String name,String id,double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return this.salary;
  }

  public abstract void  work();
}

class Employee extends CommonEmployee {
  Employee(String name,String id,double salary) {
    super(name,id,salary);
  }

  @Override
  public void work() {
    System.out.println("姓名：" + this.getName() + "正在工作");
  }
}

class Manager extends CommonEmployee {
  private double bonus;
  Manager(String name,String id,double salary) {
    super(name,id,salary);
  }

  @Override
  public void work() {
    System.out.println("经理：" + this.getName() + "正在工作");
  }
}

