package com.work.day3.wh;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void recviceFile(int port) throws IOException{
		ServerSocket server = new ServerSocket(port);
		Socket client  = server.accept();
	    InputStream is = 	client.getInputStream();
	   
	  
	    int length =   is.read();
	    System.out.println(length);
	    
	    byte[] nameByte = new  byte[length];
	    is.read(nameByte);
	    String fileName = new String(nameByte).trim();
	    System.out.println(fileName);
	    File file = new File("D:/2000/"+fileName);
	  
	    file.createNewFile();
	 
	    byte[] temp = new  byte[is.available()];
	    is.read(temp);
	    //写出新文件的文件输出流
	    FileOutputStream fos = new FileOutputStream(file);
	    fos.write(temp);
	    fos.flush();
	    System.out.println("上传OK");
	    fos.close();
	    server.close();
	}


	
	public static void main(String[] args) {
		try {
			recviceFile(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
