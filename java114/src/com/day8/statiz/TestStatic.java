package com.day8.statiz;


public class TestStatic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬��Ա���Բ��ô������󼴿�ʹ��
		/*China.country = "�쳯�Ϲ�";
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
