package com.day2.notifyandwait.t1;

public class TestNotify1  implements Runnable{
	
	private boolean flag = true;//������Դ
	
	//�Ƚ����ı���ִ����ϻ����Լ�����������
	public synchronized void test(){
		if(flag){
			flag = false;
			System.out.println(Thread.currentThread().getName()
						+"--->1");
			try {
				this.wait();//�ȴ����˻���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()
					+"--->2");
		}else{
			flag = true;
			System.out.println(Thread.currentThread().getName()
					+"--->3");
			this.notify();
			System.out.println(Thread.currentThread().getName()
					+"--->4");
		}
	}
	@Override
	public void run() {
		test();
	}

	public static void main(String[] args) {
		TestNotify1 tn = new TestNotify1();
		
		new Thread(tn).start();
		new Thread(tn).start();
		
	}
	
	

	

}
