package com.day1;

public class TestDaemon extends Thread{

	
	
	@Override
	public void run() {
		while(true){
			/*try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println("-----子线程未结束-----");
		}
	}

	public static void main(String[] args) {
		
		TestDaemon t1 = new  TestDaemon();
		t1.setDaemon(true);//将t1设定为了守护线程
		t1.start();
		/*
		TestDaemon t2 = new  TestDaemon();
		
		t2.start();*/
		
		
		//前台
		for(int i = 1;i<20;i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("*****主线程运行中******");
		}
		

	}

}
