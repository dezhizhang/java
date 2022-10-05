package com.xiaozhi.pkg.arrays;

import java.util.Arrays;

public class Array04 {
  public static void main(String[] args) {

      Integer arr1[] = new Integer[]{1,2,3};
      Integer arr2[] = new Integer[]{1,2,4};
      boolean equals = Arrays.equals(arr1,arr2);
      System.out.println(equals);
  }
}
