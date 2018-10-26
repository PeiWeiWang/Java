package com.wanho.spring.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.wanho.spring.service.PlazaInter;
@Component("two")
public class CustomerTwo implements Customer {
	@Resource(name="center")
	PlazaInter plaza = null;

	public void setPlaza(PlazaInter plaza) {
		this.plaza = plaza;
	}


	@Override
	public void shopping() {
		System.out.println(plaza.getSalesInfo());
		
	}

	

}
