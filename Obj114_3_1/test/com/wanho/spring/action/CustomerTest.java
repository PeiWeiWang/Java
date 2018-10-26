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
	    //∂¡»°≈‰÷√Œƒº˛
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Customer cust = (Customer) ctx.getBean("customerOne");
		cust.shopping();
	}

}
