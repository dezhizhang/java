package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtils;
import com.xiaozhi.pkg.utils.JDBCUtilsByDruid;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql17 {
  public static void main(String[] args) {

  }
  @Test
  public void testSelect() {
    Connection connection = JDBCUtilsByDruid.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql = "select * from users";

    try {
      preparedStatement = connection.prepareStatement(sql);
      resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        int age = resultSet.getInt("age");
        String name = resultSet.getString("name");
        System.out.println("id=" + id + "name=" + name + "age=" + age);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }
}
