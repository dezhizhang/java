package com.xiaozhi.algorithm.movezero;

import java.util.Arrays;

public class MoveZero {
  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    System.out.println(Arrays.toString(moveZeroes(nums)));
  }

  public static int[] moveZeroes(int[] nums) {
    if (nums == null) {
      return new int[0];
    }
    int j = 0;
    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }
    for (int i = j; i < nums.length; ++i) {
      nums[i] = 0;
    }
    return nums;
  }
}
