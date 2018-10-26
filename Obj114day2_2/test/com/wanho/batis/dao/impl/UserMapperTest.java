package com.wanho.batis.dao.impl;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wanho.batis.domain.Address;
import com.wanho.batis.domain.IdCard;
import com.wanho.batis.domain.Role;
import com.wanho.batis.domain.User;
import com.wanho.batis.domain.UserCardVo;
import com.wanho.batis.mapper.UserMapper;
import com.wanho.batis.utils.DbConn;

public class UserMapperTest {
	UserMapper mapper = null;
	 SqlSession session = null;
	@Before
	public void setUp() throws Exception {
		 session = DbConn.getConn();
		 mapper = session.getMapper(UserMapper.class);

	}

	@After
	public void tearDown() throws Exception {
		if (session!=null) {
			session.close();
		}
	}

	@Test
	public void testGetUserByVo() {
	System.out.println(mapper.getCardByCardno("2")); 
	}

	@Test
	public void testGetUserAndAddrById() {
	User user = mapper.getUserAndAddrById(3);
	System.out.println(user); 
     List<Address> addresses =user.getAddList();
	}
	@Test
	public void testGetUserRoleById() {
	User user = mapper.getUserRoleById(3);
	System.out.println(user); 
     List<Role> roles =user.getRoles();
     System.out.println(roles.toString());
	}
  
}
