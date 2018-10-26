package com.work.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Reciver {

	/**
	 * 接受端:先收后发
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("-------服务器等待中--------");
		DatagramSocket reciver = new DatagramSocket(8888);
		
		byte[] temp = new byte[100];
		DatagramPacket recDp = new DatagramPacket(temp,temp.length);
		reciver.receive(recDp);
		
		System.out.println("客户端:"+new String(temp).trim());
		
		//发送回执
		DatagramPacket sendDp = new DatagramPacket("呵呵.".getBytes(),4,
				new InetSocketAddress ("192.168.64.188",7777));
		
		reciver.send(sendDp);
		reciver.close();
		System.out.println("服务器:呵呵.");
	}

}
