package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mysql14 {
  public static void main(String[] args) throws SQLException {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    String sql = "update users set balance = balance - 100 where id = 1";
    String sql2 = "update users set balance = balance + 100 where id = 2";

    try {
      connection = JDBCUtils.getConnection();
      connection.setAutoCommit(false);
      preparedStatement = connection.prepareStatement(sql);
      preparedStatement.executeUpdate();
      preparedStatement = connection.prepareStatement(sql2);
      preparedStatement.executeUpdate();
      connection.commit();
    } catch (SQLException e) {
      System.out.println("执行发生了异常");
      connection.rollback();
      throw new RuntimeException(e);
    } finally {
      JDBCUtils.close(null, preparedStatement, connection);
    }
  }
}
