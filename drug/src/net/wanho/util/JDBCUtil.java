package net.wanho.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class JDBCUtil {

	private static DataSource dataSource;

	static {

		try {
			// 读取配置文件
			Properties properties = new Properties();
			properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			// 通过工厂获取数据源
			dataSource = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			// 从数据源中获取连接
			connection = dataSource.getConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(ResultSet rs, PreparedStatement ps, Connection connection) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (ps!=null) {
				ps.close();
			}
			if (connection!=null) {
				connection.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
