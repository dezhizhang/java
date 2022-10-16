package com.xiaozhi.algorithm.search;

import java.util.Arrays;

public class Interpolation {
  public static void main(String[] args) {
    int[] arr = new int[100];
    for (int i = 0; i < 100; i++) {
      arr[i] = i + 1;
    }
    int index = interpolation(arr, 0, arr.length - 1, 22);
    System.out.println(index);
  }

  public static int interpolation(int[] arr, int left, int right, int findValue) {
    if (left > right || findValue < arr[0] || findValue > arr[arr.length - 1]) {
      return -1;
    }
    int mid = left + (right - left) * (findValue - arr[left]) / (arr[right] - arr[left]);
    int midVal = arr[mid];
    if (findValue > midVal) {
      return interpolation(arr, mid + 1, right, findValue);
    } else if (findValue < midVal) {
      return interpolation(arr, left, mid - 1, findValue);
    } else {
      return mid;
    }

  }
}
