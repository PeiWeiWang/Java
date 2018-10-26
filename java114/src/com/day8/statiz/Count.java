package com.day8.statiz;
//统计一共建立过多少个Count类的对象
public class Count {
	private static int count=0;//创建了多少个对象,static修饰表示所有对象共享
	
	public Count(){
		count++;//创建一个对象,就要调用一次构造方法
	}
	//不接受修改,只接受获取
	public static int getCount() {
		return count;
	}
	
	
}
