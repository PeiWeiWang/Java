package com.day1;

public class TestVar {
	public static void main(String[] args) {
		//创建了一个名为str的变量，初始值为“aaa”
		/*String str = "aaa";
		System.out.println(str);
		str = "bbb";
		System.out.println(str);
		
		//=号右边的部分被称为字面量
		int i = 1;
		i=2;*/
		
		//基本数据类型
		//1.整数数字型  ----
		byte b = 127;  //字节  取值范围  -128（-2^7） --- 127(2^7-1)
		short s = 444;//短整型2个byte    -2^15  -----2^15-1  
		
		//字符型:单个字符
		char c = '我'; //2个byte，允许赋值汉字
		
		int i =1000;//整型：整数类型的默认类型4个byte -2^31-----2^31-1
		long l = 1000L;//长整型  -2^63-----2^63-1
		
		//2.浮点数型
		float f = 1.0F;//单精度浮点型 32位浮点数
		double d = 1.0;//双精度浮点型：浮点型的默认类型 64位浮点数
		
		//3.boolean 只有true和false
		boolean bo = true;
		boolean bo1 = false;
		
		
	}
}
