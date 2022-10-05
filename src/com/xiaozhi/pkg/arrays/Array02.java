package com.xiaozhi.pkg.arrays;

import java.util.Arrays;

public class Array02 {
  public static void main(String[] args) {
//    Integer[] arr = {1,2,3,4};
//    Integer[] newArr = Arrays.copyOf(arr,arr.length);
//    System.out.println(newArr.toString());
//    System.out.println(arr == newArr);

      Integer[] arr = {1,2,3,4};
      Integer[] newArr = Arrays.copyOf(arr,arr.length);
      System.out.println(newArr.toString());
      System.out.println(arr == newArr);
  }
}
