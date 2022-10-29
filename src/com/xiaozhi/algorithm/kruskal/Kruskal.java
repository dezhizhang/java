package com.xiaozhi.algorithm.kruskal;

import java.util.Arrays;

public class Kruskal {
  private static final int INF = Integer.MAX_VALUE;

  public static void main(String[] args) {
    char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};


    int[][] matrix = new int[][]{
      {0, 12, INF, INF, INF, 16, 14},
      {12, 0, 10, INF, INF, 7, INF},
      {INF, 10, 0, 3, 5, 6, INF},
      {INF, INF, 3, 0, 4, INF, INF},
      {INF, INF, 5, 4, 0, 2, 8},
      {16, 7, 6, INF, 2, 0, 9},
      {14, INF, INF, INF, 8, 9, 0},
    };

    // 创建
    KruskalCase kruskalCase = new KruskalCase(vertex, matrix);
    kruskalCase.print();

    EdgeData[] edges = kruskalCase.getEdge();

    kruskalCase.sortEdges(edges);

    System.out.println(Arrays.toString(edges));

  }
}


