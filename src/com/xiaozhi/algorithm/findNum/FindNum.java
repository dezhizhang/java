package com.xiaozhi.algorithm.findNum;

import java.util.Arrays;

public class FindNum {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 9, 10};
    System.out.println(Arrays.toString(find(arr, 6)));
  }

  public static int[] find(int[] arr, int num) {
    if (arr == null || arr.length == 0) {
      return new int[0];
    }
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int mid = (right - left) / 2 + left;
      if (arr[mid] == num) {
        return new int[]{mid};
      } else if (arr[mid] < num) {
        left = mid + 1;
      } else if(arr[mid] > num) {
        right = mid - 1;
      }
    }
    return new int[0];
  }
}
