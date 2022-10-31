package com.xiaozhi.algorithm.quickSort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] arr = {-9, 78, 0, 23, -567, 70};
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void quickSort(int[] arr, int left, int right) {
    int temp = 0;
    int l = left;
    int r = right;
    int mid = arr[(left + right) / 2];

    while (l < r) {
      while (arr[l] < mid) {
        l += 1;
      }

      while (arr[r] > mid) {
        r -= 1;
      }
      if (l >= r) {
        break;
      }
      //交换
      temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;

      //如果交换后发现arr[l] = mid值相等
      if (arr[l] == mid) {
        r -= 1;
      }
      // 如果交换完后，发现这个arr[r]=mid值相等l++
      if (arr[r] == mid) {
        r += 1;
      }
    }
    if (l == r) {
      l += 1;
      r -= 1;
    }
    // 向左递归
    if(left < r) {
      quickSort(arr,left,r);
    }
    // 向左递归
    if(right > l) {
      quickSort(arr,l,right);
    }
  }
}
