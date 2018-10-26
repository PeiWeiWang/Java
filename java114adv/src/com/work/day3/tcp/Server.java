package com.work.day3.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * 服务器:先收后发
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("-----服务器开启----");
		//1.创建指定端口的服务器端套接字ServerSocket对象
		ServerSocket server = new ServerSocket(7777);
		
		//2.侦听并接受到此套接字的连接。(等待客户端请求)
		Socket socket = server.accept();//接受客户端套接字对象
		
		//3.获取客户端套接字对象的输入/输出流进行信息的交换
		InputStream is = socket.getInputStream();

		//4.使用write方法写出信息/使用read方法读入信息
		byte[] temp = new byte[100];
		is.read(temp);
		
		System.out.println("客户端:"+new String(temp).trim());
		
		
		
		//发送回执
		 OutputStream os =  socket.getOutputStream();//用于向服务器发送信息
		 String msg = "接受成功";
		 os.write(msg.getBytes());
		 os.flush();
		
		//5.释放资源
		server.close();
		
	}

}
