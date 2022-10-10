package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Mysql18 {
  public static void main(String[] args) {

  }
  @Test
  public void testSelect1() {
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
}
