package com.wanho.batis.domain;

public class Address {
	private String addrType;
	private String addrName;
	private int userid;
	public String getAddrType() {
		return addrType;
	}
	public void setAddrType(String addrType) {
		this.addrType = addrType;
	}
	public String getAddrName() {
		return addrName;
	}
	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Address [addrType=" + addrType + ", addrName=" + addrName + ", userid=" + userid + "]";
	}
		
	

}
