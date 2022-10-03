package com.xiaozhi.pkg.polyDetail;

public class PolyDetail {
  public static void main(String[] args) {
    Animal animal = new Cat();
    // 可以调用父类的所有成员
    // 不能调子类特有成员
    animal.run();

    // 向下转型
    // 要求父类的引用对像必须指向的是当前
    // 目标类型对像
    Cat cat = (Cat) animal;
    cat.sleep();
    cat.catchMouse();

    System.out.println("==========");
  }
}


