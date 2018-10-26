package com.day5;

public class TestChangeVar {
	//int...is:可变长参数---本质是个数组
	public  void test1(int...is){
			for(int i=0;i<is.length;i++){
				System.out.println(is[i]);
			}
	
	}
	
	public static void main(String[] args) {
		TestChangeVar tcv = new TestChangeVar();
		//1.现有对象   2.正确的方法名  3.参数列表要正确（顺序、类型、个数）
		/*tcv.test1(1);
		tcv.test1(1,2);*/
		tcv.test1(1,2,3,5);
		/*int[] var = {1,2,3,4,5,6};
		tcv.test1(var);*/
		tcv.test1();
	}

}
