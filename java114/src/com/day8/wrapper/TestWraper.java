package com.day8.wrapper;

public class TestWraper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		int  i  = 10;
		//int  i1 = null;
		double d = 10.0;//double比int范围大，将int类型的10自动转换为double
		System.out.println(i==d);//true
		*/
		/*Integer ii = 127;
		Integer ii2 = 127;
		System.out.println(ii==ii2);//比地址
		System.out.println(ii.equals(ii2));//比数字
		
		Integer ii3 = -129;
		Integer ii4 = -129;
		System.out.println(ii3==ii4);
		System.out.println(ii3.equals(ii4));//引用数据类型的比较一般使用equals
*/	
		Integer ii = 10;
		Double dd =10D;// Double.valueOf(double)，10被包装成了Integer
	}

}
