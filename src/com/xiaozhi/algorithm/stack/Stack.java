package com.xiaozhi.algorithm.stack;

import java.util.Scanner;

public class Stack {
  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(4);
    String key = "";
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);

    while (loop) {
      System.out.println("show:表示显示栈");
      System.out.println("exit:退出程序");
      System.out.println("push:添加数据");
      System.out.println("pop:获取数据");
      System.out.println("请输入您的选择");
      key = scanner.next();
      switch (key) {
        case "show":
          stack.list();
          break;
        case "push":
          System.out.println("请输入一个数");
          int value = scanner.nextInt();
          stack.push(value);
          break;
        case "pop":
          int res = stack.pop();
          System.out.println(res);
          break;
        case "exit":
          scanner.close();
          loop = false;
          break;
        default:
          break;
      }
    }

  }
}

class ArrayStack {
  private int maxSize; //栈的大小
  private int[] stack;
  private int top = -1;

  public ArrayStack(int maxSize) {
    this.maxSize = maxSize;
    stack = new int[maxSize];
  }

  // 栈满
  public boolean isFull() {
    return top == maxSize - 1;
  }

  // 栈空
  public boolean isEmpty() {
    return top == -1;
  }

  // 入栈
  public void push(int value) {
    if (isFull()) {
      throw new RuntimeException("栈满");
    }
    top++;
    stack[top] = value;
  }

  // 出栈
  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("栈空");
    }
    int value = stack[top];
    this.top--;
    return value;
  }

  // 显示栈
  public void list() {
    if (isEmpty()) {
      throw new RuntimeException("栈空");
    }
    for (int i = top; i > 0; i--) {
      System.out.printf("stack[%d]=%d", i, stack[i]);
      System.out.println();
    }
  }
}


