package com.day1;

import com.work.day1.SalTicketDemo1;

class BlockDemo extends Thread{

	@Override
	public void run() {
		for(int i = 1;true;i++){
			//Thread.yield();//������������ִ�л���
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("----------------���߳�������-------------------------,���е�"+i+"��");
			
		}
	}
	
}

//�̵߳�����
public class TestBlock {
	public static void main(String[] args) {
		
		
		
		/*while(true){
			try {
				Thread.sleep(1000);//����1000����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+"����ִ��");
		}*/
		
		/*//���߳�
		BlockDemo bd = new BlockDemo();
		bd.start();
		
		//���߳�
		for(int i = 1;i<100;i++){
			try {
				if(i==20){
					bd.join();//
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("*****���߳�������******,���е�"+i+"��");
		}*/
		
		new BlockDemo().start();
		
		for(int i = 1;true;i++){
			
			System.out.println("*****���߳�������******,���е�"+i+"��");
		}
		
	}
}
