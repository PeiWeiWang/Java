package com.work.day1;

public class SalTicketDemo1 extends Thread{
//	private  Integer tickets = 40;//���ǹ�����Դ,ÿ������40��Ʊ
	private   Integer tickets = 400;//ʹ��static������Դ
	public SalTicketDemo1() {}
	//���õ��ø���Ĺ��췽�����߳�������
	public SalTicketDemo1(String name) {
		super(name);
	}

	@Override
	public void run() {
		while(true){
			if(tickets>0){
				//Thread.currentThread().getName():��ȡ��ǰ�̵߳�����
				System.out.println(Thread.currentThread().getName()
						+"�����˵�"+tickets--+"��Ʊ");
			}}}

	public static void main(String[] args) {
		SalTicketDemo1 saler1 = new SalTicketDemo1("����1");
		saler1.start();
		//saler1.start();
		saler1.run();
		saler1.run();
		
		
		/*//����setName�������߳�������
		SalTicketDemo1 saler2 = new SalTicketDemo1();
		saler2.setName("����2");
		saler2.start();
		
		SalTicketDemo1 saler3 = new SalTicketDemo1("����3");
		saler3.start();*/
		
		SalTicketDemo1 saler4 = new SalTicketDemo1("����4");
		saler4.start();
	}

}
