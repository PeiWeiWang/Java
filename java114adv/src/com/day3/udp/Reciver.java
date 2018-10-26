package com.day3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Reciver {

	/**
	 * 接受端:要想保证收到信息,必须先开启接受端
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("接受端开启");
		//1.创建DatagramSocket对象,监视指定的端口(与发送端约定好的端口)
		DatagramSocket rec = new DatagramSocket(8888);
		
		//2.创建一个数据报包,用于接受发送来的信息
		byte[] recmag = new byte[1024];
		DatagramPacket recDp = new DatagramPacket(recmag,recmag.length);
		
		//3.调用receive方法接受数据,进行数据处理
		rec.receive(recDp);
		System.out.println(recDp.getAddress()+":"+new String(recDp.getData()).trim());
		
		//4.释放资源
		rec.close();
	}

}
