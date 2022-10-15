package com.xiaozhi.algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack01 {
  public static void main(String[] args) {
    String suffixExpression = "3 4 + 5 * 6 - ";
    List<String> list = getListString(suffixExpression);
    int result = calculate(list);
    System.out.println(result);
  }

  public static List<String> getListString(String suffixExpression) {
    // suffixExpression分割
    String[] split = suffixExpression.split(" ");
    List<String> list = new ArrayList<>();
    for (String item : split) {
      list.add(item);
    }
    return list;
  }

  public static int calculate(List<String> list) {
    Stack<String> stack = new Stack<>();
    for (String item : list) {
      if (item.matches("\\d+")) {
        // 匹配多位数
        stack.push(item);
      } else {
        //pop出两个数并运算
        int num2 = Integer.parseInt(stack.pop());
        int num1 = Integer.parseInt(stack.pop());
        int result = 0;
        if (item.equals("+")) {
          result = num1 + num2;
        } else if (item.equals("-")) {
          result = num1 - num2;
        } else if (item.equals("*")) {
          result = num1 * num2;
        } else if (item.equals("/")) {
          result = num1 / num2;
        } else {
          throw new RuntimeException("运算符不合法");
        }
        stack.push("" + result);
      }
    }
    return Integer.parseInt(stack.pop());
  }
}


