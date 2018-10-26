package com.day4.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	private void fun1() {
		System.out.println("����û�з���ֵ,û�в����ķ���");
	}

	private int fun2() {
		System.out.println("�����з���ֵ,û�в����ķ���");
		return 1;
	}

	private void fun3(String arg1, int arg2) {
		System.out.println("����û�з���ֵ,��2�����ķ���");
		System.out.println("����1:" + arg1);
		System.out.println("����2:" + arg2);
	}
	
	
	private String fun3(String arg1, int arg2,String arg3) {
		System.out.println("�����з���ֵ,��3�����ķ���");
		System.out.println("����1:" + arg1);
		System.out.println("����2:" + arg2);
		System.out.println("����3:" + arg3);
		return arg1+arg2+arg3;
	}
}

public class TestMethod {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test t = new Test();
	//	t.fun3("aa",11);//java��ѯ����:������+�����Ĳ����б�(����\����\˳��)
		
		//1.��ȡĿ����������ʱ��Ķ���
		Class clazz = t.getClass();
		
		//��ѯ�����������ķ���
		/* Method[] ms = clazz.getDeclaredMethods();
		 for(Method m:ms){
			 System.out.println(m.toGenericString());
		 }*/
		
		//2.ͨ���������Ͳ����������б��ȡָ��������Method����
			//1.��ȡû�в����ķ���
			Method fun1 = clazz.getDeclaredMethod("fun1");
			Method fun2 = clazz.getDeclaredMethod("fun2");
			
			//2.��ȡ�в����ķ��� --- name:������  
				// Class<?>... parameterTypes:��������Class
			Method fun3 = clazz.getDeclaredMethod("fun3", String.class,int.class);//Class
			
			
		//3.ȡ����Method����ķ��ʿ���
			fun1.setAccessible(true);
			fun2.setAccessible(true);
			fun3.setAccessible(true);
			
		//4.����ָ������Ĵ�Method�������ķ���
			/* fun1.invoke(t);
			 Object value = fun2.invoke(t);//��������Ϊ����Object
			 System.out.println(value);*/
			 
			fun3.invoke(t, "t��aaaa",1000);	 
	}
}
