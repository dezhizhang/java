package com.xiaozhi.pkg.mysql;

import com.xiaozhi.pkg.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Mysql15 {
  public static void main(String[] args) throws Exception {
    Connection connection = JDBCUtils.getConnection();
    String sql = "insert into users values(null,?,?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    System.out.println("开始执行");
    long start = System.currentTimeMillis();
    for (int i = 0; i < 5000; i++) {
      preparedStatement.setString(1, "小明" + i);
      preparedStatement.setInt(2, 20);
      preparedStatement.addBatch();
      if((i+1) %5000 ==0) {
        preparedStatement.executeBatch();
        preparedStatement.clearBatch();
      }
      //preparedStatement.executeUpdate();

    }
    long end = System.currentTimeMillis();
    System.out.println("结束执行" + (end - start));

    JDBCUtils.close(null, preparedStatement, connection);

  }
}
