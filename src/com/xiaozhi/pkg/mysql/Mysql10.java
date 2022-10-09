package com.xiaozhi.pkg.mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Mysql10 {
  public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
    Properties properties = new Properties();
    properties.load(new FileInputStream("./mysql.properties"));
    String url = properties.getProperty("url");
    String user = properties.getProperty("user");
    String password = properties.getProperty("password");


    Class.forName(properties.getProperty("driver"));

    Connection connection = DriverManager.getConnection(url, user, password);
    String sql = "select id, name,age from users where name=? and age= ?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, "小明");
    preparedStatement.setInt(2, 12);

    ResultSet resultSet = preparedStatement.executeQuery();

    while (resultSet.next()) {
      String id = resultSet.getString(1);
      String name = resultSet.getString("name");
      int age = resultSet.getInt("age");
      System.out.println(id + "\t" + name + "\t" + age);
    }
    // 关闭连接
    resultSet.close();
    connection.close();
    preparedStatement.close();
  }
}
