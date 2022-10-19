package com.xiaozhi.algorithm.graph;

import java.util.ArrayList;

public class Graph {
  private ArrayList<String> vertexList;
  private int[][] edges; // 存储图对应的邻结矩阵
  private int numOfEdges; // 表示边的数目

  public static void main(String[] args) {

  }

  public Graph(int n) {
    this.edges = new int[n][n];
    this.vertexList = new ArrayList<>(n);
    this.numOfEdges = 0;
  }

  // 插入节点
  public void insertVertex(String vertex) {
    vertexList.add(vertex);
  }
  // 添加边
  public void  insertEdge(int v1,int v2,int weight) {
    edges[v1][v2] = weight;
    edges[v2][v1] = weight;
    numOfEdges++;
  }

}
