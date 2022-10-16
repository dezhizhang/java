package com.xiaozhi.algorithm.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSortOptimize {
  public static void main(String[] args) {
    int arr[] = new int[80000000];
    for (int i = 0; i < 80000000; i++) {
      arr[i] = (int) (Math.random() * 8000000);
    }

    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    String dateString = simpleDateFormat.format(date);
    System.out.println("排序前的时间是=" + dateString);
    bubbleSort(arr);

    Date date1 = new Date();
    String dateString1 = simpleDateFormat.format(date1);
    System.out.println("排序后的时间=" + dateString1);
  }

  // 冒泡排序封装成一个方法
  public static void bubbleSort(int arr[]) {
    int temp = 0;
    boolean flag = true;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if (!flag) {
        break;
      }
      flag = false;
    }
  }
}
