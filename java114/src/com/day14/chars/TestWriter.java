package com.day14.chars;


import java.io.*;

public class TestWriter {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//һ.����Ŀ���ļ��Ķ���
		File file = new File("D:/2000/HelloWorld.java");
		file.createNewFile();
		
		//��.�����ļ�������ַ������
		FileWriter fw = new FileWriter(file);
		
		//��.����д�����--����ֱ��д���ַ���
		String str = new StringBuffer().append("public class HelloWorld{\r\n")
					.append("\tpublic static void main(String[] args){\r\n")
					.append("\t\tSystem.out.println(\"HelloWorld!\");\r\n")
					.append("\t}\r\n")
					.append("}").toString();
		fw.write(str);
		
		//�� ˢ�²��ͷ������
		fw.flush();
		fw.close();
		System.out.println("д���ɹ�");
	}

}
