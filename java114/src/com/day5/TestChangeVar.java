package com.day5;

public class TestChangeVar {
	//int...is:�ɱ䳤����---�����Ǹ�����
	public  void test1(int...is){
			for(int i=0;i<is.length;i++){
				System.out.println(is[i]);
			}
	
	}
	
	public static void main(String[] args) {
		TestChangeVar tcv = new TestChangeVar();
		//1.���ж���   2.��ȷ�ķ�����  3.�����б�Ҫ��ȷ��˳�����͡�������
		/*tcv.test1(1);
		tcv.test1(1,2);*/
		tcv.test1(1,2,3,5);
		/*int[] var = {1,2,3,4,5,6};
		tcv.test1(var);*/
		tcv.test1();
	}

}
