package com.xiaozhi.leetcode.array;

public class Array04 {
  public static void main(String[] args) {
    int[] nums = {0};
    System.out.println(findMaxConsecutiveOnes(nums));
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    if(nums == null || nums.length == 0) {
      return  0;
    }
    int count = 1;
    int result = 1;
    for(int i=0;i < nums.length-1;i++) {
      if(nums[i]== nums[i+1]) {
        count = count + 1;
      }else {
        result = Math.max(result,count);
        count = 1;
      }
    }
    return Math.max(result,count) ;

  }


}
