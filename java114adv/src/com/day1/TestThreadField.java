package com.day1;

import com.work.day1.SalTicketDemo1;

public class TestThreadField {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.MIN_PRIORITY);//���1
		System.out.println(Thread.MAX_PRIORITY);//���10
		System.out.println(Thread.NORM_PRIORITY);//Ĭ����5
		
		SalTicketDemo1 saler3 = new SalTicketDemo1("����1--");
		System.out.println(saler3.getPriority());//��ȡ���ȼ�
		saler3.setPriority(1);
		saler3.start();
		
		SalTicketDemo1 saler4 = new SalTicketDemo1("����2**");
		saler4.setPriority(10);
		saler4.start();
		
	}

}
