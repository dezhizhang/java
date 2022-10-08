package com.xiaozhi.pkg.mysql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Mysql04 {
  public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    //1.注册驱动
    Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
    Driver driver = (Driver) aClass.newInstance();

    String url = "jdbc:mysql://localhost:3306/java?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true";

    // 得到连接
    Properties properties = new Properties();
    properties.setProperty("user", "root");
    properties.setProperty("password", "701XTAY1993");

    Connection connect = driver.connect(url, properties);
    System.out.println(connect);
    // 执行sql

    String sql = "insert into users values('422','刘德华','40')";
    // 用于执行sql语句并执行生成
    Statement statement = connect.createStatement();
    int rows = statement.executeUpdate(sql);
    System.out.println(rows > 0 ? "成功" : "失败");


    // 关闭连接
    statement.close();
    connect.close();
  }
}
