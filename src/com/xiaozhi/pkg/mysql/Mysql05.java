package com.xiaozhi.pkg.mysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Mysql05 {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    //1.注册驱动
    Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
    Driver driver = (Driver) aClass.newInstance();
    String url = "jdbc:mysql://localhost:3306/java?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "701XTAY1993";
    // 得到连接
//    Properties properties = new Properties();
//    properties.setProperty("user", "root");
//    properties.setProperty("password", "701XTAY1993");

    DriverManager.registerDriver(driver);
    Connection connection = DriverManager.getConnection(url, user, password);
    System.out.println(connection);


  }
}
