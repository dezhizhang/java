package com.xiaozhi.algorithm.search;

public class Search {
  public static void main(String[] args) {
    int arr[] = {1, 9, 11, -1, 34, 89};
    int value = seqSearch(arr, 34);
    System.out.println(value);
  }

  public static int seqSearch(int[] arr, int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        return i;
      }
    }
    return -1;
  }
}
