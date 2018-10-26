package com.day13;

import java.util.Arrays;
import java.util.TreeSet;



public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("zs1",22,4000.0);
		Person p2 = new Person("ls111",24,3400.0);
		Person p3 = new Person("wr22",26,8000.0);
		Person p4 = new Person("uu11",26,3200.0);
		Person p5 = new Person("gg222",20,3700.0);
		Person p6 = new Person("ii33i3333",21,3500.0);
		
	
		PersonNameComparator pnc = new PersonNameComparator();
		PersonNameLengthComparator pnlc = new PersonNameLengthComparator();
		Person[] ps = {p1,p2,p3,p4,p5,p6};
	//	Arrays.sort(ps);
		Arrays.sort(ps,pnlc);//指定比较器
		for(Person p:ps){
			System.out.println(p);
		}
		
		//TreeSet<Person> tm = new TreeSet<>();
		/*TreeSet<Person> tm = new TreeSet<>(pnlc);
		tm.add(p1);
		tm.add(p2);
		tm.add(p3);
		tm.add(p4);
		tm.add(p5);
		tm.add(p6);*/
		
		/*for(Person p :tm){
			System.out.println(p);
		}*/
	}

}
