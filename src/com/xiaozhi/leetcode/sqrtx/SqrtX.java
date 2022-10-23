package com.xiaozhi.leetcode.sqrtx;

public class SqrtX {
  public static void main(String[] args) {
    System.out.println(newton(25));
  }

  public static int newton(int x) {
    return (int)sqrt(x,x);
  }

  // 二分法
  public static int binarySearch(int x) {
    int index = -1, l = 0, r = x;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (mid * mid <= x) {
        index = mid;
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return index;
  }

  // 牛顿迭代
  public static double sqrt(double i, int x) {
    double result = (i + x / i) / 2;
    if (result == i) {
      return i;
    }else {
     return sqrt(result,x);
    }
  }
}
