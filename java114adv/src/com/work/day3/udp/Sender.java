package com.work.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class Sender {

	/**
	 * �ͻ���:�ȷ�����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("-----�ͻ��˿���-----");
		DatagramPacket sendDp = new DatagramPacket("��ô?".getBytes(),4,
				new InetSocketAddress ("192.168.64.188",8888));
		
		DatagramSocket sender = new DatagramSocket(7777);
		sender.send(sendDp);
		
		System.out.println("�ͻ���:��ô?");
		
		//���ܻ�ִ
		byte[] temp = new byte[100];
		DatagramPacket recDp = new DatagramPacket(temp,temp.length);
		sender.receive(recDp);
		System.out.println("������:"+new String(temp).trim());
		
		sender.close();
		
		
	}
}
