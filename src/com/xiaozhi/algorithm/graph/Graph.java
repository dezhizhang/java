package com.xiaozhi.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
  private ArrayList<String> vertexList;
  private int[][] edges; // 存储图对应的邻结矩阵
  private int numOfEdges; // 表示边的数目

  public static void main(String[] args) {
    int n = 5;
    String[] vertexs = {"A", "B", "C", "D", "E"};

    Graph graph = new Graph(n);
    for (String vertex : vertexs) {
      graph.insertVertex(vertex);
    }
    graph.insertEdge(0, 1, 1);
    graph.insertEdge(0, 2, 1);
    graph.insertEdge(1, 2, 1);
    graph.insertEdge(1, 3, 1);
    graph.insertEdge(1, 4, 1);

    //显示矩阵
    graph.showGraph();

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
  public void insertEdge(int v1, int v2, int weight) {
    edges[v1][v2] = weight;
    edges[v2][v1] = weight;
    numOfEdges++;
  }

  // 返回结点的个数
  public int getNumOfVertex() {
    return vertexList.size();
  }

  // 得到边的数目
  public int getNumOfEdges() {
    return this.numOfEdges;
  }

  // 返回结点i对应的数据
  public String getValueByIndex(int i) {
    return vertexList.get(i);
  }

  // 返回v1和v1的权值
  public int getWeight(int v1, int v2) {
    return edges[v1][v2];
  }

  // 显示图的矩阵
  public void showGraph() {
    for (int[] link : edges) {
      System.out.println(Arrays.toString(link));
    }
  }

}
