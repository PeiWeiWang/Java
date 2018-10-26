package com.day2.notifyandwait;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//使用的是同一个NumHorder对象,使用的是同步方法,以当前nh为锁
		NumHorder nh = new NumHorder();
		
		new Dese(nh,"减线程1").start();//  消费1产出0
		new Inse(nh,"增线程1").start();//  消费0产出1
		new Dese(nh,"减线程2").start();//  消费1产出0
		new Inse(nh,"增线程2").start();//  消费0产出1
	}

}
