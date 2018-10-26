package com.day8.statiz;

public class China {
	//静态属性在内存中只占有一块特定的内存
	//不属于类的对象，而是变成类的所有对象共享；static修饰的成员由对象成员提升为类成员
	public static String country="中国";
	public  String name;
	
	//实例方法
	public void shout(){
		//实例方法可以调用实例成员
		System.out.print(this.name);
		
		//实例方法可以调用静态成员
		System.out.println("是"+country+"人");
		
	}
	
	//静态方法
	public static void testStatic(){
		//静态方法可以调用静态成员
		System.out.println(country);
		System.out.println("我是静态方法");
		
		//静态方法不能调用非静态成员:静态方法可以通过类名.方法进行调用，有可能此时没有创建this所指向的对象
		//System.out.print(this.name);
		//shout();
		
	}
	
	public static void main(String[] args) {
		/*China c1 = new China();
		c1.name = "习大大";
		China.country = "中华人民共和国";
		c1.shout();
		
		China c2 = new China();
		c2.name = "张三";
		China.country = "中华人民共和国";
		c2.shout();
		
		China.country = "中华大帝国";//最后一次更改
		c1.shout();
		c2.shout();
		System.out.println("----------C1更改后----------");
		
		China c3 = new China();
		c3.name = "李四";
		c3.shout();
		
		c1.shout();
		c2.shout();
		
		China c4 = new China();
		c4.name = "李四2";
		China.country="中华宇宙大帝国";
		c4.shout();
		System.out.println("----------C4更改后----------");
		c1.shout();
		c2.shout();
		c3.shout();*/
		
		
		
	}
	
}
