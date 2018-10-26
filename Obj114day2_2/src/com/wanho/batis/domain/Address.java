package com.wanho.batis.domain;

public class Address {
 private String addrType;
 private String addrName;
 private User user;
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
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
@Override
public String toString() {
	return "Address [addrType=" + addrType + ", addrName=" + addrName + ", user=" + user + "]";
}

}
