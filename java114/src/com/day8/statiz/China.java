package com.day8.statiz;

public class China {
	//��̬�������ڴ���ֻռ��һ���ض����ڴ�
	//��������Ķ��󣬶��Ǳ��������ж�����static���εĳ�Ա�ɶ����Ա����Ϊ���Ա
	public static String country="�й�";
	public  String name;
	
	//ʵ������
	public void shout(){
		//ʵ���������Ե���ʵ����Ա
		System.out.print(this.name);
		
		//ʵ���������Ե��þ�̬��Ա
		System.out.println("��"+country+"��");
		
	}
	
	//��̬����
	public static void testStatic(){
		//��̬�������Ե��þ�̬��Ա
		System.out.println(country);
		System.out.println("���Ǿ�̬����");
		
		//��̬�������ܵ��÷Ǿ�̬��Ա:��̬��������ͨ������.�������е��ã��п��ܴ�ʱû�д���this��ָ��Ķ���
		//System.out.print(this.name);
		//shout();
		
	}
	
	public static void main(String[] args) {
		/*China c1 = new China();
		c1.name = "ϰ���";
		China.country = "�л����񹲺͹�";
		c1.shout();
		
		China c2 = new China();
		c2.name = "����";
		China.country = "�л����񹲺͹�";
		c2.shout();
		
		China.country = "�л���۹�";//���һ�θ���
		c1.shout();
		c2.shout();
		System.out.println("----------C1���ĺ�----------");
		
		China c3 = new China();
		c3.name = "����";
		c3.shout();
		
		c1.shout();
		c2.shout();
		
		China c4 = new China();
		c4.name = "����2";
		China.country="�л������۹�";
		c4.shout();
		System.out.println("----------C4���ĺ�----------");
		c1.shout();
		c2.shout();
		c3.shout();*/
		
		
		
	}
	
}
