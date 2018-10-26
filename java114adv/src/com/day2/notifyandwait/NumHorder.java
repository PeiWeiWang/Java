package com.day2.notifyandwait;

public class NumHorder {
	private Integer num =0;//必须为共享资源
	
	//synchronized方法以当前对象this为锁
	public synchronized void inseNum(){
		while(num==1){//当数字为1时,就进行等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//执行到这里  num=0
		num++;
		System.out.println(Thread.currentThread().getName()+"--->"+num);
		notifyAll();//随机唤醒一个线程
	}
	
	//synchronized方法以当前对象this为锁
	public synchronized void deseNum(){
		while(num==0){//当数字为0时,就进行等待
			try {
				wait();//释放锁
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//执行到这里  num=1
		num--;
		System.out.println(Thread.currentThread().getName()+"--->"+num);
		notifyAll();//随机唤醒一个线程
	}
}
