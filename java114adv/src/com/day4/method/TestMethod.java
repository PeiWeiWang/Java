package com.day4.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	private void fun1() {
		System.out.println("这是没有返回值,没有参数的方法");
	}

	private int fun2() {
		System.out.println("这是有返回值,没有参数的方法");
		return 1;
	}

	private void fun3(String arg1, int arg2) {
		System.out.println("这是没有返回值,有2参数的方法");
		System.out.println("参数1:" + arg1);
		System.out.println("参数2:" + arg2);
	}
	
	
	private String fun3(String arg1, int arg2,String arg3) {
		System.out.println("这是有返回值,有3参数的方法");
		System.out.println("参数1:" + arg1);
		System.out.println("参数2:" + arg2);
		System.out.println("参数3:" + arg3);
		return arg1+arg2+arg3;
	}
}

public class TestMethod {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test t = new Test();
	//	t.fun3("aa",11);//java查询方法:方法名+方法的参数列表(类型\个数\顺序)
		
		//1.获取目标对象的运行时类的对象
		Class clazz = t.getClass();
		
		//查询所有已声明的方法
		/* Method[] ms = clazz.getDeclaredMethods();
		 for(Method m:ms){
			 System.out.println(m.toGenericString());
		 }*/
		
		//2.通过方法名和参数的类型列表获取指定方法的Method对象
			//1.获取没有参数的方法
			Method fun1 = clazz.getDeclaredMethod("fun1");
			Method fun2 = clazz.getDeclaredMethod("fun2");
			
			//2.获取有参数的方法 --- name:方法名  
				// Class<?>... parameterTypes:各参数的Class
			Method fun3 = clazz.getDeclaredMethod("fun3", String.class,int.class);//Class
			
			
		//3.取消此Method对象的访问控制
			fun1.setAccessible(true);
			fun2.setAccessible(true);
			fun3.setAccessible(true);
			
		//4.调用指定对象的此Method对象代表的方法
			/* fun1.invoke(t);
			 Object value = fun2.invoke(t);//返回类型为对象Object
			 System.out.println(value);*/
			 
			fun3.invoke(t, "t的aaaa",1000);	 
	}
}
