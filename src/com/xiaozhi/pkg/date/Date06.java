package com.xiaozhi.pkg.date;

public class Date06 {
  public static void main(String[] args) {
    String str = "abcdef";
    str = reverse(str, 0, 5);
    System.out.println(str);
  }

  public static String reverse(String str, int start, int end) {
    char[] chars = str.toCharArray();
    char temp = ' ';
    for (int i = start, j = end; i < j; i++, j--) {
      temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
    }
    return new String(chars);

  }
}
