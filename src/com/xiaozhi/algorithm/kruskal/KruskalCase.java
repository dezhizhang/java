package com.xiaozhi.algorithm.kruskal;

public class KruskalCase {
  private int edgeNum; //边的个数
  private char[] vertex; // 顶点数组
  private int[][] matrix; // 邻接矩阵
  private static final int INF = Integer.MAX_VALUE;

  public KruskalCase(char[] vertex, int[][] matrix) {
    // 初始化顶点和边的个数
    int vLen = vertex.length;

    // 初始化顶点
    this.vertex = new char[vLen];
    for (int i = 0; i < vertex.length; i++) {
      this.vertex[i] = vertex[i];
    }

    // 初始化邻接矩阵
    this.matrix = new int[vLen][vLen];
    for (int i = 0; i < vLen; i++) {
      for (int j = 0; j < vLen; j++) {
        this.matrix[i][j] = matrix[i][j];
      }
    }

    // 统计边
    for (int i = 0; i < vLen; i++) {
      for (int j = 0; j < vLen; j++) {
        if (this.matrix[i][j] != INF) {
          edgeNum++;
        }
      }
    }

  }

  // 打印邻接矩阵
  public void print() {
    System.out.println("邻接矩阵:\n");
    for (int i = 0; i < vertex.length; i++) {
      for (int j = 0; j < vertex.length; j++) {
        System.out.printf("%12d", matrix[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * 功能：对边进行排序处理，冒泡排序
   *
   * @param edges 边的集合
   */
  public void sortEdges(EdgeData[] edges) {
    for (int i = 0; i < edges.length - 1; i++) {
      for (int j = 0; j < edges.length - 1 - i; j++) {
        if (edges[j].weight > edges[j + 1].weight) {
          EdgeData temp = edges[j];
          edges[j] = edges[j + 1];
          edges[j + 1] = temp;
        }
      }
    }
  }

  //获取顶点下标
  private int getPosition(char ch) {
    for (int i = 0; i < this.vertex.length; i++) {
      if (this.vertex[i] == ch) {
        return i;
      }
    }
    return -1;
  }

  public EdgeData[] getEdge() {
    int index = 0;
    EdgeData[] edges = new EdgeData[edgeNum];
    for (int i = 0; i < vertex.length; i++) {
      for (int j = i + 1; j < vertex.length; j++) {
        if (matrix[i][j] != INF) {
          edges[index++] = new EdgeData(vertex[i], vertex[j], matrix[i][j]);
        }
      }
    }
    return edges;
  }


}
