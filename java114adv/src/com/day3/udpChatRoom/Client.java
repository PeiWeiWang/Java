package com.day3.udpChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Client {

	/**
	 * �ͻ��ȷ�������,Ȼ����ܻ�ִ
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(7777);//UDP
		//���ն˵ĵ�ַ
		SocketAddress address = new InetSocketAddress("192.168.64.188",8888);
		
		//ʹ��Scanner���м�������
		Scanner input = new Scanner(System.in);
		System.out.println("��Ҫ��ѯʲô");
		String msg = input.next();//�������ѯ��Ϣ
		
		
		
		
		do{
			byte[] sendTemp = msg.getBytes();
			//���ڷ��͵İ�
			DatagramPacket dp = new DatagramPacket(sendTemp,sendTemp.length,address);
			System.out.println("�ͻ�:"+msg);
			ds.send(dp);
		
			//���ܻ�ִ
			//���ڽ��յİ�
			byte[] recTemp = new byte[1024];//���ڽ������ݵ�byte����
			DatagramPacket recDp = new DatagramPacket(recTemp,recTemp.length);
			ds.receive(recDp);
			System.out.println("��ѯʦ:"+new String(recTemp).trim());
			
			//�����Ƿ��ٴ�����
			msg = input.next();
		}while(!"bye".equals(msg));
		
		System.out.println("��ӭ�����ѯ,�´��ټ�!");
		ds.close();
	}

}
