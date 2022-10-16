package com.xiaozhi.algorithm.tree;

public class TreeToArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    ArrayBinaryTree tree = new ArrayBinaryTree(arr);
    tree.preOrder(0);

  }
}

class ArrayBinaryTree {
  private int[] arr;

  public ArrayBinaryTree(int[] arr) {
    this.arr = arr;
  }

  public void preOrder(int index) {
    if (arr == null || arr.length == 0) {
      System.out.println("数组为空不能遍历");
      return;
    }
    System.out.println(arr[index]);
    // 向右遍历
    if ((index * 2 + 1) < arr.length) {
      preOrder(2 * index + 1);
    }
    // 向右遍历
    if ((index * 2 + 2) < arr.length) {
      preOrder(2 * index + 2);
    }
  }
}
