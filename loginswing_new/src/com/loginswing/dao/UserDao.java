package com.loginswing.dao;

import java.util.List;

import com.loginswing.entity.User;

public interface UserDao {
    void addUser(User user);// 添加用户方法

	void updateUser(User user);// 修改用户属性方法(根据用户ID)

	void deleteUserById(int userid);// 根据用户ID删除用户的方法

	List<User> queryAllUsers();// 查询全部用户的方法

	User queryByUsername(String username); // 根据用户名查询用户的方法

}
