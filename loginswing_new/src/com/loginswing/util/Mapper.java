package com.loginswing.util;

import java.sql.ResultSet;

public interface Mapper<T> {
  T mapper(ResultSet resultSet);
}
