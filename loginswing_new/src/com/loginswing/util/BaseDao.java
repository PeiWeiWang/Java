package com.loginswing.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank 通用数据的数据库处理类
 */
public class BaseDao<T> {
	/**
	 * 通用的DML操作方法
	 * 
	 * @param sql:需要执行的sql语句
	 * @param prams:对应以上sql的可变长参数
	 */
	public void baseUpdate(String sql, Object... params) {
		Connection connection = DBUtil.getDbConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			// 使用循环进行赋值,params的长度即为学要赋值的?占位符的个数,?的计数从1开始
			for (int i = 1; i <= params.length; i++) {
				preparedStatement.setObject(i, params[i - 1]);
			}
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(null, preparedStatement, connection);
		}
	}
	
	
	/**
	 * 通用的DQL操作方法
	* @param sql:需要执行的sql语句
	* @param params:对应以上sql的可变长参数
	* @param mapper:对应不同查询的不同的记录封装对象(映射对象)
	*/
     public List<T> baseQuery(Mapper<T> mapper,String sql,Object...params){
    	 	Connection connection = DBUtil.getDbConnection();
 			PreparedStatement preparedStatement = null;
 			ResultSet resultSet = null;
 			List<T> list = new ArrayList<>();
 			try {
 				preparedStatement = connection.prepareStatement(sql);
 				for (int i = 1; i <= params.length; i++) {
 					preparedStatement.setObject(i, params[i - 1]);
 				}
 				resultSet = preparedStatement.executeQuery();
 				while(resultSet.next()){
 					T t =  mapper.mapper(resultSet);//使用Mapper返回需要封装的对象
 					list.add(t);
 				}
 			} catch (SQLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			} finally{
 				DBUtil.close(resultSet, preparedStatement, connection);
 			}
 			return list;
 	 }
	
	
}


