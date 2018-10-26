package com.wanho.aop.proxy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SellerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSell() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Seller seller = (Seller) ctx.getBean("vender");
        //System.out.println(seller.sell(200, 2));
        seller.ad("ŒÂ’€ŒÂ’€");
	
	}

	@Test
	public void testAd() {
		fail("Not yet implemented");
	}

}
