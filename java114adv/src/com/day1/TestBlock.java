package com.day1;

import com.work.day1.SalTicketDemo1;

class BlockDemo extends Thread{

	@Override
	public void run() {
		for(int i = 1;true;i++){
			//Thread.yield();//主动放弃本次执行机会
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("----------------子线程运行中-------------------------,运行第"+i+"次");
			
		}
	}
	
}

//线程的阻塞
public class TestBlock {
	public static void main(String[] args) {
		
		
		
		/*while(true){
			try {
				Thread.sleep(1000);//休眠1000毫秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+"正在执行");
		}*/
		
		/*//子线程
		BlockDemo bd = new BlockDemo();
		bd.start();
		
		//主线程
		for(int i = 1;i<100;i++){
			try {
				if(i==20){
					bd.join();//
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("*****主线程运行中******,运行第"+i+"次");
		}*/
		
		new BlockDemo().start();
		
		for(int i = 1;true;i++){
			
			System.out.println("*****主线程运行中******,运行第"+i+"次");
		}
		
	}
}
