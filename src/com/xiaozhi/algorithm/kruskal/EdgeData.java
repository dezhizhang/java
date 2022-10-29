package com.xiaozhi.algorithm.kruskal;


class EdgeData {
  char start;
  char end;
  int weight;

  public EdgeData(char start, char end, int weight) {
    this.start = start;
    this.end = end;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "EData{" + "start=" + start + ", end=" + end + ", weight=" + weight + '}';
  }
}
