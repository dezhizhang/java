package com.xiaozhi.pkg.encap;

public class Encapsulation {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("小明");
    person.setAge(22);
    person.setSalary(1000);
    System.out.println( person.info());
    System.out.println("============");
    Person person1 = new Person("小华",22,1000);
    System.out.println(person1.info());

  }
}
