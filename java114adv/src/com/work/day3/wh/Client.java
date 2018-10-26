package com.work.day3.wh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void sendFile(String filePath,String hostname,int port) throws IOException{
		//�Ȼ�ȡ�ļ���,Ȼ���ļ���ȡ����
		File file = new File(filePath);
		String fileName = file.getName();
		System.out.println(fileName.getBytes().length);
		FileInputStream fis = new FileInputStream(file);
		byte[] temp = new byte[fis.available()];
		fis.read(temp);
		
		//�����ͻ��˵�Socket
		Socket socket = new Socket(hostname,port);
		OutputStream os =  socket.getOutputStream();
		os.write(fileName.getBytes().length);
		os.flush();
		os.write(fileName.getBytes());//�ȷ��ļ���
		os.flush();
		os.write(temp);
		os.flush();
		
		fis.close();
		socket.close();
		System.out.println("���ͳɹ�");
	}
	
	public static void main(String[] args) {
		try {
			sendFile("E:/�γ�/Java.zip","192.168.64.188",8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
