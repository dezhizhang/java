package com.xiaozhi.algorithm.toSearch;

import java.util.Arrays;

public class ToSearch {
  public static void main(String[] args) {
    int[] mums = new int[]{1, 2, 3, 4, 5, 6};
    System.out.println(Arrays.toString(toPoint(mums, 10)));

  }
  // 有序查找
  public static int[] toSearch(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      int low = i;
      int high = numbers.length - 1;
      while (low <= high) {
        int mid = (high - low) / 2 + low;
        if (numbers[mid] == target - numbers[i]) {
          return new int[]{i, mid};
        } else if (numbers[mid] > target - numbers[i]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
    }
    return new int[0];
  }

  // 双指针查找
  public static int[] toPoint(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low < high) {
      int sum = nums[low] + nums[high];
      if (sum == target) {
        return new int[]{low, high};
      } else if (sum > target) {
        high = high - 1;
      } else {
        low = low + 1;
      }
    }
    return new int[0];
  }

}


