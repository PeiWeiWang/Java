package com.day3;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Date;

public class SendFeiQ {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		String str = "������Q";
		long time = new Date().getTime() ;
		String name = "������ʦ";
		String ip = "192.168.64.188";
		
		long IPMSG_SENDMSG = 0x00000020;
		byte[] buffer = ("1:" +time + ":" +name  + ":"  
                + ip + ":" + IPMSG_SENDMSG + ":" + str)  
                .getBytes("gbk");
		
		//��Q�Ķ˿�Ϊ2425
		SocketAddress address = new InetSocketAddress("192.168.64.188",2425);
		
		DatagramPacket dp = new DatagramPacket(buffer,buffer.length,address);
		DatagramSocket sender  = new DatagramSocket();
		
		sender.send(dp);		
	

		sender.close();
	}

}
