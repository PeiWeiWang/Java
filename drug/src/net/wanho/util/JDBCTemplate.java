package net.wanho.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.wanho.rowMapper.RowMapper;

public class JDBCTemplate {

	public static Object insert(String sql, Object... params) throws Exception {
		Object pk = null;
		ResultSet rs = null;
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			// 获取连接
			connection = MyJdbcUtil.getConnection();
			// 预编译
			prepareStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			// 设置参数
			for (int i = 0; i < params.length; i++) {
				prepareStatement.setObject(i + 1, params[i]);
			}
			// 执行添加
			prepareStatement.executeUpdate();
			// 获取主键
			rs = prepareStatement.getGeneratedKeys();
			if (rs.next()) {
				pk = rs.getObject(1);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("数据保存异常");
		} finally {
			MyJdbcUtil.close(rs, prepareStatement, null);
		}
		return pk;
	}

	public static List query(String sql, RowMapper rm, Object... params) {
		ResultSet rs = null;
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		List list=new ArrayList<>();
		try {
			connection = MyJdbcUtil.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			// 设置参数
			for (int i = 0; i < params.length; i++) {
				prepareStatement.setObject(i + 1, params[i]);
			}
			rs=prepareStatement.executeQuery();
			while(rs.next()){
				Object o = rm.mapRow(rs);
				list.add(o);
			}
	
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("数据查询异常");
		}finally {
			MyJdbcUtil.close(rs, prepareStatement, null);
		}

		return list;
	}
	
	public static void update(String sql,Object... params) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = MyJdbcUtil.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			// 设置参数
			for (int i = 0; i < params.length; i++) {
				prepareStatement.setObject(i + 1, params[i]);
			}
			prepareStatement.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("数据查询异常");
		}finally {
			MyJdbcUtil.close(null, prepareStatement, null);
		}

		
	}
	
	
	public static void delete(String sql,Object... params) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = MyJdbcUtil.getConnection();
			prepareStatement = connection.prepareStatement(sql);
			// 设置参数
			for (int i = 0; i < params.length; i++) {
				prepareStatement.setObject(i + 1, params[i]);
			}
			prepareStatement.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("数据查询异常");
		}finally {
			MyJdbcUtil.close(null, prepareStatement, null);
		}

		
	}
	

}
