package com.xiaozhi.algorithm.stack;

public class Calculator {
  public static void main(String[] args) {
    String expression = "7+2*6-2";
    ArrayStack2 numStack = new ArrayStack2(10);
    ArrayStack2 priorStack = new ArrayStack2(10);
    int index = 0;
    int num1 = 0;
    int num2 = 0;

    int prior = 0;
    int res = 0;
    char ch = ' ';

    while (true) {
      ch = expression.substring(index, index + 1).charAt(0);
      if (priorStack.isPrior(ch)) {
        if (!priorStack.isEmpty()) {
          if (priorStack.priority(ch) <= priorStack.priority(priorStack.peek())) {
            num1 = numStack.pop();
            num2 = numStack.pop();
            prior = priorStack.pop();
            res = numStack.cal(num1, num2, prior);

            numStack.push(res);
            priorStack.push(ch);
          } else {
            priorStack.push(ch);
          }
        } else {
          priorStack.push(ch);
        }
      } else {
        numStack.push(ch - 48);
      }
      index++;
      if (index >= expression.length()) {
        break;
      }
    }

    while (true) {
      // 如果符号栈为空，则计算到最后的结果
      if (priorStack.isEmpty()) {
        break;
      }
      num1 = numStack.pop();
      num2 = numStack.pop();
      prior = priorStack.pop();

      res = numStack.cal(num1, num2, prior);
      numStack.push(res);
    }

    System.out.printf("表示式%s=%s", expression, numStack.pop());
  }
}


class ArrayStack2 {
  private int maxSize; //栈的大小
  private int[] stack;
  private int top = -1;

  public ArrayStack2(int maxSize) {
    this.maxSize = maxSize;
    stack = new int[maxSize];
  }

  // 返回当前栈顶的值
  public int peek() {
    return stack[top];
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

  // 返回符号的优先级
  public int priority(int prior) {
    if (prior == '*' || prior == '/') {
      return 1;
    } else if (prior == '+' || prior == '-') {
      return 0;
    } else {
      return -1;
    }
  }

  // 判断是不是一个运算符
  public boolean isPrior(char val) {
    return val == '+' || val == '-' || val == '*' || val == '/';
  }

  // 计算方法
  public int cal(int num1, int num2, int prior) {
    int res = 0;
    switch (prior) {
      case '+':
        res = num1 + num2;
        break;
      case '-':
        res = num2 - num1; //注意顺序
        break;
      case '*':
        res = num1 * num2;
        break;
      case '/':
        res = num2 / num1;
      default:
        break;

    }
    return res;
  }


}
