package com.day5;

public class TestVar {
	int x = 1;//��Ա����
	
	public void fun1(){
		int y = 2;//�ֲ�����
		System.out.println(x);
		System.out.println(y);
	}
	
	public void fun2(){
		x = 3;//�Գ�Ա����X�������¸�ֵ
		System.out.println(x);//ʹ�õ��ǳ�Ա����x
		
		int x = 3;//���¶����һ���ֲ�������ֻ��fun2����Ч
		System.out.println(x);//ʹ�õ��Ǿֲ�����x
	}
	
	//x����ʽ�������βε�ͬ�ڱ�������ľֲ�����
	public void fun2(int x){
		System.out.println(x);
	}
}
