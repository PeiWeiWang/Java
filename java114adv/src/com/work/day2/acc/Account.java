package com.work.day2.acc;

public class Account {
	private String name;
	private Integer Balance;

	
	public Account() {
		super();
	}


	public Account(String name, Integer balance) {
		super();
		this.name = name;
		Balance = balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getBalance() {
		return Balance;
	}


	public void setBalance(Integer balance) {
		Balance = balance;
	}


	@Override
	public String toString() {
		return "Account [name=" + name + ", Balance=" + Balance + "]";
	}

	
	
}
