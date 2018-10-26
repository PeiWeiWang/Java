package com.wanho.batis.domain;

import java.util.Date;
import java.util.List;

public class User {
	private int rowid;
	private String username;
	private String password;
	private String wechart;
	private String email;
	private List<Address> addList;
	private List<Role> roles;
	public int getRowid() {
		return rowid;
	}
	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getWechart() {
		return wechart;
	}
	public void setWechart(String wechart) {
		this.wechart = wechart;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Address> getAddList() {
		return addList;
	}
	public void setAddList(List<Address> addList) {
		this.addList = addList;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [rowid=" + rowid + ", username=" + username + ", password=" + password + ", wechart=" + wechart
				+ ", email=" + email + ", addList=" + addList + ", roles=" + roles + "]";
	}
	
	
	
}
	