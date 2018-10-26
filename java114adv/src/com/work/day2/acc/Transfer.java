package com.work.day2.acc;

//转账线程类
public class Transfer extends Thread{
	private Account draw;//取款账户
	private Account payee;//领款账户
	private Integer menoy;//转账钱数
	
	public Transfer(Account draw, Account payee, Integer menoy) {
		super();
		this.draw = draw;
		this.payee = payee;
		this.menoy = menoy;
	}

	@Override
	public void run() {
		//锁定取款账户
		synchronized (draw) {
			if(draw.getBalance()>=menoy){//余额足够
				draw.setBalance(draw.getBalance()-menoy);//扣款
				payee.setBalance(payee.getBalance()+menoy);
				System.out.println(draw.getName()+"向"+payee.getName()+"转账"+menoy+"元,"
							+draw.getName()+"余额为"+draw.getBalance()+"元");
				
			}else{
				System.out.println("转账"+menoy+"元,"
						+draw.getName()+"余额为"+draw.getBalance()+"元,余额不足");
			}
			
		}
		
		
	}
	
	
}
