package com.day8.wrapper;

public class Test {

	/**
	 * Integer:int的包装类
	 */
	public static void main(String[] args) {
		
		/*System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer ii = new Integer(1);
		System.out.println(ii.intValue());*/
		
		//用于实现将String类型转换为对应的基本数据类型
		/*String numStr1 = "1111";
		String numStr2 = "22";*/
		//System.out.println(numStr1+numStr2);//
		
		//将字符串转换为int类型
		/*//1.直接将String----->int  推荐
		int num1 = Integer.parseInt(numStr1);
		int num2 = Integer.parseInt(numStr2);
		System.out.println(num1+num2);*/
		
		//2.String----->Integer----->int
		/*Integer ii1 = new Integer(numStr1);
		Integer ii2 = new Integer(numStr2);
		int num1 = ii1.intValue();
		int num2 = ii2.intValue();
		System.out.println(num1+num2);*/
		
		//3.String----->Integer----->int
/*		Integer ii1 =  Integer.valueOf(numStr1);
		Integer ii2 = Integer.valueOf(numStr2);
		int num1 = ii1.intValue();
		int num2 = ii2.intValue();
		System.out.println(num1+num2);*/
		
		//将为int类型转换字符串
		 //1.
		/*int i = 1;
		String str = Integer.toString(i);
		System.out.println(str+1);
		
		//2.
		String str1 = i+"";
		System.out.println(str1+1);*/
		
		
		/*//自动装箱：将基本数据类型 打包为 对应的包装类类型  int---->Integer
		Integer ii = 1;//java自动执行Integer.valueOf(1);
		System.out.println(ii+1);
		
		//自动拆箱：将对应的包装类类型 自动解析为基本数据类型
		int i = ii;//java自动执行ii.intValue()
*/	
			Emp e1 = new Emp();
			e1.setComm(10.0);
	}

}
