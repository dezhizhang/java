package com.xiaozhi.pkg.abstract_;

public class Abstract01 {
  public static void main(String[] args) {
    Dog dog = new Dog("小黄狗");
    dog.eat();
  }
}

abstract class Animal {
  public String name;
  //抽像类不能被实例化
  //抽像类可以没有抽像方法
  //一旦类包含abstract方法,
  //则这个类必须声明为抽像类abstract
  //abstract只能修饰类和方法不能修饰属性
  Animal(String name) {
    this.name = name;
  }

  public abstract void eat();
}

class Dog extends Animal{
  Dog(String name){
    super(name);
  }
  @Override
  public void eat() {
    System.out.println("小狗在吃东西");
  }
}


