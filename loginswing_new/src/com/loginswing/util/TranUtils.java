package com.loginswing.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TranUtils {
  public static void beginTransaction(Connection connection) {
	  try {
		connection.setAutoCommit(false);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public static void commitTransaction(Connection connection) {
	  try {
		connection.commit();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public static void rollbackTransaction(Connection connection) {
	  try {
		connection.rollback();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  public static void endTransaction(Connection connection) {
	  try {
		connection.setAutoCommit(true);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
