package com.day14.stream;

import java.io.*;

public class TestInputStream {

	/**
	 * 字节输入流:  文件---字节---->程序
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//读取文件的步骤
		
		//一.创建目标文件的File对象
		File file = new File("D:/test.txt");
		
		//二.创建到此文件对象的输入流
		FileInputStream fis = new FileInputStream(file);
		
		String str = "";
		//三.以字节为单位读取文件内容
			//1.每次读取单个字节---不太适合读取中文
			int c = 0;
			while((c=fis.read())!=-1){
				str +=(char)c; 
			}
			System.out.println(str);
			
		
			//2.先创建定长的byte数组做为缓冲区,每次从流中读取缓冲区长度的字节数
			/*byte[] temp = new byte[30];
			while(fis.read(temp, 0, temp.length)!=-1){
				str +=new String(temp);
			}
			System.out.println(str.trim());*/
		
			//3.一次性将流中所有字节读取出
				//创建与流中字节数相同的byte数组
		/*	byte[] temp = new byte[fis.available()];
				//将所有字节读入temp数组
			fis.read(temp);
				//将byte数组进行处理
			str = new String(temp);
			System.out.println(str);*/
			
		//四.关闭资源
		fis.close();
	}

}
