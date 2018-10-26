package com.day9.scope;

public class Test {
	private int x;
	private static int y;
	
	//实例成员代码块（构造代码块）：就是一对定义在类中{}，
	//每创建一次对象，jvm自动调用一次;可以用于给final进行赋值
	{
		x =10;
		y=100;
		System.out.println("我是代码块");
	}
	
	//静态代码块：只在类加载时，调用一次
	static{
		//x =10;//静态代码块只能调用静态成员
		y=100;
		System.out.println("我是静态代码块");
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
		/*//局部代码块：定义在方法或其他代码块中的代码块；表示的是一块作用域
		
		//System.out.println(ii);
*/	}
}
