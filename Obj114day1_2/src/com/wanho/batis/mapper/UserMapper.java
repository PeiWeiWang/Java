package com.wanho.batis.mapper;

import java.io.IOException;
import java.util.List;

import com.wanho.batis.domain.User;

public interface UserMapper {
	public User getUserById(int rowid);
	public List<User> getUsersByName(String name);
	public void addUser(User user);
	public int addUserKey(User user);
	public void updateUser(User user);
	public void delUser(int rowid);


}
