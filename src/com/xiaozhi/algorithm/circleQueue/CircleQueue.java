package com.xiaozhi.algorithm.circleQueue;


import java.util.Scanner;

public class CircleQueue {
  public static void main(String[] args) {
    CircleArray queue = new CircleArray(4);
    char key = ' ';
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    while(loop)

    {
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
  }
}

class CircleArray {
  private int maxSize;
  private int front;
  private int near;
  private int[] arr;

  public CircleArray(int maxSize) {
    this.maxSize = maxSize;
    this.arr = new int[maxSize];
  }

  // 判断队列是否为满
  public boolean isFull() {
    return (this.near + 1) % maxSize == front;
  }

  // 判断队列是否为空
  public boolean isEmpty() {
    return near == front;
  }

  // 添加数据到队列中
  public void addQueue(int n) {
    if (isFull()) {
      System.out.println("队列满不能加入数据~");
      return;
    }
    // 直接加入
    this.arr[this.near] = n;
    this.near = (this.near + 1) % this.maxSize;
  }

  // 获取列表的数据
  public int getQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空不能获取数据");
    }
    int value = this.arr[this.front];
    this.front = (front + 1) % this.maxSize;
    return value;
  }

  // 显示队列
  public void showQueue() {
    if (isEmpty()) {
      System.out.println("队列为空,没有数据");
      return;
    }
    for (int i = front; i < front + size(); i++) {
      System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
    }
  }

  // 求出队列有效数据个数
  public int size() {
    return (near + maxSize - front) % maxSize;
  }

  // 显示队列头元素
  public int headQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空");
    }
    return arr[front + 1];
  }
}
