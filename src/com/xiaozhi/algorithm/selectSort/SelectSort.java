package com.xiaozhi.algorithm.selectSort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SelectSort {
  public static void main(String[] args) {
//    int[] arr = new int[]{101, 34, 119, 1};
//    selectSort(arr);
//
//    System.out.println(Arrays.toString(arr));

    int[] arr = new int[80000];
    for(int i=0;i < 80000;i++) {
      arr[i] = (int)(Math.random() * 80000);
    }

    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    String dateStr = simpleDateFormat.format(date);
    System.out.println("排序前====" + dateStr);

    selectSort(arr);

    Date date1 = new Date();


    String dateStr1 = simpleDateFormat.format(date1);
    System.out.println("排序后====" + dateStr1);

  }

  // 选择排序
  public static void selectSort(int[] arr) {
    for(int i= 0;i < arr.length - 1;i++) {
      int minIndex = i;
      int min = arr[i];

      for(int j = i + 1;j < arr.length;j++) {
        if(min > arr[j]) {
          min = arr[j];
          minIndex = j;
        }
      }
      if(minIndex != i) {
        arr[minIndex] = arr[i];
        arr[i] = min;
      }
    }
  }

}
