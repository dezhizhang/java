package com.xiaozhi.algorithm.arrageCoin;

public class ArrangeCoins {
  public static void main(String[] args) {
      System.out.println(arrangeCoins(10));
      System.out.println(arrangeCoins2(10));

      System.out.println(arrangeCoins3(10));
  }
  public static int arrangeCoins(int n) {
    for(int i=1;i <=n;i++) {
      n = n - i;
      if(n <= i) {
        return i;
      }
    }
    return 0;
  }

  public static int arrangeCoins2(int n) {
    int low = 0;
    int high = n;
    while (low <= high) {
      long mid = (high - low) / 2 + low;
      long cost = ((mid + 1) * mid) / 2;
      if(cost == 2) {
        return (int)mid;
      }else if(cost > n) {
        high = (int)(mid - 1);
      }else {
        low = (int) (mid + 1);
      }
    }
    return high;
  }

  public static int arrangeCoins3(int n) {
    if(n == 0) {
      return 0;
    }
    return (int) sqrt(n,n);
  }

  public static double sqrt(double x,double n) {
    double r = (x + (n * 2) / x) / 2;
    if(r == x) {
      return x;
    }else {
      return sqrt(r,n);
    }
  }

}
