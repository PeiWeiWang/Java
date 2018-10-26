package com.day9;

public class TestMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
	/*	System.out.println(Math.ceil(11.9));//向上取整
		System.out.println(Math.floor(11.9));//向下取整c
		
		System.out.println(Math.round(11.59));//四舍五入 11
*/		
		/*System.out.println(Math.ceil(-11.9));//-11
		System.out.println(Math.floor(-11.9));//-12
		
		System.out.println(Math.round(-11.49));//-11
		System.out.println(Math.round(-11.59));//-12
*/		
		
		System.out.println(Math.random());//生产0-1之间的伪随机数
		
		
		//1-8之间的随机数
		int rows  = (int)(Math.random()*8+1);
		int cols  = (int)(Math.random()*8+1);
		System.out.println("请第"+rows+"行，"+"第"+cols+"列同学回答问题");
	}

}
