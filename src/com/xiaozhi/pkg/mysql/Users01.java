package com.xiaozhi.pkg.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;

public class Users01 {
  public static void main(String[] args) throws Exception {

    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java");
    String sql = "select * from user";

    Statement statement = connection.createStatement();
    statement.executeUpdate(sql);

    statement.close();
    connection.close();
    System.out.println("成功");

  }
}
