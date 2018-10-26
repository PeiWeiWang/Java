package com.wanho.batis.dao.impl;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wanho.batis.domain.IdCard;
import com.wanho.batis.domain.User;
import com.wanho.batis.domain.UserCardVo;
import com.wanho.batis.mapper.UserCardMapper;
import com.wanho.batis.mapper.UserMapper;
import com.wanho.batis.utils.DbConn;

public class UserMapperTest {
	UserCardMapper mapper = null;
	@Before
	public void setUp() throws Exception {
		 SqlSession session = DbConn.getConn();
		 mapper = session.getMapper(UserCardMapper.class);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetUserByVo() {
		UserCardVo vo = new UserCardVo();
		IdCard card = new IdCard();
		card.setCardname("二");
		vo.setCard(card);
		User user = new User();
		user.setUsername("w");
		vo.setUser(user);
		
		System.out.println(mapper.getUsersByVo(vo));
	}

	@Test
	public void testGetTuserById() {
		System.out.println(mapper.getTuserById(3));
	}

	@Test
	public void testGetuserByIf() {
		User user = new User();
		user.setUsername("fr");
		user.setWechart("22");
		System.out.println(mapper.getUserByIf(user));
	}
	@Test
	public void testGetuserByWhere() {
		User user = new User();
		user.setUsername("fr");
		user.setWechart("22");
		System.out.println(mapper.getUserByWhere(user));
	}
	@Test
	public void testGetuserByIds() {
		UserCardVo vo = new UserCardVo();
		User user = new User();
		//user.setUsername("f");
		vo.setUser(user);
		List<Integer> ids = new ArrayList<>();
		ids.add(3);
		ids.add(4);
		ids.add(5);
		vo.setIdList(ids);
		System.out.println(mapper.getUserByIds(vo));
	}

}
