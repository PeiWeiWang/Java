package com.day14;

import java.io.File;
import java.io.IOException;




public class TestFile {
	public static void main(String[] args) throws Exception {
		//String path = "D:\\2000\\TestException.java";// \\win
		String path = "D:/2000/Test.java";//unix
		
		File file = new File(path);
		//file.createNewFile();//�������ļ�
		
		//file.delete();//ɾ���ļ�
		
		//System.out.println(file.exists());//�ж��ļ�ʵ���Ƿ����
		
		//��ȡ������·��+�ļ���		
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());//*
//		
//		//��ȡ��·��
//		System.out.println(file.getParent());
//		
//		//��ȡ�ļ���+��׺
//		System.out.println(file.getName());//*
		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isHidden());
		
		System.out.println(file.lastModified());//��������޸ĵ�ʱ���
		System.out.println(file.length());
		
		//����һ��1.txt  
		
	}
}
