package com.work.day2.print;

public class Print {
	private Integer i = 1;
	
	public synchronized void printNum(int num){
		if(i%3==0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print(num);
		i++;
		notify();
	}
	
	public synchronized void printChar(char c){
		if(i%3!=0){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.print(c);
		i++;
		notify();
	}
}
