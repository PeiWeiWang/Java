package com.work.day2.acc;

//ת���߳���
public class Transfer extends Thread{
	private Account draw;//ȡ���˻�
	private Account payee;//����˻�
	private Integer menoy;//ת��Ǯ��
	
	public Transfer(Account draw, Account payee, Integer menoy) {
		super();
		this.draw = draw;
		this.payee = payee;
		this.menoy = menoy;
	}

	@Override
	public void run() {
		//����ȡ���˻�
		synchronized (draw) {
			if(draw.getBalance()>=menoy){//����㹻
				draw.setBalance(draw.getBalance()-menoy);//�ۿ�
				payee.setBalance(payee.getBalance()+menoy);
				System.out.println(draw.getName()+"��"+payee.getName()+"ת��"+menoy+"Ԫ,"
							+draw.getName()+"���Ϊ"+draw.getBalance()+"Ԫ");
				
			}else{
				System.out.println("ת��"+menoy+"Ԫ,"
						+draw.getName()+"���Ϊ"+draw.getBalance()+"Ԫ,����");
			}
			
		}
		
		
	}
	
	
}
