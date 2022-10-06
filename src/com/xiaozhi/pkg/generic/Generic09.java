package com.xiaozhi.pkg.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Generic09 {
  public static void main(String[] args) {

  }
  @Test
  public void TestList() {
    Dao<User> dao = new Dao<>();
    dao.save("001",new User());
    dao.save("002",new User());
    dao.save("003",new User());

    System.out.println(dao.list());
  }
}

class User{

}

class Dao<T> {
  private Map<String, T> map = new HashMap<>();

  public T get(String id) {
    return map.get(id);
  }

  public void update(String id, T entity) {
    map.put(id, entity);
  }

  public List<T> list() {
    List<T> list = new LinkedList<>();
    Set<String> keySet = map.keySet();
    for (String key : keySet) {
      list.add(get(key));
    }
    return list;
  }

  public void delete(String id) {
    map.remove(id);
  }

  public void save(String id, T entity) {
    map.put(id, entity);
  }

}
