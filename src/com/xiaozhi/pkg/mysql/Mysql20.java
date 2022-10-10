package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class Mysql20 {
  public static void main(String[] args) {

  }
  public void testQuerySingle() {
    // 得到连接
    Connection connection = JDBCUtilsByDruid.getConnection();
    //使用DBUtils
    QueryRunner queryRunner = new QueryRunner();
    //执行查询
    String sql = "select * from users where id =?";
    try {
      Users users = queryRunner.query(connection, sql, new BeanHandler<>(Users.class),1);
      System.out.println(users);
//      for (Users user:list) {
//        System.out.println(user);
//      }
      JDBCUtilsByDruid.close(null,null,connection);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }


}
