package com.day9.scope;

public class Test {
	private int x;
	private static int y;
	
	//ʵ����Ա����飨�������飩������һ�Զ���������{}��
	//ÿ����һ�ζ���jvm�Զ�����һ��;�������ڸ�final���и�ֵ
	{
		x =10;
		y=100;
		System.out.println("���Ǵ����");
	}
	
	//��̬����飺ֻ�������ʱ������һ��
	static{
		//x =10;//��̬�����ֻ�ܵ��þ�̬��Ա
		y=100;
		System.out.println("���Ǿ�̬�����");
	}
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public Test(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}*/

	public int getX() {
		{
			int ii = 100;
			System.out.println(ii);
		}
		return x;
	}

	public void setX(int x) {
		
		this.x = x;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.getX();
		t.getX();
		Test t1 = new Test();
		Test t2 = new Test();
		/*//�ֲ�����飺�����ڷ���������������еĴ���飻��ʾ����һ��������
		
		//System.out.println(ii);
*/	}
}
