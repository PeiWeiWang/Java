package com.day11.list;

import java.util.*;

import com.homework.w0720.inte.Person;

public class TestList {
	public static void main(String[] args) {
		int[] ia = {1,2,3,4};//������ȷ����,һ��ȷ�����ɸ���
		ia[0] = 2;
		
		/*for(int i=0;i<ia.length;i++){
			System.out.print(ia[i]+"\t");
		}*/
		
		//�����б���� ---ArrayListΪ�ɱ䳤����
		List list = new ArrayList();//��ʼ����Ϊ10,Ԫ�صĸ���Ϊ0
		//System.out.println(list.size());//�õ��б��е�Ԫ�صĸ���
		
		//����Ԫ��---��δ�涨����list�е�Ԫ�ص�����,jvmĬ��ΪObject����
		list.add("��һ��Ԫ��");//index = 0
		list.add(1);//index = 1 ��ʱ�����1���Զ�װ��Ϊ��Ӧ�İ�װ��
		list.add('2');//index = 2
		list.add("aaa");
		list.add("bbbbb");
		list.add("aaa");
		//���ʱָ���±�(��������,����ԭ������������ƶ�)
		//list.add(2, "dsdsdsd");
		
		//ȡ������Ԫ��
		/*Object o1 = list.get(3);
		System.out.println(o1);*/
		
		
		//ɾ��Ԫ��
		//���±�ɾ��Ԫ��
		/*list.remove(2);//ɾ����3��Ԫ��,������Ԫ����ǰ�ƶ�
		System.out.println(list.get(2));*/
		
		//������ɾ��(��һ�����ֵ�)
		//list.remove("aaa");
	
		//�����±��޸�Ԫ��
		list.set(3, "cccc");
		
		//����list
		//1.for
		/*for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t\t");
		}*/
		
		//2.forEach
		/*for(Object o:list){
			System.out.print(o+"\t\t");
		}*/
		
		//3.ʹ�õ�����--����:���б��е�Ԫ��һ��һ���İ�˳��ȡ��
			//��ȡĿ�꼯�ϵĵ�����
		Iterator it = list.iterator();
			//ʹ�õ��������е���
		while(it.hasNext()){//���������һ��Ԫ��
			System.out.print(it.next()+"\t\t");//����һ��Ԫ��ȡ��
		}
		
		/*System.out.println("\n---ʹ��ͬһ���������ٴε���--\n");
		while(it.hasNext()){//���������һ��Ԫ��
			System.out.print(it.next()+"\t\t");//����һ��Ԫ��ȡ��
		}*/
	}
}
