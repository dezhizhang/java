package com.xiaozhi.algorithm.triangles;

import java.util.Arrays;

public class Triangles {
  public static void main(String[] args) {
    int[] nums = new int[]{3,6,2,3};
    System.out.println(largesPerimeter(nums));
  }

  public static int largesPerimeter(int[] nums) {
    Arrays.sort(nums);
    for(int i = nums.length - 1;i >= 2;i--) {
      if(nums[i - 1] + nums[i - 2] > nums[i]) {
        return nums[i - 1] + nums[i -2] + nums[i];
      }
    }
    return 0;
  }
}
