package com.day14.stream;

import java.io.*;

public class TestInputStream {

	/**
	 * �ֽ�������:  �ļ�---�ֽ�---->����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//��ȡ�ļ��Ĳ���
		
		//һ.����Ŀ���ļ���File����
		File file = new File("D:/test.txt");
		
		//��.���������ļ������������
		FileInputStream fis = new FileInputStream(file);
		
		String str = "";
		//��.���ֽ�Ϊ��λ��ȡ�ļ�����
			//1.ÿ�ζ�ȡ�����ֽ�---��̫�ʺ϶�ȡ����
			int c = 0;
			while((c=fis.read())!=-1){
				str +=(char)c; 
			}
			System.out.println(str);
			
		
			//2.�ȴ���������byte������Ϊ������,ÿ�δ����ж�ȡ���������ȵ��ֽ���
			/*byte[] temp = new byte[30];
			while(fis.read(temp, 0, temp.length)!=-1){
				str +=new String(temp);
			}
			System.out.println(str.trim());*/
		
			//3.һ���Խ����������ֽڶ�ȡ��
				//�����������ֽ�����ͬ��byte����
		/*	byte[] temp = new byte[fis.available()];
				//�������ֽڶ���temp����
			fis.read(temp);
				//��byte������д���
			str = new String(temp);
			System.out.println(str);*/
			
		//��.�ر���Դ
		fis.close();
	}

}
