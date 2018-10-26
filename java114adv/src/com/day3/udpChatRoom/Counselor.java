package com.day3.udpChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Counselor {

	/**
	 * ��ѯʦ:�Ƚ�����ѯ,�ٷ�����Ϣ
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);//����8888�˿�
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������ȴ���");
		String msg = "";
		
		while(!"bye".equals(msg)){
			byte[] recTemp = new byte[1024];//���ڽ������ݵ�byte����
			DatagramPacket recDp = new DatagramPacket(recTemp,recTemp.length);
			msg = new String(recTemp).trim();
			ds.receive(recDp);
			System.out.println("�ͻ�:"+msg);
			
			//���ͻ�ִ
			SocketAddress address =recDp.getSocketAddress();
			String sendMsg = input.next();
			byte[] temp = sendMsg.getBytes();
			DatagramPacket sendDp = new DatagramPacket(temp,temp.length,address);
			ds.send(sendDp);
			
		}
		System.out.println("�ͻ���������");
		ds.close();

	}

}
