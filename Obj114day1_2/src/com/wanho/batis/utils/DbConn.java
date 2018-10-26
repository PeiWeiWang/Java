package com.wanho.batis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConn {
	public static SqlSession getConn(){
		//取得配置文件，解析，
				SqlSession session = null;
				try {
					InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
					SqlSessionFactory factory  = new SqlSessionFactoryBuilder().build(inputStream);
					session = factory.openSession();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return session;
	}

}
