package com.xiaozhi.pkg.mysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Mysql08 {
  public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

    Properties properties = new Properties();
    properties.load(new FileInputStream("./mysql.properties"));

    String user = properties.getProperty("user");
    String url = properties.getProperty("url");
    String password = properties.getProperty("password");
    Class.forName(properties.getProperty("driver"));

    Connection connection = DriverManager.getConnection(url, user, password);
    System.out.println("第5种方式连接" + connection);
  }
}
