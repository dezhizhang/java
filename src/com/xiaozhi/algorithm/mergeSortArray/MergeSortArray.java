package com.xiaozhi.algorithm.mergeSortArray;

import java.util.Arrays;

public class MergeSortArray {
  public static void main(String[] args) {
    int[] nums1 = new int[]{1, 3, 5, 7, 9, 0, 0, 0, 0};
    int[] nums2 = new int[]{2, 4, 6, 8};
    //System.out.println(Arrays.toString(merge(nums1, 5, nums2, 4)));
//    System.out.println(Arrays.toString(()
    System.out.println(Arrays.toString(merge1(nums1, 5, nums2, 4)));
  }

  public static int[] merge(int[] num1, int m, int[] num2, int n) {
    System.arraycopy(num2, 0, num1, m, n);
    Arrays.sort(num1);
    return num1;
  }

  public static int[] merge1(int[] num1, int m, int[] num2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int p = m + n - 1;
    while (p1 >= 0 && p2 >= 0) {
      num1[p--] = num1[p1] < num2[p2] ? num2[p2--] : num1[p1--];

    }
    System.arraycopy(num2, 0, num1, 0, p2 + 1);
    return num1;
  }
}
