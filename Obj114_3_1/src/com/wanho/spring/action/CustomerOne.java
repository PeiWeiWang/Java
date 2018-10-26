package com.wanho.spring.action;


import com.wanho.spring.service.PlazaInter;
/**
 * “¿¿µπÿœµ « « ≤√¥£¨À≠“¿¿µÀ≠
 * CustomerOne “¿¿µ GodenPlaza
 * @author wangb
 *
 */
public class CustomerOne implements Customer {
	PlazaInter plaza = null;
	String username = null;
	

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPlaza(PlazaInter plaza) {
		this.plaza = plaza;
	}

	@Override
	public void shopping() {
		
		System.out.println(plaza.getSalesInfo());

	}

}
