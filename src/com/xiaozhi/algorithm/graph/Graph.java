package com.xiaozhi.algorithm.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
  private ArrayList<String> vertexList;
  private int[][] edges; // 存储图对应的邻结矩阵
  private int numOfEdges; // 表示边的数目

  private boolean[] isVisited; // 记录某个节点是否被访问

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
    //深度遍历
    graph.dfs();

  }

  public Graph(int n) {
    this.edges = new int[n][n];
    this.vertexList = new ArrayList<>(n);
    this.numOfEdges = 0;
    this.isVisited = new boolean[n];
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

  //得到第一个领接接点的下标
  public int getFirstNeighbor(int index) {
    for (int j = 0; j < vertexList.size(); j++) {
      if (edges[index][j] > 0) {
        return j;
      }
    }
    return -1;
  }

  //根据前一个领结的下标来获取下一个邻接结点
  public int getNextNeighbor(int v1, int v2) {
    for (int j = v2 + 1; j < vertexList.size(); j++) {
      if (edges[v1][j] > 0) {
        return j;
      }
    }
    return -1;
  }

  // 深入优先遍历
  public void dfs(boolean[] isVisited, int i) {
    System.out.printf(getValueByIndex(i) + ">");
    this.isVisited[i] = true;

    //查找节点i的第一个邻接结点w
    int w = getFirstNeighbor(i);

    while (w != -1) {
      if (!isVisited[w]) {
        dfs(isVisited, w);
      }
      w = getNextNeighbor(i, w);
    }
  }

  // 对dfs进行一次重载
  public void dfs() {
    for (int i = 0; i < getNumOfVertex(); i++) {
      if (!isVisited[i]) {
        dfs(isVisited, i);
      }
    }
  }

}
