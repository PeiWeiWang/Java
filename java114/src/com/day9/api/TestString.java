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
		System.out.println(str.length());//�ַ������ַ���
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));*/
		
		//java.lang.StringIndexOutOfBoundsException
		//System.out.println(str.charAt(4));
		
//		String  str = "abcd";
//		String  str2 = "adbc";
//		//��˳��Ƚ��ַ����е�ÿ���ַ�������ͬ���������ȣ�ֱ���������߲�ͬ��
//		//��ͬ��������Ӧ�ַ����ֵ�˳��Ĳ�ֵ�����������ַ���������
//		System.out.println(str.compareTo(str2));//-2
//		
//		//contains:���ַ�����ĸ�����Ƿ����
//		System.out.println(str.contains("cb"));//false
//		System.out.println(str.contains("bc"));//true
		
		//endsWith   �Զ���ѯ.��λ��
	//	System.out.println("HelloWorld.java".endsWith("java"));
		
		/*String str = "�Ұ�java";
		byte[] ba = str.getBytes();//�Բ���ϵͳ��Ĭ���ַ������ַ���תΪbyte����
		//System.out.println(ba.length);
		System.out.println(Arrays.toString(ba));
		System.out.println(new String(ba));//��Ӧ��byte����ת��String
*/	
		//indexOf:�����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ����;����ҿ���
		
		//String  str = "acbdb";
	/*	System.out.println(str.indexOf(98));//b<---->98    2
		System.out.println(str.indexOf('b'));//2
		System.out.println(str.indexOf('e',3));//4
*/	
		//System.out.println(str.lastIndexOf('b'));//4
		
		
	//	System.out.println(str.replace("bd", ""));//��ָ���ַ������滻Ϊ�մ�
	//	System.out.println(str.replace("bd", "****"));
		
		
		//���������ݸ����ַ���ִ��ַ����������� 
//		String str ="aa,bb.cc,dd";
//		String[] sa = str.split("[,]");//[]��ѡ�ַ�
//		
//		for(String s:sa){
//			System.out.print(s+"\t");
//		}
		
		
		//substring���ַ�����ȡ������ҿ�
//		String  str = "acbdb";
//		System.out.println(str.substring(2));//bdb
//		System.out.println(str.substring(2,4));//bd
		
//		char[] ca = "acbdb".toCharArray();
//		System.out.println(Arrays.toString(ca));
		
		//System.out.println("acbdb".toUpperCase());
		
		//trim():ȥ��ǰ��ո�
		System.out.println("   acbdb  ".trim());
	}

}
