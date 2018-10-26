package com.day9.api;

import java.util.Arrays;

public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String  str = "aaa";
		String  str1 = "aaa";
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true
		
		
		String str2 = new String("bbb");
		String str3 = new String("bbb");
		System.out.println(str2==str3);//false
		System.out.println(str2.equals(str3));//true
*/		
		/*String  str = "abcd";
		System.out.println(str.length());//字符串的字符数
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));*/
		
		//java.lang.StringIndexOutOfBoundsException
		//System.out.println(str.charAt(4));
		
//		String  str = "abcd";
//		String  str2 = "adbc";
//		//按顺序比较字符串中的每个字符，如相同，继续向后比，直到结束或者不同；
//		//不同，返回相应字符的字典顺序的差值。可以用于字符串的排序
//		System.out.println(str.compareTo(str2));//-2
//		
//		//contains:子字符串在母串中是否存在
//		System.out.println(str.contains("cb"));//false
//		System.out.println(str.contains("bc"));//true
		
		//endsWith   自动查询.的位置
	//	System.out.println("HelloWorld.java".endsWith("java"));
		
		/*String str = "我爱java";
		byte[] ba = str.getBytes();//以操作系统的默认字符集将字符串转为byte数组
		//System.out.println(ba.length);
		System.out.println(Arrays.toString(ba));
		System.out.println(new String(ba));//相应的byte数组转回String
*/	
		//indexOf:返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索;左闭右开。
		
		//String  str = "acbdb";
	/*	System.out.println(str.indexOf(98));//b<---->98    2
		System.out.println(str.indexOf('b'));//2
		System.out.println(str.indexOf('e',3));//4
*/	
		//System.out.println(str.lastIndexOf('b'));//4
		
		
	//	System.out.println(str.replace("bd", ""));//将指定字符串，替换为空串
	//	System.out.println(str.replace("bd", "****"));
		
		
		//×××根据给定字符拆分此字符串×××。 
//		String str ="aa,bb.cc,dd";
//		String[] sa = str.split("[,]");//[]候选字符
//		
//		for(String s:sa){
//			System.out.print(s+"\t");
//		}
		
		
		//substring：字符串截取，左闭右开
//		String  str = "acbdb";
//		System.out.println(str.substring(2));//bdb
//		System.out.println(str.substring(2,4));//bd
		
//		char[] ca = "acbdb".toCharArray();
//		System.out.println(Arrays.toString(ca));
		
		//System.out.println("acbdb".toUpperCase());
		
		//trim():去除前后空格
		System.out.println("   acbdb  ".trim());
	}

}
