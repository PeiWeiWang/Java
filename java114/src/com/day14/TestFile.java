package com.day14;

import java.io.File;
import java.io.IOException;




public class TestFile {
	public static void main(String[] args) throws Exception {
		//String path = "D:\\2000\\TestException.java";// \\win
		String path = "D:/2000/Test.java";//unix
		
		File file = new File(path);
		//file.createNewFile();//创建新文件
		
		//file.delete();//删除文件
		
		//System.out.println(file.exists());//判断文件实体是否存在
		
		//获取完整的路径+文件名		
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());//*
//		
//		//获取父路径
//		System.out.println(file.getParent());
//		
//		//获取文件名+后缀
//		System.out.println(file.getName());//*
		
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isHidden());
		
		System.out.println(file.lastModified());//返回最后修改的时间戳
		System.out.println(file.length());
		
		//创建一个1.txt  
		
	}
}
