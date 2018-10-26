package com.loginswing.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank ͨ�����ݵ����ݿ⴦����
 */
public class BaseDao<T> {
	/**
	 * ͨ�õ�DML��������
	 * 
	 * @param sql:��Ҫִ�е�sql���
	 * @param prams:��Ӧ����sql�Ŀɱ䳤����
	 */
	public void baseUpdate(String sql, Object... params) {
		Connection connection = DBUtil.getDbConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			// ʹ��ѭ�����и�ֵ,params�ĳ��ȼ�ΪѧҪ��ֵ��?ռλ���ĸ���,?�ļ�����1��ʼ
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
	 * ͨ�õ�DQL��������
	* @param sql:��Ҫִ�е�sql���
	* @param params:��Ӧ����sql�Ŀɱ䳤����
	* @param mapper:��Ӧ��ͬ��ѯ�Ĳ�ͬ�ļ�¼��װ����(ӳ�����)
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
 					T t =  mapper.mapper(resultSet);//ʹ��Mapper������Ҫ��װ�Ķ���
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


