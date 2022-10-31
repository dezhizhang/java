package com.xiaozhi.algorithm.insertSort;

import java.util.Arrays;

public class InsertSort {
  public static void main(String[] args) {
    int[] arr = {34, 101, 119, 1};

    insertSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void insertSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int insertValue = arr[i];
      int insertIndex = i - 1;

      while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
        arr[insertIndex + 1] = arr[insertIndex];
        insertIndex--;
      }

      arr[insertIndex + 1] = insertValue;

    }
  }

}
