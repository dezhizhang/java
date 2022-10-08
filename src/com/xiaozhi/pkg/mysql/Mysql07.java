package com.xiaozhi.pkg.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql07 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/java?useUnicode=true&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true";
    String user = "root";
    String password = "701XTAY1993";

    Connection connection = DriverManager.getConnection(url, user, password);
    System.out.println("第四种方式连接" + connection);
  }
}
