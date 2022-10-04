package com.xiaozhi.pkg.string;

import com.xiaozhi.pkg.encap.Person;

public class String3 {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.name = "hspedu";
    Person p2 = new Person();
    p2.name = "hspedu";

    System.out.println(p1.name.equals(p2.name));
    System.out.println(p1.name == p2.name);
    System.out.println(p1.name == "hspedu");
  }
}
