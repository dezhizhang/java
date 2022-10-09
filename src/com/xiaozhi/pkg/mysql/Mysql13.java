package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql13 {
  public static void main(String[] args) {

  }
  @Test
  public void testSelect() {
    Connection connection = JDBCUtils.getConnection();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String sql = "select * from users";

    try {
      preparedStatement = connection.prepareStatement(sql);
      resultSet = preparedStatement.executeQuery();

      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int age = resultSet.getInt("age");
        System.out.println("id=" + id + "name=" + name + "age=" + age);
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtils.close(resultSet,preparedStatement,connection);
    }
  }
}
