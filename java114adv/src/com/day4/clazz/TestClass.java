package com.day4.clazz;

public class TestClass {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	/*	Person p1 =new Person();
		System.out.println(p1 instanceof Person);
		System.out.println(p1.getClass().getName());
		*/
		/*Person p2 =new Student();
		System.out.println(p2 instanceof Person);
		System.out.println(p2.getClass().getName());
		
		Person p3 =new Teacher();
		System.out.println(p3 instanceof Person);
		System.out.println(p3.getClass().getName());
		
		System.out.println(p2.getClass()==p3.getClass());//����
*/	
	/*	Student p2 =new Student();
		System.out.println(p2.getClass().getName());
		
		Student p3 =new Student();
		System.out.println(p3.getClass().getName());
		System.out.println(p2.getClass()==p3.getClass());
		*/
		
		//��ȡĳ�����Class����ķ���---����Class����
		//1.ֱ��ͨ��������ȡ--���Ч,�ȫ
		Class<Student> clazz = Student.class;
	
		/*//2.ͨ����Ķ����ȡ
		Student s =new Student();
		Class clazz1 = s.getClass(); 
		
		//3.ͨ����������ַ�����,����Class����---���ظ�������
		Class clazz2  = Class.forName("com.day4.clazz.Student");*/
		
		/*System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getModifiers());
		System.out.println(clazz.getSuperclass().getName());//----*/
		
		//���ִ�������ķ���
		//1.Student s = new Student();  
		//2.���������ļ��ж�ȡ
		//3.---����ͨ��Class����Ŀ����Ķ���---��֤Ŀ������,һ��Ҫ���޲ι��췽��
		Student s = clazz.newInstance();
		s.setName("����");
		s.setAge(10);
		System.out.println(s);
	}

}
