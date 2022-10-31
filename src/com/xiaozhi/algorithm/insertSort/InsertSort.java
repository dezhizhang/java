package com.xiaozhi.algorithm.insertSort;

import java.util.Arrays;

public class InsertSort {
  public static void main(String[] args) {
    int[] arr = {34, 101, 119, 1};

    insertSort(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void insertSort(int[] arr) {
    int insertValue = 0;
    int insertIndex = 0;
    for (int i = 1; i < arr.length; i++) {
      insertValue = arr[i];
      insertIndex = i - 1;
      while (insertIndex >= 0 && insertValue < arr[insertIndex]) {
        arr[insertIndex + 1] = arr[insertIndex];
        insertIndex--;
      }
      arr[insertIndex + 1] = insertValue;
    }
  }

}
