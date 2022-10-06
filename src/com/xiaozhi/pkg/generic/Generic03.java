package com.xiaozhi.pkg.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic03 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    
    Pig<A> pig = new Pig<A>(new A());
    Pig<A> pig1 = new Pig<A>(new B());
  }
}


class A {

}

class B extends A {

}

class Pig<T> {
  T e;

  public Pig(T e) {
    this.e = e;
  }

  public T getE() {
    return e;
  }
}
