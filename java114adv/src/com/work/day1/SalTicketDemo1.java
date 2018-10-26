package com.work.day1;

public class SalTicketDemo1 extends Thread{
//	private  Integer tickets = 40;//不是共享资源,每个窗口40张票
	private   Integer tickets = 400;//使用static共享资源
	public SalTicketDemo1() {}
	//利用调用父类的构造方法给线程起名字
	public SalTicketDemo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		while(true){
			if(tickets>0){
				//Thread.currentThread().getName():获取当前线程的名字
				System.out.println(Thread.currentThread().getName()
						+"卖掉了第"+tickets--+"张票");
			}}}

	public static void main(String[] args) {
		SalTicketDemo1 saler1 = new SalTicketDemo1("窗口1");
		saler1.start();
		//saler1.start();
		saler1.run();
		saler1.run();
		
		
		/*//利用setName方法给线程起名字
		SalTicketDemo1 saler2 = new SalTicketDemo1();
		saler2.setName("窗口2");
		saler2.start();
		
		SalTicketDemo1 saler3 = new SalTicketDemo1("窗口3");
		saler3.start();*/
		
		SalTicketDemo1 saler4 = new SalTicketDemo1("窗口4");
		saler4.start();
	}

}
