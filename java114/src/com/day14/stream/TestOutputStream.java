package com.day14.stream;

import java.io.*;

/**
 * 字节输出流:程序----字节---->文件
 * */
public class TestOutputStream {
	public static void main(String[] args) throws Exception {
		//一.创建目标文件的对象
		File file = new File("D:/test.txt");
		
		//二.创建文件对象的输出流
		FileOutputStream fos =  new FileOutputStream(file);//覆盖原文件内容,从文件的开头写
					//fos = new FileOutputStream(file,true);//从文件的末尾进行追加内容
		
		//三.进行文件的写入(必须将内容转换为字节)
			String str ="my first OutputStream!";
			byte[] temp = str.getBytes();
			
			//一次性写入所有
			fos.write(temp);
			
			/*//一个一个写
			for(byte b:temp){
				fos.write(b);
			}*/
			
		
		 //四 刷新输出流,并释放资源
			fos.flush();
			fos.close();
			
			
	
	}
}
