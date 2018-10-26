package com.work.day2.acc;

public class Test {

	/**
	 * A --1000--> B
	 * A --500--> C
	 */
	public static void main(String[] args) {
		Account a = new Account("A",1400);//--->

		
		Account b = new Account("B",200);//<--
		Account c = new Account("C",100);//<--
		
		
		Transfer t1 = new Transfer(a,b,1000);
		t1.start();
		
		Transfer t2 = new Transfer(a,c,500);
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
