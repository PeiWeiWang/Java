package com.day14.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestReader {

	/**
	 *�ַ�������:�����ַ�
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//һ.����Ŀ���ļ���File����
		File file = new File("D:/test.txt");
		
		//��.����File������ַ�������
		FileReader fr = new FileReader(file);
		String str = "";
		
		//��.���ļ����ַ�����ʽ���ж�ȡ
			//1.һ��һ���ַ��Ķ�ȡ
		 	/*while(fr.ready()){
		 		str+=(char)fr.read();
		 	}
		 	System.out.println(str);	
		 	*/
		 
		//2.ʹ�û�������ȡ
		char[] buf =  new char[20];
		while(fr.read(buf)!=-1){
			System.out.println(new String(buf));
			str+=new String(buf);
		}
		
	 	
		System.out.println(str);
		
		//��.�ͷ���Դ
		fr.close();
	}

}
