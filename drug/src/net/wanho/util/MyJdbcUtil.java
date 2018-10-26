package net.wanho.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class MyJdbcUtil {

	private static DataSource dataSource;
	// 本地线程 用来做二级缓存
	private static ThreadLocal<Connection> local = new ThreadLocal<>();

	static {
		try {
			// 读取配置文件
			Properties properties = new Properties();
			properties.load(MyJdbcUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			// 通过工厂获取数据源
			dataSource = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		// 先从本地线程中获取，如果没有从连接池取一个新的
		Connection connection = local.get();
		if (connection == null) {
			try {
				// 从数据源中获取连接
				connection = dataSource.getConnection();
				local.set(connection);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return connection;
	}

	public static void close(ResultSet rs, PreparedStatement ps, Connection connection) {

		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (connection != null) {
				connection.close();
				local.remove();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
