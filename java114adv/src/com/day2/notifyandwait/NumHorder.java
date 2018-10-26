package com.day2.notifyandwait;

public class NumHorder {
	private Integer num =0;//����Ϊ������Դ
	
	//synchronized�����Ե�ǰ����thisΪ��
	public synchronized void inseNum(){
		while(num==1){//������Ϊ1ʱ,�ͽ��еȴ�
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//ִ�е�����  num=0
		num++;
		System.out.println(Thread.currentThread().getName()+"--->"+num);
		notifyAll();//�������һ���߳�
	}
	
	//synchronized�����Ե�ǰ����thisΪ��
	public synchronized void deseNum(){
		while(num==0){//������Ϊ0ʱ,�ͽ��еȴ�
			try {
				wait();//�ͷ���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//ִ�е�����  num=1
		num--;
		System.out.println(Thread.currentThread().getName()+"--->"+num);
		notifyAll();//�������һ���߳�
	}
}
