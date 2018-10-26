package com.work.day3.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * ������:���պ�
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("-----����������----");
		//1.����ָ���˿ڵķ��������׽���ServerSocket����
		ServerSocket server = new ServerSocket(7777);
		
		//2.���������ܵ����׽��ֵ����ӡ�(�ȴ��ͻ�������)
		Socket socket = server.accept();//���ܿͻ����׽��ֶ���
		
		//3.��ȡ�ͻ����׽��ֶ��������/�����������Ϣ�Ľ���
		InputStream is = socket.getInputStream();

		//4.ʹ��write����д����Ϣ/ʹ��read����������Ϣ
		byte[] temp = new byte[100];
		is.read(temp);
		
		System.out.println("�ͻ���:"+new String(temp).trim());
		
		
		
		//���ͻ�ִ
		 OutputStream os =  socket.getOutputStream();//�����������������Ϣ
		 String msg = "���ܳɹ�";
		 os.write(msg.getBytes());
		 os.flush();
		
		//5.�ͷ���Դ
		server.close();
		
	}

}
