package com.wanho.batis.mapper;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wanho.batis.utils.DbConn;

public class AddressMapperTest {
	AddressMapper mapper = null;
	@Before
	public void setUp() throws Exception {
		 SqlSession session = DbConn.getConn();
		 mapper = session.getMapper(AddressMapper.class);

	}

	

	@Test
	public void test() {
		System.out.println(mapper.getAllAddress().toString());
	}

}
