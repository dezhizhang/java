package com.xiaozhi.pkg.math;

import java.util.Arrays;
import java.util.Comparator;

public class Math02 {
  public static void main(String[] args) {
    //显示字符串形式
    Integer[] integers = {1,-1,7,0,89};
    System.out.println(Arrays.toString(integers));

    // sort方法的使用
    Arrays.sort(integers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    System.out.println(Arrays.toString(integers));
  }
}

