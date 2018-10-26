package com.day3.udpChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Counselor {

	/**
	 * 咨询师:先接受咨询,再返回信息
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);//监视8888端口
		
		Scanner input = new Scanner(System.in);
		System.out.println("服务器等待中");
		String msg = "";
		
		while(!"bye".equals(msg)){
			byte[] recTemp = new byte[1024];//用于接收数据的byte数组
			DatagramPacket recDp = new DatagramPacket(recTemp,recTemp.length);
			msg = new String(recTemp).trim();
			ds.receive(recDp);
			System.out.println("客户:"+msg);
			
			//发送回执
			SocketAddress address =recDp.getSocketAddress();
			String sendMsg = input.next();
			byte[] temp = sendMsg.getBytes();
			DatagramPacket sendDp = new DatagramPacket(temp,temp.length,address);
			ds.send(sendDp);
			
		}
		System.out.println("客户结束聊天");
		ds.close();

	}

}
