package com.xiaozhi.leetcode.isValid;


import java.util.Stack;

public class IsValid {
  public static void main(String[] args) {
    System.out.println(isValid("(]"));
  }
  public static boolean isValid(String s) {
    if(s.length() == 0) {
      return true;
    }

    Stack<Character> stack = new Stack<>();
    for(char ch: s.toCharArray()) {
      if(ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      }else {
        if(stack.isEmpty()) {
          return false;
        }else {
          char temp = stack.pop();
          if(ch == ')') {
            if(temp != '(') {
              return  false;
            }
          }else if(ch == '}') {
            if(temp != '{') {
              return  false;
            }else if(ch == ']') {
              if (temp != '[') {
                return false;
              }
            }
          }
        }
      }
    }
    return stack.isEmpty() ? true:false;
  }
}
