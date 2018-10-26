package com.day2.notifyandwait;

public class Dese extends Thread{
	private  NumHorder nh;
	
	public Dese(NumHorder nh,String name) {
		super(name);
		this.nh = nh;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			nh.deseNum();
		}
	}
	
	
	
}
