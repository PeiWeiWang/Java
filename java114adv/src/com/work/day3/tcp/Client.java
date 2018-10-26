package com.work.day3.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * �ͻ���:�����ȿ�����������,�ȷ�����
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.����ָ��������˵��׽��ֶ���(IP��ַ�Ͷ˿�)
		Socket client = new Socket("192.168.64.188",7777);
		
		//2.��ȡSocket���������(����)/�����(д��)�������������Ϣ�Ľ���
		 OutputStream os =  client.getOutputStream();//�����������������Ϣ
		
		 String msg = "�ҵĵ�һ��TCP";
		//3.ʹ��write����д����Ϣ/ʹ��read����������Ϣ
		 os.write(msg.getBytes());
		 os.flush();
		 System.out.println("���ͳɹ�");
		 //׼�����ܷ������Ļ�ִ
		 InputStream is = client.getInputStream();
			byte[] temp = new byte[100];
			is.read(temp);
			System.out.println("������:"+new String(temp).trim());
		 
		 
		 
		 //4.�ͷ���Դ
		  client.close();
		
	}

}
