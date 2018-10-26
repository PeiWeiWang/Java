package com.day14.chars;


import java.io.*;

public class TestWriter {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//一.创建目标文件的对象
		File file = new File("D:/2000/HelloWorld.java");
		file.createNewFile();
		
		//二.创建文件对象的字符输出流
		FileWriter fw = new FileWriter(file);
		
		//三.进行写入操作--可以直接写入字符串
		String str = new StringBuffer().append("public class HelloWorld{\r\n")
					.append("\tpublic static void main(String[] args){\r\n")
					.append("\t\tSystem.out.println(\"HelloWorld!\");\r\n")
					.append("\t}\r\n")
					.append("}").toString();
		fw.write(str);
		
		//四 刷新并释放输出流
		fw.flush();
		fw.close();
		System.out.println("写出成功");
	}

}
