package com.xiaozhi.algorithm.kmp;

import java.util.Arrays;

public class Kmp02 {
  public static void main(String[] args) {
    String str1 = "BBC ABCDAB ABCDABCDADDE";
    String str2 = "ABCDAB";

    int[] next = kmpNext("AAAB");
    System.out.println("next=" + Arrays.toString(next));
  }

  public static int[] kmpNext(String dest) {
    int[] next = new int[dest.length()];
    next[0] = 0;
    for (int i = 1, j = 0; i < dest.length(); i++) {
      while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
        j = next[j - 1];
      }
      if (dest.charAt(i) == dest.charAt(j)) {
        j++;
      }
      next[i] = j;
    }
    return next;
  }
}
