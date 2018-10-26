package com.day1;

import com.work.day1.SalTicketDemo1;

public class TestThreadField {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.MIN_PRIORITY);//最低1
		System.out.println(Thread.MAX_PRIORITY);//最低10
		System.out.println(Thread.NORM_PRIORITY);//默认是5
		
		SalTicketDemo1 saler3 = new SalTicketDemo1("窗口1--");
		System.out.println(saler3.getPriority());//获取优先级
		saler3.setPriority(1);
		saler3.start();
		
		SalTicketDemo1 saler4 = new SalTicketDemo1("窗口2**");
		saler4.setPriority(10);
		saler4.start();
		
	}

}
