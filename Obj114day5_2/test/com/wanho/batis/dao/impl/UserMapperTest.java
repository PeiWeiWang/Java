package com.wanho.batis.dao.impl;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wanho.batis.domain.IdCard;
import com.wanho.batis.domain.User;
import com.wanho.batis.domain.UserCardVo;
import com.wanho.batis.mapper.UserCardMapper;
import com.wanho.batis.mapper.UserMapper;
import com.wanho.batis.utils.DbConn;

public class UserMapperTest {
	UserMapper mapper = null;
	@Before
	public void setUp() throws Exception {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
         mapper = (UserMapper) ctx.getBean("userMapper");


	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserByVo() {

	}

	@Test
	public void testGetTuserById() throws IOException {
		System.out.println(mapper.getUserById(3));
	}

	

}
