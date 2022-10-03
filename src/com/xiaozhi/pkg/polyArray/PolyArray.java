package com.xiaozhi.pkg.polyArray;

public class PolyArray {
  public static void main(String[] args) {

    Person[] person = new Person[5];
    person[0] = new Person("小明",22);
    person[1] = new Student("小华",20,100);
    person[2] = new Student("小强",23,88);
    person[3] = new Teacher("张老师",40,2000);
    person[4] = new Teacher("李老师",55,10000);

    for(int i=0;i < person.length;i++) {
      System.out.println(person[i].say());

      if (person[i] instanceof Student) {
        ((Student)person[i]).study();
      }
      if(person[i] instanceof Teacher) {
        ((Teacher) person[i]).teach();
      }
    }

  }
}
