package com.tower.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
  private static String user;
  private static String password;
  private static String url;
  private static String driver;

  static {
    Properties properties = new Properties();
    try {
      properties.load(new FileInputStream("./mysql.properties"));
      url = properties.getProperty("url");
      user = properties.getProperty("user");
      password = properties.getProperty("password");
      driver = properties.getProperty("driver");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  // 调用链接
  public static Connection getConnection() {
    try {
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  // 关闭连接
  public static void close(ResultSet resultSet, Statement statement, Connection connection) {
    try {
      if (resultSet != null) {
        resultSet.close();
      }
      if (statement != null) {
        statement.close();
      }
      if (connection != null) {
        statement.close();
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
