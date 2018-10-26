package com.wanho.batis.mapper;

import java.util.List;

import com.wanho.batis.domain.TUser;
import com.wanho.batis.domain.User;
import com.wanho.batis.domain.UserCardVo;



public interface UserCardMapper {
	/**
	 * 根据user,idcard里条件查询tuser的记录
	 * @return
	 */
   List<User> getUsersByVo(UserCardVo vo);
   /**
    *当用户对象属性和表结构字段不一致
    * @param id
    * @return
    */
   TUser getTuserById(int id);
   /**
    * if标签
    * @param user
    * @return
    */
   List<User> getUserByIf (User user);
   
   List<User> getUserByWhere(User user);
   List<User> getUserByIds(UserCardVo vo );
   
}
