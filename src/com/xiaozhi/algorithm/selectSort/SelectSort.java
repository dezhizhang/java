package com.xiaozhi.algorithm.selectSort;

import java.util.Arrays;

public class SelectSort {
  public static void main(String[] args) {
    int[] arr = new int[]{101, 34, 119, 1};
    selectSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  // 选择排序
  public static void selectSort(int[] arr) {
    int minIndex = 0;
    int min = arr[minIndex];

    for (int j = 1; j < arr.length; j++) {
      if (min > arr[j]) {
        min = arr[j];
        minIndex = j;
      }
    }
    arr[minIndex] = arr[0];
    arr[0] = min;
  }

}
