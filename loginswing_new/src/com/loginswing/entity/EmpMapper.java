package com.loginswing.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc114.util.Mapper;

public class EmpMapper implements Mapper<Emp> {

	@Override
	public Emp mapper(ResultSet resultSet) {
		Emp emp = new Emp();
		try {
			emp.setEmpno(resultSet.getInt("empno"));
			emp.setEname(resultSet.getString("ename"));
			emp.setJob(resultSet.getString("job"));
			emp.setMgr(resultSet.getInt("mgr"));	
			emp.setHiredate(resultSet.getDate("hiredate"));
			emp.setSal(resultSet.getDouble("Sal"));
			emp.setComm(resultSet.getDouble("comm"));
			emp.setDeptno(resultSet.getInt("deptno"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}
}
