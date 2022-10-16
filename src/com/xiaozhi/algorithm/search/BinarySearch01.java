package com.xiaozhi.algorithm.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch01 {
  public static void main(String[] args) {
    int arr[] = {1, 8, 10, 89, 89, 89, 1000, 1234};
    List<Integer> list = binarySearch(arr, 0, arr.length, 89);
    System.out.println(list);
  }

  public static ArrayList<Integer> binarySearch(int[] arr, int left, int right, int value) {

    if (left > right) {
      return new ArrayList<Integer>();
    }
    int mid = (left + right) / 2;
    int midVal = arr[mid];

    if (value > midVal) {
      return binarySearch(arr, mid + 1, right, value);
    } else if (value > midVal) {
      return binarySearch(arr, left, mid - 1, value);
    } else {
      List<Integer> list = new ArrayList<>();
      int temp = mid - 1;
      while (true) {
        if (temp < 0 || arr[temp] != value) {
          break;
        }
        list.add(temp);
        temp -= 1;
      }
      list.add(mid);
      temp = mid + 1;
      while (true) {
        if (temp > arr.length - 1 || arr[temp] != value) {
          break;
        }
        list.add(temp);
        temp += 1;
      }
      return (ArrayList<Integer>) list;
    }

  }
}


