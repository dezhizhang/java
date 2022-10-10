package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.use.Use;
import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mysql19 {
  public static void main(String[] args) {
    Connection connection = JDBCUtilsByDruid.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    ArrayList<Users> list = new ArrayList<>();
    String sql = "select * from users";

    try {
      preparedStatement = connection.prepareStatement(sql);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        int age = resultSet.getInt("age");
        String name = resultSet.getString("name");
        list.add(new Users(id,name,age));
      }
      System.out.println(list);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  @Test
  public void testQueryMany() {
    // 得到连接
    Connection connection = JDBCUtilsByDruid.getConnection();
    //使用DBUtils
    QueryRunner queryRunner = new QueryRunner();
    //执行查询
    String sql = "select * from users";
    try {
      List<Users> list = queryRunner.query(connection, sql, new BeanListHandler<>(Users.class));
      for (Users user:list) {
        System.out.println(user);
      }
      JDBCUtilsByDruid.close(null,null,connection);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  @Test
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
      JDBCUtilsByDruid.close(null,null,connection);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  // 返回单行单列
  @Test
  public void testScalar() {
    Connection connection = JDBCUtilsByDruid.getConnection();
    QueryRunner queryRunner = new QueryRunner();
    String sql = "select name from users where id =?";
    try{
      Object obj = queryRunner.query(connection,sql,new ScalarHandler<>(),1);
      System.out.println(obj);
      JDBCUtilsByDruid.close(null,null,connection);
    } catch (Exception e) {
      throw  new RuntimeException(e);
    }
  }
}
