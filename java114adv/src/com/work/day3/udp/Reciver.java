package com.work.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Reciver {

	/**
	 * ���ܶ�:���պ�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("-------�������ȴ���--------");
		DatagramSocket reciver = new DatagramSocket(8888);
		
		byte[] temp = new byte[100];
		DatagramPacket recDp = new DatagramPacket(temp,temp.length);
		reciver.receive(recDp);
		
		System.out.println("�ͻ���:"+new String(temp).trim());
		
		//���ͻ�ִ
		DatagramPacket sendDp = new DatagramPacket("�Ǻ�.".getBytes(),4,
				new InetSocketAddress ("192.168.64.188",7777));
		
		reciver.send(sendDp);
		reciver.close();
		System.out.println("������:�Ǻ�.");
	}

}
