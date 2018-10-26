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
			// ���������ȡ������ܿ���ȡ������
			if (account.getBalance() >= menoy) {
				System.out.println(name + "��ʼȡǮ");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				account.setBalance(account.getBalance() - menoy);
				System.out.println(name + "��ȡ��[" + menoy + "]Ԫ,��ʣ��["
						+ account.getBalance() + "]Ԫ");

			} else {
				System.out.println("�˻������Ϊ[" + account.getBalance()
						+ "]Ԫ,����." + name + "ȡ��δ�ɹ�");
			}
		}
	}

	public static void main(String[] args) {
		Account ac = new Account(2000);

		Withdrawal zs = new Withdrawal(ac, 500);
		zs.setName("����");
		zs.start();

		Withdrawal zsW = new Withdrawal(ac, 1200);
		zsW.setName("��������");
		zsW.start();

		Withdrawal zsW1 = new Withdrawal(ac, 500);
		zsW1.setName("��������");
		zsW1.start();
	}

}
