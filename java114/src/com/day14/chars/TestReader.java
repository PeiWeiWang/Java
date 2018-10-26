package com.day14.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestReader {

	/**
	 *字符输入流:操作字符
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//一.创建目标文件的File对象
		File file = new File("D:/test.txt");
		
		//二.创建File对象的字符输入流
		FileReader fr = new FileReader(file);
		String str = "";
		
		//三.将文件以字符的形式进行读取
			//1.一个一个字符的读取
		 	/*while(fr.ready()){
		 		str+=(char)fr.read();
		 	}
		 	System.out.println(str);	
		 	*/
		 
		//2.使用缓冲区读取
		char[] buf =  new char[20];
		while(fr.read(buf)!=-1){
			System.out.println(new String(buf));
			str+=new String(buf);
		}
		
	 	
		System.out.println(str);
		
		//四.释放资源
		fr.close();
	}

}
