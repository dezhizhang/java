package com.xiaozhi.algorithm.kmp;

public class Kmp1 {
  public static void main(String[] args) {
    String str1 = "硅硅谷,";
    String str2 = "尚硅谷你尚硅谷你";

    System.out.println(kmp(str1, str2));
  }

  public static int kmp(String str1, String str2) {
    char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();

    int s1Len = s1.length;
    int s2Len = s2.length;

    int i = 0;
    int j = 0;
    while (i < s1Len && j < s2Len) {
      if (s1[i] == s2[j]) {
        i++;
        j++;
      } else {
        i = i - (j - 1);
        j = 0;
      }
    }

    if (j == s2Len) {
      return i - j;
    }
    return -1;
  }
}
