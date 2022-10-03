package com.xiaozhi.pkg.polyParameter;

public class PolyParameter {
  public static void main(String[] args) {
    Person person = new Person("小明",22);
    Manager manager = new Manager("张经理",5000,3000);
    PolyParameter polyParameter = new PolyParameter();
    polyParameter.showEmpAnnual(person);
    polyParameter.showEmpAnnual(manager);
    polyParameter.testWork(person);
    polyParameter.testWork(manager);
  }
  public void  showEmpAnnual(Employee e) {
    System.out.println(e.getAnnual());
  }

  public void testWork(Employee e) {
    if(e instanceof  Person) {
      ((Person) e).work();
    }
    if(e instanceof Manager) {
      ((Manager) e).manage();
    }
  }
}
