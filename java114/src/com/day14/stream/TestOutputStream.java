package com.day14.stream;

import java.io.*;

/**
 * �ֽ������:����----�ֽ�---->�ļ�
 * */
public class TestOutputStream {
	public static void main(String[] args) throws Exception {
		//һ.����Ŀ���ļ��Ķ���
		File file = new File("D:/test.txt");
		
		//��.�����ļ�����������
		FileOutputStream fos =  new FileOutputStream(file);//����ԭ�ļ�����,���ļ��Ŀ�ͷд
					//fos = new FileOutputStream(file,true);//���ļ���ĩβ����׷������
		
		//��.�����ļ���д��(���뽫����ת��Ϊ�ֽ�)
			String str ="my first OutputStream!";
			byte[] temp = str.getBytes();
			
			//һ����д������
			fos.write(temp);
			
			/*//һ��һ��д
			for(byte b:temp){
				fos.write(b);
			}*/
			
		
		 //�� ˢ�������,���ͷ���Դ
			fos.flush();
			fos.close();
			
			
	
	}
}
