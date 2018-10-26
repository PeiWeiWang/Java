package com.loginswing.init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.loginswing.entity.User;


public class Init {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//使用对象流进行数据的存储,添加部分测试数据
		//D:\java114\项目
		String fileName = "D:/java114/项目/users.data";
		
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		User user1 = new User();
		user1.setUsername("zs");
		user1.setPsd("111");
		user1.setUserid(1);
		
		User user2 = new User();
		user2.setUsername("ls");
		user2.setPsd("111");
		user2.setUserid(2);
		
		User user3 = new User();
		user3.setUsername("ww");
		user3.setPsd("111");
		user3.setUserid(3);
		
		List<User> users = new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		oos.writeObject(users);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = 	new FileInputStream(fileName);
		ObjectInputStream	ois = new ObjectInputStream(fis);
			List<User> users1 = (List<User>)ois.readObject();
			for(User u:users1){
 				System.out.println(u);
 			}
			//System.out.println(users);
	}

}
