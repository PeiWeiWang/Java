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
		
		System.out.println(p2.getClass()==p3.getClass());//个性
*/	
	/*	Student p2 =new Student();
		System.out.println(p2.getClass().getName());
		
		Student p3 =new Student();
		System.out.println(p3.getClass().getName());
		System.out.println(p2.getClass()==p3.getClass());
		*/
		
		//获取某个类的Class对象的方法---加载Class对象
		//1.直接通过类名获取--最高效,最安全
		Class<Student> clazz = Student.class;
	
		/*//2.通过类的对象获取
		Student s =new Student();
		Class clazz1 = s.getClass(); 
		
		//3.通过类的完整字符串名,加载Class对象---加载各种驱动
		Class clazz2  = Class.forName("com.day4.clazz.Student");*/
		
		/*System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getModifiers());
		System.out.println(clazz.getSuperclass().getName());//----*/
		
		//三种创建对象的方法
		//1.Student s = new Student();  
		//2.对象流从文件中读取
		//3.---可以通过Class创建目标类的对象---保证目标类中,一定要有无参构造方法
		Student s = clazz.newInstance();
		s.setName("张三");
		s.setAge(10);
		System.out.println(s);
	}

}
