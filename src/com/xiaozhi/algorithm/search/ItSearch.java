package com.xiaozhi.algorithm.search;

import java.util.Arrays;

public class ItSearch {
  static int maxSize = 20;

  public static void main(String[] args) {
    int[] arr = {1, 8, 10, 89, 1000, 1234};
    System.out.println(fibSearch(arr, 89));
  }

  public static int[] fib() {
    int[] f = new int[maxSize];
    f[0] = 1;
    f[1] = 1;
    for (int i = 2; i < maxSize; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f;
  }

  public static int fibSearch(int[] arr, int key) {
    int low = 0;
    int height = arr.length;
    int k = 0;
    int mid = 0;
    int f[] = fib();
    while (height > f[k] - 1) {
      k++;
    }

    int[] temp = Arrays.copyOf(arr, f[k]);

    for (int i = height + 1; i < temp.length; i++) {
      temp[i] = arr[height];
    }

    while (low <= height) {
      mid = low + f[k - 1] - 1;
      if (key < temp[mid]) {
        height = mid - 1;
        k--;
      } else if (key > temp[mid]) {
        low = mid + 1;
        k -= 2;
      } else {
        if (mid <= height) {
          return mid;
        } else {
          return height;
        }
      }
    }
    return -1;
  }
}

