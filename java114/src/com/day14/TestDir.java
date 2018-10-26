package com.day14;

import java.io.File;
import java.util.Arrays;

public class TestDir {
	//����һ��Ŀ¼,�ܹ�չʾĿ¼�µ����е��ļ�����Ŀ¼(��Ŀ¼�µ��ļ���Ŀ¼)
	public static void showDir(File dir){
		if(!dir.exists()){
			System.out.println("�ļ��в�����");
			return;
		}
		if(dir.isFile()){
			System.out.println(dir);
			return;
		}
		
		File[] files =  dir.listFiles();//ȡ��Ŀ���ļ����µ������ļ�����
		for(File f:files){
			if(f.isFile()){
				System.out.println("�ļ�:"+f);
			}else{
				System.out.println("�ļ���:"+f);
				showDir(f);
			}
		}
	}
	
	//�ļ��е�ɾ��
	public static void deleteDir(File dir){
		if(!dir.exists()){
			return;
		}
		if(dir.isFile()){
			dir.delete();
			return;
		}
		File[] files =  dir.listFiles();//ȡ��Ŀ���ļ����µ������ļ�����
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
		
		
		//�ڸ�Ŀ¼���ڵ������,�����µ�Ŀ¼
		//dir.mkdir();
		
		//��ͬ��Ŀ¼һ�𴴽�
		//dir.mkdirs();
		
		//ɾ��Ŀ¼---ֻ��ɾ����Ŀ¼
		//dir.delete();
		
		//��ȡ��Ŀ¼�������ļ�������ַ�����
//		String[] names =dir.list();
//		System.out.println(Arrays.toString(names));
		
		//��ȡ��Ŀ¼�����е��ļ�����
		/*File[] files = dir.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				System.out.println("Ŀ¼:"+f);
			}
			else{
				System.out.println("�ļ�:"+f);
			}
		}*/
		
	//	File dir = new File("E:/x��Ŀ");
		showDir(dir);
		
	}

}
