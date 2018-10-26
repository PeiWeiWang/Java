package com.day6.overload;

import java.util.Arrays;

public class TestOverload {
	public void fun1(){};
	
	public void fun1(int i){}
	
	public void fun1(int i,String str){}
	
	//形参的命名不影响java查询方法
//	public void fun1(int i1,String str1){};
	
	public void fun1(String str,int i){}
	
	//返回值类型不影响java查询方法
	/*public int fun1(String str,int i){
		return 1;
	}*/
	public static void main(String[] args) {
		/*TestOverload to = new TestOverload();
		to.fun1(1);
		to.fun1(1, "aaa");*/
		int[] ia = {1,2,3};
		double[] da = {1,2,3};
		Arrays.sort(ia);
		Arrays.sort(da);
	}
}
