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
			System.out.println("-----���߳�δ����-----");
		}
	}

	public static void main(String[] args) {
		
		TestDaemon t1 = new  TestDaemon();
		t1.setDaemon(true);//��t1�趨Ϊ���ػ��߳�
		t1.start();
		/*
		TestDaemon t2 = new  TestDaemon();
		
		t2.start();*/
		
		
		//ǰ̨
		for(int i = 1;i<20;i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("*****���߳�������******");
		}
		

	}

}
