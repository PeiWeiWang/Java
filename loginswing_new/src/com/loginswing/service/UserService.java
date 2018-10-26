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
	private String fileName = "D:/java114/��Ŀ/users.data";
	//������û�����
	public void addUser(User user){
		List<User> users = this.getUsers();
		user.setUserid(users.size()+1);//������Ķ������list�е��±�+1������ļ�
		users.add(user);
		this.setUsers(users);
	}
    
	//�����û�����ѯ�û�,���û�������,����null;�����,������Ӧ�Ķ���
	public User queryUserByUsername(String username){
		User user = null;
		
		List<User> users = this.getUsers();
		//��ѯ�Ƿ�����������username��ͬ��User����
		for(User u:users){
			if(username.equals(u.getUsername())){
				user = u;
				break;
			}
		}
		return user;
	}
	
	//�޸��û���Ϣ
	

   
     
			
		
			
     }
     
     

