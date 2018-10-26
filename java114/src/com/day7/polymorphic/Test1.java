package com.day7.polymorphic;

public class Test1 {
	
	public static void callDouble(double d){}
	
	public static void callPerson(Person person){
		/*person.fun1();
		person.fun2();
		//person.fun3();//错误，Person类中没有fun3方法
*/	
		//Man man = person;//父类不能自动转换为子类
		
		/*Man man = (Man)person;
		man.fun1();
		man.fun2();
		man.fun3();*/
		
		//判断person对象是否是Man类型，如true，则进行转换
		if(person instanceof Man){
			Man man = (Man)person;
			man.fun1();
			man.fun2();
			man.fun3();
		}else{//否则，按照人的方式进行调用
			person.fun1();
			person.fun2();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		/*//Person p = new Man();
		Person p = new Woman();
		callPerson(p);//接受父类作为参数的方法，同样可以接受父类的所有的后代类
*/	
		Person p = new Man();
		
		System.out.println(p instanceof Woman);//false
		System.out.println(p instanceof Man);//true
		System.out.println(p instanceof Person);//true
		System.out.println(p instanceof Animal);//true
	}

}
