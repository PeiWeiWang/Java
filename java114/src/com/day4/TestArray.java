package com.day4;

public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//1.数组的声明:定义一个int类型的数组，名字为array
	//	int[] array;
		
		//2.数组的初始化(赋值) ---3种
			//动态初始化:没有给数组中的元素进行赋值
		/*array = new int[3];//初始化
		array[0] = 11;//给数组中的第一个元素赋值
			*/
		
			//静态初始化--初始化数组的同时，给数组中的元素赋值
		//array = new int[]{1,2,3};
		
		//数组的定义，初始化同时完成
		/*int[] array = {1,2,3};*/
		
		/*//数组的使用
		 * System.out.println(array.length);
		System.out.println(array[0]);//从0开始
		System.out.println(array[1]);
		System.out.println(array[array.length-1]);
		System.out.println(array[3]);
	*/
		
		/*int[] array = new int[10];
		array[0] = 111;
		System.out.println(array[0]);
		 array = new int[11];
		 System.out.println(array[0]);*/
		 
		
		
	/*ps：1.数组的属性 length：元素的个数;数组的长度一但确定不可改变
	 * 	 2.数组中元素是一块连续的内存空间，--数组的下标从0开始，到length-1结束---
	 * 	*/
		 
		/*int[] ia = {2,1,4,7,6,3}; 
		ArrayUtil.showArray(ia);
		ia[1] = 9;
		ArrayUtil.showArray(ia);
		ia[6] = 11;*/
		//找出以上数组中的最大和最小值
		//给予一个数字，判断其在数组中是否存在，如存在，找出此数的下标
	}

}
