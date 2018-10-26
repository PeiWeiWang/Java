package com.loginswing.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	// ���ڻ�ȡ���ݿ�����
	public static Connection getDbConnection() {
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "frank";// �û���
		String psd = "frank";// ����
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, psd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;	
	}
	
	// �����ͷ���Դ
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
