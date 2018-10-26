package com.day3.udpChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

	/**
	 * 客户先发起请求,然后接受回执
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(7777);//UDP
		//接收端的地址
		SocketAddress address = new InetSocketAddress("192.168.64.188",8888);
		
		//使用Scanner进行键盘输入
		Scanner input = new Scanner(System.in);
		System.out.println("需要咨询什么");
		String msg = input.next();//输入的咨询信息
		
		
		
		
		do{
			byte[] sendTemp = msg.getBytes();
			//用于发送的包
			DatagramPacket dp = new DatagramPacket(sendTemp,sendTemp.length,address);
			System.out.println("客户:"+msg);
			ds.send(dp);
		
			//接受回执
			//用于接收的包
			byte[] recTemp = new byte[1024];//用于接收数据的byte数组
			DatagramPacket recDp = new DatagramPacket(recTemp,recTemp.length);
			ds.receive(recDp);
			System.out.println("咨询师:"+new String(recTemp).trim());
			
			//决定是否再次聊天
			msg = input.next();
		}while(!"bye".equals(msg));
		
		System.out.println("欢迎你的咨询,下次再见!");
		ds.close();
	}

}
