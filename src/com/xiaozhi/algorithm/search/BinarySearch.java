package com.xiaozhi.algorithm.search;

public class BinarySearch {
  public static void main(String[] args) {
    int arr[] = {1, 8, 10, 89, 1000, 1234};
    int value = binarySearch(arr, 0, arr.length - 1, 22);
    System.out.println(value);
  }

  public static int binarySearch(int[] arr, int left, int right, int value) {
    if(left > right) {
      return -1;
    }
    int mid = (left + right) / 2;
    int midVal = arr[mid];
    if (value > midVal) {
      return binarySearch(arr, mid + 1, right, value);
    } else if (value < midVal) {
      return binarySearch(arr, left, mid - 1, value);
    } else {
      return mid;
    }
  }
}
