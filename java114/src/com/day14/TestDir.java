package com.day14;

import java.io.File;
import java.util.Arrays;

public class TestDir {
	//接受一个目录,能够展示目录下的所有的文件和子目录(子目录下的文件和目录)
	public static void showDir(File dir){
		if(!dir.exists()){
			System.out.println("文件夹不存在");
			return;
		}
		if(dir.isFile()){
			System.out.println(dir);
			return;
		}
		
		File[] files =  dir.listFiles();//取出目标文件夹下的所有文件对象
		for(File f:files){
			if(f.isFile()){
				System.out.println("文件:"+f);
			}else{
				System.out.println("文件夹:"+f);
				showDir(f);
			}
		}
	}
	
	//文件夹的删除
	public static void deleteDir(File dir){
		if(!dir.exists()){
			return;
		}
		if(dir.isFile()){
			dir.delete();
			return;
		}
		File[] files =  dir.listFiles();//取出目标文件夹下的所有文件对象
		for(File f:files){
			if(f.isDirectory()){
				showDir(f);
			}
			f.delete();
		}
		dir.delete();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = new File("D:/2000");
		
		
		//在父目录存在的情况下,创建新的目录
		//dir.mkdir();
		
		//连同父目录一起创建
		//dir.mkdirs();
		
		//删除目录---只能删除空目录
		//dir.delete();
		
		//获取本目录下所有文件对象的字符串名
//		String[] names =dir.list();
//		System.out.println(Arrays.toString(names));
		
		//获取本目录下所有的文件对象
		/*File[] files = dir.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				System.out.println("目录:"+f);
			}
			else{
				System.out.println("文件:"+f);
			}
		}*/
		
	//	File dir = new File("E:/x项目");
		showDir(dir);
		
	}

}
