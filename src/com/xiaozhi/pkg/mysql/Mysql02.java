package com.xiaozhi.pkg.mysql;

public class Mysql02 {
  public static void main(String[] args) {
     JdbcInterface jdbcInterface =  new MysqlJdbcImpl();
     jdbcInterface.getConnection();
     jdbcInterface.crud();
     jdbcInterface.close();

  }
}

