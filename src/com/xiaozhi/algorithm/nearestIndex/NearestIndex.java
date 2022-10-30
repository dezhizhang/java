package com.xiaozhi.algorithm.nearestIndex;

public class NearestIndex {
  public static void main(String[] args) {
    int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(nearestIndex(nums,4));
  }
  public static int nearestIndex(int[] arr,int num) {
    if(arr == null || arr.length == 0) {
      return -1;
    }
    int left = 0;
    int right = arr.length - 1;
    int ans = -1;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      if(arr[mid] >= num) {
        ans = mid;
        right = mid -1;
      }else {
        left = mid + 1;
      }
    }
    return ans;
  }
}
