# JAVA
### 求取最大值
```java
class A02 {
    public int find(String str, String[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                index = i;
            }

        }
        return index;
    }
}

public class This02 {
    public static void main(String[] args) {
        String arr[] = { "123", "hello", "change" };
        A02 a2 = new A02();
        System.out.println(a2.find("hello", arr));

    }
}
```
### this的使用
```java
class Book {
    double price;
    String name;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice(double price) {
        if (price > 150) {
            this.price = 150;
        } else if (price > 100) {
            this.price = 100;
        } else {
            this.price = price;
        }

    }

    public void showBook() {
        System.out.println("书名:" + this.name + "价格:" + this.price);
    }
}

public class This03 {
    public static void main(String[] args) {
        Book book = new Book("三国", 22);
        book.updatePrice(120);
        book.showBook();

    }
}

```
### 包的使用
```java
public class Inof01 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.cry();
    Cat cat = new Cat();
    cat.eta();
  }
}

```
### 继承的使用
```java
class GrandPa {
  String name = "大头爷爷";
  String hobby = "旅游";
}

class Father extends GrandPa {
  String name = "大头爸爸";
  int age = 39;
}

class Son extends  Father{
  String name = "大头儿子";
}

public class ExtendsTheory {
  public static void main(String[] args) {
    Son son = new Son();
    System.out.println(son.name);
  }
}

```
### 方法的重写
```java
class Animal{
  public void cry() {
    System.out.println("动物叫换...");
  }
}

class Dog extends Animal{
  public void cry() {
    System.out.println("小狗在叫...");
  }
}

public class Override01 {
  public static void main(String[] args) {
      Dog dog = new Dog();
      dog.cry();
  }
}
```
### 动态类型帮定
```java
package com.xiaozhi.pkg.dynamic;

public class Dynamic {
  public static void main(String[] args) {
     A a = new B();
     System.out.println(a.sum());
     System.out.println(a.sum1());
  }
}

class A {
  public int i= 10;
  public int sum() {
    return getI() + 10;
  }
  public int sum1() {
    return this.i + 10;
  }
  public int getI() {
    return i;
  }
}

class B extends A{
  public int i = 20;
  public int sum() {
    return i + 20;
  }
  public int getI() {
    return this.i;
  }

  public int sum1() {
    return this.i + 10;
  }
}

```
### 多态数组
```java
public class PolyArray {
  public static void main(String[] args) {
    Person[] person = new Person[5];
    person[0] = new Person("小明",22);
    person[1] = new Student("小强",20,100);
    person[2] = new Student("小华",18,90);
    person[3] = new Teacher("张老师",40,20000);
    person[4] = new Teacher("李老师",66,10000);

    for(int i=0;i < person.length;i++) {
      //如果是学生类
      if(person[i] instanceof  Student) {
        ((Student)person[i]).study();
      }
      //如果是老师类
      if(person[i] instanceof Teacher) {
        ((Teacher)person[i]).teach();
      }
      System.out.println(person[i].say());
    }

  }
}

```
### 动态参数
```java
public class PolyParameter {
  public static void main(String[] args) {
      Person person = new Person("小明",2222);
      Manager manager = new Manager("张经理",5000,20000);
      PolyParameter polyParameter = new PolyParameter();
      polyParameter.showEmpAnnual(person);
      polyParameter.showEmpAnnual(manager);
      polyParameter.testWork(person);
      polyParameter.testWork(manager);
  }

  public void showEmpAnnual(Employee e) {
    System.out.println(e.getAnnual());
  }

  public void  testWork(Employee e) {
    if(e instanceof  Person){
      ((Person)e).work();
    }
    if (e instanceof Manager) {
      ((Manager)e).manage();
    }
  }
}

```
### 对像的toString方法
```java
public class ToString {
  public static void main(String[] args) {
      Monster monster = new Monster("小王","搬砖",100);
      System.out.println(monster.toString());
  }
}

class Monster{
  private  String name;
  private String work;
  private Double salary;

  Monster(String name,String work,double salary) {
    this.name = name;
    this.work = work;
    this.salary = salary;
  }

}
```
### 静态属性
```java
public class VisitStatic {
  public static void main(String[] args) {
    System.out.println(A.name);
  }
}

class A{
  public static String name = "晓智云";
}

```
### 静态方法
```java
public class StaticMethod {
  public static void main(String[] args) {
     Student student = new  Student("小明");
     Student.payFee(100);

     Student student1 = new Student("小强");
     Student.payFee(200);

     Student.showFee();
  }
}

class  Student{
  private String name;
  //静态变量所有成员共享
  private static  double fee = 0;
  Student(String name){
    this.name = name;
  }

  public static void payFee(double fee) {
    Student.fee += fee;
  }

  public static void  showFee() {
    System.out.println("总学费有：" + Student.fee);
  }

}
```
### 静态方法与非静态方法
```java
public class StaticDetail1 {
  public static void main(String[] args) {
      D d = new D();
      d.say();

      D.hi();

  }
}

class D{
  private int n1 = 100;
  private static int n2 = 200;
  public void  say() {
    System.out.println("有人在说....");
  }

  public static void hi() {

    //静态方法不允许使用this和super
    //静态方法只能允许访问静态成员
    //静态方法不能访问非静态方法
    //静态方法只能访问静态成员
    System.out.println("hi..." + D.n2);
  }
}

```
### 代码块
```java
public class CodeBlock {
  public static void main(String[] args) {
//      Movie movie = new Movie("中国中华");

      Movie movie1 = new Movie("唐探3",100);

  }
}

class Movie{
  private String name;
  private double price;
  private String director;

  {
    System.out.println("电影屏幕打开...");
    System.out.println("广告开始...");
    System.out.println("电影正是开如");
  }

  public Movie(String name) {
    this.name = name;
  }

  public Movie(String name,double price) {
    this.name = name;
    this.price = price;
  }
}

```
### 代码块的使用细节
```java
public class CodeDetail {
  public static void main(String[] args) {
    //1创建对像的时候
    //2创建子类对像实例，父类也会被加载
    AA aa = new AA();
    // 使用类的静态成员时（静态属性，静态方法）
    System.out.println(Cat.n1);
  }
}

class Cat{
  public static int n1 = 999;
  static {
    System.out.println("Cat静态代码块被执行");
  }
}

class BB {
  static {
    System.out.println("BB代码块被执行了");
  }
}

class AA extends BB {
  static {
    System.out.println("AA代码块被执行了");
  }
}


```
### 如果使用类的静态面员，普通代码块不会执行
```java
public class CodeBlock02 {
  public static void main(String[] args) {
    // 如果使用类的静态面员，普通代码块不会执行
    System.out.println(DD.n1);
  }
}

class DD{
  public static int n1 = 8888;

  static {
    System.out.println("DD的静态代码块被执行....");
  }
  {
    System.out.println("DD的普通代码块....");
  }
}

```
