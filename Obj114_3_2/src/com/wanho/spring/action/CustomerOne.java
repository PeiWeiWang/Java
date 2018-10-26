package com.wanho.spring.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wanho.spring.service.PlazaInter;
/**
 * “¿¿µπÿœµ « « ≤√¥£¨À≠“¿¿µÀ≠
 * CustomerOne “¿¿µ GodenPlaza
 * @author wangb
 *
 */
@Component("one")
public class CustomerOne implements Customer {
	@Autowired
	@Qualifier("goden")
	PlazaInter plaza = null;

	public void setPlaza(PlazaInter plaza) {
		this.plaza = plaza;
	}

	@Override
	public void shopping() {
		
		System.out.println(plaza.getSalesInfo());

	}

}
