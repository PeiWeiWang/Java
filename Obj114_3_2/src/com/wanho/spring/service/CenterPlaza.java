package com.wanho.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
/**
 * 
 * @Component���Ѿ���spring����������Component("center") center�൱��<bean id="center">
 *
 */
@Component("center")
public class CenterPlaza implements PlazaInter {

	@Override
	public String getSalesInfo() {
		// TODO Auto-generated method stub
		return "���� ��һ��8�ۣ���������";
	}

}
