package com.day4.field;

import java.lang.reflect.Field;

class Person {
	private String type="变态";
	
	Integer age;
	protected String sex;
	public String name;//Filed
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Person [type=" + type + ", age=" + age + ", sex=" + sex
				+ ", name=" + name + "]";
	}
	
	
}

public class TestField {

	/**
	 * @param args
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		Person p1 = new Person();
		p.setType("好人");
		p.sex="nan";
		p.age = 100;
		System.out.println(p);
		
	
		// 1.获取目标类或目标对象的运行时对象
		Class clazz =Person.class;
		/*Class clazz1 =p.getClass();
		System.out.println(clazz==clazz1);*/
		
		// 获取所有已声明字段
		/*Field[] fs = clazz.getDeclaredFields();
		for(Field f:fs){
			System.out.println(f.toGenericString());
		}*/
		
		//2.获取指定声明字段
		Field type = clazz.getDeclaredField("type");//private
		Field age = clazz.getDeclaredField("age");//default
		
		//3.取消本属性的访问控制
		type.setAccessible(true);
		age.setAccessible(true);
		
		//4.对目标对象的相关字段进行操作(取值/赋值)
		type.set(p, "雷锋"); //赋值
		System.out.println(type.get(p));//取值
		System.out.println(age.get(p));
		
		
	}

}
