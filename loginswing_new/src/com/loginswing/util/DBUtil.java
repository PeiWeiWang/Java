package com.loginswing.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	// 用于获取数据库连接
	public static Connection getDbConnection() {
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "frank";// 用户名
		String psd = "frank";// 密码
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, psd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;	
	}
	
	// 用于释放资源
	public static void close( ResultSet resultSet, PreparedStatement preparedStatement,Connection connection)
	{
		try {
			if (resultSet != null) {
				resultSet.close();	
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
