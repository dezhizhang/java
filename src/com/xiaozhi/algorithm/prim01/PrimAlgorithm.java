package com.xiaozhi.algorithm.prim01;

import java.util.Arrays;

public class PrimAlgorithm {
  public static void main(String[] args) {
    char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    int verxs = data.length;

    int[][] weight = new int[][]{
      {10000, 5, 7, 10000, 10000, 10000, 2},
      {5, 10000, 10000, 9, 10000, 10000, 3},
      {7, 10000, 10000, 8, 10000, 10000, 10000},
      {10000, 9, 10000, 10000, 10000, 4, 10000},
      {10000, 10000, 8, 10000, 10000, 5, 4},
      {10000, 10000, 10000, 4, 5, 10000, 6},
      {2, 3, 10000, 10000, 4, 6, 10000},
    };

    //创建一个graph对像
    MGraph mGraph = new MGraph(verxs);

    MinTree minTree = new MinTree();
    minTree.createGraph(mGraph,verxs,data,weight);

    minTree.showGraph(mGraph);
  }
}

class MinTree {
  public void createGraph(MGraph graph, int verxs, char data[], int[][] weight) {
    for (int i = 0; i < verxs; i++) {
      graph.data[i] = data[i];
      for (int j = 0; j < verxs; j++) {
        graph.weight[i][j] = weight[i][j];
      }
    }
  }

  public void showGraph(MGraph graph) {
    for (int[] link : graph.weight) {
      System.out.println(Arrays.toString(link));
    }
  }
}

class MGraph {
  int verxs; // 表示图的节点个数
  char[] data;//存放结点数据
  int[][] weight;

  public MGraph(int verxs) {
    this.verxs = verxs;
    data = new char[verxs];
    weight = new int[verxs][verxs];
  }
}


