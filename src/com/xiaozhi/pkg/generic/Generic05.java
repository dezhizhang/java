package com.xiaozhi.pkg.generic;

@SuppressWarnings({"all"})
public class Generic05 {
  public static void main(String[] args) {
      Tiger g2 = new Tiger("john~");
      g2.setT("yy");
      System.out.println(g2.toString());
  }
}



class Tiger<T,R,M> {
  String name;
  R r;
  M m;
  T t;

  public Tiger(String name) {
    this.name = name;
  }

  public  Tiger(String name,R r,M m,T t) {
    this.name = name;
    this.r = r;
    this.m = m;
    this.t = t;
  }

  public void setR(R r) {
    this.r = r;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public M getM() {
    return m;
  }

  public T getT() {
    return t;
  }

  public void setM(M m) {
    this.m = m;
  }

  public void setT(T t) {
    this.t = t;
  }

  public R getR() {
    return r;
  }

  @Override
  public String toString() {
    return this.name + this.t + this.m + this.r;
  }
}

