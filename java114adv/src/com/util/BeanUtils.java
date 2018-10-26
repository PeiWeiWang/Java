package com.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.day4.Test;
import com.day4.clazz.Person;

public class BeanUtils{
	public static Object getProperty(Object obj,String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		Class clazz =  obj.getClass();
		Object value = null;
		Field f = clazz.getDeclaredField(name);
		f.setAccessible(true);
		value = f.get(obj);
		return value;
	}
	
	
	public static void setProperty(Object obj,String name,Object value){
		Class clazz =  obj.getClass();
		try {
			Field f = clazz.getDeclaredField(name);
			f.setAccessible(true);
			f.set(obj, value);	
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
	
	//public static T createObject(String className){}
	public static Object createObject(String className){
		Object obj = null;
			try {
				Class clazz = Class.forName(className);
				obj = clazz.newInstance();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return obj;
	}
	
	public static void showClass(Class clazz){
		//展示类名
		System.out.println(clazz);
		
		System.out.println("\n成员属性");
		Field[] fs = clazz.getDeclaredFields();
		for(Field f:fs){
			System.out.println(f);
		}
		
		System.out.println("\n构造方法");
		Constructor[] cs = clazz.getDeclaredConstructors();
		for(Constructor c:cs){
			System.out.println(c);
		}
		
		System.out.println("\n成员方法");
		Method[] ms = clazz.getDeclaredMethods();
		for(Method m:ms){
			System.out.println(m);
		}
		
	}
	
	//可以给继承来的属性进行赋值
	public static void setProperty(Object obj,Class clazz,
					String name,Object value) throws IllegalArgumentException, IllegalAccessException{
		
		try {
			Field f = clazz.getDeclaredField(name);
			f.setAccessible(true);//能执行到这里,说明属性就定义在本类种
			f.set(obj, value);	
		} catch (NoSuchFieldException e) {//如找不到属性,捕获异常
			if("java.lang.Object".equals(clazz.getName())){
				System.err.println("已追溯到根类Object,无此属性");
				return;
			}
			//再次调用本方法,到父类中查询此属性(递归查询)
			setProperty(obj,clazz.getSuperclass(),name,value);
		} 
	}
	
	//可以给继承来的属性进行取值
		public static Object getProperty(Object obj,Class clazz,
						String name) throws IllegalArgumentException, IllegalAccessException{
			Object value = null;
			try {
				Field f = clazz.getDeclaredField(name);
				f.setAccessible(true);//能执行到这里,说明属性就定义在本类种
				value = f.get(obj);	
			} catch (NoSuchFieldException e) {//如找不到属性,捕获异常
				if("java.lang.Object".equals(clazz.getName())){
					System.err.println("已追溯到根类Object,无此属性");
					return null;
				}
				//再次调用本方法,到父类中查询此属性(递归查询)
				value = getProperty(obj,clazz.getSuperclass(),name);
			} 
			return value;
		}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		/*Person person = new Person();
		BeanUtils.setProperty(person, "age", 19);
		System.out.println(person);*/
		
		/*Test test = (Test)BeanUtils.createObject("com.day4.Test");
		System.out.println(test);*/
		
		//BeanUtils.showClass(Account.class);
		
		Cus2 c = new Cus2();
		BeanUtils.setProperty(c,Cus2.class, "Balance", 100000);
		System.out.println(BeanUtils.getProperty(c, Cus2.class, "Balance"));
		
	}

}
class Cus extends Account{
	private String name;

	@Override
	public String toString() {
		return "Cus [name=" + name + ", Balance=" + Balance + "]";
	}
	
}

class Cus2 extends Cus{
	@Override
	public String toString() {
		return "Cus2 [Balance=" + Balance + "]";
	}
}

