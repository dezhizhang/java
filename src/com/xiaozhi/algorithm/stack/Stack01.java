package com.xiaozhi.algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack01 {
  public static void main(String[] args) {
    String expression = "1+((2+3)*4)-5";
    List<String> list = toInfixExpressionList(expression);
    List<String> list1 = parseSuffixExpressionList(list);
    System.out.println(list1);
    int result = calculate(list1);
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

  // 将中缀表过式转成对应的List
  public static List<String> toInfixExpressionList(String s) {
    List<String> list = new ArrayList<>();
    int index = 0;
    String strings; // 多位数拼接
    char c;
    do {
      if ((c = s.charAt(index)) < 48 || (c = s.charAt(index)) > 57) {
        list.add("" + c);
        index++;
      } else {
        strings = "";
        while (index < s.length() && (c = s.charAt(index)) >= 48 && (c = s.charAt(index)) <= 57) {
          strings += c;
          index++;
        }
        list.add(strings);
      }
    } while (index < s.length());
    return list;
  }

  // 中缀表达式转成后缀表过
  public static List<String> parseSuffixExpressionList(List<String> list) {
    Stack<String> stack = new Stack<>();
    List<String> list1 = new ArrayList<>();

    for (String item : list) {
      if (item.matches("\\d+")) {
        list1.add(item);
      } else if (item.equals("(")) {
        stack.push(item);
      } else if (item.equals(")")) {
        while (!stack.peek().equals("(")) {
          list1.add(stack.pop());
        }
        // 将"("弹出栈
        stack.pop();
      } else {
        //s1栈顶的运算符
        while (stack.size() != 0 && Priority.getValue(stack.peek()) >= Priority.getValue(item)) {
          list1.add(stack.pop());
        }
        // 还需要将item压力栈中
        stack.push(item);
      }
    }
    while (stack.size() != 0) {
      list1.add(stack.pop());
    }
    return list1;
  }

  public static int calculate(List<String> list) {
    Stack<String> stack = new Stack<>();
    for (String item : list) {
      if (item.matches("\\d+")) {
        //匹配多位数
        stack.push(item);
      } else {
        //pop取出两位数运算
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

class Priority {
  private static int ADD = 1;
  private static int SUB = 1;
  private static int MUL = 2;
  private static int DIV = 2;

  public static int getValue(String priority) {
    int result = 0;
    switch (priority) {
      case "+":
        result = ADD;
        break;
      case "-":
        result = SUB;
        break;
      case "*":
        result = MUL;
        break;
      case "/":
        result = DIV;
        break;
      default:
        break;
    }
    return result;
  }
}


