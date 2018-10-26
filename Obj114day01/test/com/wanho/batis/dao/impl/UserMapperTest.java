package com.wanho.batis.dao.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wanho.batis.mapper.UserMapper;
import com.wanho.batis.utils.DbConn;

public class UserMapperTest {
	UserMapper mapper = null;
	@Before
	public void setUp() throws Exception {
		 SqlSession session = DbConn.getConn();
		 mapper = session.getMapper(UserMapper.class);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserById() throws IOException {
		
		System.out.println(mapper.getUserById(3));
	}

	@Test
	public void testGetUsersByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddUserKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelUser() {
		fail("Not yet implemented");
	}

}
