package com.wanho.batis.domain;

public class IdCard {
	private String cardno;
	private String cardname;
	private String cardaddress;
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardaddress() {
		return cardaddress;
	}
	public void setCardaddress(String cardaddress) {
		this.cardaddress = cardaddress;
	}
	@Override
	public String toString() {
		return "IdCard [cardno=" + cardno + ", cardname=" + cardname + ", cardaddress=" + cardaddress + ", user=" + user
				+ "]";
	}


	
}
