package com.loginswing.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplents extends BaseDao<User> implements UserDao {
	@Override
	public void addUser(User user) {
		String sql = "insert into users(userid,username,psd,nickname,birthday,job)"
				+ "values(user_req.nextval,?,?,?,to_date(?,'yyyy/mm/dd'),?)";
		Object[] params = { user.getUsername(), user.getPsd(), user.getNickname(), user.getBirthday(), user.getJob() };
		this.baseUpdate(sql, params);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		String sql = "update users set psd?,nickname=?,birthday=?,job=?,falsecount=?,astfalsetime=?,flag=?"
				+ "where userid=?";
		Object[] params = { user.getPsd(), user.getNickname(), user.getBirthday(), user.getJob(), user.getFalseCount(),
				user.getFlag() };
		this.baseUpdate(sql, params);
	}

	@Override
	public void deleteUserById(int userid) {
		this.baseUpdate("delete from users where userid = ?", userid);
	}

	@Override
	public List<User> queryAllUsers() {
		String sql ="select * from users";
		Mapper<User> mapper =  new UserMapper();
		List<User> list = this.baseQuery(mapper, sql);
		return list;
	}

	@Override
	public User queryByUsername(String username) {
		String sql ="select * from users where username=?";
		List<User> list  = this.baseQuery(new UserMapper(),sql,username);
		return list.size()==0?null:list.get(0);
		
	}

}
