package com.xiaozhi.algorithm.primeNumber;

public class PrimeNumber {
  public static void main(String[] args) {
    System.out.println(eratosthenes(100));
  }

  public static int bf(int n) {
    int count = 0;
    for (int i = 2; i < n; i++) {
      count += isPrime(i) ? 1 : 0;
    }
    return count;
  }

  public static boolean isPrime(int x) {
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static int eratosthenes(int n) {
    boolean[] isPrime = new boolean[n];
    int count = 0;
    for(int i = 2;i < n;i++) {
      if(!isPrime[i]) {
        count++;
        for(int j=2 * i; j < n;j+=i) {
          isPrime[j] = true;
        }
      }
    }
    return count;
  }
}


