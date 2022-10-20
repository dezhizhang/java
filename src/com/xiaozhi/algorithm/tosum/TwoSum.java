package com.xiaozhi.algorithm.tosum;

public class TwoSum {
  public static void main(String[] args) {
      int target = 9;
  }

  public static int[] toSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j + 1] == target) {
          result[0] = i;
          result[1] = j;
        }
      }
    }
    return result;
  }
}
