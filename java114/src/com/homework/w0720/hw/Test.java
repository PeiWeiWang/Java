package com.homework.w0720.hw;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	Single s0 =new Single();
		/*Single s = Single.getSingle();
		s.setName("aaa");
		Single s1 = Single.getSingle();
		Single s2 = Single.getSingle();
		
		System.out.println(s.getName());
		System.out.println(s1.getName());*/
	
		/*Calculator cal=new Circle(20); // new	Rectangle(10,20);
		double per = cal.getPerimeter();
		double area = cal.getArea();
		System.out.println(per);
		System.out.println(area);*/
		
		/*SwimCar scar = new NQCar();
		scar.swim();*/
		
		Monkey m1 = new Monkey("С��", 8, "��", "��");
		Monkey m2 = new Monkey("С��", 8, "��", "��");
		
		System.out.println(m1 == m2);//�Ƚϵ���ֵ���ڴ��ַ��
		System.out.println(m1.equals(m2));//��д���equals�Ƚ�����
		
	}

}
