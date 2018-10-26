package com.day7.polymorphic;

public class Test1 {
	
	public static void callDouble(double d){}
	
	public static void callPerson(Person person){
		/*person.fun1();
		person.fun2();
		//person.fun3();//����Person����û��fun3����
*/	
		//Man man = person;//���಻���Զ�ת��Ϊ����
		
		/*Man man = (Man)person;
		man.fun1();
		man.fun2();
		man.fun3();*/
		
		//�ж�person�����Ƿ���Man���ͣ���true�������ת��
		if(person instanceof Man){
			Man man = (Man)person;
			man.fun1();
			man.fun2();
			man.fun3();
		}else{//���򣬰����˵ķ�ʽ���е���
			person.fun1();
			person.fun2();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		/*//Person p = new Man();
		Person p = new Woman();
		callPerson(p);//���ܸ�����Ϊ�����ķ�����ͬ�����Խ��ܸ�������еĺ����
*/	
		Person p = new Man();
		
		System.out.println(p instanceof Woman);//false
		System.out.println(p instanceof Man);//true
		System.out.println(p instanceof Person);//true
		System.out.println(p instanceof Animal);//true
	}

}
