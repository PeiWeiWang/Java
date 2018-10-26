package com.day6.encapsulation;



public class Person {
	private String name;
	private int age;
	private String sex;
	private double sal;
	private boolean flag;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isFlag(){
		return flag;
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	
	
	//��ȡ�ķ���:ʹ�ù����ķ���������name��ֵ
	public String getName(){
		return name;
	}
	
	//�޸ĵķ���
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		if(age<1||age>130){//�����ݲ��Ϸ�����ʾ��ֱ�ӽ�����������ִ�и�ֵ����
			System.err.println("���ݲ��Ϸ�����ֵ���ɹ�");
			return;
		}
		this.age = age;
	}
	public void shout(){
		//˽�е��������ڲ���������ʹ��
		System.out.println(name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", sal=" + sal + "]";
	}


	
	
	
}
