package net.wanho.dao.impl;

import java.util.List;

import net.wanho.dao.DoctorDaoI;
import net.wanho.pojo.Doctor;
import net.wanho.rowMapper.DoctorRowMapper;
import net.wanho.util.JDBCTemplate;

public class DoctorDaoImpl implements DoctorDaoI{

	@Override
	public Doctor login(String doctorName, String password) {
		String sql="SELECT * FROM doctor WHERE doctorName=? and `password`=?";
		List<Doctor> doctors = JDBCTemplate.query(sql, new DoctorRowMapper(), doctorName,password);

		return doctors==null||doctors.size()==0?null:doctors.get(0);
	}

}
