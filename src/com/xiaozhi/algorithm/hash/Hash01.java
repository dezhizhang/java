package com.xiaozhi.algorithm.hash;

import java.util.Scanner;

public class Hash01 {
  public static void main(String[] args) {
    HashTable hashTable = new HashTable(7);

    // 一个简单的菜单
    String key = "";
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("add:添加员工");
      System.out.println("list:显示员工");
      System.out.println("exit:退出系统");
      key = scanner.next();

      switch (key) {
        case "add":
          System.out.println("输入id");
          int id = scanner.nextInt();
          System.out.println("输入名字");
          String name = scanner.next();
          // 创建员工
          Employee employee = new Employee(id, name);
          hashTable.add(employee);
          break;
        case "list":
          hashTable.list();
          break;
        case "exit":
          scanner.close();
//          System.exit();
        default:
          break;
      }
    }

  }
}

class HashTable {
  private int size;
  private EmployeeLinkList[] employeeLinkList;

  public HashTable(int size) {
    this.size = size;
    employeeLinkList = new EmployeeLinkList[size];
    for (int i = 0; i < size; i++) {
      employeeLinkList[i] = new EmployeeLinkList();
    }
  }

  // 添加员工
  public void add(Employee employee) {
    int employeeNo = hashFunc(employee.id);
    employeeLinkList[employeeNo].add(employee);
  }

  // 遍历所有的链表
  public void list() {
    for (int i = 0; i < size; i++) {
      employeeLinkList[i].list();
    }
  }


  // 散列函数
  public int hashFunc(int id) {
    return id % size;
  }
}


class Employee {
  public int id;
  public String name;
  public Employee next;

  public Employee(int id, String name) {
    super();
    this.id = id;
    this.name = name;

  }

}

class EmployeeLinkList {
  private Employee head;

  public void add(Employee employee) {
    // 如果添加的是第一个
    if (head == null) {
      head = employee;
      return;
    }

    Employee temp = head;
    while (true) {
      if (temp.next == null) {
        break;
      }
      temp = temp.next;
    }
    // 退出时加入链表
    temp.next = employee;
  }

  // 遍历链表信息
  public void list() {
    if (head == null) {
      System.out.println("当前链表为空");
      return;
    }
    Employee temp = head;
    while (true) {
      System.out.printf("=> id=%d name=%s\t", temp.id, temp.name);
      if (temp.next == null) {
        break;

      }
      temp = temp.next;
    }
    System.out.println();
  }

  public Employee findEmployee(int id) {
    if (head == null) {
      System.out.println("链表为空");
      return null;
    }
    Employee temp = head;
    while (true) {
      if (temp.id == id) {
        break;
      }
      if (temp.next == null) {
        temp = null;
        break;
      }
      temp = temp.next;
    }
    return temp;
  }
}
