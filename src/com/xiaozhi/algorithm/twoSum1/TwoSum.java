package com.xiaozhi.algorithm.twoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {

  }

  public static int[] solution(int[] nums, int target) {
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      for (int j = 1; j < len; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[0];
  }


  public static int[] solution1(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[]{map.get(target - nums[i]), i};
      }
      map.put(nums[i], i);

    }
    return new int[0];
  }

}
