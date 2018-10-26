package com.work.day1;




public class Cross implements Runnable{
	private Integer num=1;
	@Override
	public void run() {
		synchronized (num) {
			System.out.println(Thread.currentThread().getName()+"����ͨ��ɽ��,�ǵ�"+num+"����ɽ������");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			num++;
			
		}
		
	}
	
	public static void main(String[] args) {
		Cross c = new Cross();
		
		for(int i=0;i<10;i++){
			new Thread(c).start();
		}
		

	}

	

}
