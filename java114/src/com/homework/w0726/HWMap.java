package com.homework.w0726;

import java.util.*;
class Person{
	private	String id;
    private	String name;
	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
    
    
}

public class HWMap {
	public static void main(String[] args) {
		Person p1 = new Person("0101","zs1"); 
		Person p2 = new Person("0102","zs2"); 
		Person p3 = new Person("0103","zs3"); 
		Person p4 = new Person("0104","zs4"); 
		Person p5 = new Person("0105","zs5"); 
		
		List<Person> class1 = new ArrayList<>();
		class1.add(p1);class1.add(p2);class1.add(p3);
		class1.add(p4);class1.add(p5);
		
		Person p6 = new Person("0201","ls1"); 
		Person p7 = new Person("0202","zs2"); 
		Person p8 = new Person("0203","ls3"); 
		Person p9 = new Person("0204","ls4"); 
		Person p10 = new Person("0205","zs5"); 
		
		List<Person> class2 = new ArrayList<>();
		class2.add(p6);class2.add(p7);class2.add(p8);
		class2.add(p9);class2.add(p10);
		
		Set<List<Person>> school1 = new HashSet<>();
		school1.add(class1);school1.add(class2);
		
		Person p11 = new Person("1101","zs1"); 
		Person p12 = new Person("1102","ww2"); 
		Person p13 = new Person("1103","ww3"); 
		Person p14 = new Person("1104","ww4"); 
		Person p15 = new Person("1105","ww5"); 
		
		List<Person> class11 = new ArrayList<>();
		class11.add(p11);class11.add(p12);class11.add(p13);
		class11.add(p14);class11.add(p15);
		
		Person p16 = new Person("1201","ys1"); 
		Person p17 = new Person("1202","ys2"); 
		Person p18 = new Person("1203","ys3"); 
		Person p19 = new Person("1204","ys4"); 
		Person p20 = new Person("1205","zs1"); 
		
		List<Person> class12 = new ArrayList<>();
		class12.add(p16);class12.add(p17);class12.add(p18);
		class12.add(p19);class12.add(p20);
		
		Set<List<Person>> school2 = new HashSet<>();
		school2.add(class11);school2.add(class12);
		
		Map<String,Set<List<Person>>> area = new HashMap<>();
		area.put("一中", school1);
		area.put("二中", school2);
		
		//1.遍歷area,展示所有"一中"的學生
		/*Set<String> keys = area.keySet();
		for(String key:keys){
			if("一中".equals(key)){
				Set<List<Person>> school = area.get(key);
				for(List<Person> clazz:school){
					for(Person p:clazz){
						System.out.println(key+"----->"+p);
					}
				}
			}
		}*/
		
		
		
		//2.查询出本地区同名学生的情况
		Map<String,Integer> count = new HashMap<>();
		Set<String> keys = area.keySet();
		for(String key:keys){
				Set<List<Person>> school = area.get(key);
				for(List<Person> clazz:school){
					for(Person p:clazz){
						if(count.get(p.getName())==null){
							count.put(p.getName(), 1);
						}else{
							count.put(p.getName(), count.get(p.getName())+1);
						}
					}
				}
		}
		System.out.println(count);
		
		
		
		
		
	}
}
