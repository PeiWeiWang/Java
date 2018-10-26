package com.work.day3.wh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void sendFile(String filePath,String hostname,int port) throws IOException{
		//先获取文件名,然后将文件读取出来
		File file = new File(filePath);
		String fileName = file.getName();
		System.out.println(fileName.getBytes().length);
		FileInputStream fis = new FileInputStream(file);
		byte[] temp = new byte[fis.available()];
		fis.read(temp);
		
		//创建客户端的Socket
		Socket socket = new Socket(hostname,port);
		OutputStream os =  socket.getOutputStream();
		os.write(fileName.getBytes().length);
		os.flush();
		os.write(fileName.getBytes());//先发文件名
		os.flush();
		os.write(temp);
		os.flush();
		
		fis.close();
		socket.close();
		System.out.println("发送成功");
	}
	
	public static void main(String[] args) {
		try {
			sendFile("E:/课程/Java.zip","192.168.64.188",8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
