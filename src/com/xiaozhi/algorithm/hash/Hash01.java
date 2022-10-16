package com.xiaozhi.algorithm.hash;

public class Hash01 {
  public static void main(String[] args) {

  }
}

class HashTable {
  private int size;
  private EmployeeLinkList[] employeeLinkList;

  public HashTable(int size) {
    this.size = size;
    employeeLinkList = new EmployeeLinkList[size];
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
}
