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
### 静态代码块的调用
```java
public class CodeBlock03 {
  public static void main(String[] args) {
    A a = new A();
    //A 的静态代码块
    //getN1被调用...
  }
}

class A {
  static {
    System.out.println("A 的静态代码块");
  }

  private int n2 = getN2();

  private static int n1 = getN1();

  public int getN2() {
    System.out.println("getN2被调用...");
    return 200;
  }
  public static int getN1() {
    System.out.println("getN1被调用...");
    return 100;
  }
}
```
### 继承的普通代码块
```java
public class CodeBlock04 {
  public static void main(String[] args) {
      AAA aaa = new AAA();
      /*
        1BBB的无参构造器
        2AAA的普通代码块
        3AAA的无数构造器
       */
  }
}

class  BBB {
    BBB() {
      System.out.println("BBB的无参构造器");
    }
}

class AAA extends  BBB {
  {
    System.out.println("AAA的普通代码块");
  }
  AAA() {
    super();
    System.out.println("AAA的无数构造器");
  }
}

```
### 代码块的执行顺序
```java
public class CodeBlock05 {
  public static void main(String[] args) {
    A a = new A(); //1.B静态代码初始化2.B静态代码块3.A静态属性初始化
    // 4A普通代码执行5.B普通属性初始化6.A普通属性初始化7B的无参构造器8.A的无参构造器执行

  }
}

class B {
  public static int n1 = getN1();

  static {
    System.out.println("B静态代码块");
  }

  public int n2 = getN2();

  B() {
    System.out.println("B的无参构造器");
  }

  public static int getN1() {
    System.out.println("B静态代码初始化");
    return 10;
  }

  public int getN2() {
    System.out.println("B普通属性初始化");
    return 20;
  }
}

class A extends B {
  static {
    System.out.println("A代码执行");
  }

  public static int n1 = getN1();
  public int n2 = getN2();

  public static int getN1() {
    System.out.println("A静态属性初始化");
    return 10;
  }

  public int getN2() {
    System.out.println("A普通属性初始化");
    return 20;
  }

  {
    System.out.println("A普通代码执行");
  }

  A() {
    System.out.println("A的无参构造器执行");
  }

}
```
### final可以在代码块和构造器中赋值
```java
public class Final01 {
  public static void main(String[] args) {
      AA aa = new AA();
      aa.show();
  }
}

class AA {
  public final double TAX_RATE;
  public final double TAX_RATE1;
  // 可以在代码块和构造器中赋值
  {
    TAX_RATE1 = 2;
  }

  public AA() {
    TAX_RATE = 1;
  }

  public void show() {
    System.out.println(TAX_RATE);
    System.out.println(TAX_RATE1);
  }
}
```
### final修改的静态属性
```java
public class Final03 {
  public static void main(String[] args) {
    BB bb = new BB();
    bb.show();

  }
}

class BB{
  //如果final修饰的属性是静态的，
  //则初始化的位置是定义时和静态代码块不能在构造器中赋值
  public static final double TAX_RATE;

  static {
    TAX_RATE = 0.2;
  }

  public void  show() {
    System.out.println(BB.TAX_RATE);
  }
}

```
### final方法
```java
public class Final04 {
  public static void main(String[] args) {
      D d = new D();
      d.show();
      d.cal();
  }
}

class C {
  //如果类不是final类
  //但含有final方法
  //则方法不能重写但是可以被继承
  final public void  cal() {
      System.out.println("final的方法执行了cal");
  }
}

class D extends C{
  public void show() {
    System.out.println("class D is show");
  }
}

```
### final的使用
```java
public class Final05 {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.setRadius(10);
    System.out.println(c.calculate());
  }
}

class Circle {
  private double radius;
  public final double PI;

  Circle() {
    PI = 3.14;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double calculate() {
    return (PI * radius * radius);
  }
}

```
### 抽像方法
```java

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
```
### 抽像类的实现
```java
public class Abstract03 {
  public static void main(String[] args) {
     Employee employee = new Employee("小明","012",1200);
     employee.work();

     Manager manager = new Manager("王经理","024",8000);
     manager.work();
  }
}


abstract class  CommonEmployee {
  private String name;
  private String id;
  private double salary;
  CommonEmployee(String name,String id,double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return this.salary;
  }

  public abstract void  work();
}

class Employee extends CommonEmployee {
  Employee(String name,String id,double salary) {
    super(name,id,salary);
  }

  @Override
  public void work() {
    System.out.println("姓名：" + this.getName() + "正在工作");
  }
}

class Manager extends CommonEmployee {
  private double bonus;
  Manager(String name,String id,double salary) {
    super(name,id,salary);
  }

  @Override
  public void work() {
    System.out.println("经理：" + this.getName() + "正在工作");
  }
}
```
### 接口的实现
```java
public class Interface {
  public static void main(String[] args) {
      Phone phone = new Phone();
      Camera camera = new Camera();

      Computer computer = new Computer();
      computer.work(phone);
      computer.work(camera);
  }
}

class Computer{
  public void work(UsbInterface usbInterface) {
    usbInterface.start();
    usbInterface.stop();
  }
}


class Phone implements UsbInterface {
  @Override
  public void start() {
    System.out.println("手机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("手机停止工作");
  }
}

class Camera implements UsbInterface {
  @Override
  public void start() {
    System.out.println("相机开始工作");
  }

  @Override
  public void stop() {
    System.out.println("相机停止工作");
  }
}
```
### 一个类可以同时实现多个接口
```java
public class Interface02 {
  public static void main(String[] args) {
    Pig pig = new Pig();
    pig.hi();
    pig.say();
  }
}

interface IB {
  void hi();
}

interface IC {
  void say();
}

class Pig implements IB, IC {

  @Override
  public void hi() {
    System.out.println("hi");
  }

  @Override
  public void say() {
    System.out.println("say");
  }
}
```
### 接口的练习
```java
public class Interface03 {
  public static void main(String[] args) {
    B b = new B();
    System.out.println(b.a);
    System.out.println(A.a);
    System.out.println(B.a);
  }
}

interface A {
  int a = 23;

}

class  B implements A {

}

```
### 接口多态性
```java
public class Interface04 {
  public static void main(String[] args) {
      Usb[] usbs = new Usb[2];
      usbs[0] = new MyPhone();
      usbs[1] = new MyCamera();

      for(int i=0;i < usbs.length;i++) {
        usbs[i].work();
        if(usbs[i] instanceof MyPhone) {
          ((MyPhone) usbs[i]).call();
        }
      }
  }
}

interface Usb{
  void work();
}

class MyPhone implements Usb {
  @Override
  public void work() {
    System.out.println("手机工作中...");
  }

  public void call() {
    System.out.println("手机可以打电话...");
  }
}

class MyCamera implements Usb {
  @Override
  public void work() {
    System.out.println("相机工作台...");
  }
}
```
### 内部类
```java
public class Inner01 {
  public static void main(String[] args) {
    Outer outer = new Outer(12);
    outer.m1();
  }
}


class Outer{
  private int n1;
  Outer(int n1) {
    this.n1 = n1;
  }
  private void m2() {
    System.out.println("m2");
  }
  public void m1() {
    class Inner{
      public void f1() {
        //可以访问外部类的所有成员，包括私有的
        //不能添加修饰符，但是可以用final访问
        System.out.println("n1=" + n1);
        m2();
      }
    }
    Inner inner = new Inner();
    inner.f1();
  }
}
```
### 基于接口的内部类
```java
public class Inner02 {
  public static void main(String[] args) {
    Outer01 outer01 = new Outer01();
    outer01.method();
  }
}

class Outer01{
  public void method() {
    IA tiger = new IA() {
      @Override
      public void cay() {
        System.out.println("老虎在叫....");
      }
    };
    tiger.cay();
  }
}

interface IA {
  void cay();
}

```
### 枚举
```java
public class Enum02 {
  public static void main(String[] args) {
        System.out.println(Season2.WINTER);
  }
}

enum Season2{

  SPRING("春天", "温暖"),
  WINTER("冬天", "実冷"),
  AUTUMN("秋天", "凉爽"),
  SUMMER("夏天", "炎热");

  private String name;
  private String desc;
;
  Season2(String name,String desc) {
    this.name = name;
    this.desc = desc;
  }

  @Override
  public String toString() {
    return  "季节：" + this.name + "描述：" + this.desc;
  }
}
```
### 枚举的常用
```java
public class Enum03 {
  public static void main(String[] args) {
    Gender boy = Gender.BOY;
    Gender boy2 = Gender.BOY;

    System.out.println(boy);
    System.out.println(boy2 == boy);
  }
}


enum Gender{
  BOY,GIRL
}


```
### 常用方法的使用
```java
public class Enum02 {
  public static void main(String[] args) {
    Season2 season2 = Season2.AUTUMN;
    System.out.println(season2.name());
    //常量对像的次序
    System.out.println(season2.ordinal());
    System.out.println(Season2.values().toString());
    System.out.println(Season2.valueOf("AUTUMN"));
    System.out.println(Season2.SPRING.compareTo(Season2.AUTUMN));
  }
}

enum Season2{
  SPRING("春天", "温暖"),
  WINTER("冬天", "実冷"),
  AUTUMN("秋天", "凉爽"),
  SUMMER("夏天", "炎热");

  private String name;
  private String desc;
  Season2(String name,String desc) {
    this.name = name;
    this.desc = desc;
  }
  public String toString(){
    return this.desc;
  }

}
```
### enum 方式的使用
```java
public class Enum04 {
  public static void main(String[] args) {
    Week[] weeks = Week.values();
    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
    }
  }
}

enum Week {
  MONDAY("星期一"),
  TUESDAY("星期二"),
  WEDNESDAY("星期三"),
  THURSDAY("星期四"),
  FRIDAY("星期五"),
  SATURDAY("星期六"),
  SUNDAY("星期日");
  private String name;
  Week(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
```
### 重写Override
```java
class Father{
  public void fly() {
    System.out.println("father is fly");
  }
}

class Son extends  Father {
  @Override
  public void fly() {
    super.fly();
  }
}
```
### 异常处理
```java
public class Exception01 {
  public static void main(String[] args) {

    try {
      int num1 = 10;
      int num2 = 0;
      int res = num1 / num2;
    }catch (Exception e) {
      //e.printStackTrace();
      System.out.println(e.getMessage());
    }

    System.out.println("程序继续运行...");
  }
}

```
### 包装类
```java
public class Wrapper {
  public static void main(String[] args) {
    //手动装箱
    int n1 = 100;
    Integer integer = new Integer(n1);
    Integer integer1 = Integer.valueOf(n1);

    System.out.println(integer);
    System.out.println(integer1);

    // 手动拆箱
    int i = integer.intValue();
    System.out.println(i);
  }
}

```
### 包装类型转string
```java
public class Wrapper2 {
  public static void main(String[] args) {
    // 包装类型转string
    Integer i = 100;
    String str = i + "";
    System.out.println(str);
    System.out.println(i.toString());
    System.out.println(String.valueOf(i));
  }
}
```
### string转成包装类
```java
public class Wrapper2 {
  public static void main(String[] args) {
    // 字符串转成包装类
    String str1 = "123456";
    System.out.println(Integer.parseInt(str1));
    System.out.println(new Integer(str1));
  }
}

```
### Integer的使用
```java
public class Wrapper4 {
  public static void main(String[] args) {
     Integer n = 1;
     Integer m = 1;
     System.out.println(m == n); //true

     Integer x = 128;
     Integer y = 128;
     System.out.println(x == y); //false
  }
}
```
### intern方法的使用
```java
public class String1 {
  public static void main(String[] args) {
      String a = "hsp";
      String b = new String("hsp");

      System.out.println(a == b.intern()); //true
      System.out.println(b == b.intern()); //false
  }
}

```
### String转StringBuffer
```java
public class StringBuffer2 {
  public static void main(String[] args) {
    String str = "hello world";
    StringBuffer stringBuffer2 = new StringBuffer(str);
    System.out.println(stringBuffer2);

    //使用append添加
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer = stringBuffer2.append(str);
    System.out.println(stringBuffer);
  }
}

```
### StringBuffer转成String
```java
public class StringBuffer2 {
  public static void main(String[] args) {

    // String转成StringBuffer
    StringBuffer stringBuffer1 = new StringBuffer("hello world");
    String str1 = stringBuffer1.toString();
    System.out.println(str1);
    String str2 = new String(stringBuffer1);
    System.out.println(str2);
  }
}

```
### Math方法的学中
```java
public class Math01 {
  public static void main(String[] args) {
    //1 Math.abs 求约对值
    int abs = Math.abs(-9);
    System.out.println(abs);

    //2 Math.pow求幂
    double pow = Math.pow(2, 4);
    System.out.println(pow);

    //3 Math.ceil向上取整
    double ceil = Math.ceil(-3.0001);
    System.out.println(ceil);

    //4 Math.floor向下取整
    double floor = Math.floor(-4.999);
    System.out.println(floor);

    //5 Math.round四舍五入
    long round = Math.round(-5.0001);
    System.out.println(round);

    //6 Math.sqrt求平方
    double sqrt = Math.sqrt(9.0);
    System.out.println(sqrt);

    //7 Math.random()生成随面数
    double random = Math.random();
    System.out.println(random);

    //生成随面数
    int a = 2;
    int b = 7;

    for (int i = 0; i < 10; i++) {
      int random1 = (int) (a + Math.random() * (b - a + 1));
      System.out.println(random1);
    }
  }
}
```
### Arrays方法的使用
```java
public class Math02 {
  public static void main(String[] args) {
    //显示字符串形式
    Integer[] integers = {1,-1,7,0,89};
    System.out.println(Arrays.toString(integers));

    // sort方法的使用
    Arrays.sort(integers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    System.out.println(Arrays.toString(integers));
  }
}

```
### 二分查找法
```java
public class Arrays01 {
  public static void main(String[] args) {
      Integer[] arr = {1,2,90,123,567};
      int index = Arrays.binarySearch(arr,2);
      System.out.println(index);
  }
}

```
### 数组的拷贝
```java
public class Array02 {
  public static void main(String[] args) {
    Integer[] arr = {1,2,3,4};
    Integer[] newArr = Arrays.copyOf(arr,arr.length);
    System.out.println(newArr.toString());
    System.out.println(arr == newArr);
  }
}
```
### 数组的填充
```java
public class Array03 {
  public static void main(String[] args) {
    Integer arr[] = {1,2,3,4};
    Arrays.fill(arr,5);
    System.out.println(Arrays.toString(arr));
  }
}

```
### 返回两个数组元数是否相等
```java
public class Array04 {
  public static void main(String[] args) {
      Integer arr1[] = new Integer[]{1,2,3};
      Integer arr2[] = new Integer[]{1,2,3};

      boolean equals = Arrays.equals(arr1,arr2);
      System.out.println(equals);
  }
}
```
###  数组的排序
```java
package com.xiaozhi.pkg.arrays;


import java.util.Arrays;
import java.util.Comparator;

public class Array05 {
  public static void main(String[] args) {
    Book[] books = new Book[4];
    books[0] = new Book("红楼梦~", 100);
    books[1] = new Book("金瓶梅~", 90);
    books[2] = new Book("青年文摘~", 5);
    books[3] = new Book("java从入门到放弃", 300);
    Arrays.sort(books, new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        return (int) (o2.getPrice() - o1.getPrice());
      }
    });

    for (int i = 0; i < books.length; i++) {
      System.out.println(books[i].getName().toString());
    }

  }
}

class Book {
  private String name;
  private double price;

  Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public String getName() {
    return this.name;
  }

}

```
