package com.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class Sender {

	/**
	 * 信息的发送端
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//1.进行数据的打包--包括要发送的数据的byte数组,接受端的IP地址和端口号
		String str ="我的第一个UDP信息";//需要发送的信息
		byte[] sendmsg = str.getBytes();
		
			//接受端的地址
		SocketAddress address = new InetSocketAddress("192.168.64.188",8888);
		
			//进行数据的打包
		DatagramPacket dp = new DatagramPacket(sendmsg,sendmsg.length,address);
		
		
		//2.创建一个DatagramSocket对象,
		DatagramSocket sender =new DatagramSocket();//JVM随机分配本机的一个空闲端口号
		//DatagramSocket sender1 =new DatagramSocket(7777);//调用者指定一个空闲的端口号进行发送
		
		//3.使用send方法进行数据包的发送
		sender.send(dp);
		
		//4.释放资源
		sender.close();
		
		System.out.println("发送成功");
		
	}
}
