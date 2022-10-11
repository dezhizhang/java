package com.xiaozhi.pkg.use;

import com.xiaozhi.pkg.reflection.Cat;

import java.util.Arrays;

public class Use {

  public static void main(String[] args) {
    //类的引用
    int[] arrays = {-1, 20, 2, 13, 3};
    Arrays.sort(arrays);

    for (int i = 0; i < arrays.length; i++) {
      System.out.print(arrays[i] + "\t");
    }
  }

}
