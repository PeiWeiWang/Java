package com.homework.w0725;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(9);
		
		//1.对list进行冒泡排序
		/*for(int i = 0;i<list.size()-1;i++){//总轮数
			for(int j = 0;j<list.size()-1-i;j++){//每轮比较的次数
				if(list.get(j)>list.get(j+1)){
					int temp =  list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}*/
		
		/*for(int i:list){
			System.out.print(i+"\t\t");
		}*/
		//2.找出最大的一个元素
		/*int max = list.get(0);
		for(int i:list){
			if(i>max){
				max = i;
			}
		}
		System.out.println(max);*/
		
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("zs",19,"女"));
		list1.add(new Person("ls",18,"男"));
		list1.add(new Person("we",19,"女"));
		list1.add(new Person("wy",19,"女"));
		list1.add(new Person("ww",17,"男"));
		
		//1.统计list1中男女的数量
		int men = 0;
		int women = 0;
		
		for(Person p:list1){
			//String sex = p.getSex();
			if("男".equals(p.getSex())){
				men++;
			}else{
				women++;
			}
				
		}
		System.out.println("男性:"+men);
		System.out.println("女性:"+women);
		
		//2.统计18岁以上的person数量
		int count = 0;
		for(Person p:list1){
			if(p.getAge()>18){
				count++;
			}
		}
		System.out.println("18岁以上的person为:"+count);
	}
}
