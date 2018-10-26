package com.day4.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test{
	private Test(){
		System.out.println("�����޲ι���");
	}
	
	private Test(String arg){
		System.out.println("�����вι���,����Ϊ"+arg);
	}
	
	public void fun1() {
		System.out.println("����û�з���ֵ,û�в����ķ���");
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
		
		//1.��ȡĿ���������ʱ����
		Class<Test> clazz = Test.class;
		
		//2.���ݲ����б��ѯ��Ӧ�Ĺ��췽��
			//�޲ι���
		Constructor<Test> constructor = clazz.getDeclaredConstructor();
			//�вι���
		Constructor<Test> constructorHave = clazz.getDeclaredConstructor(String.class);
		
		//3.ȡ�����ʿ���
		constructor.setAccessible(true);
		constructorHave.setAccessible(true);
		
		//4.���ô�Constructor����� newInstance����
		//Test t = constructor.newInstance();
		Test t = constructorHave.newInstance("���ǲ���");
		t.fun1();
		
	}

}
