package com.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class Sender {

	/**
	 * ��Ϣ�ķ��Ͷ�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//1.�������ݵĴ��--����Ҫ���͵����ݵ�byte����,���ܶ˵�IP��ַ�Ͷ˿ں�
		String str ="�ҵĵ�һ��UDP��Ϣ";//��Ҫ���͵���Ϣ
		byte[] sendmsg = str.getBytes();
		
			//���ܶ˵ĵ�ַ
		SocketAddress address = new InetSocketAddress("192.168.64.188",8888);
		
			//�������ݵĴ��
		DatagramPacket dp = new DatagramPacket(sendmsg,sendmsg.length,address);
		
		
		//2.����һ��DatagramSocket����,
		DatagramSocket sender =new DatagramSocket();//JVM������䱾����һ�����ж˿ں�
		//DatagramSocket sender1 =new DatagramSocket(7777);//������ָ��һ�����еĶ˿ںŽ��з���
		
		//3.ʹ��send�����������ݰ��ķ���
		sender.send(dp);
		
		//4.�ͷ���Դ
		sender.close();
		
		System.out.println("���ͳɹ�");
		
	}
}
