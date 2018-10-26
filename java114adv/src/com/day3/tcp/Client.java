package com.day3.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * 客户端:必须先开启服务器端
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建指向服务器端的套接字对象(IP地址和端口)
		Socket client = new Socket("192.168.64.188",7777);
		
		//2.获取Socket对象的输入(读入)/输出流(写出)与服务器进行信息的交换
		 OutputStream os =  client.getOutputStream();//用于向服务器发送信息
		
		 String msg = "我的第一个TCP";
		//3.使用write方法写出信息/使用read方法读入信息
		 os.write(msg.getBytes());
		 os.flush();
		 System.out.println("发送成功");
		
		 //4.释放资源
		  client.close();
		
	}

}
