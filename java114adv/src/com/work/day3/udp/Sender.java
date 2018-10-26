package com.work.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class Sender {

	/**
	 * 客户端:先发再收
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("-----客户端开启-----");
		DatagramPacket sendDp = new DatagramPacket("在么?".getBytes(),4,
				new InetSocketAddress ("192.168.64.188",8888));
		
		DatagramSocket sender = new DatagramSocket(7777);
		sender.send(sendDp);
		
		System.out.println("客户端:在么?");
		
		//接受回执
		byte[] temp = new byte[100];
		DatagramPacket recDp = new DatagramPacket(temp,temp.length);
		sender.receive(recDp);
		System.out.println("服务器:"+new String(temp).trim());
		
		sender.close();
		
		
	}
}
