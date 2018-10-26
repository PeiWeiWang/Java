package com.homework.w0727;

import java.io.*;

public class FileCopy {
	//(E:\2000\1.txt,D:\2000)
	public static void copyFile(String metaFile,String targetDir) throws IOException{
		File file = new File(metaFile);
		String name = file.getName();//��ȡԭ�ļ����ļ���
		
		String newFileName = targetDir+"/"+name;//ƴ�����ļ�������·��
		File newFile = new File(newFileName);
		
		FileInputStream fis = new FileInputStream(file);//������ԭ�ļ���������,��ȡ����
		
		FileOutputStream fos = new FileOutputStream(newFile);//���������ļ��������;Դ�ļ�����----->���ļ�
		
		byte[] temp = new byte[1024];
		while(fis.read(temp)!=-1){//�߶���д
			fos.write(temp);
			fos.flush();
		}
		
		fos.close();
		fis.close();
		System.out.println("copy OK");
	}
	
	public static void main(String[] args) {
		try {
			copyFile("D:/java114/��ҵ/7.11.docx","E:/2000");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
