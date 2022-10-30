package com.xiaozhi.algorithm.maxSeq;

public class MaxSeq {
  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 2, 3, 4, 3, 4, 5, 6, 7};
    System.out.println(findLength(nums));
  }

  public static int findLength(int[] nums) {
    int start = 0;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > 0 && nums[i] <= nums[i - 1]) {
        start = i;
      }
      max = Math.max(max, i - start + 1);
    }
    return max;
  }
}


