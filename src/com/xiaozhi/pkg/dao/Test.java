package com.xiaozhi.pkg.dao;

import java.util.List;

public class Test {
  @org.junit.jupiter.api.Test
  public void TestDao() {
    Dao dao = new Dao();
//    String sql = "select * from users";
//    List<Users> list = dao.queryMulti(sql, Users.class);
//    System.out.println("=======查询结果====");
//    for (Users user : list) {
//      System.out.println(user);
//    }
//    System.out.println("=======查询结果====");
//    String sql1 = "select * from users where id=?";
//    Users user = dao.querySingle(sql1, Users.class, 1);
//    System.out.println(user);

    System.out.println("=====查询结果=====");
    String sql2 = "delete * from users where id=?";
    int col = dao.update(sql2, Users.class, 1);
    System.out.println(col);


  }
}
