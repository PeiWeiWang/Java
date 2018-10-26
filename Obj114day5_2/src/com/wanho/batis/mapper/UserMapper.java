package com.wanho.batis.mapper;

import java.io.IOException;
import java.util.List;
import com.wanho.batis.domain.User;

public interface UserMapper {
	User getUserById(int rowid) throws IOException;

	List<User> getUserByName(String name);

	void addUser(User user);

	int addUserKey(User user);
	
	void updateUser(User user);
	
	void deleteUser(int rowid);
}
