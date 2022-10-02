package com.xiaozhi.pkg.override;

public class Test01 {
  public static void main(String[] args) {
    Student student = new Student("小明", 22);
    student.setScore(98.2);
    System.out.println(student.say());
  }
}
