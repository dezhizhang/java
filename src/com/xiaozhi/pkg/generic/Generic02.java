package com.xiaozhi.pkg.generic;

import java.util.*;

public class Generic02 {
  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();
    list.add(new Student("小明",22));
    list.add(new Student("小黄",33));
    list.add(new Student("大黄",44));

    for (Student student:list) {
      System.out.println(student.toString());
    }

    Iterator<Student> integer = list.iterator();
    while (integer.hasNext()) {
      Student next = integer.next();
      System.out.println(next.toString());
    }

    HashMap<String,Student> hashMap = new HashMap<String,Student>();
    hashMap.put("小明",new Student("小明",22));
    hashMap.put("小黄",new Student("小黄",33));
    hashMap.put("大黄",new Student("大黄",44));

    Set<Map.Entry<String, Student>> entries = hashMap.entrySet();

    Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
    while (integer.hasNext()) {
      Map.Entry<String, Student> next = iterator.next();
      System.out.println(next);
    }
    System.out.println(hashMap);
  }
}

class Student{
  private String name;
  private int age;
  public Student(String name,int age) {
    super();
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return this.name + this.age;
  }
}
