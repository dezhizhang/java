package com.xiaozhi.leetcode.array;

import java.util.ArrayList;

public class Array02 {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      arr.add(i + 1);
    }
    arr.set(1,4);
    arr.remove(1);

    System.out.println(arr);
    System.out.println(arr.get(1));
  }
}
