package com.wanho.batis.domain;

public class IdCard {
	private String cardno;
	private String cardname;
	private String cardaddress;
	private int userid;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "idCard [cardno=" + cardno + ", cardname=" + cardname + ", cardaddress=" + cardaddress + ", userid="
				+ userid + "]";
	}
}
