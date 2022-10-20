package com.xiaozhi.algorithm.disappearnum;

import java.util.ArrayList;
import java.util.List;

public class DisappearNum {
  public static void main(String[] args) {
    int[] nums = {4, 3, 7, 5, 1};
    System.out.println(findDisappearNum(nums));
  }

  public static List<Integer> findDisappearNum(int[] nums) {
    int n = nums.length;
    for (int num : nums) {
      int x = (num - 1) % n;
      nums[x] += n;
    }
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (nums[i] <= n) {
        result.add(i + 1);
      }
    }
    return result;
  }
}
