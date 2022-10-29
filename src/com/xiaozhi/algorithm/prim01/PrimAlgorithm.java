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
    minTree.createGraph(mGraph, verxs, data, weight);
//    prim

    minTree.prim(mGraph,0);
//    minTree.showGraph(mGraph);
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

  // 编写prim算法
  public void prim(MGraph graph, int v) {
    // 标记节点是否被访问过
    int visited[] = new int[graph.verxs];

    //把当前节点标记为访问
    visited[v] = 1;
    //h1和h2记录两个顶点下标
    int h1 = -1;
    int h2 = -1;

    // 将minWeight初始成一个大数
    int minWeight = 10000;

    for (int k = 1; k < graph.verxs; k++) {
      //i结点表示被访问过的结点
      for (int i = 0; i < graph.verxs; i++) {
        for (int j = 0; j < graph.verxs; j++) {
          //j节点表示还没有访问过的结点
          if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
            minWeight = graph.weight[i][j];
            h1 = i;
            h2 = j;
          }
        }
      }
      // 找到一条边是最小的
      System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + "权值" + minWeight);
      visited[h2] = 1;
      // 重新设置为最大值
      minWeight = 10000;
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


