package com.loginswing.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc114.util.Mapper;
/**
 * 
 * @author Frank
 * 这个类的作用是用于封装记录
 */
public class UserMapper implements Mapper<User> {
   public User mapper(ResultSet resultSet) {
	   User user  = new User();//用于封装单挑记录
		try {
			user.setUserid(resultSet.getInt("userid"));
			user.setUsername(resultSet.getString("username"));
			user.setNickname(resultSet.getString("nickname"));
			user.setPsd(resultSet.getString("psd"));
			user.setBirthday(resultSet.getDate("birthday"));
			user.setJob(resultSet.getString("job"));
			user.setFalseCount(resultSet.getInt("falsecount"));
			user.setLastFalseTime(resultSet.getLong("lastfalsetime"));
			user.setFlag(resultSet.getInt("flag")); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
   }
}
