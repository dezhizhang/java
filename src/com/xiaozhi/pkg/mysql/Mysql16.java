package com.xiaozhi.pkg.mysql;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class Mysql16 {
  public static void main(String[] args) throws Exception {
    Properties properties = new Properties();
    properties.load(new FileInputStream("./druid.properties"));
    // 创建一个指定参数库
    DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
    Connection connection = dataSource.getConnection();
    System.out.println("连接成功");
    connection.close();

  }
}
