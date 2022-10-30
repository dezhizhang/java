package com.xiaozhi.algorithm.findNum;

public class FindNum {
  public static void main(String[] args) {
      int[] arr = new int[]{1,2,3,4,5,6,9,10};
      System.out.println(find(arr,6));
  }

  public static boolean find(int[] arr,int num) {
    if(arr == null || arr.length == 0) {
      return false;
    }

    int L = 0;
    int R = arr.length - 1;
    while (L < R) {
      int mid = (R - L) / 2 + L;
      if (arr[mid] == num) {
        return true;
      }else if(arr[mid] < num) {
        L = mid + 1;
      }else {
        R = mid - 1;
      }
    }
    return false;
  }
}
