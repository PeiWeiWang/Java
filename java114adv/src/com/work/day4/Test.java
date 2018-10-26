package com.work.day4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Deprecated
public class Test {
	@Deprecated
	int x;
	//這個方法已經過時--注釋:給开发者自己使用,JVM会忽视
	
	@Deprecated//注解:给编译工具(JVM)看的注释
	public static void oldMethod(){
		System.out.println("這是過時方法");
	}
	
	
	public  void newMethod(){
		System.out.println("這是替代方法");
	}
	
	/**
	 * @author 作者
	 * @param 参数
	 * @return 返回值
	 * @exception 抛出的异常
	 * @version 方法的版本
	 * */
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		
		List list = new ArrayList();
	
	}

}

class  TestSon extends Test{
	@Override
	public void newMethod(){
		System.out.println("這是子类方法");
	}
}
