package com.xiaozhi.pkg.arrays;

import java.util.Arrays;

public class Array07 {
  public static void main(String[] args) {
//    int[] src = {1, 2, 3};
//    int[] dest = new int[3];
//
//    System.arraycopy(src, 0, dest, 0, 3);
//    System.out.println(Arrays.toString(dest));

    int[] src = {1,2,3};
    int[] dest = new int[3];

    System.arraycopy(src,0,dest,0,src.length);
    System.out.println(Arrays.toString(dest));
  }
}
