package com.xiaozhi.algorithm.tree;

import java.util.Arrays;

public class TreeSort {
  public static void main(String[] args) {
    int arr[] = {4, 6, 8, 5, 9};
    heapSort(arr);
  }

  //堆排序方法
  public static void heapSort(int arr[]) {
    int temp = 0;
    // 调整为大顶堆
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
      adjustHeap(arr, i, arr.length);
    }
    // 调换数据
    for (int j = arr.length - 1; j > 0; j--) {
      temp = arr[j];
      arr[j] = arr[0];
      arr[0] = temp;
      adjustHeap(arr, 0, j);
    }
    System.out.println("调整后的数据" + Arrays.toString(arr));
  }

  //将一个数组调整成一个大顶堆
  public static void adjustHeap(int arr[], int i, int length) {
    int temp = arr[i];
    for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
      if (k + 1 < length && arr[k] < arr[k + 1]) {
        k++;
      }
      if (arr[k] > temp) {
        // 如果子节点大于父节点
        // 把较大的值赋给当前节点
        arr[i] = arr[k];
        i = k; // 指向k继续循环比较
      } else {
        break;
      }
    }
    arr[i] = temp;
  }

}


