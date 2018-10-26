package com.wanho.batis.mapper;

import java.io.IOException;
import java.util.List;

import com.wanho.batis.domain.IdCard;
import com.wanho.batis.domain.User;

public interface UserMapper {
	List<IdCard> getCardByCardno(String cardNo);//查询一个身份证信息,并且把个人信息也显示出来.
	User getUserAndAddrById(int rowid);//根据用户id查询出用户信息,和地址信息
	User getUserRoleById(int id);
}
