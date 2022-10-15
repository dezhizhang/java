package com.xiaozhi.pkg.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net02 {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(8082);
    System.out.println("服务端启动等待连接8082");
    Socket accept = serverSocket.accept();

    System.out.println("accept" + accept.getClass());
    //读取sock数据
    InputStream inputStream = accept.getInputStream();
    byte[] buf = new byte[1024];
    int readLength = 0;
    while ((readLength = inputStream.read(buf)) != -1) {
      System.out.println(new String(buf, 0, readLength));
    }


    // 关闭流和socket
    inputStream.close();
    accept.close();
    serverSocket.close();
  }
}
