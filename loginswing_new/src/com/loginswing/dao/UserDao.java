package com.loginswing.dao;

import java.util.List;

import com.loginswing.entity.User;

public interface UserDao {
    void addUser(User user);// ����û�����

	void updateUser(User user);// �޸��û����Է���(�����û�ID)

	void deleteUserById(int userid);// �����û�IDɾ���û��ķ���

	List<User> queryAllUsers();// ��ѯȫ���û��ķ���

	User queryByUsername(String username); // �����û�����ѯ�û��ķ���

}
