package com.day2.account;

public class Withdrawal extends Thread {
	private Account account;
	private Integer menoy;

	public Withdrawal(Account account, Integer menoy) {
		super();
		this.account = account;
		this.menoy = menoy;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (account) {
			// 余额必须大于取款金额才能开启取款流程
			if (account.getBalance() >= menoy) {
				System.out.println(name + "开始取钱");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - menoy);
				System.out.println(name + "已取款[" + menoy + "]元,还剩余["
						+ account.getBalance() + "]元");

			} else {
				System.out.println("账户中余额为[" + account.getBalance()
						+ "]元,余额不足." + name + "取款未成功");
			}
		}
	}

	public static void main(String[] args) {
		Account ac = new Account(2000);

		Withdrawal zs = new Withdrawal(ac, 500);
		zs.setName("张三");
		zs.start();

		Withdrawal zsW = new Withdrawal(ac, 1200);
		zsW.setName("张三老婆");
		zsW.start();

		Withdrawal zsW1 = new Withdrawal(ac, 500);
		zsW1.setName("张三老妈");
		zsW1.start();
	}

}
