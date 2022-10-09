package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mysql12 {
  public static void main(String[] args) {

  }
  @Test
  public void testDML() {
    Connection connection = JDBCUtils.getConnection();
    PreparedStatement preparedStatement = null;
    String sql = "update users set name=? where id =?";

    try {
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setString(1,"小明");
      preparedStatement.setInt(2,12314);

      preparedStatement.executeUpdate();

    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      JDBCUtils.close(null,preparedStatement,connection);
    }
  }
}
