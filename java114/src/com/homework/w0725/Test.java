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
		
		//1.��list����ð������
		/*for(int i = 0;i<list.size()-1;i++){//������
			for(int j = 0;j<list.size()-1-i;j++){//ÿ�ֱȽϵĴ���
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
		//2.�ҳ�����һ��Ԫ��
		/*int max = list.get(0);
		for(int i:list){
			if(i>max){
				max = i;
			}
		}
		System.out.println(max);*/
		
		List<Person> list1 = new ArrayList<>();
		list1.add(new Person("zs",19,"Ů"));
		list1.add(new Person("ls",18,"��"));
		list1.add(new Person("we",19,"Ů"));
		list1.add(new Person("wy",19,"Ů"));
		list1.add(new Person("ww",17,"��"));
		
		//1.ͳ��list1����Ů������
		int men = 0;
		int women = 0;
		
		for(Person p:list1){
			//String sex = p.getSex();
			if("��".equals(p.getSex())){
				men++;
			}else{
				women++;
			}
				
		}
		System.out.println("����:"+men);
		System.out.println("Ů��:"+women);
		
		//2.ͳ��18�����ϵ�person����
		int count = 0;
		for(Person p:list1){
			if(p.getAge()>18){
				count++;
			}
		}
		System.out.println("18�����ϵ�personΪ:"+count);
	}
}
