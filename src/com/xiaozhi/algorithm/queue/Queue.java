package com.xiaozhi.algorithm.queue;

import java.util.Scanner;

public class Queue {
  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(3);
    char key = ' ';
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;

    while (loop) {
      System.out.println("s(show):显示队列");
      System.out.println("e(exit):退出程序");
      System.out.println("a( add):添加数据");
      System.out.println("g( get):获取数据");
      System.out.println("h(head):查看队头");
      key = scanner.next().charAt(0);
      switch (key) {
        case 's':
          queue.showQueue();
          break;
        case 'a':
          System.out.println("请输入一个数");
          int value = scanner.nextInt();
          queue.addQueue(value);
          break;
        case 'g':
          try {
            int res = queue.getQueue();
            System.out.printf("取出的数据是%d\n", res);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'h':
          try {
            int res = queue.headQueue();
            System.out.printf("队列头数据是%d\n", res);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'e':
          scanner.close();
          loop = false;
          break;
        default:
          break;
      }
    }
    if (loop) {
      System.out.println("程序退出");
    }

  }
}

class ArrayQueue {
  private int maxSize; //表示数组的最大容量
  private int front; //队列头
  private int near; //队列尾
  private int[] arr; //该数据用于存放数据

  public ArrayQueue(int maxSize) {
    this.maxSize = maxSize;
    this.arr = new int[maxSize];
    this.front = -1;
    this.near = -1;
  }

  // 判断是否为满
  public boolean isFull() {
    return near == maxSize - 1;
  }

  // 判断队列是否为空
  public boolean isEmpty() {
    return near == front;
  }

  // 添加数据到队列中
  public void addQueue(int n) {
    if (isFull()) {
      System.out.println("队列满，不能加入数据~");
      return;
    }
    this.near++;
    arr[near] = n;
  }

  // 获取队列的数据
  public int getQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空不脂取数据");
    }
    this.front++;
    return arr[this.front];
  }

  // 显示队的所有数据
  public void showQueue() {
    if (isEmpty()) {
      System.out.println("队列空的，没有数据~~");
      return;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("arr[%d]=%d\n", i, arr[i]);
    }
  }

  // 显示队列头部数据
  public int headQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空，没有数据~~");
    }
    return arr[this.front + 1];
  }

}
