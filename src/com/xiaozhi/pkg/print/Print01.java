package com.xiaozhi.pkg.print;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Print01 {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gin");
    String sql = "select * from user";

    Statement statement = connection.createStatement();
    statement.executeUpdate(sql);

    statement.close();
    connection.close();
    System.out.println("成功");

  }
}
