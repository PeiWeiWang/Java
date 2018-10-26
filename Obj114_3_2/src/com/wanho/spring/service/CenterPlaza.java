package com.wanho.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**
 * 
 * @Component，已经被spring管理起来，Component("center") center相当于<bean id="center">
 *
 */
@Component("center")
public class CenterPlaza implements PlazaInter {

	@Override
	public String getSalesInfo() {
		// TODO Auto-generated method stub
		return "中央 ，一件8折，两件半折";
	}

}
