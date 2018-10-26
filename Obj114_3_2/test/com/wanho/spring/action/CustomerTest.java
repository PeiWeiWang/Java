package com.wanho.spring.action;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShopping() {
	    //读取配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer cust = (Customer) ctx.getBean("one");
		cust.shopping();
	}
	@Test
	public void testShopping1() {
	    //读取配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer cust = (Customer) ctx.getBean("two");
		cust.shopping();
	}
	

}
