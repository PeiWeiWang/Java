package com.frank.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.frank.pojo.Student;

public class test {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate template = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "SELECT id,name,age from student";
//如果查询一个记录或者多条记录需要定义一个RowMapper
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<>(Student.class);
		List<Student> list = template.query(sql, rowMapper);
		System.out.println(list);

	}

}
