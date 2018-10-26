package com.homework.w0727;

import java.io.*;

public class FileCopy {
	//(E:\2000\1.txt,D:\2000)
	public static void copyFile(String metaFile,String targetDir) throws IOException{
		File file = new File(metaFile);
		String name = file.getName();//获取原文件的文件名
		
		String newFileName = targetDir+"/"+name;//拼接新文件的完整路径
		File newFile = new File(newFileName);
		
		FileInputStream fis = new FileInputStream(file);//开启到原文件的输入流,读取内容
		
		FileOutputStream fos = new FileOutputStream(newFile);//开启到新文件的输出流;源文件内容----->新文件
		
		byte[] temp = new byte[1024];
		while(fis.read(temp)!=-1){//边读边写
			fos.write(temp);
			fos.flush();
		}
		
		fos.close();
		fis.close();
		System.out.println("copy OK");
	}
	
	public static void main(String[] args) {
		try {
			copyFile("D:/java114/作业/7.11.docx","E:/2000");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
