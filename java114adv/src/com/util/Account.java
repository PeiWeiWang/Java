package com.util;

public class Account {
	protected Integer Balance;
	
	
	public Account() {
		super();
	}

	public Account(Integer balance) {
		super();
		Balance = balance;
	}

	public Integer getBalance() {
		return Balance;
	}

	public void setBalance(Integer balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Account [Balance=" + Balance + "]";
	}
	
}
