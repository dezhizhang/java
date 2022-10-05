package com.xiaozhi.pkg.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array03 {
  public static void main(String[] args) {
    Integer arr[] = new Integer[]{1,2,3};
    Arrays.fill(arr,5);
    System.out.println(Arrays.toString(arr));
  }
}
