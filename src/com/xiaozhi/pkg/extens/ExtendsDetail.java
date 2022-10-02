
package com.xiaozhi.pkg.extens;
class Base1 {
  public int n1 = 100;
  protected  int n2 = 200;
  int n3 = 300;
  private int n4 = 400;

  public Base1(String name,int age) {
    System.out.println("姓名:" + name + "年龄:" + age);
  }
  public void test100() {
    System.out.println("test100");
  }
  protected void test200() {
    System.out.println("test200");
  }
  void test300() {
    System.out.println("test300");
  }
}

class Person extends Base1{
  public Person() {
    super("tom",30);
    System.out.println("person()....");
  }
  public void sayOk() {
    // 非私有的属性和方法可以在子类直接访问
    // 但是私有属性和方法不能在子类直接访问
    System.out.println(n1 + "" + n2 + "" + n3);
    test100();
    test200();
    test300();
  }
}

public class ExtendsDetail {
  public static void main(String[] args) {
    Person person = new Person();
    person.sayOk();
  }
}
