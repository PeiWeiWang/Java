package com.day7.extend;

public class Person{
	//����---���Լ̳У���������д���ͽ�ԭ��
	protected String name="����";
	protected int age;
	
	//���췽��---������д�����ܼ̳У���Ĭ�ϵ���
	public Person() {
		super();//���κ�һ����û��ʹ��extends��ʽ�̳�һ����ʱ��javaĬ�ϼ̳�Object��
		// TODO Auto-generated constructor stub
	}

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	//��ͨ����---������д 
	public void eat(){
		System.out.println("���˾�Ҫ�Է���"+name);
	}
	
	
	


	public void run(){
		System.out.println("���˾ͻ���");
	}
	
	
}
