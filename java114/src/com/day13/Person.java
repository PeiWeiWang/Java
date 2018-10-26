package com.day13;
//让类具有自然顺序:实现Comparable接口
//---同类间才有可比性
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
	
	

	//2.重写compareTo方法:指定比较的规则
	//本例按照年龄进行 从小到大的排序
	/*@Override
	public int compareTo(Person other) {
		return this.age.compareTo(other.age);
		//return this.sal.compareTo(other.sal);
	//	return this.name.compareTo(other.name);
	}*/
	
	//优先按照年龄比,如年龄相同,按照工资排序  从小到大
	/*@Override
	public int compareTo(Person other) {
		if(this.age.compareTo(other.age)==0){
			return this.sal.compareTo(other.sal);
		}
		return this.age.compareTo(other.age);
	}*/
	
	//优先按照年龄比,如年龄相同,按照工资排序  从大到小
	@Override
	public int compareTo(Person other) {
		if(this.age.compareTo(other.age)==0){
			return other.sal.compareTo(this.sal);
		}
		return other.age.compareTo(this.age);
	}
	
	
	
	
}
