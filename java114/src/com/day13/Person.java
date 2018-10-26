package com.day13;
//���������Ȼ˳��:ʵ��Comparable�ӿ�
//---ͬ�����пɱ���
public class Person implements Comparable<Person>{
	
	private String name;
	private Integer age;
	private Double sal;
	
	public Person() {
		super();
	}
	public Person(String name, Integer age, Double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	
	

	//2.��дcompareTo����:ָ���ȽϵĹ���
	//��������������� ��С���������
	/*@Override
	public int compareTo(Person other) {
		return this.age.compareTo(other.age);
		//return this.sal.compareTo(other.sal);
	//	return this.name.compareTo(other.name);
	}*/
	
	//���Ȱ��������,��������ͬ,���չ�������  ��С����
	/*@Override
	public int compareTo(Person other) {
		if(this.age.compareTo(other.age)==0){
			return this.sal.compareTo(other.sal);
		}
		return this.age.compareTo(other.age);
	}*/
	
	//���Ȱ��������,��������ͬ,���չ�������  �Ӵ�С
	@Override
	public int compareTo(Person other) {
		if(this.age.compareTo(other.age)==0){
			return other.sal.compareTo(this.sal);
		}
		return other.age.compareTo(this.age);
	}
	
	
	
	
}
