package com.day8.inte;
interface T1{} 
interface T2{} 
//public interface DaoI extends T1,T2
public interface DaoI {
	//�����ڽӿ��еı���Ĭ��ʹ��public static final���Σ������ڶ����ͬʱ��ֵ��������
	 String VERSION="111";
	 
	 //�ӿ��в��ܶ��幹�췽��
	// public DaoI(){}
	
	//�����ڽӿ��еķ�����Ĭ��ʹ��public abstract����
	abstract  void add();
	public  void del();
	 void update();
	 void query();
	 
}
