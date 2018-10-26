package com.loginswing.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.loginswing.entity.User;


public class UserService {
	private String fileName = "D:/java114/项目/users.data";
	//添加新用户方法
	public void addUser(User user){
		List<User> users = this.getUsers();
		user.setUserid(users.size()+1);//将存入的对象的在list中的下标+1保存进文件
		users.add(user);
		this.setUsers(users);
	}
    
	//根据用户名查询用户,如用户不存在,返回null;如存在,返回相应的对象
	public User queryUserByUsername(String username){
		User user = null;
		
		List<User> users = this.getUsers();
		//查询是否存在与输入得username相同的User对象
		for(User u:users){
			if(username.equals(u.getUsername())){
				user = u;
				break;
			}
		}
		return user;
	}
	
	//修改用户信息
	

   
     
			
		
			
     }
     
     

