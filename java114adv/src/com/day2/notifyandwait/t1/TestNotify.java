package com.day2.notifyandwait.t1;

public class TestNotify  implements Runnable{
	
	private boolean flag = false;//������Դ
	
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
		TestNotify tn = new TestNotify();
		
		new Thread(tn,"A").start();//A
		new Thread(tn,"B").start();//B
		new Thread(tn,"C").start();//C
		new Thread(tn,"D").start();//D
	}
	
	

	

}
