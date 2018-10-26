package com.day8.statiz;


public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//静态成员可以不用创建对象即可使用
		/*China.country = "天朝上国";
		China.testStatic();
		System.out.println(China.country);*/
		
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
	//	Count c5 = new Count();
		//Count.count = 10;
		System.out.println(Count.getCount());
	}

}
