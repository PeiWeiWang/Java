package com.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciver {

	/**
	 * ���ܶ�:Ҫ�뱣֤�յ���Ϣ,�����ȿ������ܶ�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("���ܶ˿���");
		//1.����DatagramSocket����,����ָ���Ķ˿�(�뷢�Ͷ�Լ���õĶ˿�)
		DatagramSocket rec = new DatagramSocket(8888);
		
		//2.����һ�����ݱ���,���ڽ��ܷ���������Ϣ
		byte[] recmag = new byte[1024];
		DatagramPacket recDp = new DatagramPacket(recmag,recmag.length);
		
		//3.����receive������������,�������ݴ���
		rec.receive(recDp);
		System.out.println(recDp.getAddress()+":"+new String(recDp.getData()).trim());
		
		//4.�ͷ���Դ
		rec.close();
	}

}
