package com.wanho.batis.domain;

import java.util.List;

public class UserCardVo {
	private IdCard card;
	private User user;
	private List<Integer> idList;
	public List<Integer> getIdList() {
		return idList;
	}
	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
	public IdCard getCard() {
		return card;
	}
	public void setCard(IdCard card) {
		this.card = card;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserCardVo [card=" + card + ", user=" + user + ", idList=" + idList + "]";
	}
	
}
