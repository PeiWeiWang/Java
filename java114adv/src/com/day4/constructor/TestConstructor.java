package com.day4.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test{
	private Test(){
		System.out.println("我是无参构造");
	}
	
	private Test(String arg){
		System.out.println("我是有参构造,参数为"+arg);
	}
	
	public void fun1() {
		System.out.println("这是没有返回值,没有参数的方法");
	}
}

public class TestConstructor {

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//Test t = new Test();
		//Test t = Test.class.newInstance();
		
		//1.获取目标类的运行时对象
		Class<Test> clazz = Test.class;
		
		//2.根据参数列表查询对应的构造方法
			//无参构造
		Constructor<Test> constructor = clazz.getDeclaredConstructor();
			//有参构造
		Constructor<Test> constructorHave = clazz.getDeclaredConstructor(String.class);
		
		//3.取消访问控制
		constructor.setAccessible(true);
		constructorHave.setAccessible(true);
		
		//4.调用此Constructor对象的 newInstance方法
		//Test t = constructor.newInstance();
		Test t = constructorHave.newInstance("我是参数");
		t.fun1();
		
	}

}
