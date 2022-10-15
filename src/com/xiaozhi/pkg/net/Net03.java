package com.xiaozhi.pkg.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Net03 {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket(InetAddress.getLocalHost(), 8082);
    System.out.println("=========连接成功" + socket);
    OutputStream outputStream = socket.getOutputStream();
    outputStream.write("hello world".getBytes());
    outputStream.close();
    socket.close();
    System.out.println("========客户端退出=======");

  }
}
