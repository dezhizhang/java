package com.xiaozhi.algorithm.mergeSort;

public class MergeSort {
  public static void main(String[] args) {

  }

  public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
    int i = left;
    int j = mid + 1;
    int t = 0;

    //1
    while (i <= mid && j <= right) {
      if (arr[i] < arr[j]) {
        temp[t] = arr[i];
        t += 1;
        i += 1;
      } else {
        temp[t] = arr[j];
        t += 1;
        j += 1;
      }
    }

  }
}
